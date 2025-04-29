package com.example.vehiclebooking.controller;

import com.example.vehiclebooking.dto.BookingRequestDTO;
import com.example.vehiclebooking.model.*;
import com.example.vehiclebooking.repository.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookingController {

    private final VehicleTypeJpaRepository typeRepo;
    private final VehicleJpaRepository vehicleRepo;
    private final BookingJpaRepository bookingRepo;

    public BookingController(VehicleTypeJpaRepository typeRepo, VehicleJpaRepository vehicleRepo, BookingJpaRepository bookingRepo) {
        this.typeRepo = typeRepo;
        this.vehicleRepo = vehicleRepo;
        this.bookingRepo = bookingRepo;
    }

    @GetMapping("/vehicle-types")
    public List<VehicleType> getVehicleTypes(@RequestParam int wheels) {
        return typeRepo.findByWheels(wheels);
    }

    @GetMapping("/vehicles")
    public List<Vehicle> getVehicles(@RequestParam Long typeId) {
        return vehicleRepo.findByVehicleTypeId(typeId);
    }

    @PostMapping("/bookings")
    public String book(@RequestBody BookingRequestDTO dto) {
        Vehicle vehicle = vehicleRepo.findById(dto.getVehicleId()).orElseThrow();
        boolean conflict = bookingRepo.existsByVehicleAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
                vehicle, dto.getEndDate(), dto.getStartDate());
        if (conflict) return "Vehicle already booked";
        Booking booking = new Booking();
        booking.setFirstName(dto.getFirstName());
        booking.setLastName(dto.getLastName());
        booking.setStartDate(dto.getStartDate());
        booking.setEndDate(dto.getEndDate());
        booking.setVehicle(vehicle);
        bookingRepo.save(booking);
        return "Booking successful";
    }
}
