package com.example.vehiclebooking.model;

import jakarta.persistence.*;

@Entity
public class Vehicle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean available;

    @ManyToOne
    private VehicleType vehicleType;

    public Vehicle() {}
    public Vehicle(String name, boolean available, VehicleType vehicleType) {
        this.name = name;
        this.available = available;
        this.vehicleType = vehicleType;
    }
}
