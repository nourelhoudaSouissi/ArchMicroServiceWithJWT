package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.dao.entity.ArticleUpdated;
import com.csidigital.projet.dao.entity.BenefitRC;
import com.csidigital.projet.dao.entity.ExceptionalFee;
import com.csidigital.projet.shared.enumeration.Status;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ContractRequest {

    private LocalDate startDate;
    private LocalDate endDate;
    private String contractTitle;

    private String contractPlace;
    private LocalDate contractDate;
    private Byte[] entrepriseSignature;
    private String commentContract;
    private String contractIntroduction;


    private List<ArticleUpdated> articles  ;
    private Status contractStatus;
    private List<BenefitRC> benefitRCSList;
    private List<ExceptionalFee>  ExceptionalFeeList;
    private Long resourceId;
}
