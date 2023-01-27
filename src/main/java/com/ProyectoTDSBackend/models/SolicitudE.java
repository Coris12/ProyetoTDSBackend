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
@Table(name = "solicutud")
public class SolicitudE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_soli", nullable = false)
    private Long idSoli;

    @Column(name = "biometrica")
    private boolean biometrica;

    @Column(name = "uroanalisis")
    private boolean uro;

    @Column(name = "quimicaS")
    private boolean sanguinea;

    @Column(name = "electrolitos")
    private boolean elec;

    @Column(name = "gastrometria")
    private boolean gastro;

    @Column(name = "electroCar")
    private boolean cardiograma;

    @Column(name = "endoscopia")
    private boolean endo;

    @Column(name = "torax")
    private boolean torax;

    @Column(name = "abdomen")
    private boolean abdomen;

    @Column(name = "osea")
    private boolean osea;

    @Column(name = "tomografia")
    private boolean tomo;

    @Column(name = "resonancia")
    private boolean reso;

    @Column(name = "Ecopelvica")
    private boolean pelvica;

    @Column(name = "Ecoabdomen")
    private boolean ecoA;

    @Column(name = "interconsulta")
    private boolean inter;

    @Column(name = "otros")
    private boolean otros;

    @Column(name = "descripcion")
    private String desc;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_dmision", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Admision admision;

    public SolicitudE() {
    }

    public SolicitudE(Long idSoli, boolean biometrica, boolean uro, boolean sanguinea, boolean elec, boolean gastro, boolean cardiograma, boolean endo, boolean torax, boolean abdomen, boolean osea, boolean tomo, boolean reso, boolean pelvica, boolean ecoA, boolean inter, boolean otros, String desc, Admision admision) {
        this.idSoli = idSoli;
        this.biometrica = biometrica;
        this.uro = uro;
        this.sanguinea = sanguinea;
        this.elec = elec;
        this.gastro = gastro;
        this.cardiograma = cardiograma;
        this.endo = endo;
        this.torax = torax;
        this.abdomen = abdomen;
        this.osea = osea;
        this.tomo = tomo;
        this.reso = reso;
        this.pelvica = pelvica;
        this.ecoA = ecoA;
        this.inter = inter;
        this.otros = otros;
        this.desc = desc;
        this.admision = admision;
    }

    public Long getIdSoli() {
        return idSoli;
    }

    public void setIdSoli(Long idSoli) {
        this.idSoli = idSoli;
    }

    

   
    public boolean isBiometrica() {
        return biometrica;
    }

    public void setBiometrica(boolean biometrica) {
        this.biometrica = biometrica;
    }

    public boolean isUro() {
        return uro;
    }

    public void setUro(boolean uro) {
        this.uro = uro;
    }

    public boolean isSanguinea() {
        return sanguinea;
    }

    public void setSanguinea(boolean sanguinea) {
        this.sanguinea = sanguinea;
    }

    public boolean isElec() {
        return elec;
    }

    public void setElec(boolean elec) {
        this.elec = elec;
    }

    public boolean isGastro() {
        return gastro;
    }

    public void setGastro(boolean gastro) {
        this.gastro = gastro;
    }

    public boolean isCardiograma() {
        return cardiograma;
    }

    public void setCardiograma(boolean cardiograma) {
        this.cardiograma = cardiograma;
    }

    public boolean isEndo() {
        return endo;
    }

    public void setEndo(boolean endo) {
        this.endo = endo;
    }

    public boolean isTorax() {
        return torax;
    }

    public void setTorax(boolean torax) {
        this.torax = torax;
    }

    public boolean isAbdomen() {
        return abdomen;
    }

    public void setAbdomen(boolean abdomen) {
        this.abdomen = abdomen;
    }

    public boolean isOsea() {
        return osea;
    }

    public void setOsea(boolean osea) {
        this.osea = osea;
    }

    public boolean isTomo() {
        return tomo;
    }

    public void setTomo(boolean tomo) {
        this.tomo = tomo;
    }

    public boolean isReso() {
        return reso;
    }

    public void setReso(boolean reso) {
        this.reso = reso;
    }

    public boolean isPelvica() {
        return pelvica;
    }

    public void setPelvica(boolean pelvica) {
        this.pelvica = pelvica;
    }

    public boolean isEcoA() {
        return ecoA;
    }

    public void setEcoA(boolean ecoA) {
        this.ecoA = ecoA;
    }

    public boolean isInter() {
        return inter;
    }

    public void setInter(boolean inter) {
        this.inter = inter;
    }

    public boolean isOtros() {
        return otros;
    }

    public void setOtros(boolean otros) {
        this.otros = otros;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    
}
