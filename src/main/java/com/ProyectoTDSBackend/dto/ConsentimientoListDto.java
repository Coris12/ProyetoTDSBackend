package com.ProyectoTDSBackend.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class ConsentimientoListDto {
    private Integer idConsentimiento;
    private Date fecha;
    private Integer numHistCli; 
    private Integer usuarioId; 
    private String identificacion;
    private String nombres;
    
    public ConsentimientoListDto() {
    }

    public ConsentimientoListDto(Integer idConsentimiento, Date fecha, Integer numHistCli, Integer usuarioId,
			String identificacion, String nombres) {
		super();
		this.idConsentimiento = idConsentimiento;
		this.fecha = fecha;
		this.numHistCli = numHistCli;
		this.usuarioId = usuarioId;
		this.identificacion = identificacion;
		this.nombres = nombres;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFecha() {
		return fecha;
	}

	public Integer getIdConsentimiento() {
        return idConsentimiento;
    }
    public void setIdConsentimiento(Integer idConsentimiento) {
        this.idConsentimiento = idConsentimiento;
    }
    public Integer getNumHistCli() {
        return numHistCli;
    }
    public void setNumHistCli(Integer numHistCli) {
        this.numHistCli = numHistCli;
    }
    public Integer getUsuarioId() {
        return usuarioId;
    }
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
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
}
