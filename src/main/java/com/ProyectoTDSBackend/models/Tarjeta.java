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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "tarjeta")

public class Tarjeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarjeta", nullable = false)
    private int idTarjeta;

    @Column(name = "consultas", nullable = false)
    private int numConsultas;

    @Column(name = "afiliacion", nullable = false)
    private String tipoaAfiliacion;

    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private Date fechaFin;

    @Column(name = "qr", nullable = false)
    private String QR;

    @Column(name = "estado", nullable = false)
    private int estado;
    
    @JoinColumn(name = "ID_TARJETA_ESPECIALIDAD", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private TarjetaEspecialidad tarjetaEspecialidad;

    public Tarjeta() {
    }

    public Tarjeta(int idTarjeta, int numConsultas, String tipoaAfiliacion, Date fechaInicio, Date fechaFin, String qR,
            int estado, TarjetaEspecialidad tarjetaEspecialidad) {
        this.idTarjeta = idTarjeta;
        this.numConsultas = numConsultas;
        this.tipoaAfiliacion = tipoaAfiliacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        QR = qR;
        this.estado = estado;
        this.tarjetaEspecialidad = tarjetaEspecialidad;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getNumConsultas() {
        return numConsultas;
    }

    public void setNumConsultas(int numConsultas) {
        this.numConsultas = numConsultas;
    }

    public String getTipoaAfiliacion() {
        return tipoaAfiliacion;
    }

    public void setTipoaAfiliacion(String tipoaAfiliacion) {
        this.tipoaAfiliacion = tipoaAfiliacion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getQR() {
        return QR;
    }

    public void setQR(String QR) {
        this.QR = QR;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public TarjetaEspecialidad getTarjetaEspecialidad() {
        return tarjetaEspecialidad;
    }

    public void setTarjetaEspecialidad(TarjetaEspecialidad tarjetaEspecialidad) {
        this.tarjetaEspecialidad = tarjetaEspecialidad;
    }

}
