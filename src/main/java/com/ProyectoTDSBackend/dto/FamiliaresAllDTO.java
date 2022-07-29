package com.ProyectoTDSBackend.dto;

public class FamiliaresAllDTO {
    private Long idFamiliares; 
    private String nombres;
    private String usuarioId; 
    private String idenUsuarioFamiliar; 
    private String tipoFamiliar;
    
    public FamiliaresAllDTO() {
    }

    public FamiliaresAllDTO(Long idFamiliares, String nombres, String usuarioId, String idenUsuarioFamiliar,
            String tipoFamiliar) {
        this.idFamiliares = idFamiliares;
        this.nombres = nombres;
        this.usuarioId = usuarioId;
        this.idenUsuarioFamiliar = idenUsuarioFamiliar;
        this.tipoFamiliar = tipoFamiliar;
    }

    public String getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }
    public String getIdenUsuarioFamiliar() {
        return idenUsuarioFamiliar;
    }
    public void setIdenUsuarioFamiliar(String idenUsuarioFamiliar) {
        this.idenUsuarioFamiliar = idenUsuarioFamiliar;
    }
    public String getTipoFamiliar() {
        return tipoFamiliar;
    }
    public void setTipoFamiliar(String tipoFamiliar) {
        this.tipoFamiliar = tipoFamiliar;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Long getIdFamiliares() {
        return idFamiliares;
    }

    public void setIdFamiliares(Long idFamiliares) {
        this.idFamiliares = idFamiliares;
    } 

    
}
