package com.ProyectoTDSBackend.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ForeignKey;

import com.ProyectoTDSBackend.security.models.Usuario;

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

    @Column(name = "MOTIVO_CONSULTA")
    private String motivoConsulta;

    @Column(name = "ENFERMEDAD_ACTUAL")
    private String enfermedadActual;

    @Column(name = "HISTORIA_CLINICA")
    private String historiaClinica;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
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

    public ConsultaExterna(Long idConsexterna, Date fecha, String motivoConsulta, String enfermedadActual,
            String historiaClinica) {
        this.idConsexterna = idConsexterna;
        this.fecha = fecha;
        this.motivoConsulta = motivoConsulta;
        this.enfermedadActual = enfermedadActual;
        this.historiaClinica = historiaClinica;
    }

    public ConsultaExterna(Long idConsexterna, String establecimiento, Date fecha, String motivoConsulta,
            String enfermedadActual, String historiaClinica, Usuario usuario, List<AntecPersonales> antecPersonales,
            List<AntecFamiliares> antecFamiliares, List<RevOrganoSistem> revOrganoSistem,
            List<Diagnosticos> diagnosticos, List<PlanTratamiento> planTratamiento) {
        this.idConsexterna = idConsexterna;
        this.establecimiento = establecimiento;
        this.fecha = fecha;
        this.motivoConsulta = motivoConsulta;
        this.enfermedadActual = enfermedadActual;
        this.historiaClinica = historiaClinica;
        this.usuario = usuario;
        this.antecPersonales = antecPersonales;
        this.antecFamiliares = antecFamiliares;
        this.revOrganoSistem = revOrganoSistem;
        this.diagnosticos = diagnosticos;
        this.planTratamiento = planTratamiento;
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

    public String getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(String historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
