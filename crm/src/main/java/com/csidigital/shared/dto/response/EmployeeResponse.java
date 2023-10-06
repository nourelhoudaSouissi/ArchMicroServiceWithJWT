package com.csidigital.shared.dto.response;

import com.csidigital.dao.entity.Positioning;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeResponse {
    private Long Id;
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
    @Enumerated(EnumType.STRING)
    private ResourceType resourceType;

    private MaritalSituation maritalSituation;
    private Integer recommendationMark ;
    private Integer experience ;
    private String experienceDetails ;

    private EmployeeStatus employeeStatus;

    private WorkLocation workLocation;

    private Departement departement;

    private TechnicalFile technicalFile;

    private List<OfferCandidate> offerCandidateList;
    private Evaluation evaluation;*/
    ///---------------attributs ResourceInterne------------------------
    /*private String socialSecurityNumber;
    private String bankAccountNumber;
    @Lob
    private String  photo;
    private double leaveBalanceRest;
    private double leaveBalance;
    private Long productivity;
    private String nationalIdentity;
    private LocalDate recruitmentDate;
    private Boolean isEmployee;*/

    /*@OneToMany(mappedBy = "employee")
    private List<Contract> contractsList;
    //----------attributs Backoffice-------------------
    private String test;
    //----------attributs ResourceExterne--------------
    private String serialNumber;

    private List<Equipment> equipmentList;*/

}