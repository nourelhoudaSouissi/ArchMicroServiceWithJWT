package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Long> {
}
