package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.TimeOff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeOffRepository extends JpaRepository<TimeOff,Long> {
}
