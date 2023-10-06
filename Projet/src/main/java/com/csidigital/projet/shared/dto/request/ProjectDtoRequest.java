package com.csidigital.projet.shared.dto.request;



import com.csidigital.projet.dao.entity.ResponsableExtern;
import com.csidigital.projet.shared.enumeration.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDtoRequest {
    private String projectReference;
    private String name;
    private String description;
    private Double budget;
    private LocalDate startDate;

    private ProjectType projectType;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private ProjectStatus projectStatus;
    private List<Long> resourceIds;
    private List<ResponsableExtern> responsables;
}
