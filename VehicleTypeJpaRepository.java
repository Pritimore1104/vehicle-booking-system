package com.example.vehiclebooking.repository;

import com.example.vehiclebooking.model.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VehicleTypeJpaRepository extends JpaRepository<VehicleType, Long> {
    List<VehicleType> findByWheels(int wheels);
}
