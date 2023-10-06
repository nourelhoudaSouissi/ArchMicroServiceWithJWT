package com.csidigital.projet.management.service;

import com.csidigital.projet.shared.dto.request.QuestionRequest;
import com.csidigital.projet.shared.dto.response.QuestionResponse;

import java.util.List;

public interface QuestionService {
    QuestionResponse createQuestion(QuestionRequest request);
    List<QuestionResponse> getAllQuestion();
    QuestionResponse getQuestionById(Long id);

    QuestionResponse updateQuestion(QuestionRequest request, Long id);

    void deleteQuestion(Long id);

}
