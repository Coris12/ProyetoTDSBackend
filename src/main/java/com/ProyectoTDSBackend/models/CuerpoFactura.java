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

/**
 *
 * @author corin
 */
@Entity
@Table(name = "cuerpo_factura")
public class CuerpoFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuerpo", nullable = false)
    private Long idCuerpo;
    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    @Column(name = "total", nullable = false)
    private float total;
    @Column(name = "subtotal", nullable = false)
    private float subtotal;
    @Column(name = "descuento", nullable = false)
    private double descuento;
    @Column(name = "iva", nullable = false)
    private int iva;
    @Column(name = "id_producto", nullable = true)
    private int id_producto;

    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto", insertable = false, updatable = false)
    @ManyToOne()
    private Producto producto;

    @JoinColumn(name = "id_factura")
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Factura factura;


    public CuerpoFactura() {
    }

    public CuerpoFactura(Long idCuerpo, int cantidad, float total, float subtotal, double descuento, int iva, int id_producto, Producto producto) {
        this.idCuerpo = idCuerpo;
        this.cantidad = cantidad;
        this.total = total;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.id_producto = id_producto;
        this.producto = producto;
    }

    public Long getIdCuerpo() {
        return idCuerpo;
    }

    public void setIdCuerpo(Long idCuerpo) {
        this.idCuerpo = idCuerpo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
