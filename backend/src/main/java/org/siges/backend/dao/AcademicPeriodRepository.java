package org.siges.backend.dao;

import org.siges.backend.entity.AcademicPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface AcademicPeriodRepository extends JpaRepository<AcademicPeriod, Integer> {

}
