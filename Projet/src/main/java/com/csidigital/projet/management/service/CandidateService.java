package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.CandidateRequest;
import com.csidigital.projet.shared.dto.response.CandidateResponse;

import java.util.List;

public interface CandidateService {
    CandidateResponse createCandidate(CandidateRequest request);
    List<CandidateResponse> getAllCandidates();
    CandidateResponse getCandidateById(Long id);

    CandidateResponse updateCandidate(CandidateRequest request, Long id);

    void deleteCandidate(Long id);
}
