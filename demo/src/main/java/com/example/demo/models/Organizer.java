package com.example.demo.models;

import javax.persistence.*;

import java.util.List;

@Entity
public class Organizer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String contactInfo;

    @OneToMany(mappedBy = "organizer")
    private List<Event> events;

    // Getters and Setters
}
