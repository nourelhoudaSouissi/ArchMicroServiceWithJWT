package com.csidigital.projet.shared.dto.response;




import com.csidigital.projet.dao.entity.AssResourceProjet;
import com.csidigital.projet.shared.enumeration.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDtoResponse {
    private long id ;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate EndDate;
    private Long estimation;
    private String reference;
    private TaskType taskType;
    private Priority priority;
    private TaskPhase taskPhase;
    private AssResourceProjet assResourceProjet ;
    private Long resourceId;
    private String ResourceN;
}
