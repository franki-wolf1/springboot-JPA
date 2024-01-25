
package com.ejemplo.crudfast.controller;

import com.ejemplo.crudfast.entity.Classroom;
import com.ejemplo.crudfast.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/controller/classrooms")

public class ClassroomController {

    @Autowired
    private ClassroomService classroomService;

    @GetMapping
    public List<Classroom> getAllClassrooms () {
        return classroomService.getClassrooms();
    }

    @PostMapping
    public Classroom saveClassroom (@RequestBody Classroom classroom) {
        classroomService.saveOrUpdateClassroom(classroom);
        return classroom;
    }

    @DeleteMapping("/{classroomId}")
    public String deleteClassroom (@PathVariable ("classroomId") Long classroomId) {
        classroomService.deleteClassroom(classroomId);
        return "Classroom deleted successfully";
    }

    @GetMapping("/{classroomId}")
    public Optional<Classroom> getByIDClassroom (@PathVariable("classroomId") Long classroomId) {
        return classroomService.getClassroom(classroomId);
    }
}
