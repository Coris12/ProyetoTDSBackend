/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */

@Entity
@Table(name = "tratamiento")
public class Tratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tratamiento", nullable = false)
    private int id_tratamiento;

    @Column(name = "nombre", length = 200)
    private String nombre;

    @Column(name = "codigo")
    private String codigo;
    
    @Column(name = "categoria", length = 200)
    private String descuento;
    
    @Column(name = "descripcion", length = 200)
    private String descripcion;

    @Column(name = "cantidad", length = 10)
    private String cantidad;

    @Column(name = "valor unitario", length = 200)
    private Double correoSuc;
    
    @Column(name = "subtotal", length = 10)
    private Double subtotal;
    
    @Column(name = "total", length = 200)
    private Double total;
    
    @Column(name = "id_cliente", length = 200)
    private Double idCliente;
    
    @Column(name = "id_empleado", length = 200)
    private Double idEmpleado;

    public Tratamiento() {
    }

    public Tratamiento(int id_tratamiento, String nombre, String codigo, String descuento, String descripcion, String cantidad, Double correoSuc, Double subtotal, Double total, Double idCliente, Double idEmpleado) {
        this.id_tratamiento = id_tratamiento;
        this.nombre = nombre;
        this.codigo = codigo;
        this.descuento = descuento;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.correoSuc = correoSuc;
        this.subtotal = subtotal;
        this.total = total;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
    }

    public Integer getId_tratamiento() {
        return id_tratamiento;
    }

    public void setId_tratamiento(int id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
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

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCorreoSuc() {
        return correoSuc;
    }

    public void setCorreoSuc(Double correoSuc) {
        this.correoSuc = correoSuc;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Double idCliente) {
        this.idCliente = idCliente;
    }

    public Double getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Double idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
    
    
    
    
    
}
