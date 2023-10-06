package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.dao.entity.Contract;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data
public class ArticleResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String articleTitle;
    private String description;
    private List<Contract> contracts;
}
