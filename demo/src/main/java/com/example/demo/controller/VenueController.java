package com.app.demo.controller;

import com.app.demo.model.Venue;
import com.app.demo.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/venues")
public class VenueController {
    @Autowired
    private VenueService venueService;

    @PostMapping
    public Venue createVenue(@RequestBody Venue venue) {
        return venueService.createVenue(venue);
    }

    @GetMapping("/{id}")
    public Venue getVenueById(@PathVariable Integer id) {
        return venueService.getVenueById(id);
    }

    @PutMapping("/{id}")
    public Venue updateVenue(@PathVariable Integer id, @RequestBody Venue venueDetails) {
        return venueService.updateVenue(id, venueDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteVenue(@PathVariable Integer id) {
        venueService.deleteVenue(id);
    }
}
