package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.ExperienceRequest;
import com.csidigital.projet.shared.dto.response.ExperienceResponse;

import java.util.List;

public interface ExperienceService {
    ExperienceResponse createExperience(ExperienceRequest request);
    List<ExperienceResponse> getAllExperiences();
    ExperienceResponse getExperienceById(Long id);

    ExperienceResponse updateExperience(ExperienceRequest request, Long id);

    void deleteExperience(Long id);
}
