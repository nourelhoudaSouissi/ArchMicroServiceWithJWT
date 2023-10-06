package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.AdministrativeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministrativeDataRepository extends JpaRepository<AdministrativeData,Long> {

}
