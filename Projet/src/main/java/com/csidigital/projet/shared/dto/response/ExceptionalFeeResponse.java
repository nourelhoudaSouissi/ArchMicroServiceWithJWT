package com.csidigital.projet.shared.dto.response;

import com.csidigital.projet.shared.enumeration.Currency;
import com.csidigital.projet.shared.enumeration.FeeType;
import lombok.Data;

@Data
public class ExceptionalFeeResponse {
    private Long Id ;
    private FeeType feeType;
    private String shortDescription;
    private Long amount;
    private Currency currency;
    private String name;
    private Long contractId;

}
