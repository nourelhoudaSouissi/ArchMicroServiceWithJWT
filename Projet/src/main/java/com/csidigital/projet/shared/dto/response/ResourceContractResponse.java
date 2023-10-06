package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.shared.enumeration.ContractType;
import com.csidigital.projet.shared.enumeration.Currency;
import com.csidigital.projet.shared.enumeration.EndContractReason;
import com.csidigital.projet.shared.enumeration.SalaryType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
public class ResourceContractResponse {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    private ContractType contractType;
    private String trialPeriod;
    private EndContractReason endContractReason;
    private SalaryType salaryType;
    private Long changeCoefficient;
    private double contractFees;
    private String workingTime;
    private Currency currency;
    private double averageDailyCost;
    private double rateDailyCost;

}
