package com.csidigital.rh.shared.dto.response;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class ExternalResourceResponse extends EmployeeResponse{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
}

