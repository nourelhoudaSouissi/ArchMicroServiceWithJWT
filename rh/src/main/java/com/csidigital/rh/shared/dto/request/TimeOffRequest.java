package com.csidigital.rh.shared.dto.request;

import com.csidigital.rh.shared.enumeration.ExternalTimeOffType;
import com.csidigital.rh.shared.enumeration.RequestStatus;
import com.csidigital.rh.shared.enumeration.TimeOfTimeType;
import com.csidigital.rh.shared.enumeration.TimeOffPeriodType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDate;
@Data
public class TimeOffRequest {


    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double timeOffPeriod;
    private String comment;
    private LocalDate requestInputDate;
    private RequestStatus requestStatus;
    private LocalDate validationDate;
    private ExternalTimeOffType externalTimeOffType;
    private Long leaveTypeNum;
    private Long employeeNum;
    private String employeeFirstName;
    private String employeeLastName;
    private String justificationDoc;

    @Enumerated(EnumType.STRING)
    private TimeOffPeriodType timeOffPeriodType;
    @Enumerated(EnumType.STRING)
    private TimeOfTimeType timeOfTimeType;

}
