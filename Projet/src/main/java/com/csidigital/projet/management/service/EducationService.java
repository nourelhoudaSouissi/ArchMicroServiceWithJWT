package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.EducationRequest;
import com.csidigital.projet.shared.dto.response.EducationResponse;

import java.util.List;

public interface EducationService {
    EducationResponse createEducation(EducationRequest request);
    List<EducationResponse> getAllEducations();
    EducationResponse getEducationById(Long id);

    EducationResponse updateEducation(EducationRequest request, Long id);

    void deleteEducation(Long id);
}
