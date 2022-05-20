package com.ProyectoTDSBackend.dto;

import com.ProyectoTDSBackend.models.CuerpoFactura;

public class ProductosDto {
    private String descripcionProducto;
    private String nombreProducto;
    private double precioProducto;
    private int cantidad;
    private CuerpoFactura cuerpoFactura;
    private double descuento;
    private int stock;
    private double total;

    public ProductosDto() {
    }

    public ProductosDto(String descripcionProducto, String nombreProducto, double precioProducto, int cantidad,
            CuerpoFactura cuerpoFactura, double descuento, int stock, double total) {
        this.descripcionProducto = descripcionProducto;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidad = cantidad;
        this.cuerpoFactura = cuerpoFactura;
        this.descuento = descuento;
        this.stock = stock;
        this.total = total;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CuerpoFactura getCuerpoFactura() {
        return cuerpoFactura;
    }

    public void setCuerpoFactura(CuerpoFactura cuerpoFactura) {
        this.cuerpoFactura = cuerpoFactura;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
