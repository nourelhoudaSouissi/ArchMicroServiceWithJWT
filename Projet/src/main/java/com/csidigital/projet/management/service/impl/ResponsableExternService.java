package com.csidigital.projet.management.service.impl;



import com.csidigital.projet.dao.entity.ResponsableExtern;
import com.csidigital.projet.dao.repository.ResponsableExternRepository;
import com.csidigital.projet.shared.dto.request.ResponsableExternRequest;
import com.csidigital.projet.shared.dto.response.ResponsableExternResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResponsableExternService {
    @Autowired
    private ResponsableExternRepository responsableExternRepository;
    @Autowired
    private ModelMapper modelMapper ;
    public ResponsableExternResponse createResponsable(ResponsableExternRequest request) {


        ResponsableExtern responsableExtern= modelMapper.map(request, ResponsableExtern.class);


        ResponsableExtern RespSaved = responsableExternRepository.save(responsableExtern);
        return modelMapper.map(RespSaved, ResponsableExternResponse.class);
    }
    public List<ResponsableExternResponse> getAllResp() {
        List<ResponsableExtern> responsableExterns = responsableExternRepository.findAll();
        List<ResponsableExternResponse> responsableExternResponses = new ArrayList<>();

        for (ResponsableExtern resp : responsableExterns) {
            ResponsableExternResponse response = modelMapper.map(resp ,ResponsableExternResponse.class);
            responsableExternResponses.add(response);
        }

        return responsableExternResponses;
    }
}
