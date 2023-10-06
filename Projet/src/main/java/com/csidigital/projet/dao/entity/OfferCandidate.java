package com.csidigital.projet.dao.entity;

import com.csidigital.projet.shared.enumeration.ExperienceLevel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferCandidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate applicationDate;
    @Enumerated(EnumType.STRING)
    private ExperienceLevel experienceLevel;




    @JsonIgnore
    @ManyToOne @JoinColumn(name = "id_offer")
    private Offer offer;

    @JsonIgnore
    @ManyToOne @JoinColumn(name = "id_employee")
    private Employee employee;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "evaluation_id", referencedColumnName = "id")
    private Evaluation evaluation;

}