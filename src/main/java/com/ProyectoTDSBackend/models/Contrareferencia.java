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
 * @author corin
 */
@Entity
@Table(name = "contrareferencia")
public class Contrareferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contra", nullable = false)
    private Long idContra;

    @Column(name = "entidadC")
    private String entidad;

    @Column(name = "num")
    private String numCli;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "tipoC")
    private String tipo;

    @Column(name = "servicioC")
    private String servicio;

    @Column(name = "especial")
    private String especialS;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "justificada")
    private String justificada;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_formulario", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Formulario formulario;

    public Contrareferencia() {
    }

    public Contrareferencia(Long idContra, String entidad, String numCli, String establecimiento, String tipo, String servicio, String especialS, String fecha, String distrito, String justificada, Formulario formulario) {
        this.idContra = idContra;
        this.entidad = entidad;
        this.numCli = numCli;
        this.establecimiento = establecimiento;
        this.tipo = tipo;
        this.servicio = servicio;
        this.especialS = especialS;
        this.fecha = fecha;
        this.distrito = distrito;
        this.justificada = justificada;
        this.formulario = formulario;
    }


    public Long getIdContra() {
        return idContra;
    }

    public void setIdContra(Long idContra) {
        this.idContra = idContra;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getNumCli() {
        return numCli;
    }

    public void setNumCli(String numCli) {
        this.numCli = numCli;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getEspecialS() {
        return especialS;
    }

    public void setEspecialS(String especialS) {
        this.especialS = especialS;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public String getJustificada() {
        return justificada;
    }

    public void setJustificada(String justificada) {
        this.justificada = justificada;
    }
    

}
