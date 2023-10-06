package com.csidigital.rh.shared.dto.response;

import com.csidigital.rh.dao.entity.CalendarMonth;
import com.csidigital.rh.dao.entity.Holiday;
import com.csidigital.rh.dao.entity.WeekendUpdated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class CalendarResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String reference ;
    private String name;
    private String description;

    private LocalDate startDate;
    private LocalDate endDate;
    private Integer accountingPeriod;
    private List<Holiday> holidays;
    private List<WeekendUpdated> weekendUpdateds  ;
    private List<CalendarMonth> calendarMonths;



}
