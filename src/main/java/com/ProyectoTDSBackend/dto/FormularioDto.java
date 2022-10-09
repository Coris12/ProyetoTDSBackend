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
public class FormularioDto {
    private String nombres;
    private String direccion;
    private String celular;
    private String cuadro_clinico;
    private String diagnostico;
    private String hallazgos;
    private String districto;
    private String area;
    private String entidad;
    private String establecimiento;
    private String hist_clin_num;
    private String tipo;
    private String entidad_sistema;
    private String especiali_referido;
    private String establecimiento_referido;
    private Date fecha;
    private String servicio_referido;
    private String anio;
    private String dia;
    private String mes;
    private String especialidad;
    private String servicio;
    private String provincia;
    private String nacionalidad;
    private String pais;
    private String parroquia;
    private String canton;
    private String otro;
    private String referencia;
    private int idformulario;
    

    public FormularioDto() {
    }

    public FormularioDto(String nombres, String direccion, String celular, String cuadro_clinico, String diagnostico, String hallazgos, String districto, String area, String entidad, String establecimiento, String hist_clin_num, String tipo, String entidad_sistema, String especiali_referido, String establecimiento_referido, Date fecha, String servicio_referido, String anio, String dia, String mes, String especialidad, String servicio, String provincia, String nacionalidad, String pais, String parroquia, String canton, String otro, String referencia, int idformulario) {
        this.nombres = nombres;
        this.direccion = direccion;
        this.celular = celular;
        this.cuadro_clinico = cuadro_clinico;
        this.diagnostico = diagnostico;
        this.hallazgos = hallazgos;
        this.districto = districto;
        this.area = area;
        this.entidad = entidad;
        this.establecimiento = establecimiento;
        this.hist_clin_num = hist_clin_num;
        this.tipo = tipo;
        this.entidad_sistema = entidad_sistema;
        this.especiali_referido = especiali_referido;
        this.establecimiento_referido = establecimiento_referido;
        this.fecha = fecha;
        this.servicio_referido = servicio_referido;
        this.anio = anio;
        this.dia = dia;
        this.mes = mes;
        this.especialidad = especialidad;
        this.servicio = servicio;
        this.provincia = provincia;
        this.nacionalidad = nacionalidad;
        this.pais = pais;
        this.parroquia = parroquia;
        this.canton = canton;
        this.otro = otro;
        this.referencia = referencia;
        this.idformulario = idformulario;
    }


    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCuadro_clinico() {
        return cuadro_clinico;
    }

    public void setCuadro_clinico(String cuadro_clinico) {
        this.cuadro_clinico = cuadro_clinico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getHallazgos() {
        return hallazgos;
    }

    public void setHallazgos(String hallazgos) {
        this.hallazgos = hallazgos;
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

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getHist_clin_num() {
        return hist_clin_num;
    }

    public void setHist_clin_num(String hist_clin_num) {
        this.hist_clin_num = hist_clin_num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEntidad_sistema() {
        return entidad_sistema;
    }

    public void setEntidad_sistema(String entidad_sistema) {
        this.entidad_sistema = entidad_sistema;
    }

    public String getEspeciali_referido() {
        return especiali_referido;
    }

    public void setEspeciali_referido(String especiali_referido) {
        this.especiali_referido = especiali_referido;
    }

    public String getEstablecimiento_referido() {
        return establecimiento_referido;
    }

    public void setEstablecimiento_referido(String establecimiento_referido) {
        this.establecimiento_referido = establecimiento_referido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getServicio_referido() {
        return servicio_referido;
    }

    public void setServicio_referido(String servicio_referido) {
        this.servicio_referido = servicio_referido;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getIdformulario() {
        return idformulario;
    }

    public void setIdformulario(int idformulario) {
        this.idformulario = idformulario;
    }
    
    
}
