package com.dutra.dev.infrastructure.persistence.repository;

import com.dutra.dev.infrastructure.persistence.relational.DepartmentRow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentRow, Integer> {


}
