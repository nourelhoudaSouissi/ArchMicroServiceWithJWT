package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.dao.entity.*;
import lombok.Data;

import java.util.List;

@Data
public class TechnicalFileResponse {
    private Long id ;
    private  String reference;
    private String description;
    private String objective;
    private String driverLicense;
    private List<Skills> skills;
    private List<Experience> experiences;
    private List <Language> languages;
    private List<Certification> certifications;
    private List<Education> educations;
    private Long employeeId;
}
