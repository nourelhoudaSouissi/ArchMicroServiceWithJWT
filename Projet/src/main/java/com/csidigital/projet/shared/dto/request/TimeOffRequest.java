package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.shared.enumeration.ExternalTimeOffType;
import com.csidigital.projet.shared.enumeration.RequestStatus;
import com.csidigital.projet.shared.enumeration.TimeOffType;
import lombok.Data;

import java.time.LocalDate;
@Data
public class TimeOffRequest {

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
