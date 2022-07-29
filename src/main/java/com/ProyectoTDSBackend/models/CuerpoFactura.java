/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;
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
    private double iva;

    @JoinColumn(name = "id_producto")
    @ManyToOne()
    private Producto producto;

    // @JoinColumn(name = "id_factura")
    // @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // private Factura factura;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_factura",foreignKey = @ForeignKey(name = "FK_CUERPOFACTURA_ID"))
    private Factura factura;

    // @ManyToOne() valleeeeee
    // @JoinColumn(name = "id_factura")
    // private Factura factura;

    public CuerpoFactura() {
    }

    public CuerpoFactura(Long idCuerpo, int cantidad, float total, float subtotal, double descuento, double iva, Producto producto) {
        this.idCuerpo = idCuerpo;
        this.cantidad = cantidad;
        this.total = total;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.producto = producto;
    }

    
    public CuerpoFactura(Long idCuerpo, int cantidad, float total, float subtotal, double descuento, Double iva,
            Producto producto, Factura factura) {
        this.idCuerpo = idCuerpo;
        this.cantidad = cantidad;
        this.total = total;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.iva = iva;
        this.producto = producto;
        this.factura = factura;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
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

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
