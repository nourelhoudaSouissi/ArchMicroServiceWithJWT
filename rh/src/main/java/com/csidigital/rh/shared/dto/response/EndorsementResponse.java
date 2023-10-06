package com.csidigital.rh.shared.dto.response;


import com.csidigital.rh.dao.entity.Contract;
import com.csidigital.rh.shared.enumeration.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EndorsementResponse {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String reference;
    @Column(name = "title")
    private String title;
    @Column(name = "nationalBRNumber")
    private String nationalBRNumber;
    @Column(name = "address")
    private String address;
    @Column(name = "endorsementDate")
    private LocalDate endorsementDate;
    @Column(name = "object")
    private String object;
    @Column(name = "note")
    private String note;

    private LocalDate validityDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    private Contract contract;

}
