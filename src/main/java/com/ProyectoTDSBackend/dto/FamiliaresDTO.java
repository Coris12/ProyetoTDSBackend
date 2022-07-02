package com.ProyectoTDSBackend.dto;

import com.ProyectoTDSBackend.security.models.Usuario;

public class FamiliaresDTO {
    private Long idFamiliares; 
    private String tipoFamiliar; 
    private String idenUsuarioFamiliar; 
    private Usuario usuario;
    
    public FamiliaresDTO() {
    }

    public FamiliaresDTO(Long idFamiliares, String tipoFamiliar, String idenUsuarioFamiliar, Usuario usuario) {
        this.idFamiliares = idFamiliares;
        this.tipoFamiliar = tipoFamiliar;
        this.idenUsuarioFamiliar = idenUsuarioFamiliar;
        this.usuario = usuario;
    }

    public Long getIdFamiliares() {
        return idFamiliares;
    }
    public void setIdFamiliares(Long idFamiliares) {
        this.idFamiliares = idFamiliares;
    }
    public String getTipoFamiliar() {
        return tipoFamiliar;
    }
    public void setTipoFamiliar(String tipoFamiliar) {
        this.tipoFamiliar = tipoFamiliar;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getIdenUsuarioFamiliar() {
        return idenUsuarioFamiliar;
    }
    public void setIdenUsuarioFamiliar(String idenUsuarioFamiliar) {
        this.idenUsuarioFamiliar = idenUsuarioFamiliar;
    }
    
}
