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
@Table(name = "infunsion")
public class Infusion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_infunsion", nullable = false)
    private Long idInfu;

    @Column(name = "dextrosas")
    private String dext;

    @Column(name = "ringer")
    private String ringer;

    @Column(name = "sangre")
    private String sangre;

    @Column(name = "expansores")
    private String ex;

    @Column(name = "total")
    private int total;

    @Column(name = "hemorragia")
    private String hemorragia;

    @Column(name = "apgar")
    private String apga;

    @Column(name = "tecnicas")
    private String especiales;

    @Column(name = "conducido")
    private String conducido;

    @Column(name = "po")
    private String por;

    @Column(name = "hora")
    private String hora;

    @Column(name = "uroanalisis")
    private String uro;

    @Column(name = "hematologico")
    private String hema;

    @Column(name = "quimicaS")
    private String quimicaS;

    @Column(name = "otros")
    private String otros;

    @Column(name = "atrimias")
    private String at;

    @Column(name = "hipertensiom")
    private String hiper;

    @Column(name = "valvulares")
    private String valvulares;

    @Column(name = "congenitas")
    private String congenitas;

    @Column(name = "infarto")
    private String infartos;

    @Column(name = "pa")
    private String pa;

    @Column(name = "ecg")
    private String ecg;

    @Column(name = "anteriorA")
    private String anteriorA;
    
    @Column(name = "horaI")
    private String horaI;
    
    @Column(name = "horaD")
    private String horaD;
    
    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_anes", foreignKey = @ForeignKey(name = "fk_anes_id"))
    private Anestesia anestesia;

    public Infusion() {
    }

    public Infusion(Long idInfu, String dext, String ringer, String sangre, String ex, int total, String hemorragia, String apga, String especiales, String conducido, String por, String hora, String uro, String hema, String quimicaS, String otros, String at, String hiper, String valvulares, String congenitas, String infartos, String pa, String ecg, String anteriorA, String horaI, String horaD, Anestesia anestesia) {
        this.idInfu = idInfu;
        this.dext = dext;
        this.ringer = ringer;
        this.sangre = sangre;
        this.ex = ex;
        this.total = total;
        this.hemorragia = hemorragia;
        this.apga = apga;
        this.especiales = especiales;
        this.conducido = conducido;
        this.por = por;
        this.hora = hora;
        this.uro = uro;
        this.hema = hema;
        this.quimicaS = quimicaS;
        this.otros = otros;
        this.at = at;
        this.hiper = hiper;
        this.valvulares = valvulares;
        this.congenitas = congenitas;
        this.infartos = infartos;
        this.pa = pa;
        this.ecg = ecg;
        this.anteriorA = anteriorA;
        this.horaI = horaI;
        this.horaD = horaD;
        this.anestesia = anestesia;
    }

    public Long getIdInfu() {
        return idInfu;
    }

    public void setIdInfu(Long idInfu) {
        this.idInfu = idInfu;
    }

    public String getDext() {
        return dext;
    }

    public void setDext(String dext) {
        this.dext = dext;
    }

    public String getRinger() {
        return ringer;
    }

    public void setRinger(String ringer) {
        this.ringer = ringer;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getHemorragia() {
        return hemorragia;
    }

    public void setHemorragia(String hemorragia) {
        this.hemorragia = hemorragia;
    }

    public String getApga() {
        return apga;
    }

    public void setApga(String apga) {
        this.apga = apga;
    }

    public String getEspeciales() {
        return especiales;
    }

    public void setEspeciales(String especiales) {
        this.especiales = especiales;
    }

    public String getConducido() {
        return conducido;
    }

    public void setConducido(String conducido) {
        this.conducido = conducido;
    }

    public String getPor() {
        return por;
    }

    public void setPor(String por) {
        this.por = por;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUro() {
        return uro;
    }

    public void setUro(String uro) {
        this.uro = uro;
    }

    public String getHema() {
        return hema;
    }

    public void setHema(String hema) {
        this.hema = hema;
    }

    public String getQuimicaS() {
        return quimicaS;
    }

    public void setQuimicaS(String quimicaS) {
        this.quimicaS = quimicaS;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
        this.otros = otros;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getHiper() {
        return hiper;
    }

    public void setHiper(String hiper) {
        this.hiper = hiper;
    }

    public String getValvulares() {
        return valvulares;
    }

    public void setValvulares(String valvulares) {
        this.valvulares = valvulares;
    }

    public String getCongenitas() {
        return congenitas;
    }

    public void setCongenitas(String congenitas) {
        this.congenitas = congenitas;
    }

    public String getInfartos() {
        return infartos;
    }

    public void setInfartos(String infartos) {
        this.infartos = infartos;
    }

    public String getPa() {
        return pa;
    }

    public void setPa(String pa) {
        this.pa = pa;
    }

    public String getEcg() {
        return ecg;
    }

    public void setEcg(String ecg) {
        this.ecg = ecg;
    }

    public String getAnteriorA() {
        return anteriorA;
    }

    public void setAnteriorA(String anteriorA) {
        this.anteriorA = anteriorA;
    }

    public String getHoraI() {
        return horaI;
    }

    public void setHoraI(String horaI) {
        this.horaI = horaI;
    }

    public String getHoraD() {
        return horaD;
    }

    public void setHoraD(String horaD) {
        this.horaD = horaD;
    }

    public Anestesia getAnestesia() {
        return anestesia;
    }

    public void setAnestesia(Anestesia anestesia) {
        this.anestesia = anestesia;
    }
    
    
    
}
