package com.ejemplo.crudfast.controller;

import com.ejemplo.crudfast.entity.Student;
import com.ejemplo.crudfast.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/controller/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents () {
        return studentService.getStudents();
    }

    @PostMapping
    public Student saveStudent (@RequestBody Student student) {
        studentService.saveOrUpdate(student);
        return student;
    }

    @DeleteMapping("/{studentId}")
    public String deleteStudent (@PathVariable ("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
        return "Studiante Eliminado";
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getByIDStudent (@PathVariable("studentId") Long studentId) {
        return studentService.getStudent(studentId);
    }
}
