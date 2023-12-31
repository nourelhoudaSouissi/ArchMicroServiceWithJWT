package com.csidigital.projet.management.service.impl;

import com.csidigital.projet.dao.entity.SkillsCategory;
import com.csidigital.projet.dao.repository.SkillsCategoryRepository;
import com.csidigital.projet.management.service.SkillsCategoryService;
import com.csidigital.projet.shared.dto.request.SkillsCategoryRequest;
import com.csidigital.projet.shared.dto.response.SkillsCategoryResponse;
import com.csidigital.projet.shared.exception.ResourceNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Transactional
@Service
@AllArgsConstructor
public class SkillsCategoryImpl implements SkillsCategoryService {

    @Autowired
    private SkillsCategoryRepository skillsCategoryRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public SkillsCategoryResponse createSkillsCategory(SkillsCategoryRequest request) {
        SkillsCategory skillsCategory= modelMapper.map(request, SkillsCategory.class);
        SkillsCategory skillsCategorySaved = skillsCategoryRepository.save(skillsCategory);
        return modelMapper.map(skillsCategorySaved, SkillsCategoryResponse.class);
    }

    @Override
    public List<SkillsCategoryResponse> getAllSkillsCategories() {
        List<SkillsCategory> skillsCategories = skillsCategoryRepository.findAll();
        List<SkillsCategoryResponse> skillsCategoryResponseList = new ArrayList<>();

        for (SkillsCategory skillsCategory : skillsCategories) {
            SkillsCategoryResponse response = modelMapper.map(skillsCategory ,SkillsCategoryResponse.class);
            skillsCategoryResponseList.add(response);
        }

        return skillsCategoryResponseList;
    }

    @Override
    public SkillsCategoryResponse getSkillsCategoryById(Long id) {
        SkillsCategory skillsCategory = skillsCategoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("SkillsCategory with id " + id + " not found"));
        SkillsCategoryResponse skillsCategoryResponse = modelMapper.map(skillsCategory, SkillsCategoryResponse.class);
        return skillsCategoryResponse;
    }

    @Override
    public SkillsCategoryResponse updateSkillsCategory(SkillsCategoryRequest request, Long id) {
        SkillsCategory existingSkillsCategory = skillsCategoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("SkillsCategory with id: " + id + " not found"));
        modelMapper.map(request, existingSkillsCategory);
        SkillsCategory savedSkillsCategory = skillsCategoryRepository.save(existingSkillsCategory);
        return modelMapper.map(savedSkillsCategory, SkillsCategoryResponse.class);
    }

    @Override
    public void deleteSkillsCategory(Long id) {skillsCategoryRepository.deleteById(id);
    }
}
