package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.CertificationRequest;
import com.csidigital.projet.shared.dto.response.CertificationResponse;

import java.util.List;

public interface CertificationService {
    CertificationResponse createCertification(CertificationRequest request);
    List<CertificationResponse> getAllCertifications();
    CertificationResponse getCertificationById(Long id);

    CertificationResponse updateCertification(CertificationRequest request, Long id);

    void deleteCertification(Long id);
}
