package com.csidigital.projet.shared.dto.response;

import lombok.Data;

import java.time.LocalDate;
@Data
public class CertificationResponse {
    private Long id;

    private LocalDate certificationObtainedDate;
    private String certificationTitle;

    private Long technicalFileId ;

}