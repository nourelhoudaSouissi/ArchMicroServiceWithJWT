package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.shared.enumeration.InterviewMode;
import com.csidigital.projet.shared.enumeration.InterviewType;
import lombok.Data;

import java.time.LocalDate;
@Data
public class InterviewRequest {

    private LocalDate interviewDate;
    private String comment;
    private String globalMark;
    private InterviewType interviewType;
    private String duration;
    private InterviewMode interviewMode;
    private Long AssQuestionInterviewId;
}

