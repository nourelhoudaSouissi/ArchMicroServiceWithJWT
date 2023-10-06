package com.csidigital.projet.shared.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimesheetDtoResponse {
    private long id ;
    private String name;
    private String description;
}
