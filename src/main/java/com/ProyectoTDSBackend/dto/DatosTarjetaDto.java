package com.ProyectoTDSBackend.dto;

public class DatosTarjetaDto {
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

    public DatosTarjetaDto() {
    }

    public DatosTarjetaDto(Long id, Long idRecidencia, String nombres, String direccion, String celular,
            String nacionalidad, String pais, String provincia, String canton, String parroquia) {
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
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public Long getIdRecidencia() {
        return idRecidencia;
    }
    public void setIdRecidencia(Long idRecidencia) {
        this.idRecidencia = idRecidencia;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    
}
