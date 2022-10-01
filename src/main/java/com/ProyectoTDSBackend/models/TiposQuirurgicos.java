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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "tipo_quirurgico")
public class TiposQuirurgicos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo", nullable = false)
    private Long idTipo;

    @Column(name = "dieresis", nullable = false)
    private String dieresis;

    @Column(name = "exposicion", nullable = false)
    private String exposicion;

    @Column(name = "exploracion", nullable = false)
    private String exploracion;

    @Column(name = "procedimiento", nullable = false)
    private String procedimiento;

    @Column(name = "sintesis", nullable = false)
    private String sintesis;

    @Column(name = "complicaciones", nullable = false)
    private String complicaciones;

    @Column(name = "examen", nullable = false)
    private String examen;

    @ManyToOne()
    @JoinColumn(name = "id_protocolo")
    private Protocolos protocolo;

    public TiposQuirurgicos() {
    }

    public TiposQuirurgicos(Long idTipo, String dieresis, String exposición, String exploracion, String procedimiento, String sintesis, String complicaciones, String examen, Protocolos protocolo) {
        this.idTipo = idTipo;
        this.dieresis = dieresis;
        this.exposicion = exposicion;
        this.exploracion = exploracion;
        this.procedimiento = procedimiento;
        this.sintesis = sintesis;
        this.complicaciones = complicaciones;
        this.examen = examen;
        this.protocolo = protocolo;
    }

   

    public Long getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(Long idTipo) {
        this.idTipo = idTipo;
    }

    public String getDieresis() {
        return dieresis;
    }

    public void setDieresis(String dieresis) {
        this.dieresis = dieresis;
    }

    public String getExposicion() {
        return exposicion;
    }

    public void setExposicion(String exposicion) {
        this.exposicion = exposicion;
    }

    public String getExploracion() {
        return exploracion;
    }

    public void setExploracion(String exploracion) {
        this.exploracion = exploracion;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getSintesis() {
        return sintesis;
    }

    public void setSintesis(String sintesis) {
        this.sintesis = sintesis;
    }

    public String getComplicaciones() {
        return complicaciones;
    }

    public void setComplicaciones(String complicaciones) {
        this.complicaciones = complicaciones;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public Protocolos getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Protocolos protocolo) {
        this.protocolo = protocolo;
    }

    
    
}
