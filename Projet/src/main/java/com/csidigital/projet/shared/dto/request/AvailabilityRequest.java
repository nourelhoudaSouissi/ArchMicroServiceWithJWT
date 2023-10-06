package com.csidigital.projet.shared.dto.request;

import lombok.Data;

import java.time.LocalDate;
@Data
public class AvailabilityRequest {
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer period;
}
