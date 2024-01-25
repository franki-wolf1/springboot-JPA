package com.ejemplo.crudfast.controller;

import com.ejemplo.crudfast.entity.GraduateAcademic;
import com.ejemplo.crudfast.service.GraduateAcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/controller/ciclosacademicos")
public class GraduateAcademicController {
    @Autowired
    private GraduateAcademicService graduateAcademicService ;

    @GetMapping
    public List<GraduateAcademic> getAllGraduateAcademics () {

        return graduateAcademicService.getGraduateAcademics();
    }

    @PostMapping
    public GraduateAcademic saveGraduateAcademic (@RequestBody GraduateAcademic graduateAcademic) {
        graduateAcademicService.saveOrUpdateGraduateAcademic(graduateAcademic);
        return graduateAcademic;
    }

    @DeleteMapping("/{graduateAcademicID}")
    public String deleteGraduateAcademic (@PathVariable("graduateAcademicID") Long graduateAcademicID) {
        graduateAcademicService.deleteGraduateAcademic(graduateAcademicID);
        return "Studiante Eliminado";
    }

    @GetMapping("/{graduateAcademicID}")
    public Optional<GraduateAcademic> getByIDGraduateAcademic (@PathVariable("graduateAcademicID") Long graduateAcademicID) {
        return graduateAcademicService.getGraduateAcademic(graduateAcademicID);
    }
}
