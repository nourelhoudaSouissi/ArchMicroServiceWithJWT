package com.csidigital.projet.shared.dto.response;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.time.LocalDate;
@Data
public class AvailabilityResponse {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer period;
}
