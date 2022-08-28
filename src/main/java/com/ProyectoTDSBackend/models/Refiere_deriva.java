/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "refiere_deriva")
public class Refiere_deriva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_refiere", nullable = false)
    private int id_refiere;

    @Column(name = "entidad")
    private String entidad;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "servicio")
    private String servicio;

    @Column(name = "especialidad")
    private String especialidad;

    @Column(name = "dia")
    private String dia;
    
    @Column(name = "mes")
    private String mes;
    
    @Column(name = "anio")
    private String anio;
    
 
}
