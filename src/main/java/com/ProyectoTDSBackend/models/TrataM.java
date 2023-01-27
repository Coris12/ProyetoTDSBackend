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
@Table(name = "trataMe")
public class TrataM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trataM", nullable = false)
    private Long idTrat;

    @Column(name = "indicaciones")
    private String indicaciones;

    @Column(name = "medicamento1")
    private String medica1;

    @Column(name = "medicamento2")
    private String medica2;

    @Column(name = "medicamento3")
    private String medica3;

    @Column(name = "Posologia")
    private String posologia1;

    @Column(name = "posologia2")
    private String posologia2;

    @Column(name = "posologia3")
    private String poso3;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_dmision", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Admision admision;

    public TrataM() {
    }

    public TrataM(Long idTrat, String indicaciones, String medica1, String medica2, String medica3, String posologia1, String posologia2, String poso3, Admision admision) {
        this.idTrat = idTrat;
        this.indicaciones = indicaciones;
        this.medica1 = medica1;
        this.medica2 = medica2;
        this.medica3 = medica3;
        this.posologia1 = posologia1;
        this.posologia2 = posologia2;
        this.poso3 = poso3;
        this.admision = admision;
    }

    public Long getIdTrat() {
        return idTrat;
    }

    public void setIdTrat(Long idTrat) {
        this.idTrat = idTrat;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getMedica1() {
        return medica1;
    }

    public void setMedica1(String medica1) {
        this.medica1 = medica1;
    }

    public String getMedica2() {
        return medica2;
    }

    public void setMedica2(String medica2) {
        this.medica2 = medica2;
    }

    public String getMedica3() {
        return medica3;
    }

    public void setMedica3(String medica3) {
        this.medica3 = medica3;
    }

    public String getPosologia1() {
        return posologia1;
    }

    public void setPosologia1(String posologia1) {
        this.posologia1 = posologia1;
    }

    public String getPosologia2() {
        return posologia2;
    }

    public void setPosologia2(String posologia2) {
        this.posologia2 = posologia2;
    }

    public String getPoso3() {
        return poso3;
    }

    public void setPoso3(String poso3) {
        this.poso3 = poso3;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }
    
    
}
