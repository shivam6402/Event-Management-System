package com.app.demo.controller;

import com.app.demo.model.Organizer;
import com.app.demo.service.OrganizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/organizers")
public class OrganizerController {
    @Autowired
    private OrganizerService organizerService;

    @PostMapping
    public Organizer createOrganizer(@RequestBody Organizer organizer) {
        return organizerService.createOrganizer(organizer);
    }

    @GetMapping("/{id}")
    public Organizer getOrganizerById(@PathVariable Integer id) {
        return organizerService.getOrganizerById(id);
    }

    @PutMapping("/{id}")
    public Organizer updateOrganizer(@PathVariable Integer id, @RequestBody Organizer organizerDetails) {
        return organizerService.updateOrganizer(id, organizerDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteOrganizer(@PathVariable Integer id) {
        organizerService.deleteOrganizer(id);
    }
}
