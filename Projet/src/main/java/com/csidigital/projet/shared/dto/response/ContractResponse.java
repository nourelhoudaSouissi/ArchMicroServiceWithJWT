package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.dao.entity.ArticleUpdated;
import com.csidigital.projet.dao.entity.BenefitRC;
import com.csidigital.projet.dao.entity.ExceptionalFee;
import com.csidigital.projet.shared.enumeration.Status;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContractResponse {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDate startDate;
    private String contractTitle;
    private LocalDate endDate;
    private String contractPlace;

    private String contractIntroduction;
    private LocalDate contractDate;
    private Byte[] entrepriseSignature;
    private List<ArticleUpdated> articles ;
    private String commentContract;
    private Status contractStatus;
    private List<BenefitRC> benefitRCSList;
    private List<ExceptionalFee>  ExceptionalFeeList;
    private Long resourceId;
}
