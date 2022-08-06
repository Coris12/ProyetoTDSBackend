/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.ProyectoTDSBackend.dto.DatosTarjetaAllDTO;

import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

/**
 *
 * @author corin
 */

@NamedNativeQueries({
    @NamedNativeQuery(name = "Tarjeta.getAllDatosTarjeta", query = "", resultSetMapping = "getAllDatosTarjeta"),
})

@SqlResultSetMappings({
    @SqlResultSetMapping(name = "getAllDatosTarjeta", classes = {
        @ConstructorResult(targetClass = DatosTarjetaAllDTO.class, columns = {
            @ColumnResult(name = "id", type = Long.class),
            @ColumnResult(name = "idRecidencia", type = Long.class),
            @ColumnResult(name = "nombres", type = String.class),
            @ColumnResult(name = "direccion", type = String.class),
            @ColumnResult(name = "celular", type = String.class),
            @ColumnResult(name = "nacionalidad", type = String.class),
            @ColumnResult(name = "pais", type = String.class),
            @ColumnResult(name = "provincia", type = String.class),
            @ColumnResult(name = "canton", type = String.class),
            @ColumnResult(name = "parroquia", type = String.class),
            @ColumnResult(name = "idTarjeta", type = Integer.class),
            @ColumnResult(name = "afiliacion", type = String.class),
            @ColumnResult(name = "idTarjetaEspecialidad", type = Integer.class),
            @ColumnResult(name = "tipoEspecialidad", type = String.class),
            @ColumnResult(name = "estado", type = Integer.class), 
            @ColumnResult(name = "fechaFin", type = Date.class),
            @ColumnResult(name = "fechaInicio", type = Date.class),
            @ColumnResult(name = "consultas", type = Integer.class)
        })
    })
})

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

    // @Column(name = "qr", nullable = false)
    // private String QR;

    @Column(name = "qr", nullable = false)
    private byte[] QR;

    @Column(name = "estado", nullable = false)
    private int estado;

    @Column(name = "ID_TARJETA_ESPECIALIDAD", unique = false)
    private int idTarjetaEspecialidad;
    
    @JoinColumn(name = "ID_TARJETA_ESPECIALIDAD", insertable = false, updatable = false)
    @OneToOne(cascade = CascadeType.MERGE)
    private TarjetaEspecialidad tarjetaEspecialidad;

    public Tarjeta() {
    }

    // public Tarjeta(int idTarjeta, int numConsultas, String tipoaAfiliacion, Date fechaInicio, Date fechaFin, String qR,
    //         int estado, TarjetaEspecialidad tarjetaEspecialidad) {
    //     this.idTarjeta = idTarjeta;
    //     this.numConsultas = numConsultas;
    //     this.tipoaAfiliacion = tipoaAfiliacion;
    //     this.fechaInicio = fechaInicio;
    //     this.fechaFin = fechaFin;
    //     QR = qR;
    //     this.estado = estado;
    //     this.tarjetaEspecialidad = tarjetaEspecialidad;
    // }
    

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public Tarjeta(int idTarjeta, int numConsultas, String tipoaAfiliacion, Date fechaInicio, Date fechaFin, byte[] qR,
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

    public Tarjeta(int idTarjeta, int numConsultas, String tipoaAfiliacion, Date fechaInicio, Date fechaFin, byte[] qR,
            int estado, int idTarjetaEspecialidad, TarjetaEspecialidad tarjetaEspecialidad) {
        this.idTarjeta = idTarjeta;
        this.numConsultas = numConsultas;
        this.tipoaAfiliacion = tipoaAfiliacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        QR = qR;
        this.estado = estado;
        this.idTarjetaEspecialidad = idTarjetaEspecialidad;
        this.tarjetaEspecialidad = tarjetaEspecialidad;
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

    // public String getQR() {
    //     return QR;
    // }

    // public void setQR(String QR) {
    //     this.QR = QR;
    // }

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

    public byte[] getQR() {
        return QR;
    }

    public void setQR(byte[] qR) {
        QR = qR;
    }

    public int getIdTarjetaEspecialidad() {
        return idTarjetaEspecialidad;
    }

    public void setIdTarjetaEspecialidad(int idTarjetaEspecialidad) {
        this.idTarjetaEspecialidad = idTarjetaEspecialidad;
    }

}
