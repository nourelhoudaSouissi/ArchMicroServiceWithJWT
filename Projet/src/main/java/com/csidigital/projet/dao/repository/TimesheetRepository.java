package com.csidigital.projet.dao.repository;


import com.csidigital.projet.dao.entity.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet,Long> {

}
