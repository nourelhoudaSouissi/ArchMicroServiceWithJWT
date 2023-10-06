package com.csidigital.rh.management.service;


import com.csidigital.rh.shared.dto.request.AssEquipmentEmployeeRequest;
import com.csidigital.rh.shared.dto.response.AssEquipmentEmployeeResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssEquipmentEmployeeService {
    AssEquipmentEmployeeResponse createAssEquipmentEmployee( AssEquipmentEmployeeRequest request);
    List<AssEquipmentEmployeeResponse> getAllAssEquipmentEmployee();
    AssEquipmentEmployeeResponse getAssEquipmentEmployeeById(Long id);

    AssEquipmentEmployeeResponse updateAssEquipmentEmployee(AssEquipmentEmployeeRequest request, Long id);

    void deleteAssEquipmentEmployee(Long id);
}
