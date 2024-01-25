package com.ejemplo.crudfast.service;

import com.ejemplo.crudfast.entity.GraduateAcademic;
import com.ejemplo.crudfast.repository.GraduateAcademicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GraduateAcademicService {

    @Autowired
    GraduateAcademicRepository graduateAcademicRepository;

    public List<GraduateAcademic>  getGraduateAcademics() {
        return graduateAcademicRepository.findAll();
    }

    public Optional<GraduateAcademic> getGraduateAcademic(Long id) {
        return graduateAcademicRepository.findById(id);
    }
    public void saveOrUpdateGraduateAcademic (GraduateAcademic student) {
        graduateAcademicRepository.save(student);
    }
    public void deleteGraduateAcademic (Long id) {
        graduateAcademicRepository.deleteById(id);
    }

}
