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
@Table(name = "lesiones")
public class Lesiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lesion", nullable = false)
    private Long idLesiones;

    @Column(name = "penetrante")
    private String pentrante;

    @Column(name = "cortante")
    private String cortante;

    @Column(name = "expuesta")
    private String expuesta;

    @Column(name = "cerrada")
    private String cerrada;

    @Column(name = "extraña")
    private String extraña;

    @Column(name = "hemorragia")
    private String hemorragia;

    @Column(name = "mordedura")
    private String mordedura;

    @Column(name = "picadura")
    private String picadura;

    @Column(name = "excoracion")
    private String excoracion;

    @Column(name = "deformacion")
    private String masa;

    @Column(name = "hematoma")
    private String hematoma;

    @Column(name = "inflamacion")
    private String inflamacion;

    @Column(name = "esguince")
    private String esguince;

    @Column(name = "quemadura")
    private String quemadura;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_dmision", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Admision admision;

    public Lesiones() {
    }

    public Lesiones(Long idLesiones, String pentrante, String cortante, String expuesta, String cerrada, String extraña, String hemorragia, String mordedura, String picadura, String excoracion, String masa, String hematoma, String inflamacion, String esguince, String quemadura, Admision admision) {
        this.idLesiones = idLesiones;
        this.pentrante = pentrante;
        this.cortante = cortante;
        this.expuesta = expuesta;
        this.cerrada = cerrada;
        this.extraña = extraña;
        this.hemorragia = hemorragia;
        this.mordedura = mordedura;
        this.picadura = picadura;
        this.excoracion = excoracion;
        this.masa = masa;
        this.hematoma = hematoma;
        this.inflamacion = inflamacion;
        this.esguince = esguince;
        this.quemadura = quemadura;
        this.admision = admision;
    }

    public Long getIdLesiones() {
        return idLesiones;
    }

    public void setIdLesiones(Long idLesiones) {
        this.idLesiones = idLesiones;
    }

    public String getPentrante() {
        return pentrante;
    }

    public void setPentrante(String pentrante) {
        this.pentrante = pentrante;
    }

    public String getCortante() {
        return cortante;
    }

    public void setCortante(String cortante) {
        this.cortante = cortante;
    }

    public String getExpuesta() {
        return expuesta;
    }

    public void setExpuesta(String expuesta) {
        this.expuesta = expuesta;
    }

    public String getCerrada() {
        return cerrada;
    }

    public void setCerrada(String cerrada) {
        this.cerrada = cerrada;
    }

    public String getExtraña() {
        return extraña;
    }

    public void setExtraña(String extraña) {
        this.extraña = extraña;
    }

    public String getHemorragia() {
        return hemorragia;
    }

    public void setHemorragia(String hemorragia) {
        this.hemorragia = hemorragia;
    }

    public String getMordedura() {
        return mordedura;
    }

    public void setMordedura(String mordedura) {
        this.mordedura = mordedura;
    }

    public String getPicadura() {
        return picadura;
    }

    public void setPicadura(String picadura) {
        this.picadura = picadura;
    }

    public String getExcoracion() {
        return excoracion;
    }

    public void setExcoracion(String excoracion) {
        this.excoracion = excoracion;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getHematoma() {
        return hematoma;
    }

    public void setHematoma(String hematoma) {
        this.hematoma = hematoma;
    }

    public String getInflamacion() {
        return inflamacion;
    }

    public void setInflamacion(String inflamacion) {
        this.inflamacion = inflamacion;
    }

    public String getEsguince() {
        return esguince;
    }

    public void setEsguince(String esguince) {
        this.esguince = esguince;
    }

    public String getQuemadura() {
        return quemadura;
    }

    public void setQuemadura(String quemadura) {
        this.quemadura = quemadura;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

}
