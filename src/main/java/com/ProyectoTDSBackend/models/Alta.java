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
@Table(name="alta")
public class Alta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alta", nullable = false)
    private Long idAlta;
    
    @Column(name = "Domicilio")
    private boolean domicilio;
    
    @Column(name = "CExterna")
    private boolean cExterna;
    
    @Column(name = "Observacion")
    private boolean observacion;
    
    @Column(name = "Internacion")
    private boolean internacion;
    
    @Column(name = "Referencia")
    private boolean referencia;
    
    @Column(name = "Vivo")
    private boolean vivo;
    
    @Column(name = "Estable")
    private boolean estable;
    
    @Column(name = "Inestable")
    private boolean inestable;
    
    @Column(name = "dias")
    private int dias;
    
    @Column(name = "Servicio")
    private String servicio;
    
    @Column(name = "Establecimiento")
    private String establecimiento;
    
    @Column(name = "muerto")
    private boolean muerto;
    
    @Column(name = "Causa")
    private String causa;
    
    @Column(name="fecha")
    private Date fecha;
    
    @Column(name="nombre")
    private String nombre;
    
    @Column(name="codigo")
    private String codigo;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_dmision", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Admision admision;

    public Alta() {
    }

    public Alta(Long idAlta, boolean domicilio, boolean cExterna, boolean observacion, boolean internacion, boolean referencia, boolean vivo, boolean estable, boolean inestable, int dias, String servicio, String establecimiento, boolean muerto, String causa, Date fecha, String nombre, String codigo, Admision admision) {
        this.idAlta = idAlta;
        this.domicilio = domicilio;
        this.cExterna = cExterna;
        this.observacion = observacion;
        this.internacion = internacion;
        this.referencia = referencia;
        this.vivo = vivo;
        this.estable = estable;
        this.inestable = inestable;
        this.dias = dias;
        this.servicio = servicio;
        this.establecimiento = establecimiento;
        this.muerto = muerto;
        this.causa = causa;
        this.fecha = fecha;
        this.nombre = nombre;
        this.codigo = codigo;
        this.admision = admision;
    }

    public Long getIdAlta() {
        return idAlta;
    }

    public void setIdAlta(Long idAlta) {
        this.idAlta = idAlta;
    }

    public boolean isDomicilio() {
        return domicilio;
    }

    public void setDomicilio(boolean domicilio) {
        this.domicilio = domicilio;
    }

    public boolean iscExterna() {
        return cExterna;
    }

    public void setcExterna(boolean cExterna) {
        this.cExterna = cExterna;
    }

    public boolean isObservacion() {
        return observacion;
    }

    public void setObservacion(boolean observacion) {
        this.observacion = observacion;
    }

    public boolean isInternacion() {
        return internacion;
    }

    public void setInternacion(boolean internacion) {
        this.internacion = internacion;
    }

    public boolean isReferencia() {
        return referencia;
    }

    public void setReferencia(boolean referencia) {
        this.referencia = referencia;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
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

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }
    
    
}
