package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.shared.enumeration.ExperienceLevel;
import lombok.Data;

import java.time.LocalDate;
@Data

public class AssOfferCandidateResponse {
    private Long id;

    private LocalDate applicationDate;
    private ExperienceLevel experienceLevel;



    private Long offerNum;
    private Long employeeNum;
    private Long evaluationNum;


}
