package com.csidigital.projet.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Language implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String language;
    private String additionalInformation;


    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "technicalFileId")
    private TechnicalFile technicalFile;
}


