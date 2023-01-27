/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.security.models.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "odontologia")
public class Odontologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_odontologia", nullable = false)
    private Long idOdonto;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "motivo_consulta")
    private String motivo;

    @Column(name = "enfermedad")
    private String enfermedad;

    @Column(name = "presion_arterial")
    private int presion;

    @Column(name = "temperatura")
    private int temperatura;

    @Column(name = "frec_cardiaca")
    private int frecCardiaca;

    @Column(name = "frec_respira")
    private int frecRespi;

    @Column(name = "Sesion")
    private String sesion;

    @Column(name = "Fecha")
    private Date fecha;

    @Column(name = "Diagnostico")
    private String diagnostico;

    @Column(name = "Procedimientos")
    private String procedimiento;

    @Column(name = "Prescipcion")
    private String prescripcion;

    @Column(name = "Codigo")
    private String codigo;

    @JsonIgnore
    @OneToMany(mappedBy = "odontologia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<IndicesCPO> indices;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_evoluc_id"))
    private Usuario usuario;

    @JsonIgnore
    @OneToMany(mappedBy = "odontologia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<IndicesF> indicesF;

    @JsonIgnore
    @OneToMany(mappedBy = "odontologia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ExamenEsto> examen;

    @JsonIgnore
    @OneToMany(mappedBy = "odontologia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PlanesDiagnostico> planes;

    @JsonIgnore
    @OneToMany(mappedBy = "odontologia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DiagnosticoO> diagnosticos;

    @JsonIgnore
    @OneToMany(mappedBy = "odontologia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SaludBucal> salud;
    
    

    public Odontologia() {
    }

    public Odontologia(Long idOdonto, String establecimiento, String motivo, String enfermedad, int presion, int temperatura, int frecCardiaca, int frecRespi, String sesion, Date fecha, String diagnostico, String procedimiento, String prescripcion, String codigo, List<IndicesCPO> indices, Usuario usuario, List<IndicesF> indicesF, List<ExamenEsto> examen, List<PlanesDiagnostico> planes, List<DiagnosticoO> diagnosticos, List<SaludBucal> salud) {
        this.idOdonto = idOdonto;
        this.establecimiento = establecimiento;
        this.motivo = motivo;
        this.enfermedad = enfermedad;
        this.presion = presion;
        this.temperatura = temperatura;
        this.frecCardiaca = frecCardiaca;
        this.frecRespi = frecRespi;
        this.sesion = sesion;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.procedimiento = procedimiento;
        this.prescripcion = prescripcion;
        this.codigo = codigo;
        this.indices = indices;
        this.usuario = usuario;
        this.indicesF = indicesF;
        this.examen = examen;
        this.planes = planes;
        this.diagnosticos = diagnosticos;
        this.salud = salud;
    }

  
    

    public List<DiagnosticoO> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(List<DiagnosticoO> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public List<SaludBucal> getSalud() {
        return salud;
    }

    public void setSalud(List<SaludBucal> salud) {
        this.salud = salud;
    }

    
    public List<PlanesDiagnostico> getPlanes() {
        return planes;
    }

    public void setPlanes(List<PlanesDiagnostico> planes) {
        this.planes = planes;
    }

    public List<ExamenEsto> getExamen() {
        return examen;
    }

    public void setExamen(List<ExamenEsto> examen) {
        this.examen = examen;
    }

    public Long getIdOdonto() {
        return idOdonto;
    }

    public void setIdOdonto(Long idOdonto) {
        this.idOdonto = idOdonto;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getFrecCardiaca() {
        return frecCardiaca;
    }

    public void setFrecCardiaca(int frecCardiaca) {
        this.frecCardiaca = frecCardiaca;
    }

    public int getFrecRespi() {
        return frecRespi;
    }

    public void setFrecRespi(int frecRespi) {
        this.frecRespi = frecRespi;
    }

    public List<IndicesCPO> getIndices() {
        return indices;
    }

    public void setIndices(List<IndicesCPO> indices) {
        this.indices = indices;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<IndicesF> getIndicesF() {
        return indicesF;
    }

    public void setIndicesF(List<IndicesF> indicesF) {
        this.indicesF = indicesF;
    }

    public String getSesion() {
        return sesion;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getPrescripcion() {
        return prescripcion;
    }

    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   

}
