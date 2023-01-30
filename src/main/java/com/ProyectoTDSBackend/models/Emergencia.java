/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import java.util.Date;
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
@Table(name = "emergencia")
public class Emergencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_emergencia", nullable = false)
    private Long idEmergencia;

    @Column(name = "gestas")
    private String gestas;

    @Column(name = "partos")
    private String partos;

    @Column(name = "abortos")
    private String abortos;
    
    @Column(name="cesareas")
    private String cesareas;
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="semanas")
    private String semanas;
    
    @Column(name="fetal")
    private String fetal;
    
    @Column(name="frecuencia")
    private String frecuencia;
    
    @Column(name="membranas")
    private String membranas;
    
    @Column(name="tiempo")
    private int tiempo;
    
    @Column(name="uterina")
    private String uterina;
    
    @Column(name="presentacion")
    private String presentacion;
    
    @Column(name="dilatacion")
    private String dilatacion;
    
    @Column(name="borramiento")
    private String borramiento;
    
    @Column(name="plano")
    private String plano;
    
    @Column(name="util")
    private String util;
    
    @Column(name="sangrado")
    private String snagrado;
    
    @Column(name="contraciones")
    private String contraciones;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_dmision", foreignKey = @ForeignKey(name = "FK_LLEGADA_ID"))
    private Admision admision;

    public Emergencia() {
    }

    public Emergencia(Long idEmergencia, String gestas, String partos, String abortos, String cesareas, Date fecha, String semanas, String fetal, String frecuencia, String membranas, int tiempo, String uterina, String presentacion, String dilatacion, String borramiento, String plano, String util, String snagrado, String contraciones, Admision admision) {
        this.idEmergencia = idEmergencia;
        this.gestas = gestas;
        this.partos = partos;
        this.abortos = abortos;
        this.cesareas = cesareas;
        this.fecha = fecha;
        this.semanas = semanas;
        this.fetal = fetal;
        this.frecuencia = frecuencia;
        this.membranas = membranas;
        this.tiempo = tiempo;
        this.uterina = uterina;
        this.presentacion = presentacion;
        this.dilatacion = dilatacion;
        this.borramiento = borramiento;
        this.plano = plano;
        this.util = util;
        this.snagrado = snagrado;
        this.contraciones = contraciones;
        this.admision = admision;
    }

    public Long getIdEmergencia() {
        return idEmergencia;
    }

    public void setIdEmergencia(Long idEmergencia) {
        this.idEmergencia = idEmergencia;
    }

    public String getGestas() {
        return gestas;
    }

    public void setGestas(String gestas) {
        this.gestas = gestas;
    }

    public String getPartos() {
        return partos;
    }

    public void setPartos(String partos) {
        this.partos = partos;
    }

    public String getAbortos() {
        return abortos;
    }

    public void setAbortos(String abortos) {
        this.abortos = abortos;
    }

    public String getCesareas() {
        return cesareas;
    }

    public void setCesareas(String cesareas) {
        this.cesareas = cesareas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSemanas() {
        return semanas;
    }

    public void setSemanas(String semanas) {
        this.semanas = semanas;
    }

    public String getFetal() {
        return fetal;
    }

    public void setFetal(String fetal) {
        this.fetal = fetal;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getMembranas() {
        return membranas;
    }

    public void setMembranas(String membranas) {
        this.membranas = membranas;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getUterina() {
        return uterina;
    }

    public void setUterina(String uterina) {
        this.uterina = uterina;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getDilatacion() {
        return dilatacion;
    }

    public void setDilatacion(String dilatacion) {
        this.dilatacion = dilatacion;
    }

    public String getBorramiento() {
        return borramiento;
    }

    public void setBorramiento(String borramiento) {
        this.borramiento = borramiento;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getUtil() {
        return util;
    }

    public void setUtil(String util) {
        this.util = util;
    }

    public String getSnagrado() {
        return snagrado;
    }

    public void setSnagrado(String snagrado) {
        this.snagrado = snagrado;
    }

    public String getContraciones() {
        return contraciones;
    }

    public void setContraciones(String contraciones) {
        this.contraciones = contraciones;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }
    
    
}
