/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
//s

/**
 *
 * @author LENOVO,corina
 */
@Entity
@Table(name = "productos")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto", nullable = false)
    private int idProducto;
    @Column(name = "categoria_producto", nullable = false)
    private String categoriaProducto;
    @Column(name = "codigo_ref_producto", nullable = false)
    private String codigoRef;
    @Column(name = "nombre_producto", nullable = false)
    private String nombreProducto;
    @Column(name = "inventario_producto", nullable = false)
    private String inventarioProducto;
    @Column(name = "fecha_exp_producto", nullable = false)
    private String fechaExp;
    @Column(name = "reg_sanitario_producto", nullable = false)
    private String regSanitario;
    @Column(name = "cod_barra_producto", nullable = false)
    private String codBarra;
    @Column(name = "descripcion_producto", nullable = false)
    private String descripcionProducto;
    @Column(name = "precio_producto", nullable = false)
    private float precioProducto;
    @Column(name = "stock_producto", nullable = false)
    private int stockProducto;
    @Column(name = "estado_producto", nullable = false)
    private int estadoProducto;

    @JoinColumn(name = "id_proveedors")
    @ManyToOne()
    private Proveedor proveedor;
    
    public Producto() {
    }

    public Producto(int idProducto, String categoriaProducto, String codigoRef, String nombreProducto, String inventarioProducto, String fechaExp, String regSanitario, String codBarra, String descripcionProducto, float precioProducto, int stockProducto, int estadoProducto, Proveedor proveedor) {
        this.idProducto = idProducto;
        this.categoriaProducto = categoriaProducto;
        this.codigoRef = codigoRef;
        this.nombreProducto = nombreProducto;
        this.inventarioProducto = inventarioProducto;
        this.fechaExp = fechaExp;
        this.regSanitario = regSanitario;
        this.codBarra = codBarra;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;
        this.estadoProducto = estadoProducto;
        this.proveedor = proveedor;
    }

    

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCategoriaProducto() {
        return categoriaProducto;
    }

    public void setCategoriaProducto(String categoriaProducto) {
        this.categoriaProducto = categoriaProducto;
    }

    public String getCodigoRef() {
        return codigoRef;
    }

    public void setCodigoRef(String codigoRef) {
        this.codigoRef = codigoRef;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getInventarioProducto() {
        return inventarioProducto;
    }

    public void setInventarioProducto(String inventarioProducto) {
        this.inventarioProducto = inventarioProducto;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getRegSanitario() {
        return regSanitario;
    }

    public void setRegSanitario(String regSanitario) {
        this.regSanitario = regSanitario;
    }

    public String getCodBarra() {
        return codBarra;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    public int getEstadoProducto() {
        return estadoProducto;
    }

    public void setEstadoProducto(int estadoProducto) {
        this.estadoProducto = estadoProducto;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

   


}
