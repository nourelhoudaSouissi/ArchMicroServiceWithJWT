package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.AssQuestionInterview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssQuestionInterviewRepository extends JpaRepository<AssQuestionInterview,Long> {

}