/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.dto;

import java.util.Date;

/**
 *
 * @author corin
 */

public class EvolucionDTO {

    private int idEvolucion;
    private String evolucion;
    private Date fecha;
    private String hora;
    private String indicaciones;
    private String medicamento_ad;
    private String nombres;
    private String sexo;
    private String establecimiento;
    private String identificacion;

    public EvolucionDTO() {
    }

    public EvolucionDTO(String evolucion, Date fecha, String hora, String indicaciones, String medicamento_ad, String nombres, String sexo, String establecimiento) {
        this.evolucion = evolucion;
        this.fecha = fecha;
        this.hora = hora;
        this.indicaciones = indicaciones;
        this.medicamento_ad = medicamento_ad;
        this.nombres = nombres;
        this.sexo = sexo;
        this.establecimiento = establecimiento;
    }

   
    public int getIdEvolucion() {
        return idEvolucion;
    }

    public void setIdEvolucion(int idEvolucion) {
        this.idEvolucion = idEvolucion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getMedicamento_ad() {
        return medicamento_ad;
    }

    public void setMedicamento_ad(String medicamento_ad) {
        this.medicamento_ad = medicamento_ad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }
    
   
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    
}
