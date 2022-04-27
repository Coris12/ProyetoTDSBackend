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
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado", nullable = false)
    private int id_empleado;

    @Column(name = "cargo_emple", nullable = false)
    private String cargo_emple;

    @Column(name = "estado", nullable = false)
    private int estado;

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Usuario usuario;

    public Empleado() {
    }

    public Empleado(int id_empleado, String cargo_emple, int estado, Usuario usuario) {
        this.id_empleado = id_empleado;
        this.cargo_emple = cargo_emple;
        this.estado = estado;
        this.usuario = usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getCargo_emple() {
        return cargo_emple;
    }

    public void setCargo_emple(String cargo_emple) {
        this.cargo_emple = cargo_emple;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
