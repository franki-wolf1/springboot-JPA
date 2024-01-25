package com.ejemplo.crudfast.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_classroom")
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "classroom_id")
    private Long classroomId;

    @Column(name = "classroom_name")
    private String classroomName;

    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "ciclo_id")
    private GraduateAcademic ciclo;

    @OneToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;
}
