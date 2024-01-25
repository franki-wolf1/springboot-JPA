package com.ejemplo.crudfast.repository;

import com.ejemplo.crudfast.entity.GraduateAcademic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraduateAcademicRepository extends JpaRepository<GraduateAcademic, Long> {
}
