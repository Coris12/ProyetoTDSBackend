package com.ProyectoTDSBackend.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sucursal")
public class Sucursal extends Auditable implements Serializable {

    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sucursal", nullable = false)
    private Long idSucursal;

    @Column(name = "nombreSuc", length = 200)
    private String nombreSuc;

    @Column(name = "direccionSuc")
    private String direccionSuc;

    @Column(name = "telefonoSuc", length = 10)
    private String telefonoSuc;

    @Column(name = "correoSuc", length = 200)
    private String correoSuc;

    @Column(name = "estado", length = 200)
    private int estado;

    public Sucursal() {
    }

    public Sucursal(Long idSucursal, String nombreSuc, String direccionSuc, String telefonoSuc, String correoSuc, int estado) {
        this.idSucursal = idSucursal;
        this.nombreSuc = nombreSuc;
        this.direccionSuc = direccionSuc;
        this.telefonoSuc = telefonoSuc;
        this.correoSuc = correoSuc;
        this.estado = estado;
    }

  

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSuc() {
        return nombreSuc;
    }

    public void setNombreSuc(String nombreSuc) {
        this.nombreSuc = nombreSuc;
    }

    public String getDireccionSuc() {
        return direccionSuc;
    }

    public void setDireccionSuc(String direccionSuc) {
        this.direccionSuc = direccionSuc;
    }

    public String getTelefonoSuc() {
        return telefonoSuc;
    }

    public void setTelefonoSuc(String telefonoSuc) {
        this.telefonoSuc = telefonoSuc;
    }

    public String getCorreoSuc() {
        return correoSuc;
    }

    public void setCorreoSuc(String correoSuc) {
        this.correoSuc = correoSuc;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
