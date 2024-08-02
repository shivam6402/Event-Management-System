package com.app.demo.service;

import com.app.demo.model.Venue;
import com.app.demo.repository.VenueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenueService {
    @Autowired
    private VenueRepository venueRepository;

    public Venue createVenue(Venue venue) {
        return venueRepository.save(venue);
    }

    public Venue getVenueById(Integer id) {
        return venueRepository.findById(id).orElse(null);
    }

    public Venue updateVenue(Integer id, Venue venueDetails) {
        Venue venue = venueRepository.findById(id).orElse(null);
        if (venue != null) {
            venue.setName(venueDetails.getName());
            venue.setLocation(venueDetails.getLocation());
            venue.setCapacity(venueDetails.getCapacity());
            return venueRepository.save(venue);
        }
        return null;
    }

    public void deleteVenue(Integer id) {
        venueRepository.deleteById(id);
    }
}
