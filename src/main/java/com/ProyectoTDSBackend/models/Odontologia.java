/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.dto.OdontologiaDto;
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
    @NamedNativeQuery(name = "Odontologia.generarPdfOdon", query = "", resultSetMapping = "generarPdfOdon")
})

@SqlResultSetMapping(name = "generarPdfOdon", classes = {
    @ConstructorResult(targetClass = OdontologiaDto.class, columns = {
       
        @ColumnResult(name = "codigo", type = String.class),
        @ColumnResult(name = "diagnostico", type = String.class),
        @ColumnResult(name = "enfermedad", type = String.class),
        @ColumnResult(name = "establecimeinto", type = String.class),
        @ColumnResult(name = "fecha", type = Date.class),
        @ColumnResult(name = "nombres", type = String.class),
        @ColumnResult(name = "sexo", type = String.class),
        @ColumnResult(name = "num_cli", type = Integer.class),
        @ColumnResult(name = "edad", type = Integer.class),
        @ColumnResult(name = "frec_cardiaca", type = Integer.class),
        @ColumnResult(name = "frec_respira", type = Integer.class),
        @ColumnResult(name = "motivo_consulta", type = String.class),
        @ColumnResult(name = "prescipcion", type = String.class),
        @ColumnResult(name = "presion_arterial", type = Integer.class),
        @ColumnResult(name = "procedimientos", type = String.class),
        @ColumnResult(name = "sesion", type = String.class),
        @ColumnResult(name = "temperatura", type = Integer.class),
        @ColumnResult(name = "alergia_anes", type = Boolean.class),
        @ColumnResult(name = "alergiaa", type = Boolean.class),
        @ColumnResult(name = "asma", type = Boolean.class),
        @ColumnResult(name = "diabetes", type = Boolean.class),
        @ColumnResult(name = "descripcion", type = String.class),
        @ColumnResult(name = "enf_car", type = Boolean.class),
        @ColumnResult(name = "hemorragias", type = Boolean.class),
        @ColumnResult(name = "otros", type = Boolean.class),
        @ColumnResult(name = "tuberculosis", type = Boolean.class),
        @ColumnResult(name = "vh_sida", type = Boolean.class),
        @ColumnResult(name = "a_t_m", type = Boolean.class),
        @ColumnResult(name = "carrillos", type = Boolean.class),
        @ColumnResult(name = "descripcione", type = String.class),
        @ColumnResult(name = "glandulas_sa", type = Boolean.class),
        @ColumnResult(name = "glangios", type = Boolean.class),
        @ColumnResult(name = "labio", type = Boolean.class),
        @ColumnResult(name = "lengua", type = Boolean.class),
        @ColumnResult(name = "maxilar_su", type = Boolean.class),
        @ColumnResult(name = "maxilar_in", type = Boolean.class),
        @ColumnResult(name = "mejillas", type = Boolean.class),
        @ColumnResult(name = "oro", type = Boolean.class),
        @ColumnResult(name = "paladar", type = Boolean.class),
        @ColumnResult(name = "piso", type = Boolean.class),
        @ColumnResult(name = "anglei", type = String.class),
        @ColumnResult(name = "angleii", type = String.class),
        @ColumnResult(name = "angleiii", type = String.class),
        @ColumnResult(name = "cal1", type = Integer.class),
        @ColumnResult(name = "cal2", type = Integer.class),
        @ColumnResult(name = "cal3", type = Integer.class),
        @ColumnResult(name = "cal4", type = Integer.class),
        @ColumnResult(name = "cal5", type = Integer.class),
        @ColumnResult(name = "cal6", type = Integer.class),
        @ColumnResult(name = "gin1", type = Integer.class),
        @ColumnResult(name = "gin2", type = Integer.class),
        @ColumnResult(name = "gin3", type = Integer.class),
        @ColumnResult(name = "gin4", type = Integer.class),
        @ColumnResult(name = "gin5", type = Integer.class),
        @ColumnResult(name = "gin6", type = Integer.class),
        @ColumnResult(name = "leve", type = String.class),
        @ColumnResult(name = "levef", type = String.class),
        @ColumnResult(name = "moderada", type = String.class),
        @ColumnResult(name = "moderadaf", type = String.class),
        @ColumnResult(name = "p11", type = String.class),
        @ColumnResult(name = "p16", type = String.class),
        @ColumnResult(name = "p17", type = String.class),
        @ColumnResult(name = "p21", type = String.class),
        @ColumnResult(name = "p26", type = String.class),
        @ColumnResult(name = "p27", type = String.class),
        @ColumnResult(name = "p31", type = String.class),
        @ColumnResult(name = "p36", type = String.class),
        @ColumnResult(name = "p37", type = String.class),
        @ColumnResult(name = "p41", type = String.class),
        @ColumnResult(name = "p46", type = String.class),
        @ColumnResult(name = "p47", type = String.class),
        @ColumnResult(name = "p55", type = String.class),
        @ColumnResult(name = "p65", type = String.class),
        @ColumnResult(name = "p71", type = String.class),
        @ColumnResult(name = "p75", type = String.class),
        @ColumnResult(name = "p85", type = String.class),
        @ColumnResult(name = "placa1", type = Integer.class),
        @ColumnResult(name = "placa2", type = Integer.class),
        @ColumnResult(name = "placa3", type = Integer.class),
        @ColumnResult(name = "placa4", type = Integer.class),
        @ColumnResult(name = "placa5", type = Integer.class),
        @ColumnResult(name = "placa6", type = Integer.class),
        @ColumnResult(name = "severa", type = String.class),
        @ColumnResult(name = "severaf", type = String.class),
        @ColumnResult(name = "totalg1", type = Integer.class),
        @ColumnResult(name = "totalp1", type = Integer.class),
        @ColumnResult(name = "totalc2", type = Integer.class),
        @ColumnResult(name = "p51", type = String.class),
        @ColumnResult(name = "d", type = Integer.class),
        @ColumnResult(name = "c", type = Integer.class),
        @ColumnResult(name = "p", type = Integer.class),
        @ColumnResult(name = "o", type = Integer.class),
        @ColumnResult(name = "totald", type = Integer.class),
        @ColumnResult(name = "d1", type = Integer.class),
        @ColumnResult(name = "c1", type = Integer.class),
        @ColumnResult(name = "p1", type = Integer.class),
        @ColumnResult(name = "o1", type = Integer.class),
        @ColumnResult(name = "totald1", type = Integer.class),
        @ColumnResult(name = "biometrica", type = Boolean.class),
        @ColumnResult(name = "otrosp", type = Boolean.class),
        @ColumnResult(name = "quimicas", type = String.class),
        @ColumnResult(name = "descripcionp", type = String.class),
        @ColumnResult(name = "rayosx", type = Boolean.class),
        @ColumnResult(name = "cie1", type = String.class),
        @ColumnResult(name = "cie2", type = String.class),
        @ColumnResult(name = "def", type = String.class),
        @ColumnResult(name = "def1", type = String.class),
        @ColumnResult(name = "descripcion1", type = String.class),
        @ColumnResult(name = "descripcion2", type = String.class),
        @ColumnResult(name = "fechaa", type = Date.class),
        @ColumnResult(name = "fechac", type = Date.class),
        @ColumnResult(name = "pre1", type = String.class),
        @ColumnResult(name = "pre2", type = String.class),
        @ColumnResult(name = "profesional", type = String.class),})
})
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
