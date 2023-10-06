package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.TechnicalFileRequest;
import com.csidigital.projet.shared.dto.response.EducationResponse;
import com.csidigital.projet.shared.dto.response.TechnicalFileResponse;

import java.util.List;

public interface TechnicalFileService {
    TechnicalFileResponse createTechnicalFile(TechnicalFileRequest request);
    List<TechnicalFileResponse> getAllTechnicalFiles();
    TechnicalFileResponse getTechnicalFileById(Long id);
    TechnicalFileResponse getTechnicalFileByEmployeeId(Long id);
   List <EducationResponse> getTechnicalFileEducation(Long id);

    TechnicalFileResponse updateTechnicalFile(TechnicalFileRequest request, Long id);

    void deleteTechnicalFile(Long id);
}