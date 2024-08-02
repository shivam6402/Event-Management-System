package com.example.demo.models;

import javax.persistence.*;

@Entity
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String location;
    private int capacity;

    @OneToOne(mappedBy = "venue")
    private Event event;

    // Getters and Setters
}
