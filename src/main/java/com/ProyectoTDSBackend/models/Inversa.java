/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "inversa")

public class Inversa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inversa", nullable = false)
    private Long idInversa;

    @Column(name = "tratamiento")
    private String tratamiento;

    @Column(name = "tratamientoR")
    private String tratamientoR;

    @Column(name = "diagnosticoIn")
    private String diagnosIn;

    @Column(name = "diagnosticoI")
    private String diagnosI;

    @Column(name = "cieI")
    private String cieI;

    @Column(name = "cieC")
    private String cieC;

    @Column(name = "da", length = 3)
    private String da;
    
    @Column(name = "da1", length = 3)
    private String da1;
    
    @Column(name = "cuadro")
    private String cuadroC;

    @Column(name = "halla")
    private String hallazgoI;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_formulario", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Formulario formulario;

    public Inversa() {
    }

    public Inversa(Long idInversa, String tratamiento, String tratamientoR, String diagnosIn, String diagnosI, String cieI, String cieC, String da, String da1, String cuadroC, String hallazgoI, Formulario formulario) {
        this.idInversa = idInversa;
        this.tratamiento = tratamiento;
        this.tratamientoR = tratamientoR;
        this.diagnosIn = diagnosIn;
        this.diagnosI = diagnosI;
        this.cieI = cieI;
        this.cieC = cieC;
        this.da = da;
        this.da1 = da1;
        this.cuadroC = cuadroC;
        this.hallazgoI = hallazgoI;
        this.formulario = formulario;
    }


    public Long getIdInversa() {
        return idInversa;
    }

    public void setIdInversa(Long idInversa) {
        this.idInversa = idInversa;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getTratamientoR() {
        return tratamientoR;
    }

    public void setTratamientoR(String tratamientoR) {
        this.tratamientoR = tratamientoR;
    }

    public String getDiagnosIn() {
        return diagnosIn;
    }

    public void setDiagnosIn(String diagnosIn) {
        this.diagnosIn = diagnosIn;
    }

    public String getCieI() {
        return cieI;
    }

    public void setCieI(String cieI) {
        this.cieI = cieI;
    }

    public String getCieC() {
        return cieC;
    }

    public void setCieC(String cieC) {
        this.cieC = cieC;
    }

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public String getCuadroC() {
        return cuadroC;
    }

    public void setCuadroC(String cuadroC) {
        this.cuadroC = cuadroC;
    }

    public String getHallazgoI() {
        return hallazgoI;
    }

    public void setHallazgoI(String hallazgoI) {
        this.hallazgoI = hallazgoI;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public String getDiagnosI() {
        return diagnosI;
    }

    public void setDiagnosI(String diagnosI) {
        this.diagnosI = diagnosI;
    }

    public String getDa1() {
        return da1;
    }

    public void setDa1(String da1) {
        this.da1 = da1;
    }

    
}
