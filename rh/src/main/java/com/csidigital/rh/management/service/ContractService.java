package com.csidigital.rh.management.service;

import com.csidigital.rh.dao.entity.BenefitRC;
import com.csidigital.rh.dao.entity.Contract;
import com.csidigital.rh.dao.entity.ExceptionalFee;
import com.csidigital.rh.shared.dto.request.ContractRequest;
import com.csidigital.rh.shared.dto.response.ContractResponse;

import java.util.List;

public interface ContractService {
    ContractResponse createContract(ContractRequest request);
    List<ContractResponse> getAllContracts();
    ContractResponse getContractById(Long id);

    ContractResponse updateContract(ContractRequest request, Long id);

    void deleteContract(Long id);
    void updateStatusById(Long id, String contractStatus);
    void updateStatusToAcceptedById(Long id);
    void updateStatusToRefusedById(Long id);
    void updateStatusToExpiredById(Long id);
    List<BenefitRC> getContractBenefits(Long id);
    List<ExceptionalFee> getContractFee(Long id);

    void updateStatusToSentById(Long id);

    int countContractsByStillPendingStatus();

    int countContractsByRefusedStatus();
    int countContractsByAcceptedStatus();
    int countContractsBySentStatus();
    int countContractsByExpiredStatus();

    List<Contract> getAllAccepted();
}
