package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.AssOfferCandidateRequest;
import com.csidigital.projet.shared.dto.response.AssOfferCandidateResponse;

import java.util.List;

public interface AssOfferCandidateService {
    AssOfferCandidateResponse createAssOfferCandidate(AssOfferCandidateRequest request);
    List<AssOfferCandidateResponse> getAllAssOfferCandidate();
    AssOfferCandidateResponse getAssOfferCandidateById(Long id);

    AssOfferCandidateResponse updateAssOfferCandidate(AssOfferCandidateRequest request, Long id);

    void deleteAssOfferCandidate(Long id);


}
