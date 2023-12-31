package com.csidigital.rh.management.service;

import com.csidigital.rh.dao.entity.Offer;
import com.csidigital.rh.shared.dto.request.AssOfferCandidateRequest;
import com.csidigital.rh.shared.dto.response.AssOfferCandidateResponse;

import java.util.List;

public interface AssOfferCandidateService {
    AssOfferCandidateResponse createAssOfferCandidate(AssOfferCandidateRequest request);
    List<AssOfferCandidateResponse> getAllAssOfferCandidate();
    AssOfferCandidateResponse getAssOfferCandidateById(Long id);
    List<Offer> getOffersByEmployeeId(Long employeeId);

    AssOfferCandidateResponse updateAssOfferCandidate(AssOfferCandidateRequest request, Long id);

    void deleteAssOfferCandidate(Long id);


}