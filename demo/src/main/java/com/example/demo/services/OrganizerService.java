package com.app.demo.service;

import com.app.demo.model.Organizer;
import com.app.demo.repository.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizerService {
    @Autowired
    private OrganizerRepository organizerRepository;

    public Organizer createOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    public Organizer getOrganizerById(Integer id) {
        return organizerRepository.findById(id).orElse(null);
    }

    public Organizer updateOrganizer(Integer id, Organizer organizerDetails) {
        Organizer organizer = organizerRepository.findById(id).orElse(null);
        if (organizer != null) {
            organizer.setName(organizerDetails.getName());
            organizer.setContactInfo(organizerDetails.getContactInfo());
            return organizerRepository.save(organizer);
        }
        return null;
    }

    public void deleteOrganizer(Integer id) {
        organizerRepository.deleteById(id);
    }
}
