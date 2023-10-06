package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.dao.entity.AdministrativeData;
import com.csidigital.projet.dao.entity.OfferCandidate;
import com.csidigital.projet.dao.entity.TechnicalFile;
import com.csidigital.projet.shared.enumeration.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeeRequest {
    private String lastName;
    private String firstName;
    private Civility civility;
    private Title title;
    private EmployeeType employeeType;
    private LocalDate birthDate;
    private String emailOne;
    private String emailTwo;
    private Integer phoneNumberOne;
    private Integer phoneNumberTwo;
    private String address;
    private ResourceType resourceType;
    private Integer postCode;
    private String city;
    private String country;
    private MaritalSituation maritalSituation;
    private Integer recommendationMark ;
    private Integer experience ;
    private String experienceDetails ;
    @Enumerated(EnumType.STRING)
    private WorkLocation workLocation;

    @Enumerated(EnumType.STRING)
    private Provenance provenance;
    private String employeeFirstName;
    private String employeeLastName;
    private String EmployeeSerialNumber;
    private List<OfferCandidate> AssOfferCandidateList;

    private EmployeeStatus employeeStatus;
    private Departement departement;
    private TechnicalFile technicalFile ;
    private AdministrativeData administrativeData;

}