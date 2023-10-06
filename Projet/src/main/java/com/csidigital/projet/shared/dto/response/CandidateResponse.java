package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.shared.enumeration.Provenance;
import lombok.Data;

@Data
public class CandidateResponse  {
    private Long id;
    private Provenance provenance;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeSerialNumber;
    private Long AssOfferCandidateId;




}