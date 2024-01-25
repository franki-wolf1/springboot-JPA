package com.ejemplo.crudfast.controller;

import com.ejemplo.crudfast.entity.Teacher;
import com.ejemplo.crudfast.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/controller/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getAlTeachers () {
        return teacherService.getTeachers();
    }

    @PostMapping
    public Teacher saveTeacher (@RequestBody Teacher teacher) {
        teacherService.saveOrUpdateTeacher(teacher);
        return teacher;
    }

    @DeleteMapping("/{teacherId}")
    public String deleteTeacher (@PathVariable("teacherId") Long teacherId) {
        teacherService.deleteTeacher(teacherId);
        return "Teacher deleted successfully";
    }

    @GetMapping("/{teacherId}")
    public Optional<Teacher> getByIDTeacher(@PathVariable("teacherId") Long teacherId) {
        return teacherService.getTeacher(teacherId);
    }
}
