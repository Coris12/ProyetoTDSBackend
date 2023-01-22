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
@Table(name="examenEsto")
public class ExamenEsto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_examen", nullable = false)
    private Long idExamenEs;
    
    @Column(name = "Labio" )
    private boolean labio;

    @Column(name = "Mejillas" )
    private boolean mejillas;

    @Column(name = "Maxilar_su" )
    private boolean maxSuperior;

    @Column(name = "Maxilar_in")
    private boolean maxilarInf;

    @Column(name = "Lengua")
    private boolean lengua;

    @Column(name = "Paladar" )
    private boolean paladar;

    @Column(name = "Piso" )
    private boolean piso;

    @Column(name = "Carrillos")
    private boolean carrillos;

    @Column(name = "Glandulas_Sa")
    private boolean glandulasSa;
    
    @Column(name = "Oro")
    private boolean oroFaringe;
    
    @Column(name = "A.T.M")
    private boolean atm;
    
    @Column(name = "Glangios")
    private boolean glangios;
    
    
    @Column(name = "Descripcion", length = 500)
    private String descripcion;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_odontologia", foreignKey = @ForeignKey(name = "FK_ANTEC_FAMILIARES_Indice_ID"))
    private Odontologia odontologia;

    public ExamenEsto() {
    }

    public ExamenEsto(Long idExamenEs, boolean labio, boolean mejillas, boolean maxSuperior, boolean maxilarInf, boolean lengua, boolean paladar, boolean piso, boolean carrillos, boolean glandulasSa, boolean oroFaringe, boolean atm, boolean glangios, String descripcion, Odontologia odontologia) {
        this.idExamenEs = idExamenEs;
        this.labio = labio;
        this.mejillas = mejillas;
        this.maxSuperior = maxSuperior;
        this.maxilarInf = maxilarInf;
        this.lengua = lengua;
        this.paladar = paladar;
        this.piso = piso;
        this.carrillos = carrillos;
        this.glandulasSa = glandulasSa;
        this.oroFaringe = oroFaringe;
        this.atm = atm;
        this.glangios = glangios;
        this.descripcion = descripcion;
        this.odontologia = odontologia;
    }

    public Long getIdExamenEs() {
        return idExamenEs;
    }

    public void setIdExamenEs(Long idExamenEs) {
        this.idExamenEs = idExamenEs;
    }

    public boolean isLabio() {
        return labio;
    }

    public void setLabio(boolean labio) {
        this.labio = labio;
    }

    public boolean isMejillas() {
        return mejillas;
    }

    public void setMejillas(boolean mejillas) {
        this.mejillas = mejillas;
    }

    public boolean isMaxSuperior() {
        return maxSuperior;
    }

    public void setMaxSuperior(boolean maxSuperior) {
        this.maxSuperior = maxSuperior;
    }

    public boolean isMaxilarInf() {
        return maxilarInf;
    }

    public void setMaxilarInf(boolean maxilarInf) {
        this.maxilarInf = maxilarInf;
    }

    public boolean isLengua() {
        return lengua;
    }

    public void setLengua(boolean lengua) {
        this.lengua = lengua;
    }

    public boolean isPaladar() {
        return paladar;
    }

    public void setPaladar(boolean paladar) {
        this.paladar = paladar;
    }

    public boolean isPiso() {
        return piso;
    }

    public void setPiso(boolean piso) {
        this.piso = piso;
    }

    public boolean isCarrillos() {
        return carrillos;
    }

    public void setCarrillos(boolean carrillos) {
        this.carrillos = carrillos;
    }

    public boolean isGlandulasSa() {
        return glandulasSa;
    }

    public void setGlandulasSa(boolean glandulasSa) {
        this.glandulasSa = glandulasSa;
    }

    public boolean isOroFaringe() {
        return oroFaringe;
    }

    public void setOroFaringe(boolean oroFaringe) {
        this.oroFaringe = oroFaringe;
    }

    public boolean isAtm() {
        return atm;
    }

    public void setAtm(boolean atm) {
        this.atm = atm;
    }

    public boolean isGlangios() {
        return glangios;
    }

    public void setGlangios(boolean glangios) {
        this.glangios = glangios;
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
