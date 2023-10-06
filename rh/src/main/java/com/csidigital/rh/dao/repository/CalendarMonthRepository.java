package com.csidigital.rh.dao.repository;

import com.csidigital.rh.dao.entity.CalendarMonth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarMonthRepository extends JpaRepository<CalendarMonth,Long> {
}
