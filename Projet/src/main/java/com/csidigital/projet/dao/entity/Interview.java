package com.csidigital.projet.dao.entity;

import com.csidigital.projet.shared.enumeration.InterviewMode;
import com.csidigital.projet.shared.enumeration.InterviewType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Interview {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    private LocalDate interviewDate;
    private String comment;
    private String globalMark;
    private InterviewType interviewType;
    private String duration;
    @Enumerated(EnumType.STRING)
    private InterviewMode interviewMode;


    @OneToMany(mappedBy = "interview")
    private List<AssQuestionInterview> assQuestionInterviewList;
}

