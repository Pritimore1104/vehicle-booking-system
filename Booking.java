package com.example.vehiclebooking.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Booking {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    private Vehicle vehicle;

    public Booking() {}
}
