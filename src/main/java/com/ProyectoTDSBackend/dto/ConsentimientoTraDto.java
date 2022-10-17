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
    private String institucionsistema;
    private String unidadoperativa;
    private String codud;
    private String canton;
    private String parroquia;
    private String provincia;
    private Integer numerohistoriaclinica;
    private String nombres;
    private String sala;
    private String servicio;
    private String cama;
    private Date fecha;
    private String proposito;
    private String procedimiento_propuesto;
    private String resultado_esperado;
    private String riesgo_complicaciones;
    private String nombre_profesional_trat;
    private String especialidad;
    private String telefono;
    private Integer codigo;

    public ConsentimientoTraDto() {
    }

    public ConsentimientoTraDto( String institucionsistema, String unidadoperativa, String codud, String canton, String parroquia, String provincia, Integer numerohistoriaclinica, String nombres, String sala, String servicio, String cama, Date fecha, String proposito, String procedimiento_propuesto, String resultado_esperado, String riesgo_complicaciones, String nombre_profesional_trat, String especialidad, String telefono, Integer codigo) {
        this.institucionsistema = institucionsistema;
        this.unidadoperativa = unidadoperativa;
        this.codud = codud;
        this.canton = canton;
        this.parroquia = parroquia;
        this.provincia = provincia;
        this.numerohistoriaclinica = numerohistoriaclinica;
        this.nombres = nombres;
        this.sala = sala;
        this.servicio = servicio;
        this.cama = cama;
        this.fecha = fecha;
        this.proposito = proposito;
        this.procedimiento_propuesto = procedimiento_propuesto;
        this.resultado_esperado = resultado_esperado;
        this.riesgo_complicaciones = riesgo_complicaciones;
        this.nombre_profesional_trat = nombre_profesional_trat;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.codigo = codigo;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

   

    public String getProcedimiento_propuesto() {
        return procedimiento_propuesto;
    }

    public void setProcedimiento_propuesto(String procedimiento_propuesto) {
        this.procedimiento_propuesto = procedimiento_propuesto;
    }

    public String getResultado_esperado() {
        return resultado_esperado;
    }

    public void setResultado_esperado(String resultado_esperado) {
        this.resultado_esperado = resultado_esperado;
    }

    public String getRiesgo_complicaciones() {
        return riesgo_complicaciones;
    }

    public void setRiesgo_complicaciones(String riesgo_complicaciones) {
        this.riesgo_complicaciones = riesgo_complicaciones;
    }

    public String getNombre_profesional_trat() {
        return nombre_profesional_trat;
    }

    public void setNombre_profesional_trat(String nombre_profesional_trat) {
        this.nombre_profesional_trat = nombre_profesional_trat;
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

    public String getCodud() {
        return codud;
    }

    public void setCodud(String codud) {
        this.codud = codud;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getInstitucionsistema() {
        return institucionsistema;
    }

    public void setInstitucionsistema(String institucionsistema) {
        this.institucionsistema = institucionsistema;
    }

    public Integer getNumerohistoriaclinica() {
        return numerohistoriaclinica;
    }

    public void setNumerohistoriaclinica(Integer numerohistoriaclinica) {
        this.numerohistoriaclinica = numerohistoriaclinica;
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

    public String getUnidadoperativa() {
        return unidadoperativa;
    }

    public void setUnidadoperativa(String unidadoperativa) {
        this.unidadoperativa = unidadoperativa;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getProposito() {
        return proposito;
    }

    public String getTelefono() {
        return telefono;
    }

}
