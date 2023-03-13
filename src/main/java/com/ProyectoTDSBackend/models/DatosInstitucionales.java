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
@Table(name = "datos_institucionales")
public class DatosInstitucionales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_datos", nullable = false)
    private Long idDatos;

    @Column(name = "entidad")
    private String entidad;

    @Column(name = "hist_clin_num")
    private String histclinnum;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "districto")
    private String districto;

    @Column(name = "limitada", length = 1)
    private String limitada;

    @Column(name = "ausencia", length = 1)
    private String ausencia;

    @Column(name = "falta", length = 1)
    private String falta;

    @Column(name = "saturacion", length = 1)
    private String satu;

    @Column(name = "otro", length = 1)
    private String otros;

    @Column(name = "descrip")
    private String descripcion;

    @Column(name = "nombreP")
    private String nombreP;
    
    @Column(name = "codigo")
    private String codigo; 
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_formulario", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Formulario formulario;

    public DatosInstitucionales() {
    }

    public DatosInstitucionales(Long idDatos, String entidad, String histclinnum, String establecimiento, String tipo, String districto, String limitada, String ausencia, String falta, String satu, String otros, String descripcion, String nombreP, String codigo, Formulario formulario) {
        this.idDatos = idDatos;
        this.entidad = entidad;
        this.histclinnum = histclinnum;
        this.establecimiento = establecimiento;
        this.tipo = tipo;
        this.districto = districto;
        this.limitada = limitada;
        this.ausencia = ausencia;
        this.falta = falta;
        this.satu = satu;
        this.otros = otros;
        this.descripcion = descripcion;
        this.nombreP = nombreP;
        this.codigo = codigo;
        this.formulario = formulario;
    }

   

    public Long getIdDatos() {
        return idDatos;
    }

    public void setIdDatos(Long idDatos) {
        this.idDatos = idDatos;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getHistclinnum() {
        return histclinnum;
    }

    public void setHist_clin_num(String histclinnum) {
        this.histclinnum = histclinnum;
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

    public String getDistricto() {
        return districto;
    }

    public void setDistricto(String districto) {
        this.districto = districto;
    }

    public String getLimitada() {
        return limitada;
    }

    public void setLimitada(String limitada) {
        this.limitada = limitada;
    }

    public String getAusencia() {
        return ausencia;
    }

    public void setAusencia(String ausencia) {
        this.ausencia = ausencia;
    }

    public String getFalta() {
        return falta;
    }

    public void setFalta(String falta) {
        this.falta = falta;
    }

    public String getSatu() {
        return satu;
    }

    public void setSatu(String satu) {
        this.satu = satu;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
}
