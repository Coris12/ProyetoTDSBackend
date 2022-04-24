package com.ProyectoTDSBackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuerpofactura")
public class CuerpoFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuerpo_factura", nullable = false, length = 50)
    private Long idCuerpoFactura;

    @Column(name = "idproducto")
    private Long idProducto;

    @Column(name = "cantidadPro")
    private int cantidad;

    @Column(name = "subTotal",  precision = 14, scale = 2)
    private Double subTotal;

    @Column(name = "descuento",  precision = 14, scale = 2)
    private Double descuento;

    @Column(name = "iva", length = 50)
    private Double iva;

    @Column(name = "total",  precision = 14, scale = 2)
    private Double total;

    public CuerpoFactura() {
    }

    public Long getIdCuerpoFactura() {
        return idCuerpoFactura;
    }

    public void setIdCuerpoFactura(Long idCuerpoFactura) {
        this.idCuerpoFactura = idCuerpoFactura;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
