package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.ProjectReferenceSequence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectReferenceSequenceRepository extends JpaRepository<ProjectReferenceSequence, Long> {
}
