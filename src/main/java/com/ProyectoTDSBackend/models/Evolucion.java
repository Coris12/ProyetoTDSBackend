/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "evolucion_prescripcion")
public class Evolucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evolucion", nullable = false)
    private Long idEvolucion;

    @Column(name = "indicaciones", nullable = false)
    private String indicaciones;

    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "hora")
    private String hora;
    
    @Column (name="evolucion")
    private String evolucion;
    
    

}
