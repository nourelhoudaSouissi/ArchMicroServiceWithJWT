package com.csidigital.rh.shared.dto.request;

import com.csidigital.rh.shared.enumeration.MotifUnavailability;
import lombok.Data;

import java.time.LocalDate;
@Data
public class AvailabilityRequest {
    private LocalDate startDate;
    private LocalDate endDate;
    private Integer period;
    private String comment;
    private MotifUnavailability motifUnavailability;
    private Long employeeNum;

}
