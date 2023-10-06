package com.csidigital.projet.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SkillsCategory {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    @Column(name = "title")
    private String title;


    /*@OneToMany(mappedBy = "skillsCategory", cascade = CascadeType.ALL)
    private List<Skills> skillsList;*/
}


