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
 * @author corin
 */
@Entity
@Table(name="alta")
public class Alta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alta", nullable = false)
    private Long idAlta;
    
    @Column(name = "Domicilio", length = 1)
    private String domicilio;
    
    @Column(name = "CExterna", length = 1)
    private String cExterna;
    
    @Column(name = "Observacion", length = 1)
    private String observacion;
    
    @Column(name = "Internacion", length = 1)
    private String internacion;
    
    @Column(name = "Referencia", length = 1)
    private String referencia;
    
    @Column(name = "Vivo", length = 1)
    private String vivo;
    
    @Column(name = "Estable", length = 1)
    private String estable;
    
    @Column(name = "Inestable", length = 1)
    private String inestable;
    
    @Column(name = "dias")
    private int dias;
    
    @Column(name = "Servicio")
    private String servicio;
    
    @Column(name = "Establecimiento")
    private String establecimiento;
    
    @Column(name = "muerto", length = 1)
    private String muerto;
    
    @Column(name = "Causa")
    private String causa;
}
