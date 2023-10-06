package com.csidigital.projet.shared.dto.request;

import lombok.Data;

@Data
public class ArticleRequest {


    private String articleTitle;
    private String description;

    private Long contractId;

}
