package org.siges.backend.dao;

import org.siges.backend.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShiftRepository extends JpaRepository<Shift, Integer> {

}
