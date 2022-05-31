package com.ProyectoTDSBackend.dto;

import java.util.Date;

public class FactConsFinalDTO {
    private Long idFactura; 
    private Date fecha;
    private int cantidad;
    private String nombreProducto; 
    private double precioProducto;
    private double descuento;
    private double iva;
    private double subtotal;
    private double total;

    

    public FactConsFinalDTO(Long idFactura, Date fecha, int cantidad, String nombreProducto, double precioProducto,
            double descuento, double iva, double subtotal, double total) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.descuento = descuento;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
    }

    public FactConsFinalDTO() {
    }

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
