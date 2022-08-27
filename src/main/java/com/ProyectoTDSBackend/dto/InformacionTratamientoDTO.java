package com.ProyectoTDSBackend.dto;

public class InformacionTratamientoDTO {
	private Integer idInfTrat;
	private int codigo;
	private String especialidad;
    private Integer idConsentimientoFK;
    private String nombreProfesionalTrat;
    private String procedimientoPropuesto;
    private String proposito;
    private String resultadoEsperado;
    private String riesgoComplicaciones;
    private int telefono;
    
    public InformacionTratamientoDTO() {
    }

    public InformacionTratamientoDTO(Integer idInfTrat, int codigo, String especialidad, Integer idConsentimientoFK,
			String nombreProfesionalTrat, String procedimientoPropuesto, String proposito, String resultadoEsperado,
			String riesgoComplicaciones, int telefono) {
		super();
		this.idInfTrat = idInfTrat;
		this.codigo = codigo;
		this.especialidad = especialidad;
		this.idConsentimientoFK = idConsentimientoFK;
		this.nombreProfesionalTrat = nombreProfesionalTrat;
		this.procedimientoPropuesto = procedimientoPropuesto;
		this.proposito = proposito;
		this.resultadoEsperado = resultadoEsperado;
		this.riesgoComplicaciones = riesgoComplicaciones;
		this.telefono = telefono;
	}

	public Integer getIdInfTrat() {
		return idInfTrat;
	}

	public void setIdInfTrat(Integer idInfTrat) {
		this.idInfTrat = idInfTrat;
	}

	public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombreProfesionalTrat() {
        return nombreProfesionalTrat;
    }

    public void setNombreProfesionalTrat(String nombreProfesionalTrat) {
        this.nombreProfesionalTrat = nombreProfesionalTrat;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Integer getIdConsentimientoFK() {
        return idConsentimientoFK;
    }

    public void setIdConsentimientoFK(Integer idConsentimientoFK) {
        this.idConsentimientoFK = idConsentimientoFK;
    }

}
