/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "tratamientos")
public class Tratamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tratamiento", nullable = false)
    private int idTratamiento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "categoria")
    private String categoria;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "estado")
    private int estado;
    
    @Column(name = "valor_unitario")
    private float valorUnitario;

    @Column(name = "subtotal")
    private float subtotal;

    @Column(name = "total")
    private Double total;

  

    public Tratamiento() {
    }

    public Tratamiento(int idTratamiento, String nombre, String codigo, String categoria, String descripcion, int cantidad, int estado, float valorUnitario, float subtotal, Double total) {
        this.idTratamiento = idTratamiento;
        this.nombre = nombre;
        this.codigo = codigo;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.estado = estado;
        this.valorUnitario = valorUnitario;
        this.subtotal = subtotal;
        this.total = total;
    }

    

    

    

    public int getIdTratamiento() {
        return idTratamiento;
    }

    public void setIdTratamiento(int idTratamiento) {
        this.idTratamiento = idTratamiento;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

   

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }


    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
