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
@Table(name="organos")
public class OrganosDonados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_organos", nullable = false)
    private Long idOrganos;
    
    @Column(name = "nombre_organos", nullable = false)
    private String nombreOrgano;
    
     @Column(name = "nombre_receptor", nullable = false)
    private String nombreReceptor;
    
    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_autorizacion", foreignKey = @ForeignKey(name = "fk_id_autorizacion"))
    private Autorizacion autorizacion;

    public OrganosDonados() {
    }

    public OrganosDonados(Long idOrganos, String nombreOrgano, String nombreReceptor, Autorizacion autorizacion) {
        this.idOrganos = idOrganos;
        this.nombreOrgano = nombreOrgano;
        this.nombreReceptor = nombreReceptor;
        this.autorizacion = autorizacion;
    }

    
    
    

    public Long getIdOrganos() {
        return idOrganos;
    }

    public void setIdOrganos(Long idOrganos) {
        this.idOrganos = idOrganos;
    }

    public String getNombreOrgano() {
        return nombreOrgano;
    }

    public void setNombreOrgano(String nombreOrgano) {
        this.nombreOrgano = nombreOrgano;
    }

    public String getNombreReceptor() {
        return nombreReceptor;
    }

    public void setNombreReceptor(String nombreReceptor) {
        this.nombreReceptor = nombreReceptor;
    }

    public Autorizacion getAutorizacion() {
        return autorizacion;
    }

    public void setAutorizacion(Autorizacion autorizacion) {
        this.autorizacion = autorizacion;
    }

   
    
    

}
