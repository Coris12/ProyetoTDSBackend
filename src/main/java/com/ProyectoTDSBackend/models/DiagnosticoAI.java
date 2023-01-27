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
@Table(name = "diagnosticoAI")
public class DiagnosticoAI {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diagnosticoA", nullable = false)
    private Long idDiagA;

    @Column(name = "Descripcion1")
    private String descripcion1;

    @Column(name = "Descripcion2")
    private String descripcion2;

    @Column(name = "Descripcion3")
    private String descripcion3;

    @Column(name = "cie1")
    private String cie1;

    @Column(name = "cie2")
    private String cie2;
    
    @Column(name = "cie3")
    private String cie3;
    
    @Column(name = "d1", length = 3)
    private String d1;
    
    @Column(name = "d2", length = 3)
    private String d2;
    
    @Column(name = "d3", length = 3)
    private String d3;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_dmision", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Admision admision;

    public DiagnosticoAI() {
    }

    public DiagnosticoAI(Long idDiagA, String descripcion1, String descripcion2, String descripcion3, String cie1, String cie2, String cie3, String d1, String d2, String d3, Admision admision) {
        this.idDiagA = idDiagA;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.descripcion3 = descripcion3;
        this.cie1 = cie1;
        this.cie2 = cie2;
        this.cie3 = cie3;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.admision = admision;
    }

    public Long getIdDiagA() {
        return idDiagA;
    }

    public void setIdDiagA(Long idDiagA) {
        this.idDiagA = idDiagA;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public String getDescripcion3() {
        return descripcion3;
    }

    public void setDescripcion3(String descripcion3) {
        this.descripcion3 = descripcion3;
    }

    public String getCie1() {
        return cie1;
    }

    public void setCie1(String cie1) {
        this.cie1 = cie1;
    }

    public String getCie2() {
        return cie2;
    }

    public void setCie2(String cie2) {
        this.cie2 = cie2;
    }

    public String getCie3() {
        return cie3;
    }

    public void setCie3(String cie3) {
        this.cie3 = cie3;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }
    
    
    
    
}
