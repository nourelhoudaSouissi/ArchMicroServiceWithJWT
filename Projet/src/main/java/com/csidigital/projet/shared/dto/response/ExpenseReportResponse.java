package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.shared.enumeration.Absence;
import com.csidigital.projet.shared.enumeration.FeeType;
import com.csidigital.projet.shared.enumeration.RequestStatus;
import lombok.Data;

import java.time.LocalDate;
@Data
public class ExpenseReportResponse {
    private Long Id ;
    private LocalDate billingDate;
    private FeeType feeType;
    private Absence absence;
    private String description;
    private double amount;
    private double currency;
    private Boolean customerBilling;
    private Boolean paid;
    private RequestStatus requestStatus;
    private Boolean advance;
    private double advanceAmount;
    private double advanceRest;
    private double fixedAmount;
    private double feeSum;
}
