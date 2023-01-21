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
@Table(name = "IndiceF")
public class IndicesF {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_IndiceF", nullable = false)
    private Long idIndiceF;

    @Column(name = "alergiaA")
    private boolean alergiaAntiabio;

    @Column(name = "alergiaAnes" )
    private boolean alergiaAnes;

    @Column(name = "HEMORRAGIAS" )
    private boolean hemR;

    @Column(name = "vh_sida" )
    private boolean vh;

    @Column(name = "TUBERCULOSIS")
    private boolean tuberculosis;

    @Column(name = "Asma")
    private boolean asma;

    @Column(name = "Diabetes" )
    private boolean diabetes;

    @Column(name = "enfCar" )
    private boolean enfCardiaca;

    @Column(name = "OTROS")
    private boolean otros;

    @Column(name = "Descripcion", length = 500)
    private String descripcion;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_odontologia", foreignKey = @ForeignKey(name = "FK_ANTEC_FAMILIARES_Indice_ID"))
    private Odontologia odontologia;

    public IndicesF() {
    }

    public IndicesF(Long idIndiceF, boolean alergiaAntiabio, boolean alergiaAnes, boolean hemR, boolean vh, boolean tuberculosis, boolean asma, boolean diabetes, boolean enfCardiaca, boolean otros, String descripcion, Odontologia odontologia) {
        this.idIndiceF = idIndiceF;
        this.alergiaAntiabio = alergiaAntiabio;
        this.alergiaAnes = alergiaAnes;
        this.hemR = hemR;
        this.vh = vh;
        this.tuberculosis = tuberculosis;
        this.asma = asma;
        this.diabetes = diabetes;
        this.enfCardiaca = enfCardiaca;
        this.otros = otros;
        this.descripcion = descripcion;
        this.odontologia = odontologia;
    }

    public Long getIdIndiceF() {
        return idIndiceF;
    }

    public void setIdIndiceF(Long idIndiceF) {
        this.idIndiceF = idIndiceF;
    }

    public boolean isAlergiaAntiabio() {
        return alergiaAntiabio;
    }

    public void setAlergiaAntiabio(boolean alergiaAntiabio) {
        this.alergiaAntiabio = alergiaAntiabio;
    }

    public boolean isAlergiaAnes() {
        return alergiaAnes;
    }

    public void setAlergiaAnes(boolean alergiaAnes) {
        this.alergiaAnes = alergiaAnes;
    }

    public boolean isHemR() {
        return hemR;
    }

    public void setHemR(boolean hemR) {
        this.hemR = hemR;
    }

    public boolean isVh() {
        return vh;
    }

    public void setVh(boolean vh) {
        this.vh = vh;
    }

    public boolean isTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(boolean tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public boolean isAsma() {
        return asma;
    }

    public void setAsma(boolean asma) {
        this.asma = asma;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isEnfCardiaca() {
        return enfCardiaca;
    }

    public void setEnfCardiaca(boolean enfCardiaca) {
        this.enfCardiaca = enfCardiaca;
    }

    public boolean isOtros() {
        return otros;
    }

    public void setOtros(boolean otros) {
        this.otros = otros;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Odontologia getOdontologia() {
        return odontologia;
    }

    public void setOdontologia(Odontologia odontologia) {
        this.odontologia = odontologia;
    }
    
    
}
