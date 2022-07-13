package com.ProyectoTDSBackend.dto;

public class ResidenciaDto {
    private long idRecidencia;
    private String provincia; 
    private String canton; 
    private String parroquia; 
    private String barrio; 
    private String zona; 
    private String pais;
    private String nacionalidad;
    private Long idUsuario;

    public ResidenciaDto() {
    }

    public ResidenciaDto(long idRecidencia, String provincia, String canton, String parroquia, String barrio,
            String zona, String pais, String nacionalidad, Long idUsuario) {
        this.idRecidencia = idRecidencia;
        this.provincia = provincia;
        this.canton = canton;
        this.parroquia = parroquia;
        this.barrio = barrio;
        this.zona = zona;
        this.pais = pais;
        this.nacionalidad = nacionalidad;
        this.idUsuario = idUsuario;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public long getIdRecidencia() {
        return idRecidencia;
    }
    public void setIdRecidencia(long idRecidencia) {
        this.idRecidencia = idRecidencia;
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
    public String getBarrio() {
        return barrio;
    }
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
}
