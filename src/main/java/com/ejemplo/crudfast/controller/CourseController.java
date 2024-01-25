package com.ejemplo.crudfast.controller;

import com.ejemplo.crudfast.entity.Course;
import com.ejemplo.crudfast.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/controller/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourses () {
        return courseService.getCourses();
    }

    @PostMapping
    public Course saveCourse (@RequestBody Course course) {
        courseService.saveOrUpdateCourse(course);
        return course;
    }

    @DeleteMapping("/{courseId}")
    public String deleteCourse (@PathVariable ("courseId") Long courseId) {
        courseService.deleteCourse(courseId);
        return "Course deleted successfully";
    }

    @GetMapping("/{courseId}")
    public Optional<Course> getByIDCourse (@PathVariable("courseId") Long courseId) {
        return courseService.getCourse(courseId);
    }
}
