package com.ejemplo.crudfast.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "tbl_schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    private Long scheduleId;

    @Column(name = "nombre")
    private String nombre; // Verano; CICLO I; CICLO II

    @Column(name = "start_time")
    @Temporal(TemporalType.TIME)
    private Date startTime;

    @Column(name = "end_time")
    @Temporal(TemporalType.TIME)
    private Date endTime;

    @Column(name = "class_start_time")
    @Temporal(TemporalType.TIME)
    private Date classStartTime;

    @Column(name = "class_end_time")
    @Temporal(TemporalType.TIME)
    private Date classEndTime;

    @Column(name = "class_start_time_break")
    @Temporal(TemporalType.TIME)
    private Date classStartTimeBreak;

    @Column(name = "class_end_time_break")
    @Temporal(TemporalType.TIME)
    private Date classEndTimeBreak;

    @OneToOne(mappedBy = "schedule", cascade = CascadeType.ALL)
    private Classroom classroom;

    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    private List<Course> courses;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
