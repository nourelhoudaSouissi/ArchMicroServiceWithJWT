package com.csidigital.projet.management.controller;

import com.csidigital.projet.management.service.impl.SkillsImpl;
import com.csidigital.projet.shared.dto.request.SkillsRequest;
import com.csidigital.projet.shared.dto.response.SkillsResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Transactional
@RequestMapping("/rh/skills")
public class SkillsController {
    @Autowired
    private SkillsImpl skills;

    @GetMapping("/getAll")
    public List<SkillsResponse> getAllSkills(){
        return skills.getAllSkills();
    }

    @GetMapping("/getSkills/{id}")
    public SkillsResponse getSkillsById(@PathVariable Long id){
        return skills.getSkillsById(id);
    }

    @PostMapping("/addSkills")
    public SkillsResponse createSkills(@Valid @RequestBody SkillsRequest skillsRequest){
        return skills.createSkills(skillsRequest);
    }

    @PutMapping("/updateSkills/{id}")
    public SkillsResponse updateSkills(@Valid @RequestBody SkillsRequest skillsRequest,
                                                       @PathVariable Long id){
        return skills.updateSkills(skillsRequest, id);
    }

    @DeleteMapping("/deleteSkills/{id}")
    public void deleteSkills(@PathVariable Long id){
        skills.deleteSkills(id);
    }
}
