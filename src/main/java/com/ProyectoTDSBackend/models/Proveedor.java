/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.security.models.Usuario;
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
 * @author LENOVO
 */

@Entity
@Table(name = "proveedor")

public class Proveedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor", nullable = false)
    private int idProveedor;

    @Column(name = "nombre_comercial_pro", nullable = false)
    private String nombreComercialPro;
    

   @Column(name = "estado", nullable = false)
    private int estado;

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Usuario usuario;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombreComercialPro, int estado, Usuario usuario) {
        this.idProveedor = idProveedor;
        this.nombreComercialPro = nombreComercialPro;
        this.estado = estado;
        this.usuario = usuario;
    }

    

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreComercialPro() {
        return nombreComercialPro;
    }

    public void setNombreComercialPro(String nombreComercialPro) {
        this.nombreComercialPro = nombreComercialPro;
    }
   
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
    
}
