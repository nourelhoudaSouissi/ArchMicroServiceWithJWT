package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.AssResourceProjet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssResourceProjetRepository extends JpaRepository<AssResourceProjet , Long> {

}
