package com.csidigital.projet.shared.dto.response;



import com.csidigital.projet.dao.entity.Resource;
import com.csidigital.projet.dao.entity.Task;
import com.csidigital.projet.shared.enumeration.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class SousTacheResponse {
   private Long id ;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate EndDate;
    private Long estimation;
    private Long progression ;
    private TaskType taskType;
    private Priority priority;
    private TaskPhase taskPhase;
    private Resource resource;
    private Integer remaining ;
 private LocalDate realStartDate;
    private LocalDate realEndDate;
    private Date creationDate ;
    private LocalDate projectionDate;
 private String subTaskReference;
    private Task task ;
}
