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
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sucursal", nullable = false)
    private Long idSucursal;

    @Column(name = "nombreSuc", length = 200)
    private String nombreSuc;

    @Column(name = "direccionSuc")
    private String direccionSuc;

    @Column(name = "telefonoSuc", length = 10)
    private int telefonoSuc;

    @Column(name = "correoSuc", length = 200)
    private String correoSuc;

    public Sucursal() {
    }

    public Sucursal(Long idSucursal, String nombreSuc, String direccionSuc, int telefonoSuc, String correoSuc) {
        this.idSucursal = idSucursal;
        this.nombreSuc = nombreSuc;
        this.direccionSuc = direccionSuc;
        this.telefonoSuc = telefonoSuc;
        this.correoSuc = correoSuc;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
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

    public int getTelefonoSuc() {
        return telefonoSuc;
    }

    public void setTelefonoSuc(int telefonoSuc) {
        this.telefonoSuc = telefonoSuc;
    }

    public String getCorreoSuc() {
        return correoSuc;
    }

    public void setCorreoSuc(String correoSuc) {
        this.correoSuc = correoSuc;
    }

    
}
