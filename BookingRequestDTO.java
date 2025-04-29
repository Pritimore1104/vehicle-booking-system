package com.example.vehiclebooking.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class BookingRequestDTO {
    private String firstName;
    private String lastName;
    private Long vehicleId;
    private LocalDate startDate;
    private LocalDate endDate;
}
