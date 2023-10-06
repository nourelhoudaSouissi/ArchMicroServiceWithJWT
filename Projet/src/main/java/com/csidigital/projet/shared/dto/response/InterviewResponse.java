package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.shared.enumeration.InterviewMode;
import com.csidigital.projet.shared.enumeration.InterviewType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class InterviewResponse {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDate interviewDate;
    private String comment;
    private String globalMark;
    private InterviewType interviewType;
    private String duration;
    private InterviewMode interviewMode;
    private Set<Long> question;
}

