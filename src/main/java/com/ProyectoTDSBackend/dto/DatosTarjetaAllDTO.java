package com.ProyectoTDSBackend.dto;

import java.util.Date;

public class DatosTarjetaAllDTO {
    private Long id; 
    private Long idRecidencia; 
    private String nombres;
    private String direccion;
    private String celular;
    private String nacionalidad;
    private String pais;
    private String provincia;
    private String canton;
    private String parroquia;
    private int idTarjeta; 
    private String afiliacion;
    private int idTarjetaEspecialidad; 
    private String tipoEspecialidad;
    private int estado;
    private Date fechaFin;
    private Date fechaInicio;
    private int consultas;

    public DatosTarjetaAllDTO() {
    }
    
    public DatosTarjetaAllDTO(Long id, Long idRecidencia, String nombres, String direccion, String celular,
            String nacionalidad, String pais, String provincia, String canton, String parroquia, int idTarjeta,
            String afiliacion, int idTarjetaEspecialidad, String tipoEspecialidad, int estado, Date fechaFin,
            Date fechaInicio, int consultas) {
        this.id = id;
        this.idRecidencia = idRecidencia;
        this.nombres = nombres;
        this.direccion = direccion;
        this.celular = celular;
        this.nacionalidad = nacionalidad;
        this.pais = pais;
        this.provincia = provincia;
        this.canton = canton;
        this.parroquia = parroquia;
        this.idTarjeta = idTarjeta;
        this.afiliacion = afiliacion;
        this.idTarjetaEspecialidad = idTarjetaEspecialidad;
        this.tipoEspecialidad = tipoEspecialidad;
        this.estado = estado;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.consultas = consultas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdRecidencia() {
        return idRecidencia;
    }

    public void setIdRecidencia(Long idRecidencia) {
        this.idRecidencia = idRecidencia;
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

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public int getIdTarjetaEspecialidad() {
        return idTarjetaEspecialidad;
    }

    public void setIdTarjetaEspecialidad(int idTarjetaEspecialidad) {
        this.idTarjetaEspecialidad = idTarjetaEspecialidad;
    }

    public String getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(String tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getConsultas() {
        return consultas;
    }

    public void setConsultas(int consultas) {
        this.consultas = consultas;
    } 

    
}
