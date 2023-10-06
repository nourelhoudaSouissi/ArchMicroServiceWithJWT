package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.shared.enumeration.ContractBenifitType;
import lombok.Data;

@Data

public class BenefitRCRequest {
    private String shortDescription;
    private String description;
    private ContractBenifitType contractBenifitType;
    private Long contractId;
}

