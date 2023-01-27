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
@Table(name = "admision")
public class Admision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dmision", nullable = false)
    private Long idAdmision;
    @Column(name = "institucion_sistema")
    private String instutucionSistema;

    @Column(name = "unidad_operativa")
    private String unidadOperativa;

    @Column(name = "cod_ud")
    private String codUd;
    private String servicio;

    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
    private Date fecha;
    private String parroquia;
    private String canton;
    private String provincia;
    private String nombre;

    private String estadoC;
    private String instruccion;

    private Date fechaA;
    private String ocupacion;
    private String empresa;
    private String tipoS;
    private String referidoD;
    private String emergencia;
    private String parantesco;
    private String direccP;
    private String telefono;

    private String fuente;
    private String persona;
    private String numero;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_autoriza_id"))
    private Usuario usuario;

    @JsonIgnore
    @OneToMany(mappedBy = "admision", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<LLegadaAd> llegada;

    @JsonIgnore
    @OneToMany(mappedBy = "admision", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Accidente> accidente;

    @JsonIgnore
    @OneToMany(mappedBy = "admision", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<EnfermadAnte> enfermedad;
    
    @JsonIgnore
    @OneToMany(mappedBy = "admision", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SolicitudE> solicitud;
    
    @JsonIgnore
    @OneToMany(mappedBy = "admision", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Alta> alta;
    
    @JsonIgnore
    @OneToMany(mappedBy = "admision", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<IngresoDia> ingreso;
    
    @JsonIgnore
    @OneToMany(mappedBy = "admision", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DiagnosticoAI> diagnosAlta;
    
    @JsonIgnore
    @OneToMany(mappedBy = "admision", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<TrataM> tratamiento;
    
    public Admision() {
    }

    public Admision(Long idAdmision, String instutucionSistema, String unidadOperativa, String codUd, String servicio, Date fecha, String parroquia, String canton, String provincia, String nombre, String estadoC, String instruccion, Date fechaA, String ocupacion, String empresa, String tipoS, String referidoD, String emergencia, String parantesco, String direccP, String telefono, String fuente, String persona, String numero, Usuario usuario, List<LLegadaAd> llegada, List<Accidente> accidente, List<EnfermadAnte> enfermedad, List<SolicitudE> solicitud, List<Alta> alta, List<IngresoDia> ingreso, List<DiagnosticoAI> diagnosAlta, List<TrataM> tratamiento) {
        this.idAdmision = idAdmision;
        this.instutucionSistema = instutucionSistema;
        this.unidadOperativa = unidadOperativa;
        this.codUd = codUd;
        this.servicio = servicio;
        this.fecha = fecha;
        this.parroquia = parroquia;
        this.canton = canton;
        this.provincia = provincia;
        this.nombre = nombre;
        this.estadoC = estadoC;
        this.instruccion = instruccion;
        this.fechaA = fechaA;
        this.ocupacion = ocupacion;
        this.empresa = empresa;
        this.tipoS = tipoS;
        this.referidoD = referidoD;
        this.emergencia = emergencia;
        this.parantesco = parantesco;
        this.direccP = direccP;
        this.telefono = telefono;
        this.fuente = fuente;
        this.persona = persona;
        this.numero = numero;
        this.usuario = usuario;
        this.llegada = llegada;
        this.accidente = accidente;
        this.enfermedad = enfermedad;
        this.solicitud = solicitud;
        this.alta = alta;
        this.ingreso = ingreso;
        this.diagnosAlta = diagnosAlta;
        this.tratamiento = tratamiento;
    }

    

    
   
    public Long getIdAdmision() {
        return idAdmision;
    }

    public void setIdAdmision(Long idAdmision) {
        this.idAdmision = idAdmision;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoC() {
        return estadoC;
    }

    public void setEstadoC(String estadoC) {
        this.estadoC = estadoC;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public Date getFechaA() {
        return fechaA;
    }

    public void setFechaA(Date fechaA) {
        this.fechaA = fechaA;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTipoS() {
        return tipoS;
    }

    public void setTipoS(String tipoS) {
        this.tipoS = tipoS;
    }

    public String getReferidoD() {
        return referidoD;
    }

    public void setReferidoD(String referidoD) {
        this.referidoD = referidoD;
    }

    public String getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(String emergencia) {
        this.emergencia = emergencia;
    }

    public String getParantesco() {
        return parantesco;
    }

    public void setParantesco(String parantesco) {
        this.parantesco = parantesco;
    }

    public String getDireccP() {
        return direccP;
    }

    public void setDireccP(String direccP) {
        this.direccP = direccP;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<LLegadaAd> getLlegada() {
        return llegada;
    }

    public void setLlegada(List<LLegadaAd> llegada) {
        this.llegada = llegada;
    }

    public List<Accidente> getAccidente() {
        return accidente;
    }

    public void setAccidente(List<Accidente> accidente) {
        this.accidente = accidente;
    }

    public List<EnfermadAnte> getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(List<EnfermadAnte> enfermedad) {
        this.enfermedad = enfermedad;
    }

    public List<SolicitudE> getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(List<SolicitudE> solicitud) {
        this.solicitud = solicitud;
    }

    public List<Alta> getAlta() {
        return alta;
    }

    public void setAlta(List<Alta> alta) {
        this.alta = alta;
    }

    public List<IngresoDia> getIngreso() {
        return ingreso;
    }

    public void setIngreso(List<IngresoDia> ingreso) {
        this.ingreso = ingreso;
    }

    public List<DiagnosticoAI> getDiagnosAlta() {
        return diagnosAlta;
    }

    public void setDiagnosAlta(List<DiagnosticoAI> diagnosAlta) {
        this.diagnosAlta = diagnosAlta;
    }

    public List<TrataM> getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(List<TrataM> tratamiento) {
        this.tratamiento = tratamiento;
    }

    
}
