package com.example.vehiclebooking.repository;

import com.example.vehiclebooking.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingJpaRepository extends JpaRepository<Booking, Long> {
    boolean existsByVehicleAndStartDateLessThanEqualAndEndDateGreaterThanEqual(
        Vehicle vehicle, java.time.LocalDate endDate, java.time.LocalDate startDate
    );
}
