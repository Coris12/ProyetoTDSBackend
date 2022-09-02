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
public class MedicamentoDTO {

    private int idMedicamentos;
    private String nombres;
    private Date fecha;
    private String hora;
    private String ini_responsable;
    private String abreviatura;
    private String nombre_medicamento;
    private String sexo;
    private String establecimiento;
    private String identificacion;

    public MedicamentoDTO() {
    }

    public MedicamentoDTO(String nombres, Date fecha, String hora, String ini_responsable, String abreviatura, String nombre_medicamento, String sexo, String establecimiento) {
        this.nombres = nombres;
        this.fecha = fecha;
        this.hora = hora;
        this.ini_responsable = ini_responsable;
        this.abreviatura = abreviatura;
        this.nombre_medicamento = nombre_medicamento;
        this.sexo = sexo;
        this.establecimiento = establecimiento;
    }

    

    

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    

    public String getIni_responsable() {
        return ini_responsable;
    }

    public void setIni_responsable(String ini_responsable) {
        this.ini_responsable = ini_responsable;
    }

    public String getNombre_medicamento() {
        return nombre_medicamento;
    }

    public void setNombre_medicamento(String nombre_medicamento) {
        this.nombre_medicamento = nombre_medicamento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }


    public int getIdMedicamentos() {
        return idMedicamentos;
    }

    public void setIdMedicamentos(int idMedicamentos) {
        this.idMedicamentos = idMedicamentos;
    }

}
