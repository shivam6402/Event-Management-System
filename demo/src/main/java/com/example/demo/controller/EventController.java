package com.app.demo.controller;

import com.app.demo.model.Event;
import com.app.demo.model.Organizer;
import com.app.demo.model.Venue;
import com.app.demo.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Integer id) {
        return eventService.getEventById(id);
    }

    @PutMapping("/{id}")
    public Event updateEvent(@PathVariable Integer id, @RequestBody Event eventDetails) {
        return eventService.updateEvent(id, eventDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Integer id) {
        eventService.deleteEvent(id);
    }

    @GetMapping("/venue/{venueId}")
    public List<Event> getEventsByVenue(@PathVariable Integer venueId) {
        Venue venue = new Venue();
        venue.setId(venueId);
        return eventService.getEventsByVenue(venue);
    }

    @GetMapping("/organizer/{organizerId}")
    public List<Event> getEventsByOrganizer(@PathVariable Integer organizerId) {
        Organizer organizer = new Organizer();
        organizer.setId(organizerId);
        return eventService.getEventsByOrganizer(organizer);
    }
}