package com.csidigital.projet.dao.entity;

import com.csidigital.projet.shared.enumeration.ContractType;
import com.csidigital.projet.shared.enumeration.Currency;
import com.csidigital.projet.shared.enumeration.EndContractReason;
import com.csidigital.projet.shared.enumeration.SalaryType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ResourceContract {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    @Enumerated(EnumType.STRING)
    private ContractType contractType;
    private String trialPeriod;
    @Enumerated(EnumType.STRING)
    private EndContractReason endContractReason;
    @Enumerated(EnumType.STRING)
    private SalaryType salaryType;
    private Long changeCoefficient;
    private double contractFees;
    private String workingTime;
    @Enumerated(EnumType.STRING)
    private Currency currency;
    private double averageDailyCost;
    private double rateDailyCost;

}