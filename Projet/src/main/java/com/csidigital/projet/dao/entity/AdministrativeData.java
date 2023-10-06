package com.csidigital.projet.dao.entity;

import com.csidigital.projet.shared.enumeration.AvailabilityEnum;
import com.csidigital.projet.shared.enumeration.ContractType;
import com.csidigital.projet.shared.enumeration.Experience;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdministrativeData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "contractType")
    private ContractType contractType;
    @Column(name = "currentSalary")
    private double currentSalary;
    @Column(name = "expectedSalary")
    private double expectedSalary;
    @Enumerated(EnumType.STRING)
    @Column(name = "availability")
    private AvailabilityEnum availability;
    @Column(name = "availabilityDate")
    private LocalDate availabilityDate;
    @Enumerated(EnumType.STRING)
    @Column(name = "experience")
    private Experience experience;



    @JsonIgnore
    @OneToOne (
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "employeeId")
    private Employee employee;

}