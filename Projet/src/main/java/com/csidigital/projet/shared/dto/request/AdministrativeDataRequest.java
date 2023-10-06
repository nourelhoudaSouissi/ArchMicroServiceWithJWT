package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.shared.enumeration.AvailabilityEnum;
import com.csidigital.projet.shared.enumeration.ContractType;
import com.csidigital.projet.shared.enumeration.Experience;
import lombok.Data;

import java.time.LocalDate;
@Data
public class AdministrativeDataRequest {

    private ContractType contractType;
    private double currentSalary;
    private double expectedSalary;
    private AvailabilityEnum availability;
    private LocalDate availabilityDate;
    private Experience experience;
    private Long employeeId;

}