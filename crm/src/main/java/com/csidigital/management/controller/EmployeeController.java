package com.csidigital.management.controller;

import com.csidigital.management.service.implementation.EmployeeImpl;
import com.csidigital.shared.dto.request.EmployeeRequest;
import com.csidigital.shared.dto.response.EmployeeResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/crm/employee")
public class EmployeeController {
    @Autowired
    private EmployeeImpl employeeService;

    @Autowired
    public EmployeeController(EmployeeImpl employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("")
    public List<EmployeeResponse> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeResponse getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    /*@GetMapping("/get/{id}/technicalFile")
    public TechnicalFileResponse getEmployeeTechnicalFile(@PathVariable Long id) {
        return employeeService.getEmployeeTechnicalFile(id);
    }

    @GetMapping("get/{id}/education")
    public List<EducationResponse> getEmployeeEducation(@PathVariable Long id) {
        return employeeService.getEmployeeEducation(id);
    }

    @GetMapping("get/{id}/experience")
    public List<ExperienceResponse> getEmployeeExperience(@PathVariable Long id) {
        return employeeService.getEmployeeExperience(id);
    }

    @GetMapping("get/{id}/certificaton")
    public List<CertificationResponse> getEmployeeCertification(@PathVariable Long id) {
        return employeeService.getEmployeeCertification(id);
    }

    @GetMapping("get/{id}/language")
    public List<LanguageResponse> getEmployeeLanguage(@PathVariable Long id) {
        return employeeService.getEmployeeLanguage(id);
    }

    @GetMapping("get/{id}/skills")
    public List<SkillsResponse> getEmployeeSkills(@PathVariable Long id) {
        return employeeService.getEmployeeSkills(id);
    }

    @GetMapping("get/{id}/candidature")
    public List<AssOfferCandidateResponse> getOfferCandidates(@PathVariable Long id) {
        return employeeService.getOfferCandidates(id);
    }*/

    @PostMapping()
    public EmployeeResponse createEmployee(@Valid @RequestBody EmployeeRequest employeeRequest) {
        return employeeService.createEmployee(employeeRequest);
    }

    @PutMapping("/{id}")
    public EmployeeResponse updateEmployee(@Valid @RequestBody EmployeeRequest employeeRequest,
                                           @PathVariable Long id) {
        return employeeService.updateEmployee(employeeRequest, id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    /*@GetMapping("/testV1")
    public List<Employee> getEmployee() {
        return employeeService.findByEmployeeStatus();
    }

    @GetMapping("/getAllCandidates")
    public List<Employee> getAllCandidates() {
        return employeeService.getAllCandidates();
    }

    @GetMapping("/getAllResourcesBackOffice")
    public List<Employee> getAllResourcesBackOffice() {
        return employeeService.getAllResourcesBackOffice();
    }

    @GetMapping("/getAllResourcesInterne")
    public List<Employee> getAllResourcesInterne() {
        return employeeService.getAllResourcesInterne();
    }

    @GetMapping("/getAllResourcesExterne")
    public List<Employee> getAllResourcesExterne() {
        return employeeService.getAllResourcesExterne();
    }

    @GetMapping("/getAllInternes")
    public List<Employee> getAllInternes() {
        return employeeService.getAllInternes();
    }
    @GetMapping("/getAllEmployees")
    public List<Employee> getConvertedCandidates() {
        return employeeService.getConvertedCandidates();
    }
    @GetMapping("/getAllNotConverted")
    public List<Employee> getNotConvertedCandidates() {
        return employeeService.getNotConvertedCandidates();
    }


    @PutMapping("/updateToInProcessById/{id}")
    void updateStatusToInProcessById(@PathVariable Long id) {
        employeeService.updateStatusToInProcessById(id);
    }

    @PutMapping("/updateToInProgressById/{id}")
    void updateStatusToInProgressById(@PathVariable Long id) {
        employeeService.updateStatusToInProgressById(id);
    }

    @PutMapping("/updateToTopProfilesById/{id}")
    void updateStatusToTopProfilesById(@PathVariable Long id) {
        employeeService.updateStatusToTopProfilesById(id);
    }

    @PutMapping("/updateToPreQualifiedById/{id}")
    void updateStatusToPreQualifiedById(@PathVariable Long id) {
        employeeService.updateStatusToPreQualifiedById(id);
    }

    @PutMapping("/updateToConvertedToResourceById/{id}")
    void updateStatusToConvertedToResourceById(@PathVariable Long id) {
        employeeService.updateStatusToConvertedToResourceById(id);
    }

    @PutMapping("/updateToDoNotContactById/{id}")
    void updateStatusToDoNotContactById(@PathVariable Long id) {
        employeeService.updateStatusToDoNotContactById(id);
    }

    @PutMapping("/updateToArchiveById/{id}")
    void updateStatusToArchiveById(@PathVariable Long id) {
        employeeService.updateStatusToArchiveById(id);
    }

/*
    @PostMapping("/{id}/assignEquipment/{equipmentId}")
    public ResponseEntity<String> assignEquipmentToEmployee(
            @PathVariable Long employeeId,
            @PathVariable Long equipmentId
    ) {
        try {
            employeeService.assignEquipmentToEmployee(equipmentId, employeeId);
            return ResponseEntity.ok("Equipment assigned to employee successfully.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body("Invalid employee ID or equipment ID.");
        }
    }*/
}