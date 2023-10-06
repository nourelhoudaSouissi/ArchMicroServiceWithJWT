package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.Skills;
import com.csidigital.projet.dao.entity.TechnicalFile;
import com.csidigital.projet.dao.repository.SkillsCategoryRepository;
import com.csidigital.projet.dao.repository.SkillsRepository;
import com.csidigital.projet.dao.repository.TechnicalFileRepository;
import com.csidigital.projet.management.service.SkillsService;
import com.csidigital.projet.shared.dto.request.SkillsRequest;
import com.csidigital.projet.shared.dto.response.SkillsResponse;
import com.csidigital.projet.shared.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
@AllArgsConstructor
public class SkillsImpl implements SkillsService {
    @Autowired
    private SkillsRepository skillsRepository;
    @Autowired
    TechnicalFileRepository technicalFileRepository ;

    @Autowired
    SkillsCategoryRepository skillsCategoryRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public SkillsResponse createSkills(SkillsRequest request) {
        TechnicalFile technicalFile= technicalFileRepository.findById(request.getTechnicalFileId()).orElseThrow();

        Skills skills= modelMapper.map(request, Skills.class);
        skills.setTechnicalFile(technicalFile);

        Skills skillsSaved = skillsRepository.save(skills);
        return modelMapper.map(skillsSaved, SkillsResponse.class);
    }

    @Override
    public List<SkillsResponse> getAllSkills() {
        List<Skills> skills = skillsRepository.findAll();
        List<SkillsResponse> skillsResponseList = new ArrayList<>();

        for (Skills skill : skills) {
            SkillsResponse response = modelMapper.map(skill ,SkillsResponse.class);
            skillsResponseList.add(response);
        }

        return skillsResponseList;
    }

    @Override
    public SkillsResponse getSkillsById(Long id) {
        Skills skills = skillsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Skills with id " + id + " not found"));
        SkillsResponse skillsResponse = modelMapper.map(skills, SkillsResponse.class);
        return skillsResponse;
    }

    @Override
    public SkillsResponse updateSkills(SkillsRequest request, Long id) {
        TechnicalFile technicalFile = technicalFileRepository.findById(request.getTechnicalFileId()).orElseThrow();
        Skills existingSkills = skillsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Skills with id: " + id + " not found"));
        modelMapper.map(request, existingSkills);
        Skills savedSkills = skillsRepository.save(existingSkills);
        existingSkills.setTechnicalFile(technicalFile);
        return modelMapper.map(savedSkills, SkillsResponse.class);
    }

    @Override
    public void deleteSkills(Long id) {skillsRepository.deleteById(id);
    }
}