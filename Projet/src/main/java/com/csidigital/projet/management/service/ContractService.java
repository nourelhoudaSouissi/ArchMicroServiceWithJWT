package com.csidigital.projet.management.service;

import com.csidigital.projet.dao.entity.BenefitRC;
import com.csidigital.projet.dao.entity.ExceptionalFee;
import com.csidigital.projet.shared.dto.request.ContractRequest;
import com.csidigital.projet.shared.dto.response.ContractResponse;

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
    public List<BenefitRC> getContractBenefits(Long id);
    public List<ExceptionalFee> getContractFee(Long id);
}
