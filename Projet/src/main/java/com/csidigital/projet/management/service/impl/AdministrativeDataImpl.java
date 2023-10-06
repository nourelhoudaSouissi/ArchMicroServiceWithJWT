package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.AdministrativeData;
import com.csidigital.projet.dao.entity.Employee;
import com.csidigital.projet.dao.repository.AdministrativeDataRepository;
import com.csidigital.projet.dao.repository.EmployeeRepository;
import com.csidigital.projet.management.service.AdministrativeDataService;
import com.csidigital.projet.shared.dto.request.AdministrativeDataRequest;
import com.csidigital.projet.shared.dto.response.AdministrativeDataResponse;
import com.csidigital.projet.shared.exception.ResourceNotFoundException;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
@Transactional
@AllArgsConstructor
public class AdministrativeDataImpl implements AdministrativeDataService {
    @Autowired
    private AdministrativeDataRepository administrativeDataRepository ;
    @Autowired
    private EmployeeRepository employeeRepository ;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AdministrativeDataResponse createAdministrativeData(AdministrativeDataRequest request) {
        Employee employee =  employeeRepository.findById(request.getEmployeeId()).orElseThrow();
        AdministrativeData administrativeData = modelMapper.map(request, AdministrativeData.class);
        administrativeData.setEmployee(employee);
        AdministrativeData administrativeDataSaved = administrativeDataRepository.save(administrativeData);
        return modelMapper.map(administrativeDataSaved, AdministrativeDataResponse.class);
    }

    @Override
    public List<AdministrativeDataResponse> getAllAdministrativeData() {
        List<AdministrativeData> administrativeData = administrativeDataRepository.findAll();
        List<AdministrativeDataResponse> administrativeDataList = new ArrayList<>();

        for (AdministrativeData administrativeDataS : administrativeData) {
            AdministrativeDataResponse response = modelMapper.map(administrativeDataS, AdministrativeDataResponse.class);
            administrativeDataList.add(response);
        }

        return administrativeDataList;
    }

    @Override
    public AdministrativeDataResponse getAdministrativeDataById(Long id) {
        AdministrativeData administrativeData =administrativeDataRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Requirement with id " +id+ " not found"));
        AdministrativeDataResponse administrativeDataResponse = modelMapper.map(administrativeData, AdministrativeDataResponse.class);
        return administrativeDataResponse;
    }

    @Override
    public AdministrativeDataResponse updateAdministrativeData(AdministrativeDataRequest request, Long id) {
        AdministrativeData existingAdministrativeData = administrativeDataRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("AdministrativeData with id: " + id + " not found"));
        modelMapper.map(request, existingAdministrativeData);
        AdministrativeData savedAdministrativeData = administrativeDataRepository.save(existingAdministrativeData);
        return modelMapper.map(savedAdministrativeData, AdministrativeDataResponse.class);
    }

    @Override
    public void deleteAdministrativeData(Long id) {
        administrativeDataRepository.deleteById(id);
    }

}