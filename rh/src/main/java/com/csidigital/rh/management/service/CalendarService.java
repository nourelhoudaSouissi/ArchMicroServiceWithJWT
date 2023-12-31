package com.csidigital.rh.management.service;

import com.csidigital.rh.dao.entity.CalendarMonth;
import com.csidigital.rh.dao.entity.Holiday;
import com.csidigital.rh.dao.entity.WeekendUpdated;
import com.csidigital.rh.shared.dto.request.CalendarRequest;
import com.csidigital.rh.shared.dto.response.CalendarResponse;

import java.util.List;

public interface CalendarService {
    CalendarResponse createCalendar(CalendarRequest request);
    List<CalendarResponse> getAllCalendars();
    CalendarResponse getCalendarById(Long id);

    CalendarResponse updateCalendar(CalendarRequest request, Long id);

    void deleteCalendar(Long id);

    Long countCalendars();

    List<WeekendUpdated> getCalendarWeekends(Long id);

    List<Holiday> getCalendarHolidays(Long id);

    List<CalendarMonth> getCalendarMonths(Long id);

}
