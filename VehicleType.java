package com.example.vehiclebooking.model;

import jakarta.persistence.*;

@Entity
public class VehicleType {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int wheels;

    public VehicleType() {}
    public VehicleType(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }
}
