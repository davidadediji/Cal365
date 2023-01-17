package com.cal365.data.repository;

import com.cal365.data.models.Calender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalenderRepository extends JpaRepository<Calender, Long> {
}
