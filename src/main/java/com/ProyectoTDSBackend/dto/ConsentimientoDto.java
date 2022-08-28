package com.ProyectoTDSBackend.dto;

import java.util.Date;

public class ConsentimientoDto {
    
    private Integer idConsentimiento;
    private String cama; 
    private String canton; 
    private String codUd; 
    private Character estado;
    private Date fecha; 
    private String instutucionSistema;
    private Integer numeroHistoriaClinica; 
    private String parroquia; 
    private String provincia;
    private String sala; 
    private String servicio; 
    private String unidadOperativa; 
    private Integer idUsuario;
    private String nombre; 
    private String identificacion; 
 
    public ConsentimientoDto() {
    }
    
	public ConsentimientoDto(Integer idConsentimiento, String cama, String canton, String codUd, Character estado,
			Date fecha, String instutucionSistema, Integer numeroHistoriaClinica, String parroquia, String provincia,
			String sala, String servicio, String unidadOperativa, Integer idUsuario, String nombre,
			String identificacion) {
		super();
		this.idConsentimiento = idConsentimiento;
		this.cama = cama;
		this.canton = canton;
		this.codUd = codUd;
		this.estado = estado;
		this.fecha = fecha;
		this.instutucionSistema = instutucionSistema;
		this.numeroHistoriaClinica = numeroHistoriaClinica;
		this.parroquia = parroquia;
		this.provincia = provincia;
		this.sala = sala;
		this.servicio = servicio;
		this.unidadOperativa = unidadOperativa;
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public Integer getIdConsentimiento() {
        return idConsentimiento;
    }
    public void setIdConsentimiento(Integer idConsentimiento) {
        this.idConsentimiento = idConsentimiento;
    }
    public String getInstutucionSistema() {
        return instutucionSistema;
    }
    public void setInstutucionSistema(String instutucionSistema) {
        this.instutucionSistema = instutucionSistema;
    }
    public String getUnidadOperativa() {
        return unidadOperativa;
    }
    public void setUnidadOperativa(String unidadOperativa) {
        this.unidadOperativa = unidadOperativa;
    }
    public String getCodUd() {
        return codUd;
    }
    public void setCodUd(String codUd) {
        this.codUd = codUd;
    }
    
    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public String getSala() {
        return sala;
    }
    public void setSala(String sala) {
        this.sala = sala;
    }
    public String getCama() {
        return cama;
    }
    public void setCama(String cama) {
        this.cama = cama;
    }
    
    public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getParroquia() {
        return parroquia;
    }
    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }
    public String getCanton() {
        return canton;
    }
    public void setCanton(String canton) {
        this.canton = canton;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public Character getEstado() {
        return estado;
    }
    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public Integer getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(Integer numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    

}
