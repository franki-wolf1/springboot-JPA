package com.ejemplo.crudfast.repository;

import com.ejemplo.crudfast.entity.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassroomRepository  extends JpaRepository<Classroom, Long> {
}
