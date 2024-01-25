package com.ejemplo.crudfast.service;

import com.ejemplo.crudfast.entity.Teacher;
import com.ejemplo.crudfast.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }

    public Optional<Teacher> getTeacher(Long id) {
        return teacherRepository.findById(id);
    }
    public void saveOrUpdateTeacher (Teacher student) {
        teacherRepository.save(student);
    }
    public void deleteTeacher (Long id) {
        teacherRepository.deleteById(id);
    }
}
