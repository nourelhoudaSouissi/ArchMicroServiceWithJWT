package com.csidigital.rh.management.service;

import com.csidigital.rh.shared.dto.request.RecoveryLeaveRequest;
import com.csidigital.rh.shared.dto.response.RecoveryLeaveResponse;

import java.util.List;

public interface RecoveryLeaveService {
    RecoveryLeaveResponse createRecoveryLeave(RecoveryLeaveRequest request);
    List<RecoveryLeaveResponse> getAllRecoveryLeaves();
    RecoveryLeaveResponse getRecoveryLeaveById(Long id);

    RecoveryLeaveResponse updateRecoveryLeave(RecoveryLeaveRequest request, Long id);

    void deleteRecoveryLeave(Long id);

    void updateStatusToValidatedById( Long id);

    void updateStatusToRejectedById(Long id);
    int countValidated();
    int countRejected();
    int countPending();
}
