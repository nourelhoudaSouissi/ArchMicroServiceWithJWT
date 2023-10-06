package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education , Long> {
}
