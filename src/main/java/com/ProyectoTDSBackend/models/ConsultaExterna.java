package com.ProyectoTDSBackend.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.persistence.ForeignKey;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

import com.ProyectoTDSBackend.dto.ConstExternaListDTO;
import com.ProyectoTDSBackend.dto.ConsultaExternaByIdDTO;
import com.ProyectoTDSBackend.security.models.Usuario;

@NamedNativeQueries({
    @NamedNativeQuery(name = "ConsultaExterna.getConsultaExterna", query = "", resultSetMapping = "getConsultaExterna"),
    @NamedNativeQuery(name = "ConsultaExterna.getConsultaExternaById", query = "", resultSetMapping = "getConsultaExternaById"),
    @NamedNativeQuery(name = "ConsultaExterna.generarPdfConsultaExterna", query = "", resultSetMapping = "generarPdfConsultaExterna")
})

@SqlResultSetMappings({
    @SqlResultSetMapping(name = "getConsultaExterna", classes = {
        @ConstructorResult(targetClass = ConstExternaListDTO.class, columns = {
            @ColumnResult(name = "id_consexterna", type = Integer.class),
            @ColumnResult(name = "nombres", type = String.class),
            @ColumnResult(name = "historia_clinica", type = Integer.class),
            @ColumnResult(name = "fecha", type = Date.class),
            @ColumnResult(name = "nombresProfesional", type = String.class),
        })
    }),

    @SqlResultSetMapping(name = "getConsultaExternaById", classes = {
        @ConstructorResult(targetClass = ConsultaExternaByIdDTO.class, columns = {
            @ColumnResult(name = "duracionConsulta", type = String.class),
            @ColumnResult(name = "nombresProfesional", type = String.class),
            @ColumnResult(name = "identificacion", type = String.class),
            @ColumnResult(name = "idConsexterna", type = Integer.class),
            @ColumnResult(name = "establecimiento", type = String.class),
            @ColumnResult(name = "nombres", type = String.class),
            @ColumnResult(name = "sexo", type = String.class),
            @ColumnResult(name = "historiaClinica", type = Integer.class),
            @ColumnResult(name = "motivoConsulta", type = String.class),
            @ColumnResult(name = "enfermedadActual", type = String.class),
            @ColumnResult(name = "fecha", type = Date.class),
            @ColumnResult(name = "clinicos", type = String.class),
            @ColumnResult(name = "quirurgicos", type = String.class),
            @ColumnResult(name = "cardiopatia", type = Boolean.class),
            @ColumnResult(name = "diabetes", type = Boolean.class),
            @ColumnResult(name = "enfCardiovasculares", type = Boolean.class),
            @ColumnResult(name = "hipertension", type = Boolean.class),
            @ColumnResult(name = "cancer", type = Boolean.class),
            @ColumnResult(name = "tuberculosis", type = Boolean.class),
            @ColumnResult(name = "enfMentales", type = Boolean.class),
            @ColumnResult(name = "enfInfecciosas", type = Boolean.class),
            @ColumnResult(name = "malformaciones", type = Boolean.class),
            @ColumnResult(name = "otros", type = Boolean.class),
            @ColumnResult(name = "familiares", type = String.class),
            @ColumnResult(name = "organoSentido", type = String.class),
            @ColumnResult(name = "respiratorio", type = String.class),
            @ColumnResult(name = "cardiovascular", type = String.class),
            @ColumnResult(name = "digestivo", type = String.class),
            @ColumnResult(name = "genital", type = String.class),
            @ColumnResult(name = "urinario", type = String.class),
            @ColumnResult(name = "musculoEsqueletico", type = String.class),
            @ColumnResult(name = "endocrino", type = String.class),
            @ColumnResult(name = "hemolenfatico", type = String.class),
            @ColumnResult(name = "nervioso", type = String.class),
            @ColumnResult(name = "descripcion", type = String.class),
            @ColumnResult(name = "fechaMedicion", type = Date.class),
            @ColumnResult(name = "temperatura", type = Double.class),
            @ColumnResult(name = "presionArterial", type = String.class),
            @ColumnResult(name = "pulso", type = Integer.class),
            @ColumnResult(name = "frecRespiratoria", type = Double.class),
            @ColumnResult(name = "peso", type = Double.class),
            @ColumnResult(name = "talla", type = Double.class),
            @ColumnResult(name = "cabeza", type = String.class),
            @ColumnResult(name = "cuello", type = String.class),
            @ColumnResult(name = "torax", type = String.class),
            @ColumnResult(name = "abdomen", type = String.class),
            @ColumnResult(name = "pelvis", type = String.class),
            @ColumnResult(name = "extremidades", type = String.class),
            @ColumnResult(name = "observaciones", type = String.class),
            @ColumnResult(name = "descripcionDiagnostico", type = String.class),
            @ColumnResult(name = "cie", type = String.class),
            @ColumnResult(name = "preDef", type = String.class),
            @ColumnResult(name = "descripcionPreDef", type = String.class),
            @ColumnResult(name = "descripcionPreDefCie", type = String.class),
            @ColumnResult(name = "descripcionPreDefPreDef", type = String.class),
            @ColumnResult(name = "m", type = String.class),
            @ColumnResult(name = "i", type = String.class),
            @ColumnResult(name = "l", type = String.class),
            @ColumnResult(name = "r", type = String.class),
            @ColumnResult(name = "c", type = String.class),
            @ColumnResult(name = "t", type = String.class),
            @ColumnResult(name = "o", type = String.class)
        })
    }), 

    @SqlResultSetMapping(name = "generarPdfConsultaExterna", classes = {
        @ConstructorResult(targetClass = ConsultaExternaByIdDTO.class, columns = {
            @ColumnResult(name = "duracionConsulta", type = String.class),
            @ColumnResult(name = "nombresProfesional", type = String.class),
            @ColumnResult(name = "identificacion", type = String.class),
            @ColumnResult(name = "idConsexterna", type = Integer.class),
            @ColumnResult(name = "establecimiento", type = String.class),
            @ColumnResult(name = "nombres", type = String.class),
            @ColumnResult(name = "sexo", type = String.class),
            @ColumnResult(name = "historiaClinica", type = Integer.class),
            @ColumnResult(name = "motivoConsulta", type = String.class),
            @ColumnResult(name = "enfermedadActual", type = String.class),
            @ColumnResult(name = "fecha", type = Date.class),
            @ColumnResult(name = "clinicos", type = String.class),
            @ColumnResult(name = "quirurgicos", type = String.class),
            @ColumnResult(name = "cardiopatia", type = Boolean.class),
            @ColumnResult(name = "diabetes", type = Boolean.class),
            @ColumnResult(name = "enfCardiovasculares", type = Boolean.class),
            @ColumnResult(name = "hipertension", type = Boolean.class),
            @ColumnResult(name = "cancer", type = Boolean.class),
            @ColumnResult(name = "tuberculosis", type = Boolean.class),
            @ColumnResult(name = "enfMentales", type = Boolean.class),
            @ColumnResult(name = "enfInfecciosas", type = Boolean.class),
            @ColumnResult(name = "malformaciones", type = Boolean.class),
            @ColumnResult(name = "otros", type = Boolean.class),
            @ColumnResult(name = "familiares", type = String.class),
            @ColumnResult(name = "organoSentido", type = String.class),
            @ColumnResult(name = "respiratorio", type = String.class),
            @ColumnResult(name = "cardiovascular", type = String.class),
            @ColumnResult(name = "digestivo", type = String.class),
            @ColumnResult(name = "genital", type = String.class),
            @ColumnResult(name = "urinario", type = String.class),
            @ColumnResult(name = "musculoEsqueletico", type = String.class),
            @ColumnResult(name = "endocrino", type = String.class),
            @ColumnResult(name = "hemolenfatico", type = String.class),
            @ColumnResult(name = "nervioso", type = String.class),
            @ColumnResult(name = "descripcion", type = String.class),
            @ColumnResult(name = "fechaMedicion", type = Date.class),
            @ColumnResult(name = "temperatura", type = Double.class),
            @ColumnResult(name = "presionArterial", type = String.class),
            @ColumnResult(name = "pulso", type = Integer.class),
            @ColumnResult(name = "frecRespiratoria", type = Double.class),
            @ColumnResult(name = "peso", type = Double.class),
            @ColumnResult(name = "talla", type = Double.class),
            @ColumnResult(name = "cabeza", type = String.class),
            @ColumnResult(name = "cuello", type = String.class),
            @ColumnResult(name = "torax", type = String.class),
            @ColumnResult(name = "abdomen", type = String.class),
            @ColumnResult(name = "pelvis", type = String.class),
            @ColumnResult(name = "extremidades", type = String.class),
            @ColumnResult(name = "observaciones", type = String.class),
            @ColumnResult(name = "descripcionDiagnostico", type = String.class),
            @ColumnResult(name = "cie", type = String.class),
            @ColumnResult(name = "preDef", type = String.class),
            @ColumnResult(name = "descripcionPreDef", type = String.class),
            @ColumnResult(name = "descripcionPreDefCie", type = String.class),
            @ColumnResult(name = "descripcionPreDefPreDef", type = String.class),
            @ColumnResult(name = "m", type = String.class),
            @ColumnResult(name = "i", type = String.class),
            @ColumnResult(name = "l", type = String.class),
            @ColumnResult(name = "r", type = String.class),
            @ColumnResult(name = "c", type = String.class),
            @ColumnResult(name = "t", type = String.class),
            @ColumnResult(name = "o", type = String.class)
        })
    })
})

@Entity
@Table(name = "CONSULTA_EXTERNA")
public class ConsultaExterna {
    private static final long serialVersionUID = 1542L;
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CONSEXTERNA", nullable = false)
	private Long idConsexterna;

    @Column(name = "ESTABLECIMIENTO", length = 60)
    private String establecimiento;

    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "MOTIVO_CONSULTA", length = 1200)
    private String motivoConsulta;

    @Column(name = "ENFERMEDAD_ACTUAL", length = 1200)
    private String enfermedadActual;

    @Column(name = "HISTORIA_CLINICA")
    private int historiaClinica;

    @Column(name = "ESTADO", length = 1)
    private String estado;

    @Column(name = "DURACION_CONSULTA", length = 60)
    private String duracionConsulta;

    @Column(name = "NOMBRES_PROFESIONAL", length = 60)
    private String nombresProfesional;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ID_USUARIO", foreignKey = @ForeignKey(name = "FK_CONSULTA_EXTERNA_ID"))
	private Usuario usuario;

    @OneToMany(mappedBy = "consultaExterna", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AntecPersonales> antecPersonales;

    @OneToMany(mappedBy = "consultaExterna", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AntecFamiliares> antecFamiliares;

    @OneToMany(mappedBy = "consultaExterna", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<RevOrganoSistem> revOrganoSistem;

    @OneToMany(mappedBy = "consultaExterna", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Diagnosticos> diagnosticos;

    @OneToMany(mappedBy = "consultaExterna", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PlanTratamiento> planTratamiento;
    
    public ConsultaExterna() {
    }

    // public ConsultaExterna( Usuario usuario, int historiaClinica) {
    //     this.usuario = usuario;
    //     this.historiaClinica = historiaClinica;
        
    // }

    public ConsultaExterna(Long idConsexterna, String establecimiento, Date fecha, String motivoConsulta,
            String enfermedadActual, int historiaClinica, String estado, String duracionConsulta,
            String nombresProfesional, Usuario usuario, List<AntecPersonales> antecPersonales,
            List<AntecFamiliares> antecFamiliares, List<RevOrganoSistem> revOrganoSistem,
            List<Diagnosticos> diagnosticos, List<PlanTratamiento> planTratamiento) {
        this.idConsexterna = idConsexterna;
        this.establecimiento = establecimiento;
        this.fecha = fecha;
        this.motivoConsulta = motivoConsulta;
        this.enfermedadActual = enfermedadActual;
        this.historiaClinica = historiaClinica;
        this.estado = estado;
        this.duracionConsulta = duracionConsulta;
        this.nombresProfesional = nombresProfesional;
        this.usuario = usuario;
        this.antecPersonales = antecPersonales;
        this.antecFamiliares = antecFamiliares;
        this.revOrganoSistem = revOrganoSistem;
        this.diagnosticos = diagnosticos;
        this.planTratamiento = planTratamiento;
    }

    public String getNombresProfesional() {
        return nombresProfesional;
    }

    public void setNombresProfesional(String nombresProfesional) {
        this.nombresProfesional = nombresProfesional;
    }

    public String getEstado() {
        return estado;
    }

    public String getDuracionConsulta() {
        return duracionConsulta;
    }

    public void setDuracionConsulta(String duracionConsulta) {
        this.duracionConsulta = duracionConsulta;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public List<AntecPersonales> getAntecPersonales() {
        return antecPersonales;
    }

    public void setAntecPersonales(List<AntecPersonales> antecPersonales) {
        this.antecPersonales = antecPersonales;
    }

    public List<AntecFamiliares> getAntecFamiliares() {
        return antecFamiliares;
    }

    public void setAntecFamiliares(List<AntecFamiliares> antecFamiliares) {
        this.antecFamiliares = antecFamiliares;
    }

    public List<RevOrganoSistem> getRevOrganoSistem() {
        return revOrganoSistem;
    }

    public void setRevOrganoSistem(List<RevOrganoSistem> revOrganoSistem) {
        this.revOrganoSistem = revOrganoSistem;
    }

    public List<Diagnosticos> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(List<Diagnosticos> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    public List<PlanTratamiento> getPlanTratamiento() {
        return planTratamiento;
    }

    public void setPlanTratamiento(List<PlanTratamiento> planTratamiento) {
        this.planTratamiento = planTratamiento;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getIdConsexterna() {
        return idConsexterna;
    }

    public void setIdConsexterna(Long idConsexterna) {
        this.idConsexterna = idConsexterna;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public int getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(int historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
