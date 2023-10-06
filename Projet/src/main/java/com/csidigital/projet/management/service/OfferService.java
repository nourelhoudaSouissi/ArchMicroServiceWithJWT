package com.csidigital.projet.management.service;
import com.csidigital.projet.shared.dto.request.OfferRequest;
import com.csidigital.projet.shared.dto.response.OfferResponse;

import java.util.List;

public interface OfferService {
    OfferResponse createOffer(OfferRequest request);
    List<OfferResponse> getAllOffer();
    OfferResponse getOfferById(Long id);

    OfferResponse updateOffer(OfferRequest request, Long id);

    void deleteOffer(Long id);

}

