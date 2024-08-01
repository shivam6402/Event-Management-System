package com.app.demo.service;

import com.app.demo.model.Event;
import com.app.demo.model.Organizer;
import com.app.demo.model.Venue;
import com.app.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Integer id) {
        return eventRepository.findById(id).orElse(null);
    }

    public Event updateEvent(Integer id, Event eventDetails) {
        Event event = eventRepository.findById(id).orElse(null);
        if (event != null) {
            event.setEventName(eventDetails.getEventName());
            event.setEventDate(eventDetails.getEventDate());
            event.setDescription(eventDetails.getDescription());
            event.setOrganizer(eventDetails.getOrganizer());
            event.setVenue(eventDetails.getVenue());
            return eventRepository.save(event);
        }
        return null;
    }

    public void deleteEvent(Integer id) {
        eventRepository.deleteById(id);
    }

    public List<Event> getEventsByVenue(Venue venue) {
        return eventRepository.findByVenue(venue);
    }

    public List<Event> getEventsByOrganizer(Organizer organizer) {
        return eventRepository.findByOrganizer(organizer);
    }
}
