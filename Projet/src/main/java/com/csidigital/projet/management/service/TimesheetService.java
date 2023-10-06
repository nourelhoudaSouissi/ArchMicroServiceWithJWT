package com.csidigital.projet.management.service;


import com.csidigital.projet.shared.dto.request.TimesheetDtoRequest;
import com.csidigital.projet.shared.dto.response.TimesheetDtoResponse;

import java.util.List;

public interface TimesheetService {

    // Get All Timesheet
    List<TimesheetDtoResponse> getAllTimesheets();

    // Get Timesheet by id
    TimesheetDtoResponse getTimesheetById(Long id);

    // Add new Timesheet
    TimesheetDtoResponse createTimesheet(TimesheetDtoRequest timesheetDtoRequest);


    // Update Timesheet by id

    TimesheetDtoResponse updateTimesheet(Long id, TimesheetDtoRequest timesheetDtoRequest);


    //delete Timesheet by id
    void deleteTimesheetById(Long id);
}
