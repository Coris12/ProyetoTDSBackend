package com.ProyectoTDSBackend.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "Sucursal")
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idSucursal", nullable = false)
    private Long idSucursal;

    @Column(name = "nombreSuc", length = 200)
    private String nombreSuc;

    @Column(name = "direccionSuc")
    private String direccionSuc;

    @Column(name = "telefonoSuc", length = 10)
    private int telefonoSuc;

    @Column(name = "correoSuc", length = 200)
    private String correoSuc;

    //secundario de la tabla farmacia
    @JoinColumn(name = "id_farmacia")
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Farmacia farmacia;

    public Sucursal() {
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

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }
    
}
