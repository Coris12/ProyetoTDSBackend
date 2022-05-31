package com.ProyectoTDSBackend.dto;

import java.util.Date;

public class FacturaDatosDTO {

    private Date fecha;
    private String identificacion;
    private String nombres;
    private String celular;
    private String email;
    private int id_factura;
    private int id_cliente;
    private double precio_producto;
    private String nombre_producto;
    private String direccion;
    private int cantidad;
    private double descuento;
    private double iva;
    private double subtotal;
    private double total;

    public FacturaDatosDTO(Date fecha, String identificacion, String nombres, String celular, String email,
            int id_factura, int id_cliente, double precio_producto, String nombre_producto, String direccion,
            int cantidad, double descuento, double iva, double subtotal, double total) {
        super();
        this.fecha = fecha;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.celular = celular;
        this.email = email;
        this.id_factura = id_factura;
        this.id_cliente = id_cliente;
        this.precio_producto = precio_producto;
        this.nombre_producto = nombre_producto;
        this.direccion = direccion;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.iva = iva;
        this.subtotal = subtotal;
        this.total = total;
    }

    public FacturaDatosDTO() {
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
