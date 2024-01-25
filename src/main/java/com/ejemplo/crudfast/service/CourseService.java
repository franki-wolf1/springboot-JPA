package com.ejemplo.crudfast.service;

import com.ejemplo.crudfast.entity.Course;
import com.ejemplo.crudfast.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    public Optional<Course> getCourse(Long id) {
        return courseRepository.findById(id);
    }
    public void saveOrUpdateCourse (Course student) {
        courseRepository.save(student);
    }
    public void deleteCourse (Long id) {
        courseRepository.deleteById(id);
    }
}
