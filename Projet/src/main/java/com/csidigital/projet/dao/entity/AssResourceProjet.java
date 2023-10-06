package com.csidigital.projet.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class AssResourceProjet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
