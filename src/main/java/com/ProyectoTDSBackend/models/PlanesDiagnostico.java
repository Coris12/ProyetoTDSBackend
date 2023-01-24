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
@Table(name = "planes")
public class PlanesDiagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_planes", nullable = false)
    private Long idPlanes;

    @Column(name = "Biometrica")
    private boolean biometrica;

    @Column(name = "QuimicaS")
    private String quimicaS;

    @Column(name = "Rayosx")
    private boolean rayosx;

    @Column(name = "Otros")
    private boolean otros;

    @Column(name = "Descripcion")
    private String descripcion;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_odontologia", foreignKey = @ForeignKey(name = "fk_odontolo_id"))
    private Odontologia odontologia;

    public PlanesDiagnostico() {
    }

    public PlanesDiagnostico(Long idPlanes, boolean biometrica, String quimicaS, boolean rayosx, boolean otros, String descripcion, Odontologia odontologia) {
        this.idPlanes = idPlanes;
        this.biometrica = biometrica;
        this.quimicaS = quimicaS;
        this.rayosx = rayosx;
        this.otros = otros;
        this.descripcion = descripcion;
        this.odontologia = odontologia;
    }

    public Long getIdPlanes() {
        return idPlanes;
    }

    public void setIdPlanes(Long idPlanes) {
        this.idPlanes = idPlanes;
    }

    public boolean isBiometrica() {
        return biometrica;
    }

    public void setBiometrica(boolean biometrica) {
        this.biometrica = biometrica;
    }

    public String getQuimicaS() {
        return quimicaS;
    }

    public void setQuimicaS(String quimicaS) {
        this.quimicaS = quimicaS;
    }

    public boolean isRayosx() {
        return rayosx;
    }

    public void setRayosx(boolean rayosx) {
        this.rayosx = rayosx;
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
