package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.Evaluation;
import com.csidigital.projet.dao.repository.AdministrativeDataRepository;
import com.csidigital.projet.dao.repository.AssOfferCandidateRepository;
import com.csidigital.projet.dao.repository.EvaluationRepository;
import com.csidigital.projet.management.service.EvaluationService;
import com.csidigital.projet.shared.dto.request.EvaluationRequest;
import com.csidigital.projet.shared.dto.response.EvaluationResponse;
import com.csidigital.projet.shared.exception.ResourceNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
@AllArgsConstructor
public class EvaluationImpl implements EvaluationService {
    @Autowired
    private EvaluationRepository evaluationRepository ;
    @Autowired
    private ModelMapper modelMapper ;
    @Autowired
    private AssOfferCandidateRepository offerCandidateRepository;

    @Autowired
    private AdministrativeDataRepository administrativeDataRepository;
    @Override
    public EvaluationResponse createEvaluation(EvaluationRequest request) {
        Evaluation evaluation = modelMapper.map(request, Evaluation.class);

        Evaluation evaluationSaved = evaluationRepository.save(evaluation);

        return modelMapper.map(evaluationSaved, EvaluationResponse.class);
    }

    @Override
    public List<EvaluationResponse> getAllEvaluations() {
        List<Evaluation> evaluations = evaluationRepository.findAll();
        List<EvaluationResponse> evaluationList = new ArrayList<>();

        for (Evaluation evaluation : evaluations) {
            EvaluationResponse response = modelMapper.map(evaluation, EvaluationResponse.class);
            evaluationList.add(response);
        }

        return evaluationList;
    }

    @Override
    public EvaluationResponse getEvaluationById(Long id) {
        Evaluation evaluation = evaluationRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Evaluation with id " +id+ " not found"));
        EvaluationResponse evaluationResponse = modelMapper.map(evaluation, EvaluationResponse.class);
        return evaluationResponse;
    }

    @Override
    public EvaluationResponse updateEvaluation(EvaluationRequest request, Long id) {
        Evaluation existingEvaluation = evaluationRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Evaluation with id: " + id + " not found"));
        modelMapper.map(request, existingEvaluation);
        Evaluation savedEvaluation = evaluationRepository.save(existingEvaluation);
        return modelMapper.map(savedEvaluation, EvaluationResponse.class);
    }

    @Override
    public void deleteEvaluation(Long id) {
        evaluationRepository.deleteById(id);
    }
}