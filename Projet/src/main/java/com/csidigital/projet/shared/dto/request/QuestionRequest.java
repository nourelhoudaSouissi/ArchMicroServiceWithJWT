package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.shared.enumeration.InterviewType;
import lombok.Data;

@Data
public class QuestionRequest {
    private String question;
    private InterviewType interviewType;
    private Long AssQuestionInterviewId;
}
