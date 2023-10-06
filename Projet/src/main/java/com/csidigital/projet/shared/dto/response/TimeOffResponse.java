package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.shared.enumeration.ExternalTimeOffType;
import com.csidigital.projet.shared.enumeration.RequestStatus;
import com.csidigital.projet.shared.enumeration.TimeOffType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.time.LocalDate;
@Data

public class TimeOffResponse {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    private TimeOffType timeOffType;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String timeOffPeriod;
    private String comment;
    private LocalDate requestInputDate;
    private RequestStatus requestStatus;
    private LocalDate validationDate;
    private ExternalTimeOffType externalTimeOffType;
}
