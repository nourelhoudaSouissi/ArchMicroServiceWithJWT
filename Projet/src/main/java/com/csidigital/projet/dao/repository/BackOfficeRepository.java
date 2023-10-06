package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.BackOffice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackOfficeRepository extends JpaRepository<BackOffice,Long> {
}

