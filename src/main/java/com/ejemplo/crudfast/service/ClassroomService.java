package com.ejemplo.crudfast.service;

import com.ejemplo.crudfast.entity.Classroom;
import com.ejemplo.crudfast.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassroomService {

    @Autowired
    ClassroomRepository classroomRepository;

        public List<Classroom> getClassrooms() {
            return classroomRepository.findAll();
        }
        public Optional<Classroom> getClassroom(Long id) {
            return classroomRepository.findById(id);
        }
        public void saveOrUpdateClassroom (Classroom classroom) {
            classroomRepository.save(classroom);
        }
        public void deleteClassroom (Long id) {
            classroomRepository.deleteById(id);
        }

}
