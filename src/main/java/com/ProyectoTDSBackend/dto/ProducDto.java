/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.dto;

import java.util.logging.Logger;

/**
 *
 * @author corin
 */
public class ProducDto {

    private Long idProducto;
    private String categoriaProducto;
    private String codigoRef;
    private String nombreProducto;
    private String inventarioProducto;
    private String fechaExp;
    private String regSanitario;
    private String codBarra;
    private String descripcionProducto;
    private float precioProducto;
    private String stock;
    private float ultimoCosto;
    private float costoPromedio;
    private String nombresuc;
    private Long idSucursal;
    public ProducDto() {
    }

    public ProducDto(Long idProducto, String categoriaProducto, String codigoRef, String nombreProducto, String inventarioProducto, String fechaExp, String regSanitario, String codBarra, String descripcionProducto, float precioProducto, String stock, float ultimoCosto, float costoPromedio, String nombresuc, Long idSucursal) {
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
        this.stock = stock;
        this.ultimoCosto = ultimoCosto;
        this.costoPromedio = costoPromedio;
        this.nombresuc = nombresuc;
        this.idSucursal = idSucursal;
    }

   
    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
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

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public float getUltimoCosto() {
        return ultimoCosto;
    }

    public void setUltimoCosto(float ultimoCosto) {
        this.ultimoCosto = ultimoCosto;
    }

    public float getCostoPromedio() {
        return costoPromedio;
    }

    public void setCostoPromedio(float costoPromedio) {
        this.costoPromedio = costoPromedio;
    }

    public String getNombresuc() {
        return nombresuc;
    }

    public void setNombresuc(String nombresuc) {
        this.nombresuc = nombresuc;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

}
