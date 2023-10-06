package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.dao.entity.OfferCandidate;
import lombok.Data;

import java.util.List;

@Data
public class EvaluationRequest {
    private Integer globalAppreciation;
    private List<OfferCandidate>offerCandidates;

}
