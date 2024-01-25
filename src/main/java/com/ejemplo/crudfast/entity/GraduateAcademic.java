package com.ejemplo.crudfast.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
//interfaz de programación de aplicaciones (API)
@Data
@Entity
@Table(name = "tbl_graduate_academic")
public class GraduateAcademic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ciclo_id")
    private Long cicloId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    @OneToMany(mappedBy = "ciclo", cascade = CascadeType.ALL)
    private List<Classroom> classrooms;

}
