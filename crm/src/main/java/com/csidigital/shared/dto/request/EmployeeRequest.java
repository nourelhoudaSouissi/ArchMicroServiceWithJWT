package com.csidigital.shared.dto.request;

import com.csidigital.dao.entity.Positioning;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeRequest {
    private String lastName;
    private String firstName;
    private List<Positioning> positioningList;
    /*private Civility civility;
    private Title title;
    private LocalDate birthDate;
    private String emailOne;
    private String emailTwo;
    private Integer phoneNumberOne;
    private Integer phoneNumberTwo;
    private String address;
    private Integer postCode;
    private String city;
    private String country;
    //private MaritalSituation maritalSituation;
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
    private Evaluation evaluation;
    @Enumerated(EnumType.STRING)
    private ResourceType resourceType;

    //--------------attributs ResourceInterne------------------
    private String socialSecurityNumber;
    private String bankAccountNumber;
    @Lob
    private String  photo;
    private double leaveBalanceRest;
    private double leaveBalance;
    private Long productivity;
    private String nationalIdentity;
    private LocalDate recruitmentDate;
    private Boolean isEmployee;

    @OneToMany(mappedBy = "employee")
    private List<Contract> contractsList;

    //----------attributs ResourceExterne--------------
    private String serialNumber;

    //private List<Equipment> equipmentList;*/



}