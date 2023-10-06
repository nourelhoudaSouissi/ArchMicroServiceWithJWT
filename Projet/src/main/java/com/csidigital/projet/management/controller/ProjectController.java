package com.csidigital.projet.management.controller;




import com.csidigital.projet.dao.entity.Resource;
import com.csidigital.projet.management.service.impl.ProjectServiceImpl;
import com.csidigital.projet.shared.dto.request.ProjectDtoRequest;
import com.csidigital.projet.shared.dto.response.ProjectDtoResponse;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Transactional
@RestController
@RequiredArgsConstructor
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectServiceImpl projectService;
    @GetMapping("/getAll")
    public ResponseEntity<List<ProjectDtoResponse>> getAllProjects() {
        return new ResponseEntity<>(projectService.getAllProjects(), HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<ProjectDtoResponse> getProjectById(@PathVariable Long id) {
        return new ResponseEntity<>(projectService.getProjectById(id), HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<ProjectDtoResponse> createProject(@Valid @RequestBody ProjectDtoRequest projectDtoRequest) {
        return new ResponseEntity<>(projectService.createProject(projectDtoRequest), HttpStatus.OK);
    }

    @PutMapping("/updateById/{id}")
    public ResponseEntity<ProjectDtoResponse> updateProject(@Valid @RequestBody ProjectDtoRequest projectDtoRequest, @PathVariable Long id) {
        return new ResponseEntity<>(projectService.updateProject(id,projectDtoRequest), HttpStatus.OK);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteProject(@PathVariable Long id){
        projectService.deleteProjectById(id);

    }
    @GetMapping("/getResources/{id}")
    public List<Resource> getProjectResource(@PathVariable Long id) {
        return projectService.getProjectResource(id);
    }



    @PostMapping("/{projectId}/resources")
    public ResponseEntity<?> addResourceToProject(@PathVariable Long projectId,  @RequestBody List<Long> resourceIds) {
        projectService.addResourceToProject(projectId, resourceIds);
        return ResponseEntity.ok("Resource added to the project successfully.");
    }
}
