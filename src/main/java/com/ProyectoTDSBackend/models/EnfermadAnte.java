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
@Table(name = "Enfermedad")
public class EnfermadAnte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_enfermdad", nullable = false)
    private Long idEnfermedad;

    @Column(name = "Alergico")
    private boolean alergico;

    @Column(name = "Clinico")
    private boolean clinico;

    @Column(name = "Quirurgico")
    private boolean quirur;

    @Column(name = "Ginecologico")
    private boolean gine;

    @Column(name = "Traumato")
    private boolean trau;

    @Column(name = "Farmacolo")
    private boolean farma;

    @Column(name = "Psiquiatrico")
    private boolean psiquiatrico;

    @Column(name = "Otro")
    private boolean otro;

    @Column(name = "descricionA")
    private String descripcionA;

    @Column(name = "viaAerea")
    private boolean libre;

    @Column(name = "viaObstruida")
    private boolean obstruida;

    @Column(name = "condicionEstable")
    private boolean estable;

    @Column(name = "condicionInestable")
    private boolean inestable;

    @Column(name = "descripcinE")
    private String descripcion;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_dmision", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Admision admision;

    public EnfermadAnte() {
    }

    public EnfermadAnte(Long idEnfermedad, boolean alergico, boolean clinico, boolean quirur, boolean gine, boolean trau, boolean farma, boolean psiquiatrico, boolean otro, String descripcionA, boolean libre, boolean obstruida, boolean estable, boolean inestable, String descripcion, Admision admision) {
        this.idEnfermedad = idEnfermedad;
        this.alergico = alergico;
        this.clinico = clinico;
        this.quirur = quirur;
        this.gine = gine;
        this.trau = trau;
        this.farma = farma;
        this.psiquiatrico = psiquiatrico;
        this.otro = otro;
        this.descripcionA = descripcionA;
        this.libre = libre;
        this.obstruida = obstruida;
        this.estable = estable;
        this.inestable = inestable;
        this.descripcion = descripcion;
        this.admision = admision;
    }

    public Long getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(Long idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isClinico() {
        return clinico;
    }

    public void setClinico(boolean clinico) {
        this.clinico = clinico;
    }

    public boolean isQuirur() {
        return quirur;
    }

    public void setQuirur(boolean quirur) {
        this.quirur = quirur;
    }

    public boolean isGine() {
        return gine;
    }

    public void setGine(boolean gine) {
        this.gine = gine;
    }

    public boolean isTrau() {
        return trau;
    }

    public void setTrau(boolean trau) {
        this.trau = trau;
    }

    public boolean isFarma() {
        return farma;
    }

    public void setFarma(boolean farma) {
        this.farma = farma;
    }

    public boolean isPsiquiatrico() {
        return psiquiatrico;
    }

    public void setPsiquiatrico(boolean psiquiatrico) {
        this.psiquiatrico = psiquiatrico;
    }

    public boolean isOtro() {
        return otro;
    }

    public void setOtro(boolean otro) {
        this.otro = otro;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public boolean isObstruida() {
        return obstruida;
    }

    public void setObstruida(boolean obstruida) {
        this.obstruida = obstruida;
    }

    public boolean isEstable() {
        return estable;
    }

    public void setEstable(boolean estable) {
        this.estable = estable;
    }

    public boolean isInestable() {
        return inestable;
    }

    public void setInestable(boolean inestable) {
        this.inestable = inestable;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
