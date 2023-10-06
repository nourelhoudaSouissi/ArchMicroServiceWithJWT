package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.shared.enumeration.ContractType;
import com.csidigital.projet.shared.enumeration.Currency;
import com.csidigital.projet.shared.enumeration.EndContractReason;
import com.csidigital.projet.shared.enumeration.SalaryType;
import lombok.Data;

@Data
public class ResourceContractRequest {

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
