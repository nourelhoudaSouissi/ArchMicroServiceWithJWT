package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.shared.enumeration.Provenance;
import lombok.Data;

@Data
public class CandidateRequest  {
    private Provenance provenance;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeSerialNumber;
    private Long AssOfferCandidateId;




}

