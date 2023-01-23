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
@Table(name = "diagnosticoO")
public class DiagnosticoO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_diagnostico", nullable = false)
    private Long idDiagnostico;

    @Column(name = "FechaA")
    private Date fechaA;

    @Column(name = "FechaC")
    private Date fechaC;

    @Column(name = "Profesional")
    private String profesional;

    @Column(name = "Cie1")
    private String cie1;

    @Column(name = "Cie2")
    private String cie2;

    @Column(name = "Descripcion1")
    private String descripcion1;

    @Column(name = "Descripcion2")
    private String descripcion2;

    @Column(name = "Pre1", length = 3)
    private String pre1;

    @Column(name = "Def", length = 3)
    private String def;

    @Column(name = "Pre2", length = 3)
    private String pre2;

    @Column(name = "Def1", length = 3)
    private String def2;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_odontologia", foreignKey = @ForeignKey(name = "FK_ANTEC_FAMILIARES_Indice_ID"))
    private Odontologia odontologia;

    public DiagnosticoO() {
    }

    public DiagnosticoO(Long idDiagnostico, Date fechaA, Date fechaC, String profesional, String cie1, String cie2, String descripcion1, String descripcion2, String pre1, String def, String pre2, String def2, Odontologia odontologia) {
        this.idDiagnostico = idDiagnostico;
        this.fechaA = fechaA;
        this.fechaC = fechaC;
        this.profesional = profesional;
        this.cie1 = cie1;
        this.cie2 = cie2;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.pre1 = pre1;
        this.def = def;
        this.pre2 = pre2;
        this.def2 = def2;
        this.odontologia = odontologia;
    }
    
    

    public Long getIdDiagnostico() {
        return idDiagnostico;
    }

    public void setIdDiagnostico(Long idDiagnostico) {
        this.idDiagnostico = idDiagnostico;
    }

    public Date getFechaA() {
        return fechaA;
    }

    public void setFechaA(Date fechaA) {
        this.fechaA = fechaA;
    }

    public Date getFechaC() {
        return fechaC;
    }

    public void setFechaC(Date fechaC) {
        this.fechaC = fechaC;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
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

    public String getPre1() {
        return pre1;
    }

    public void setPre1(String pre1) {
        this.pre1 = pre1;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

   

    public String getPre2() {
        return pre2;
    }

    public void setPre2(String pre2) {
        this.pre2 = pre2;
    }

    public String getDef2() {
        return def2;
    }

    public void setDef2(String def2) {
        this.def2 = def2;
    }

    public Odontologia getOdontologia() {
        return odontologia;
    }

    public void setOdontologia(Odontologia odontologia) {
        this.odontologia = odontologia;
    }
    
    

}
