package com.ProyectoTDSBackend.dto;

public class ListaFamiliaresDTO{
    private Long idFamiliares;
    private String identificacion; 
    private String nombres; 
    private int idenUsuarioFamiliar; 
    private String tipoFamiliar;
    private int usuarioId;
    private String estado; 
    
    public ListaFamiliaresDTO() {
    }

    public ListaFamiliaresDTO(Long idFamiliares, String identificacion, String nombres, int idenUsuarioFamiliar,
            String tipoFamiliar, int usuarioId, String estado) {
        this.idFamiliares = idFamiliares;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.idenUsuarioFamiliar = idenUsuarioFamiliar;
        this.tipoFamiliar = tipoFamiliar;
        this.usuarioId = usuarioId;
        this.estado = estado;
    }

    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    public String getTipoFamiliar() {
        return tipoFamiliar;
    }
    public void setTipoFamiliar(String tipoFamiliar) {
        this.tipoFamiliar = tipoFamiliar;
    }
    public int getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public int getIdenUsuarioFamiliar() {
        return idenUsuarioFamiliar;
    }

    public void setIdenUsuarioFamiliar(int idenUsuarioFamiliar) {
        this.idenUsuarioFamiliar = idenUsuarioFamiliar;
    }


    public Long getIdFamiliares() {
        return idFamiliares;
    }

    public void setIdFamiliares(Long idFamiliares) {
        this.idFamiliares = idFamiliares;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 
    
}
