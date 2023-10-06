package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.*;
import com.csidigital.projet.dao.repository.ArticleUpdatedRepository;
import com.csidigital.projet.dao.repository.ContractRepository;
import com.csidigital.projet.dao.repository.ResourceRepository;
import com.csidigital.projet.management.service.ContractService;
import com.csidigital.projet.shared.dto.request.ContractRequest;
import com.csidigital.projet.shared.dto.response.ContractResponse;
import com.csidigital.projet.shared.enumeration.Status;
import com.csidigital.projet.shared.exception.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
@AllArgsConstructor
public class ContractImpl implements ContractService {
    @Autowired
    private ContractRepository contractRepository;
    @Autowired
    private ArticleUpdatedRepository articleUpdatedRepository;
    @Autowired

    private ResourceRepository resourceRepository;
    @Autowired
    private ModelMapper modelMapper;


    /*
    @Override
    @Transactional
    public ContractResponse createContract(ContractRequest request) {
        List<ArticleUpdated> articleUpdatedList = new ArrayList<>();
        articleUpdatedList = request.getArticles();
        Resource resource = null;
       if (request.getResourceId() != null) {
           resource = resourceRepository.findById(request.getResourceId())
                   .orElseThrow();}

        Contract contract = modelMapper.map(request, Contract.class);

       ArticleUpdated articleUpdated = modelMapper.map(request ,ArticleUpdated.class);

        articleUpdatedList.add(articleUpdated);
        contract.setArticles( articleUpdatedList);
        contract.setResource(resource);
        contract.setContractStatus(Status.STILL_PENDING);
        Contract contractSaved = contractRepository.save(contract);

       List<ArticleUpdated>  articlesUpdatedSaved = articleUpdatedRepository.saveAll(articleUpdatedList);

        return modelMapper.map(contractSaved, ContractResponse.class);
    }
*/
    @Override
    @Transactional
    public ContractResponse createContract(ContractRequest request) {
        Resource resource = null;
        if (request.getResourceId() != null) {
            resource = resourceRepository.findById(request.getResourceId())
                    .orElseThrow();
        }

        Contract contract = modelMapper.map(request, Contract.class);
        contract.setContractStatus(Status.STILL_PENDING);
        Contract contractSaved = contractRepository.save(contract);


        for (int i =0 ; i< request.getArticles().size(); i++) {
            request.getArticles().get(i).setContract(contract);
            request.getArticles().get(i).setId(null);
            articleUpdatedRepository.save(request.getArticles().get(i));
       }

        return modelMapper.map(contractSaved, ContractResponse.class);
    }


    @Override
    public List<ContractResponse> getAllContracts() {
        List<Contract> contracts = contractRepository.findAll();
        List<ContractResponse> contractResponseList = new ArrayList<>();

        for (Contract contract : contracts) {
            ContractResponse response = modelMapper.map(contract ,ContractResponse.class);
            contractResponseList.add(response);
        }

        return contractResponseList;
    }

    @Override
    public ContractResponse getContractById(Long id) {
        Contract contract = contractRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contract with id " + id + " not found"));
        ContractResponse contractResponse = modelMapper.map(contract, ContractResponse.class);
        return contractResponse;
    }

    @Override
    public ContractResponse updateContract(ContractRequest request, Long id) {
        Contract existingContract = contractRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contract with id: " + id + " not found"));
        modelMapper.map(request, existingContract);
        Contract savedContract = contractRepository.save(existingContract);
        return modelMapper.map(savedContract, ContractResponse.class);
    }

    @Override
    public void deleteContract(Long id) {
        /*contractRepository.deleteById(id);*/
        Contract contract = contractRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Contract not found"));

        // Set the contract field to null for all associated articles
        for (ArticleUpdated article : contract.getArticles()) {
            article.setContract(null);
        }

        // Delete the contract
        contractRepository.delete(contract);
    }

    @Override
    public void updateStatusById(Long id, String contractStatus) {
        contractRepository.updateStatusById(id, contractStatus);
    }

    @Override
    public void updateStatusToAcceptedById(Long id) {
        contractRepository.updateStatusToAcceptedById(id);

    }

    @Override
    public void updateStatusToRefusedById(Long id) {
        contractRepository.updateStatusToRefusedById(id);

    }
    @Override
    public List<BenefitRC> getContractBenefits(Long id) {
        Contract contract = contractRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contract with id " + id + " not found"));
        List<BenefitRC> benefitRC = contract.getBenefitRCSList();

        return benefitRC;
    }

    @Override
    public List<ExceptionalFee> getContractFee(Long id) {

            Contract contract = contractRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Contract with id " + id + " not found"));
            List<ExceptionalFee> exceptionalFee = contract.getExceptionalFeeList();

            return exceptionalFee;
        }

}
