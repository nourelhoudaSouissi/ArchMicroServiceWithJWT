package com.csidigital.projet.dao.repository;

import com.csidigital.projet.dao.entity.ExpenseReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseReportRepository extends JpaRepository<ExpenseReport , Long> {
}
