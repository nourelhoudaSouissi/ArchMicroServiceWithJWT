package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.BackOfficeRequest;
import com.csidigital.projet.shared.dto.response.BackOfficeResponse;

import java.util.List;

public interface BackOfficeService {
    BackOfficeResponse createBackoffice(BackOfficeRequest request);
    List<BackOfficeResponse> getAllBackOffice();
    BackOfficeResponse getBackOfficeById(Long id);

    BackOfficeResponse updateBackOffice(BackOfficeRequest request, Long id);

    void deleteBackOffice(Long id);

}


