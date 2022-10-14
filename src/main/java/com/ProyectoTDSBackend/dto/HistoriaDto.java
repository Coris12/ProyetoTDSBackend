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
public class HistoriaDto {

    private int idHistoria;
    private String nombres;
    private String alergia;
    private String apf;
    private String app;
    private Date fecha;
    private int edad;
    private String enfermedad;
    private String estado_civil;
    private String fc;
    private String fr;
    private String habitos;
    private String motivo;
    private int num_cli;
    private String procedencia;
    private String religion;
    private String residencia;
    private String spo2;
    private String ta;
    private int t;
    private String tipo_sangre;
    private String examen;
    private String dr;
    private String realizado;
    private String dx;

    public HistoriaDto() {
    }

    public HistoriaDto(String nombres, String alergia, String apf, String app, Date fecha, int edad, String enfermedad, String estado_civil, String fc, String fr, String habitos, String motivo, int num_cli, String procedencia, String religion, String residencia, String spo2, String ta, int t, String tipo_sangre, String examen, String dr, String realizado, String dx) {
        this.nombres = nombres;
        this.alergia = alergia;
        this.apf = apf;
        this.app = app;
        this.fecha = fecha;
        this.edad = edad;
        this.enfermedad = enfermedad;
        this.estado_civil = estado_civil;
        this.fc = fc;
        this.fr = fr;
        this.habitos = habitos;
        this.motivo = motivo;
        this.num_cli = num_cli;
        this.procedencia = procedencia;
        this.religion = religion;
        this.residencia = residencia;
        this.spo2 = spo2;
        this.ta = ta;
        this.t = t;
        this.tipo_sangre = tipo_sangre;
        this.examen = examen;
        this.dr = dr;
        this.realizado = realizado;
        this.dx = dx;
    }

    
    
    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getApf() {
        return apf;
    }

    public void setApf(String apf) {
        this.apf = apf;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getNum_cli() {
        return num_cli;
    }

    public void setNum_cli(int num_cli) {
        this.num_cli = num_cli;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getSpo2() {
        return spo2;
    }

    public void setSpo2(String spo2) {
        this.spo2 = spo2;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

   

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getRealizado() {
        return realizado;
    }

    public void setRealizado(String realizado) {
        this.realizado = realizado;
    }

    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }
    
    
}
