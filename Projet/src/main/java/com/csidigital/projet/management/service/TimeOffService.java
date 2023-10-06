package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.TimeOffRequest;
import com.csidigital.projet.shared.dto.response.TimeOffResponse;

import java.util.List;

public interface TimeOffService {

    TimeOffResponse createTimeOff(TimeOffRequest request);
    List<TimeOffResponse> getAllTimeOff();
    TimeOffResponse getTimeOffById(Long id);

    TimeOffResponse updateTimeOff(TimeOffRequest request, Long id);

    void deleteTimeOff(Long id);

}
