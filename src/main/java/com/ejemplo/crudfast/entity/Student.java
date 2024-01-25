package com.ejemplo.crudfast.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
//Java Persistence API
@Data
@Entity
@Table(name = "tbl_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "code_qr", unique = true, nullable = false)
    private String codeQR;

    @Column(name = "first_names")
    private String firstNames;

    @Column(name = "last_names")
    private String lastNames;

    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Column(name = "email_address", unique = true, nullable = false)
    private String emailAddress;

    @Column(name = "dni", unique = true, nullable = false)
    private String dni;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "guardian_name")
    private String guardianName;

    @Column(name = "guardian_phone_number")
    private String guardianPhoneNumber;

    @Column(name = "student_address")
    private String studentAddress;

    @Column(name = "age")
    private int age;

    @Column(name = "gender")
    private String gender;

    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private Classroom classroom;
}
