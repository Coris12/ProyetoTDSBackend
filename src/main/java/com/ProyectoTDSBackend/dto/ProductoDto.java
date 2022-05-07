/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.dto;

import javax.validation.constraints.Min;

/**
 *
 * @author LENOVO
 */
public class ProductoDto {

    private String nombreProducto;
    @Min(0)
    private Float precioProducto;

    private String categoriaProducto;

    private String codigoRef;
    private String inventarioProducto;
    private String fechaExp;
    private String regSanitario;
    private String codBarra;
    private String descripcionProducto;
    private int stockProducto;

    public ProductoDto() {
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Float getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Float precioProducto) {
        this.precioProducto = precioProducto;
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

    public int getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(int stockProducto) {
        this.stockProducto = stockProducto;
    }

    

}
