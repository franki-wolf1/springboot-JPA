package com.ejemplo.crudfast.repository;

import com.ejemplo.crudfast.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    /**
     * Al extender JpaRepository, StudentRepository hereda métodos como save,
     * findById, findAll, delete, etc., sin necesidad de implementarlos manualmente.
     * Spring Data JPA se encargará de generar implementaciones de estos métodos en
     * tiempo de ejecución, basándose en la firma de la interfaz y las convenciones
     * de nombres.
     * */

}
