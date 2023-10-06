package com.csidigital.projet.management.controller;

import com.csidigital.projet.management.service.impl.CandidateImpl;
import com.csidigital.projet.shared.dto.request.CandidateRequest;
import com.csidigital.projet.shared.dto.response.CandidateResponse;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Transactional
@RequestMapping("/rhm/candidate")
public class CandidateController {
    @Autowired
    private CandidateImpl candidate;

    @GetMapping("/getAll")
    public List<CandidateResponse> getAllCandidates(){
        return candidate.getAllCandidates();
    }

    @GetMapping("/getCandidate/{id}")
    public CandidateResponse getCandidateById(@PathVariable Long id){
        return candidate.getCandidateById(id);
    }

    @PostMapping("/addCandidate")
    public CandidateResponse createCandidate(@Valid @RequestBody CandidateRequest candidateRequest){
        return candidate.createCandidate(candidateRequest);
    }

    @PutMapping("/updateCandidate/{id}")
    public CandidateResponse updateCandidate(@Valid @RequestBody CandidateRequest candidateRequest,
                                                          @PathVariable Long id){
        return candidate.updateCandidate(candidateRequest, id);
    }

    @DeleteMapping("/deleteCandidate/{id}")
    public void deleteCandidate(@PathVariable Long id){
        candidate.deleteCandidate(id);
    }

}
