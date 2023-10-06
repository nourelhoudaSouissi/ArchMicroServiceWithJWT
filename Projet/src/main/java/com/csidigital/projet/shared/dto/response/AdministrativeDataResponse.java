package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.dao.entity.Evaluation;

import com.csidigital.projet.dao.entity.Experience;
import com.csidigital.projet.shared.enumeration.*;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AdministrativeDataResponse {
    private Long id ;
    @Enumerated(EnumType.STRING)
    private ContractType contractType;
    private double currentSalary;
    private double expectedSalary;
    @Enumerated(EnumType.STRING)
    private AvailabilityEnum availability;
    private LocalDate availabilityDate;
    @Enumerated(EnumType.STRING)
    private Experience experience;
    private Evaluation evaluation;

}
