/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.dto.AdmisionDto;
import com.ProyectoTDSBackend.security.models.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@NamedNativeQueries({
    @NamedNativeQuery(name = "Admision.generarPdfAd", query = "", resultSetMapping = "generarPdfAd")
})

@SqlResultSetMapping(name = "generarPdfAd", classes = {
    @ConstructorResult(targetClass = AdmisionDto.class, columns = {
        @ColumnResult(name = "canton", type = String.class),
        @ColumnResult(name = "cod_ud", type = String.class),
        @ColumnResult(name = "direccp", type = String.class),
        @ColumnResult(name = "emergencia", type = String.class),
        @ColumnResult(name = "empresa", type = String.class),
        @ColumnResult(name = "fecha", type = Date.class),
        @ColumnResult(name = "fechaa", type = Date.class),
        @ColumnResult(name = "fuente", type = String.class),
        @ColumnResult(name = "instruccion", type = String.class),
        @ColumnResult(name = "institucion_sistema", type = String.class),
        @ColumnResult(name = "nombre", type = String.class),
        @ColumnResult(name = "numero", type = String.class),
        @ColumnResult(name = "ocupacion", type = String.class),
        @ColumnResult(name = "parantesco", type = String.class),
        @ColumnResult(name = "parroquia", type = String.class),
        @ColumnResult(name = "persona", type = String.class),
        @ColumnResult(name = "provincia", type = String.class),
        @ColumnResult(name = "referidod", type = String.class),
        @ColumnResult(name = "servicio", type = String.class),
        @ColumnResult(name = "telefono", type = String.class),
        @ColumnResult(name = "tipos", type = String.class),
        @ColumnResult(name = "unida_operativa", type = String.class),
        @ColumnResult(name = "num_cli", type = Integer.class),
        @ColumnResult(name = "nombres", type = String.class),
        @ColumnResult(name = "celular", type = String.class),
        @ColumnResult(name = "barrio", type = String.class),
        @ColumnResult(name = "parro", type = String.class),
        @ColumnResult(name = "can", type = String.class),
        @ColumnResult(name = "provi", type = String.class),
        @ColumnResult(name = "nacionalidad", type = String.class),
        @ColumnResult(name = "sexo", type = String.class),
        @ColumnResult(name = "estado_civil", type = String.class),
        @ColumnResult(name = "direccion", type = String.class),
        @ColumnResult(name = "ambulancia", type = String.class),
        @ColumnResult(name = "ambulatorio", type = String.class),
        @ColumnResult(name = "otrot", type = String.class),
        @ColumnResult(name = "causac", type = String.class),
        @ColumnResult(name = "descrip", type = String.class),
        @ColumnResult(name = "grupo", type = String.class),
        @ColumnResult(name = "hora", type = String.class),
        @ColumnResult(name = "motivo", type = String.class),
        @ColumnResult(name = "obstretica", type = String.class),
        @ColumnResult(name = "policia", type = String.class),
        @ColumnResult(name = "quirurgica", type = String.class),
        @ColumnResult(name = "trauma", type = String.class),
        @ColumnResult(name = "familiar", type = Boolean.class),
        @ColumnResult(name = "abusof", type = Boolean.class),
        @ColumnResult(name = "abusos", type = Boolean.class),
        @ColumnResult(name = "ahogamiento", type = Boolean.class),
        @ColumnResult(name = "ialcoholica", type = Boolean.class),
        @ColumnResult(name = "almientaria", type = Boolean.class),
        @ColumnResult(name = "anafilaxia", type = Boolean.class),
        @ColumnResult(name = "aplastamiento", type = Boolean.class),
        @ColumnResult(name = "apsicologico", type = Boolean.class),
        @ColumnResult(name = "caida", type = Boolean.class),
        @ColumnResult(name = "vcorto", type = Boolean.class),
        @ColumnResult(name = "descr", type = String.class),
        @ColumnResult(name = "direcciona", type = String.class),
        @ColumnResult(name = "drogas", type = Boolean.class),
        @ColumnResult(name = "enve", type = Boolean.class),
        @ColumnResult(name = "alientoe", type = Boolean.class),
        @ColumnResult(name = "c_extraño", type = Boolean.class),
        @ColumnResult(name = "fechae", type = Date.class),
        @ColumnResult(name = "armaf", type = Boolean.class),
        @ColumnResult(name = "gases", type = Boolean.class),
        @ColumnResult(name = "moderdura", type = Boolean.class),
        @ColumnResult(name = "nombrea", type = String.class),
        @ColumnResult(name = "policial", type = Boolean.class),
        @ColumnResult(name = "quemadura", type = Boolean.class),
        @ColumnResult(name = "rina", type = Boolean.class),
        @ColumnResult(name = "transito", type = Boolean.class),
        @ColumnResult(name = "valor", type = Integer.class),
        @ColumnResult(name = "otrav", type = Boolean.class),
        @ColumnResult(name = "picadura", type = Boolean.class),
        @ColumnResult(name = "otrai", type = Boolean.class),
        @ColumnResult(name = "otroa", type = Boolean.class),
        @ColumnResult(name = "alergico", type = Boolean.class),
        @ColumnResult(name = "clinico", type = Boolean.class),
        @ColumnResult(name = "decripcione", type = String.class),
        @ColumnResult(name = "descriciona", type = String.class),
        @ColumnResult(name = "condicion_estable", type = Boolean.class),
        @ColumnResult(name = "condicion_inestable", type = Boolean.class),
        @ColumnResult(name = "farmacolo", type = Boolean.class),
        @ColumnResult(name = "ginecologico", type = Boolean.class),
        @ColumnResult(name = "via_aerea", type = Boolean.class),
        @ColumnResult(name = "via_obstruida", type = Boolean.class),
        @ColumnResult(name = "otroe", type = Boolean.class),
        @ColumnResult(name = "psiquiatrico", type = Boolean.class),
        @ColumnResult(name = "quirurgico", type = Boolean.class),
        @ColumnResult(name = "traumato", type = Boolean.class),
        @ColumnResult(name = "abdomens", type = String.class),
        @ColumnResult(name = "t_axilar", type = Integer.class),
        @ColumnResult(name = "t_bucal", type = Integer.class),
        @ColumnResult(name = "cabezas", type = String.class),
        @ColumnResult(name = "capilar", type = Integer.class),
        @ColumnResult(name = "columnas", type = String.class),
        @ColumnResult(name = "cuello", type = String.class),
        @ColumnResult(name = "descripcions", type = String.class),
        @ColumnResult(name = "extremidades", type = String.class),
        @ColumnResult(name = "fcardiaca", type = Integer.class),
        @ColumnResult(name = "motora", type = Integer.class),
        @ColumnResult(name = "ocular", type = Integer.class),
        @ColumnResult(name = "satura", type = Integer.class),
        @ColumnResult(name = "pelvis", type = String.class),
        @ColumnResult(name = "peso", type = Integer.class),
        @ColumnResult(name = "presion", type = Integer.class),
        @ColumnResult(name = "pupilad", type = String.class),
        @ColumnResult(name = "pupilai", type = String.class),
        @ColumnResult(name = "frespiratoria", type = Integer.class),
        @ColumnResult(name = "talla", type = Integer.class),
        @ColumnResult(name = "torax", type = String.class),
        @ColumnResult(name = "totals", type = Integer.class),
        @ColumnResult(name = "verbal", type = Integer.class),
        @ColumnResult(name = " via_obstruidasp", type = String.class),
        @ColumnResult(name = "cerrada", type = String.class),
        @ColumnResult(name = "cortante", type = String.class),
        @ColumnResult(name = "esguince", type = String.class),
        @ColumnResult(name = "excoracion", type = String.class),
        @ColumnResult(name = "expuesta", type = String.class),
        @ColumnResult(name = "extraña", type = String.class),
        @ColumnResult(name = "hematoma", type = String.class),
        @ColumnResult(name = "hemorragia", type = String.class),
        @ColumnResult(name = "inflamacion", type = String.class),
        @ColumnResult(name = "deformacion", type = String.class),
        @ColumnResult(name = "moderdural", type = String.class),
        @ColumnResult(name = "penetrante", type = String.class),
        @ColumnResult(name = "picadural", type = String.class),
        @ColumnResult(name = "quemaduraf", type = String.class),
        @ColumnResult(name = "abortos", type = String.class),
        @ColumnResult(name = "borramiento", type = String.class),
        @ColumnResult(name = "cesareas", type = String.class),
        @ColumnResult(name = "contraciones", type = String.class),
        @ColumnResult(name = "dilatacion", type = String.class),
        @ColumnResult(name = "fecham", type = Date.class),
        @ColumnResult(name = "fetal", type = String.class),
        @ColumnResult(name = "frecuenciam", type = String.class),
        @ColumnResult(name = "gestas", type = String.class),
        @ColumnResult(name = "membranas", type = String.class),
        @ColumnResult(name = "partos", type = String.class),
        @ColumnResult(name = "plano", type = String.class),
        @ColumnResult(name = "presentacion", type = String.class),
        @ColumnResult(name = "semanas", type = String.class),
        @ColumnResult(name = "sangrado", type = String.class),
        @ColumnResult(name = "tiempo", type = Integer.class),
        @ColumnResult(name = "uterina", type = String.class),
        @ColumnResult(name = "util", type = String.class),
        @ColumnResult(name = "abdomeno", type = Boolean.class),
        @ColumnResult(name = "biometricas", type = Boolean.class),
        @ColumnResult(name = "electro_car", type = Boolean.class),
        @ColumnResult(name = "descripciono", type = String.class),
        @ColumnResult(name = "ecoabdomen", type = Boolean.class),
        @ColumnResult(name = "electrolitos", type = Boolean.class),
        @ColumnResult(name = "endoscopia", type = Boolean.class),
        @ColumnResult(name = "gastrometira", type = Boolean.class),
        @ColumnResult(name = "interconsulta", type = Boolean.class),
        @ColumnResult(name = "osea", type = Boolean.class),
        @ColumnResult(name = "otroso", type = Boolean.class),
        @ColumnResult(name = "ecopelvica", type = Boolean.class),
        @ColumnResult(name = "resonancia", type = Boolean.class),
        @ColumnResult(name = "quimicaso", type = Boolean.class),
        @ColumnResult(name = "tomografia", type = Boolean.class),
        @ColumnResult(name = "toraxo", type = Boolean.class),
        @ColumnResult(name = "uroanalisis", type = Boolean.class),
        @ColumnResult(name = "cie1", type = String.class),
        @ColumnResult(name = "cie2", type = String.class),
        @ColumnResult(name = "cie3", type = String.class),
        @ColumnResult(name = "descripcion1", type = String.class),
        @ColumnResult(name = "descripcion2", type = String.class),
        @ColumnResult(name = "descripcion3", type = String.class),
        @ColumnResult(name = "d1", type = String.class),
        @ColumnResult(name = "d2", type = String.class),
        @ColumnResult(name = "d3", type = String.class),
        @ColumnResult(name = "cie1a", type = String.class),
        @ColumnResult(name = "cie2a", type = String.class),
        @ColumnResult(name = "cie3a", type = String.class),
        @ColumnResult(name = "descripcion1a", type = String.class),
        @ColumnResult(name = "descripcion2a", type = String.class),
        @ColumnResult(name = "descripcion3a", type = String.class),
        @ColumnResult(name = "d1a", type = String.class),
        @ColumnResult(name = "d2a", type = String.class),
        @ColumnResult(name = "d3a", type = String.class),
        @ColumnResult(name = "indicaciones", type = String.class),
        @ColumnResult(name = "medicamento1", type = String.class),
        @ColumnResult(name = "medicamento2", type = String.class),
        @ColumnResult(name = "medicamento3", type = String.class),
        @ColumnResult(name = "posologia", type = String.class),
        @ColumnResult(name = "posologia2", type = String.class),
        @ColumnResult(name = "posologia3", type = String.class),
        @ColumnResult(name = "cexterna", type = Boolean.class),
        @ColumnResult(name = "causaa", type = String.class),
        @ColumnResult(name = "codigoa", type = String.class),
        @ColumnResult(name = "diasa", type = Integer.class),
        @ColumnResult(name = "domicilio", type = Boolean.class),
        @ColumnResult(name = "establea", type = Boolean.class),
        @ColumnResult(name = "establecimientoa", type = String.class),
        @ColumnResult(name = "fechas", type = Date.class),
        @ColumnResult(name = "inestablea", type = Boolean.class),
        @ColumnResult(name = "internacion", type = Boolean.class),
        @ColumnResult(name = "muerto", type = Boolean.class),
        @ColumnResult(name = "nombrep", type = String.class),
        @ColumnResult(name = "observaciona", type = Boolean.class),
        @ColumnResult(name = "referenciaa", type = Boolean.class),
        @ColumnResult(name = "servicioa", type = String.class),
        @ColumnResult(name = "vivo", type = Boolean.class),})
})
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

    @JsonIgnore
    @OneToMany(mappedBy = "admision", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Emergencia> emergencias;

    @JsonIgnore
    @OneToMany(mappedBy = "admision", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Lesiones> lesion;

    public Admision() {
    }

    public Admision(Long idAdmision, String instutucionSistema, String unidadOperativa, String codUd, String servicio, Date fecha, String parroquia, String canton, String provincia, String nombre, String estadoC, String instruccion, Date fechaA, String ocupacion, String empresa, String tipoS, String referidoD, String emergencia, String parantesco, String direccP, String telefono, String fuente, String persona, String numero, Usuario usuario, List<LLegadaAd> llegada, List<Accidente> accidente, List<EnfermadAnte> enfermedad, List<SolicitudE> solicitud, List<Alta> alta, List<IngresoDia> ingreso, List<DiagnosticoAI> diagnosAlta, List<TrataM> tratamiento, List<Emergencia> emergencias, List<Lesiones> lesion) {
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
        this.emergencias = emergencias;
        this.lesion = lesion;
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

    public List<Emergencia> getEmergencias() {
        return emergencias;
    }

    public void setEmergencias(List<Emergencia> emergencias) {
        this.emergencias = emergencias;
    }

    public List<Lesiones> getLesion() {
        return lesion;
    }

    public void setLesion(List<Lesiones> lesion) {
        this.lesion = lesion;
    }

}
