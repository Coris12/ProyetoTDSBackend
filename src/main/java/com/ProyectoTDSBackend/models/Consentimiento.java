package com.ProyectoTDSBackend.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;

import com.ProyectoTDSBackend.dto.ConsentimientoDto;
import com.ProyectoTDSBackend.dto.ConsentimientoListDto;
import com.ProyectoTDSBackend.dto.ConsentimientoTraDto;
import com.ProyectoTDSBackend.dto.ConsentimientoTratamientoDto;
import com.ProyectoTDSBackend.security.models.Usuario;

@NamedNativeQueries({
    @NamedNativeQuery(name = "Consentimiento.getAllDatosOnlyConsentimiento", query = "", resultSetMapping = "getAllDatosOnlyConsentimiento"),
    @NamedNativeQuery(name = "Consentimiento.listDataConsentimiento", query = "", resultSetMapping = "listDataConsentimiento"),
    @NamedNativeQuery(name = "Consentimiento.getAllDatosOnlyConsentimientoById", query = "", resultSetMapping = "getAllDatosOnlyConsentimientoById"),
    @NamedNativeQuery(name = "Consentimiento.generarPdfConsentimiento", query = "", resultSetMapping = "generarPdfConsentimiento")

})

@SqlResultSetMappings({
    @SqlResultSetMapping(name = "getAllDatosOnlyConsentimiento", classes = {
        @ConstructorResult(targetClass = ConsentimientoDto.class, columns = {
            @ColumnResult(name = "idConsentimiento", type = Integer.class),
            @ColumnResult(name = "cama", type = String.class),
            @ColumnResult(name = "canton", type = String.class),
            @ColumnResult(name = "codUd", type = String.class),
            @ColumnResult(name = "estado", type = Character.class),
            @ColumnResult(name = "fecha", type = Date.class),
            @ColumnResult(name = "institucionSistema", type = String.class),
            @ColumnResult(name = "numeroHistoriaClinica", type = Integer.class),
            @ColumnResult(name = "parroquia", type = String.class),
            @ColumnResult(name = "provincia", type = String.class),
            @ColumnResult(name = "sala", type = String.class),
            @ColumnResult(name = "servicio", type = String.class),
            @ColumnResult(name = "unidadOperativa", type = String.class),
            @ColumnResult(name = "idUsuario", type = Integer.class),})
    }),

    @SqlResultSetMapping(name = "listDataConsentimiento", classes = {
        @ConstructorResult(targetClass = ConsentimientoListDto.class, columns = {
            @ColumnResult(name = "idConsentimiento", type = Integer.class),
            @ColumnResult(name = "fecha", type = Date.class),
            @ColumnResult(name = "numHistCli", type = Integer.class),
            @ColumnResult(name = "usuarioId", type = Integer.class),
            @ColumnResult(name = "identificacion", type = String.class),
            @ColumnResult(name = "nombres", type = String.class),})
    }),

    @SqlResultSetMapping(name = "getAllDatosOnlyConsentimientoById", classes = {
        @ConstructorResult(targetClass = ConsentimientoDto.class, columns = {
            @ColumnResult(name = "idConsentimiento", type = Integer.class),
            @ColumnResult(name = "cama", type = String.class),
            @ColumnResult(name = "canton", type = String.class),
            @ColumnResult(name = "codUd", type = String.class),
            @ColumnResult(name = "estado", type = Character.class),
            @ColumnResult(name = "fecha", type = Date.class),
            @ColumnResult(name = "institucionSistema", type = String.class),
            @ColumnResult(name = "numeroHistoriaClinica", type = Integer.class),
            @ColumnResult(name = "parroquia", type = String.class),
            @ColumnResult(name = "provincia", type = String.class),
            @ColumnResult(name = "sala", type = String.class),
            @ColumnResult(name = "servicio", type = String.class),
            @ColumnResult(name = "unidadOperativa", type = String.class),
            @ColumnResult(name = "idUsuario", type = Integer.class),
            @ColumnResult(name = "nombres", type = String.class),
            @ColumnResult(name = "identificacion", type = String.class),})
    }),

    @SqlResultSetMapping(name = "generarPdfConsentimiento", classes = {
        @ConstructorResult(targetClass = ConsentimientoTraDto.class, columns = {
            @ColumnResult(name = "institucionsistema", type = String.class),
            @ColumnResult(name = "unidadoperativa", type = String.class),
            @ColumnResult(name = "codud", type = String.class),
            @ColumnResult(name = "canton", type = String.class),
            @ColumnResult(name = "parroquia", type = String.class),
            @ColumnResult(name = "provincia", type = String.class),
            @ColumnResult(name = "numerohistoriaclinica", type = Integer.class),
            @ColumnResult(name = "nombres", type = String.class),
            @ColumnResult(name = "sala", type = String.class),
            @ColumnResult(name = "servicio", type = String.class),
            @ColumnResult(name = "cama", type = String.class),
            @ColumnResult(name = "fecha", type = Date.class),
            @ColumnResult(name = "proposito", type = String.class),
            @ColumnResult(name = "procedimiento_propuesto", type = String.class),
            @ColumnResult(name = "resultado_esperado", type = String.class),
            @ColumnResult(name = "riesgo_complicaciones", type = String.class),
            @ColumnResult(name = "nombre_profesional_trat", type = String.class),
            @ColumnResult(name = "especialidad", type = String.class),
            @ColumnResult(name = "telefono", type = String.class),
            @ColumnResult(name = "codigo", type = Integer.class),})
    }),})

@Entity
@Table(name = "consentimientos")
public class Consentimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consentimiento", nullable = false)
    private Integer idConsentimiento;

    @Column(name = "institucion_sistema")
    private String instutucionSistema;

    @Column(name = "unidad_operativa")
    private String unidadOperativa;

    @Column(name = "cod_ud")
    private String codUd;

    @Column(name = "numero_historia_clinica")
    private Integer numeroHistoriaClinica;

    @Column(name = "idUsuario", unique = false)
    public Integer IdUsuario;

    @OneToMany(mappedBy = "consentimiento")
    private List<InformacionTratamiento> informacionTratamiento;

    @ManyToOne
    @JoinColumn(name = "idUsuario", insertable = false, updatable = false)
    private Usuario usuario;

    private String servicio;
    private String sala;
    private String cama;

    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
    private Date fecha;
    private String parroquia;
    private String canton;
    private String provincia;
    private Character estado;

    public Consentimiento() {
    }

    public List<InformacionTratamiento> getInformacionTratamiento() {
        return informacionTratamiento;
    }

    public void setInformacionTratamiento(List<InformacionTratamiento> informacionTratamiento) {
        this.informacionTratamiento = informacionTratamiento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public Integer getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(Integer numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
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

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        IdUsuario = idUsuario;
    }
}
