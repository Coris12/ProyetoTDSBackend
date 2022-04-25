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
    private int id_proveedor;

    @Column(name = "nombre_comercial_pro", nullable = false)
    private String nombre_comercial_pro;
    

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Usuario usuario;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String nombre_comercial_pro, Usuario usuario) {
        this.id_proveedor = id_proveedor;
        this.nombre_comercial_pro = nombre_comercial_pro;
        this.usuario = usuario;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getNombre_comercial_pro() {
        return nombre_comercial_pro;
    }

    public void setNombre_comercial_pro(String nombre_comercial_pro) {
        this.nombre_comercial_pro = nombre_comercial_pro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    
    
    
}
