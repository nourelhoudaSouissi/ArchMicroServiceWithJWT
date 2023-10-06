package com.csidigital.projet.dao.entity;

import com.csidigital.projet.shared.enumeration.Absence;
import com.csidigital.projet.shared.enumeration.FeeType;
import com.csidigital.projet.shared.enumeration.RequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ExpenseReport {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private LocalDate billingDate;
    @Enumerated(EnumType.STRING)
    private FeeType feeType;
    @Enumerated(EnumType.STRING)
    private Absence absence;
    private String description;
    private double amount;
    private double currency;
    private Boolean customerBilling;
    private Boolean paid;
    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus;
    private Boolean advance;
    private double advanceAmount;
    private double advanceRest;
    private double fixedAmount;
    private double feeSum;

}


