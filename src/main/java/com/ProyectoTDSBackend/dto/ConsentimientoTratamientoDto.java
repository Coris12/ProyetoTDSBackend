package com.ProyectoTDSBackend.dto;

import java.util.Date;

public class ConsentimientoTratamientoDto {

    private Integer idConsentimiento;
    private String cama;
    private String canton;
    private String codUd;
    private Date fecha;
    private String institucionSistema;
    private Integer numeroHistoriaClinica;
    private String parroquia;
    private String provincia;
    private String sala;
    private String servicio;
    private String unidadOperativa;
    private char estado;
    private Integer idConsentimientoFK;
    private Integer codigo;
    private String especialidad;
    private String nombreProfesional;
    private String procedimientoPropuesto;
    private String proposito;
    private String resultadoEsperado;
    private String riesgoComplicaciones;
    private Integer telefono;
    private Integer IdInfTrat;

    public ConsentimientoTratamientoDto() {
    }

    public ConsentimientoTratamientoDto(Integer idConsentimiento, String cama, String canton, String codUd, Date fecha,
            String institucionSistema, Integer numeroHistoriaClinica, String parroquia, String provincia, String sala,
            String servicio, String unidadOperativa, char estado, Integer idConsentimientoFK, Integer codigo,
            String especialidad, String nombreProfesional, String procedimientoPropuesto, String proposito,
            String resultadoEsperado, String riesgoComplicaciones, Integer telefono, Integer idInfTrat) {
        super();
        this.idConsentimiento = idConsentimiento;
        this.cama = cama;
        this.canton = canton;
        this.codUd = codUd;
        this.fecha = fecha;
        this.institucionSistema = institucionSistema;
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.parroquia = parroquia;
        this.provincia = provincia;
        this.sala = sala;
        this.servicio = servicio;
        this.unidadOperativa = unidadOperativa;
        this.estado = estado;
        this.idConsentimientoFK = idConsentimientoFK;
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.nombreProfesional = nombreProfesional;
        this.procedimientoPropuesto = procedimientoPropuesto;
        this.proposito = proposito;
        this.resultadoEsperado = resultadoEsperado;
        this.riesgoComplicaciones = riesgoComplicaciones;
        this.telefono = telefono;
        IdInfTrat = idInfTrat;
    }
    
   
    public Integer getIdConsentimiento() {
        return idConsentimiento;
    }

    public void setIdConsentimiento(Integer idConsentimiento) {
        this.idConsentimiento = idConsentimiento;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCodUd() {
        return codUd;
    }

    public void setCodUd(String codUd) {
        this.codUd = codUd;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getInstitucionSistema() {
        return institucionSistema;
    }

    public void setInstitucionSistema(String institucionSistema) {
        this.institucionSistema = institucionSistema;
    }

    public Integer getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(Integer numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getUnidadOperativa() {
        return unidadOperativa;
    }

    public void setUnidadOperativa(String unidadOperativa) {
        this.unidadOperativa = unidadOperativa;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombreProfesional() {
        return nombreProfesional;
    }

    public void setNombreProfesional(String nombreProfesional) {
        this.nombreProfesional = nombreProfesional;
    }

    public String getProcedimientoPropuesto() {
        return procedimientoPropuesto;
    }

    public void setProcedimientoPropuesto(String procedimientoPropuesto) {
        this.procedimientoPropuesto = procedimientoPropuesto;
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public String getResultadoEsperado() {
        return resultadoEsperado;
    }

    public void setResultadoEsperado(String resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
    }

    public String getRiesgoComplicaciones() {
        return riesgoComplicaciones;
    }

    public void setRiesgoComplicaciones(String riesgoComplicaciones) {
        this.riesgoComplicaciones = riesgoComplicaciones;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getIdInfTrat() {
        return IdInfTrat;
    }

    public void setIdInfTrat(Integer idInfTrat) {
        IdInfTrat = idInfTrat;
    }

    public Integer getIdConsentimientoFK() {
        return idConsentimientoFK;
    }

    public void setIdConsentimientoFK(Integer idConsentimientoFK) {
        this.idConsentimientoFK = idConsentimientoFK;
    }

}
