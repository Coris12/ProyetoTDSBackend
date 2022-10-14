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
public class ConsentimientoTraDto {

    private Integer id_consentimiento;
    private String institucionSistema;
    private String unidadOperativa;
    private String codUd;
    private String canton;
    private String parroquia;
    private String provincia;
    private Integer numeroHistoriaClinica;
    private String nombres;
    private String sala;
    private String servicio;
    private String cama;
    private Date fecha;
    private String proposito;
    private String procedimientoPropuesto;
    private String resultadoEsperado;
    private String riesgoComplicaciones;
    private String nombreProfesional;
    private String especialidad;
    private String telefono;
    private Integer codigo;

    public ConsentimientoTraDto() {
    }

    public ConsentimientoTraDto(String institucionSistema, String unidadOperativa, String codUd, String canton, String parroquia, String provincia, Integer numeroHistoriaClinica, String nombres, String sala, String servicio, String cama, Date fecha, String proposito, String procedimientoPropuesto, String resultadoEsperado, String riesgoComplicaciones, String nombreProfesional, String especialidad, String telefono, Integer codigo) {
        this.institucionSistema = institucionSistema;
        this.unidadOperativa = unidadOperativa;
        this.codUd = codUd;
        this.canton = canton;
        this.parroquia = parroquia;
        this.provincia = provincia;
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.nombres = nombres;
        this.sala = sala;
        this.servicio = servicio;
        this.cama = cama;
        this.fecha = fecha;
        this.proposito = proposito;
        this.procedimientoPropuesto = procedimientoPropuesto;
        this.resultadoEsperado = resultadoEsperado;
        this.riesgoComplicaciones = riesgoComplicaciones;
        this.nombreProfesional = nombreProfesional;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.codigo = codigo;
    }

    

    public Integer getId_consentimiento() {
        return id_consentimiento;
    }

    public void setId_consentimiento(Integer id_consentimiento) {
        this.id_consentimiento = id_consentimiento;
    }

   

  
    public String getCama() {
        return cama;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCanton() {
        return canton;
    }

    public String getCodUd() {
        return codUd;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getInstitucionSistema() {
        return institucionSistema;
    }

    public Integer getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public String getParroquia() {
        return parroquia;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getSala() {
        return sala;
    }

    public String getServicio() {
        return servicio;
    }

    public String getUnidadOperativa() {
        return unidadOperativa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public String getProcedimientoPropuesto() {
        return procedimientoPropuesto;
    }

    public String getProposito() {
        return proposito;
    }

    public String getResultadoEsperado() {
        return resultadoEsperado;
    }

    public String getRiesgoComplicaciones() {
        return riesgoComplicaciones;
    }

    public String getTelefono() {
        return telefono;
    }

}
