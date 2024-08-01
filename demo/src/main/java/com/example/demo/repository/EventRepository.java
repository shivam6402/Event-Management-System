package com.app.demo.repository;

import com.app.demo.model.Event;
import com.app.demo.model.Organizer;
import com.app.demo.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    List<Event> findByVenue(Venue venue);
    List<Event> findByOrganizer(Organizer organizer);
}
