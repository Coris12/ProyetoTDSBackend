/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.security.models.Usuario;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
    private int idEmpleado;

    @Column(name = "cargo_emple", nullable = false)
    private String cargoEmple;

    @Column(name = "estado", nullable = false)
    private int estado;

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Usuario usuario;

    @JoinColumn(name = "id_farmacia")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Farmacia farmacia;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String cargoEmple, int estado, Usuario usuario, Farmacia farmacia) {
        this.idEmpleado = idEmpleado;
        this.cargoEmple = cargoEmple;
        this.estado = estado;
        this.usuario = usuario;
        this.farmacia = farmacia;
    }

   

   

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargoEmple() {
        return cargoEmple;
    }

    public void setCargoEmple(String cargoEmple) {
        this.cargoEmple = cargoEmple;
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
