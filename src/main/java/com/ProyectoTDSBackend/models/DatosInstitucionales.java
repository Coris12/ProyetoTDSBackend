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
@Table(name = "datos_institucionales")
public class DatosInstitucionales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_datos", nullable = false)
    private int id_datos;

    @Column(name = "entidad")
    private String entidad;

    @Column(name = "hist_clin_num")
    private String hist_clin_num;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "districto")
    private String districto;
    
    @Column(name = "area")
    private String area;

    public DatosInstitucionales(int id_datos, String entidad, String hist_clin_num, String establecimiento, String tipo, String districto, String area) {
        this.id_datos = id_datos;
        this.entidad = entidad;
        this.hist_clin_num = hist_clin_num;
        this.establecimiento = establecimiento;
        this.tipo = tipo;
        this.districto = districto;
        this.area = area;
    }

    public DatosInstitucionales() {
    }

    
    
    public int getId_datos() {
        return id_datos;
    }

    public void setId_datos(int id_datos) {
        this.id_datos = id_datos;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getHist_clin_num() {
        return hist_clin_num;
    }

    public void setHist_clin_num(String hist_clin_num) {
        this.hist_clin_num = hist_clin_num;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDistricto() {
        return districto;
    }

    public void setDistricto(String districto) {
        this.districto = districto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    
    
}
