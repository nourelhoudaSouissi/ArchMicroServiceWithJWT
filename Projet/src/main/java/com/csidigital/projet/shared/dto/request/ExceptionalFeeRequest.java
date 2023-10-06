package com.csidigital.projet.shared.dto.request;

import com.csidigital.projet.shared.enumeration.Currency;
import com.csidigital.projet.shared.enumeration.FeeType;
import lombok.Data;

@Data
public class ExceptionalFeeRequest {
        private FeeType feeType;
        private String shortDescription;
        private Long amount;
        private Currency currency;
        private String name;
        private Long contractId;

}
