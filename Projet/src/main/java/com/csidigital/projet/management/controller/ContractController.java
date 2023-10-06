package com.csidigital.projet.management.controller;

import com.csidigital.projet.dao.entity.BenefitRC;
import com.csidigital.projet.dao.entity.ExceptionalFee;
import com.csidigital.projet.management.service.impl.ContractImpl;
import com.csidigital.projet.shared.dto.request.ContractRequest;
import com.csidigital.projet.shared.dto.response.ContractResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Transactional
@RequestMapping("/rh/contract")
public class ContractController {

    @Autowired
    private ContractImpl contract;

    @GetMapping("/getAll")
    public List<ContractResponse> getAllContracts(){
        return contract.getAllContracts();
    }

    @GetMapping("/getContract/{id}")
    public ContractResponse getContractById(@PathVariable Long id){
        return contract.getContractById(id);
    }

    @PostMapping("/addContract")
    public ContractResponse createContract(@Valid @RequestBody ContractRequest contractRequest){
        return contract.createContract(contractRequest);
    }

    @PutMapping("/updateContract/{id}")
    public ContractResponse updateContract(@Valid @RequestBody ContractRequest contractRequest,
                                                     @PathVariable Long id){
        return contract.updateContract(contractRequest, id);
    }

    @DeleteMapping("/deleteContract/{id}")
    public void deleteContract(@PathVariable Long id){
        contract.deleteContract(id);
    }
    @PutMapping("/updateStatusById")
    void updateStatusById(Long id, String contractStatus){
        contract.updateStatusById(id, contractStatus);
    }
    @PutMapping("/updateToAcceptedById")
    void updateStatusToAcceptedById(Long id){
        contract.updateStatusToAcceptedById(id);
    }
    @PutMapping("/updateToRefusedById")
    void updateStatusToRefusedById(Long id){
        contract.updateStatusToRefusedById(id);
    }
    @GetMapping("/{id}/getContractFee")
    public  List<ExceptionalFee> getContractFee(@PathVariable Long id)
    {
       return contract.getContractFee(id);
    }
    @GetMapping("/{id}/getContractBenefits")
    public  List<BenefitRC> getContractBenefits(@PathVariable Long id)
    {
       return contract.getContractBenefits(id);
    }
}
