package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
