package com.csidigital.rh.shared.dto.request;

import lombok.Data;

@Data
public class QuestionRequest {
    private String question;
    private Long AssQuestionInterviewId;
    private Long categoryNum ;

}
