package com.ejemplo.crudfast.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tbl_course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "course_name")
    private String courseName;

    //Cada course tiene muchos topics
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Topic> topics;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;
}
