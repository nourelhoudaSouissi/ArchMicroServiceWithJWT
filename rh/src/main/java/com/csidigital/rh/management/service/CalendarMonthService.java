package com.csidigital.rh.management.service;

import com.csidigital.rh.shared.dto.request.CalendarMonthRequest;
import com.csidigital.rh.shared.dto.response.CalendarMonthResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CalendarMonthService {
    CalendarMonthResponse createCalendarMonth(CalendarMonthRequest request);
    List<CalendarMonthResponse> getAllCalendarsMonth();
    CalendarMonthResponse getCalendarMonthById(Long id);

    CalendarMonthResponse updateCalendarMonth(CalendarMonthRequest request, Long id);

    void deleteCalendarMonth(Long id);
}
