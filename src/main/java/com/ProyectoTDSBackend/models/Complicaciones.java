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
@Table(name = "complicacion")
public class Complicaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comp", nullable = false)
    private Long idCom;

    @Column(name = "hipertension", length = 1)
    private String hipertension;

    @Column(name = "depRespiratoria", length = 1)
    private String respiratoria;

    @Column(name = "insuficiente", length = 1)
    private String insuficiente;

    @Column(name = "cardiaco", length = 1)
    private String cardiaco;

    @Column(name = "atrrimias", length = 1)
    private String atrri;

    @Column(name = "perforacionDuram", length = 1)
    private String duramadre;

    @Column(name = "espamo", length = 1)
    private String espamo;

    @Column(name = "vomito", length = 1)
    private String vomito;
    
    @Column(name = "cambioT")
    private String cambioT;

    @Column(name = "comentario")
    private String comentarios;

    @Column(name = "informacion")
    private String informacion;

    @Column(name = "grupoS")
    private String grupoS;

    @Column(name = "r1", length = 1)
    private String r1;

    @Column(name = "r2", length = 1)
    private String r2;

    @Column(name = "r3", length = 1)
    private String r3;

    @Column(name = "r4", length = 1)
    private String r4;

    @Column(name = "r5", length = 1)
    private String r5;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_anes", foreignKey = @ForeignKey(name = "fk_anes_id"))
    private Anestesia anestesia;

    public Complicaciones() {
    }

    public Complicaciones(Long idCom, String hipertension, String respiratoria, String insuficiente, String cardiaco, String atrri, String duramadre, String espamo, String vomito, String cambioT, String comentarios, String informacion, String grupoS, String r1, String r2, String r3, String r4, String r5, Anestesia anestesia) {
        this.idCom = idCom;
        this.hipertension = hipertension;
        this.respiratoria = respiratoria;
        this.insuficiente = insuficiente;
        this.cardiaco = cardiaco;
        this.atrri = atrri;
        this.duramadre = duramadre;
        this.espamo = espamo;
        this.vomito = vomito;
        this.cambioT = cambioT;
        this.comentarios = comentarios;
        this.informacion = informacion;
        this.grupoS = grupoS;
        this.r1 = r1;
        this.r2 = r2;
        this.r3 = r3;
        this.r4 = r4;
        this.r5 = r5;
        this.anestesia = anestesia;
    }


    public Long getIdCom() {
        return idCom;
    }

    public void setIdCom(Long idCom) {
        this.idCom = idCom;
    }

    public String getHipertension() {
        return hipertension;
    }

    public void setHipertension(String hipertension) {
        this.hipertension = hipertension;
    }

    public String getRespiratoria() {
        return respiratoria;
    }

    public void setRespiratoria(String respiratoria) {
        this.respiratoria = respiratoria;
    }

    public String getInsuficiente() {
        return insuficiente;
    }

    public void setInsuficiente(String insuficiente) {
        this.insuficiente = insuficiente;
    }

    public String getCardiaco() {
        return cardiaco;
    }

    public void setCardiaco(String cardiaco) {
        this.cardiaco = cardiaco;
    }

    public String getAtrri() {
        return atrri;
    }

    public void setAtrri(String atrri) {
        this.atrri = atrri;
    }

    public String getDuramadre() {
        return duramadre;
    }

    public void setDuramadre(String duramadre) {
        this.duramadre = duramadre;
    }

    public String getEspamo() {
        return espamo;
    }

    public void setEspamo(String espamo) {
        this.espamo = espamo;
    }

    public String getCambioT() {
        return cambioT;
    }

    public void setCambioT(String cambioT) {
        this.cambioT = cambioT;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getGrupoS() {
        return grupoS;
    }

    public void setGrupoS(String grupoS) {
        this.grupoS = grupoS;
    }

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1;
    }

    public String getR2() {
        return r2;
    }

    public void setR2(String r2) {
        this.r2 = r2;
    }

    public String getR3() {
        return r3;
    }

    public void setR3(String r3) {
        this.r3 = r3;
    }

    public String getR4() {
        return r4;
    }

    public void setR4(String r4) {
        this.r4 = r4;
    }

    public String getR5() {
        return r5;
    }

    public void setR5(String r5) {
        this.r5 = r5;
    }

    public Anestesia getAnestesia() {
        return anestesia;
    }

    public void setAnestesia(Anestesia anestesia) {
        this.anestesia = anestesia;
    }

    public String getVomito() {
        return vomito;
    }

    public void setVomito(String vomito) {
        this.vomito = vomito;
    }

}
