package com.ProyectoTDSBackend.models;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.ProyectoTDSBackend.dto.InformacionTratamientoDTO;
@NamedNativeQueries({
    @NamedNativeQuery(name = "InformacionTratamiento.getAllDatosOnlyInformacionTratamientoById", query = "", resultSetMapping = "getAllDatosOnlyInformacionTratamientoById"),
})

@SqlResultSetMappings({
	 @SqlResultSetMapping(name = "getAllDatosOnlyInformacionTratamientoById", classes = {
			 @ConstructorResult(targetClass = InformacionTratamientoDTO.class, columns = {
					 @ColumnResult(name = "idInfTrat", type = Integer.class),
					 @ColumnResult(name = "codigo", type = Integer.class),
					 @ColumnResult(name = "especialidad", type = String.class),
					 @ColumnResult(name = "idConsentimientoFK", type = Integer.class),
					 @ColumnResult(name = "nombreProfesionalTrat", type = String.class),
					 @ColumnResult(name = "procedimientoPropuesto", type = String.class),
					 @ColumnResult(name = "proposito", type = String.class),
					 @ColumnResult(name = "resultadoEsperado", type = String.class),
					 @ColumnResult(name = "riesgoComplicaciones", type = String.class),
					 @ColumnResult(name = "telefono", type = int.class),
			 })
	 })
})
@Entity
@Table(name = "informacionTratamientos")
public class InformacionTratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Inf_Trat", nullable = false)
    private Integer idInfTrat; 
    
	// @Column(name = "id_informe_tratamiento", nullable = false)
	// private Integer idInformeTratamiento;

    private String proposito; 
    
    @Column(name = "procedimiento_propuesto")
    private String procedimientoPropuesto; 

    @Column(name = "resultado_esperado")
    private String resultadoEsperado; 

    @Column(name = "riesgo_complicaciones")
    private String riesgoComplicaciones;

    @Column(name = "nombre_profesional_trat")
    private String nombreProfesionalTrat;

    private String especialidad; 
    private int telefono;
    private int codigo;

    @Column(name = "id_consentimiento_fk", nullable = false)
	private Integer idConsentimientoFK;

    @ManyToOne
	@JoinColumn(name = "id_consentimiento_fk", insertable = false, updatable = false)
	private Consentimiento consentimiento; 

    public InformacionTratamiento() {
    }

    public String getProposito() {
        return proposito;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public String getProcedimientoPropuesto() {
        return procedimientoPropuesto;
    }

    public void setProcedimientoPropuesto(String procedimientoPropuesto) {
        this.procedimientoPropuesto = procedimientoPropuesto;
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

    public String getNombreProfesionalTrat() {
        return nombreProfesionalTrat;
    }

    public void setNombreProfesionalTrat(String nombreProfesionalTrat) {
        this.nombreProfesionalTrat = nombreProfesionalTrat;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Integer getIdConsentimientoFK() {
        return idConsentimientoFK;
    }

    public void setIdConsentimientoFK(Integer idConsentimientoFK) {
        this.idConsentimientoFK = idConsentimientoFK;
    }

    public Consentimiento getConsentimiento() {
        return consentimiento;
    }

    public void setConsentimiento(Consentimiento consentimiento) {
        this.consentimiento = consentimiento;
    }

    public Integer getIdInfTrat() {
        return idInfTrat;
    }

    public void setIdInfTrat(Integer idInfTrat) {
        this.idInfTrat = idInfTrat;
    }

}
