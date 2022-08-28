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
@Table(name = "datos_institucionales")
public class datos_institucionales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_datos", nullable = false)
    private int id_datos;

    @Column(name = "entidad")
    private String entidad;

    @Column(name = "hist_clin_num")
    private String hist_clin_num;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "districto")
    private String districto;
    
    @Column(name = "area")
    private String area;
    
    
    
}