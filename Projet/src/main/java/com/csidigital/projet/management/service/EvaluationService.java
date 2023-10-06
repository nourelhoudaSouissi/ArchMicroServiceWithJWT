package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.EvaluationRequest;
import com.csidigital.projet.shared.dto.response.EvaluationResponse;

import java.util.List;

public interface EvaluationService {
    EvaluationResponse createEvaluation(EvaluationRequest request);
    List<EvaluationResponse> getAllEvaluations();
    EvaluationResponse getEvaluationById(Long id);

    EvaluationResponse updateEvaluation(EvaluationRequest request, Long id);

    void deleteEvaluation(Long id);
}
