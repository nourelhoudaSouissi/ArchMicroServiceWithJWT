package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.dao.entity.OfferCandidate;
import lombok.Data;

@Data
public class EvaluationResponse {
    private Long Id ;
    private Integer globalAppreciation;
    private OfferCandidate offerCandidate;
}
