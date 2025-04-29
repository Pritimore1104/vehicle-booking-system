package com.example.vehiclebooking.repository;

import com.example.vehiclebooking.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VehicleJpaRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByVehicleTypeId(Long typeId);
}
