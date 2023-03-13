/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.dto.FormularioDto;
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
import javax.persistence.OneToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@NamedNativeQueries({
    @NamedNativeQuery(name = "Formulario.getFormularioById", query = "", resultSetMapping = "getFormularioById")
})
@SqlResultSetMapping(name = "getFormularioById", classes = {
    @ConstructorResult(targetClass = FormularioDto.class, columns = {
        @ColumnResult(name = "nombres", type = String.class),
        @ColumnResult(name = "direccion", type = String.class),
        @ColumnResult(name = "celular", type = String.class),
        @ColumnResult(name = "cuadro_clinico", type = String.class),
        @ColumnResult(name = "diagnostico", type = String.class),
        @ColumnResult(name = "hallazgos", type = String.class),
        @ColumnResult(name = "districto", type = String.class),
        @ColumnResult(name = "area", type = String.class),
        @ColumnResult(name = "entidad", type = String.class),
        @ColumnResult(name = "establecimiento", type = String.class),
        @ColumnResult(name = "hist_clin_num", type = String.class),
        @ColumnResult(name = "tipo", type = String.class),
        @ColumnResult(name = "entidad_sistema", type = String.class),
        @ColumnResult(name = "especiali_referido", type = String.class),
        @ColumnResult(name = "establecimiento_referido", type = String.class),
        @ColumnResult(name = "fecha", type = Date.class),
        @ColumnResult(name = "servicio_referido", type = String.class),
        @ColumnResult(name = "anio", type = String.class),
        @ColumnResult(name = "dia", type = String.class),
        @ColumnResult(name = "mes", type = String.class),
        @ColumnResult(name = "especilaidad", type = String.class),
        @ColumnResult(name = "servicio", type = String.class),
        @ColumnResult(name = "provincia", type = Boolean.class),
        @ColumnResult(name = "nacionalidad", type = String.class),
        @ColumnResult(name = "pais", type = String.class),
        @ColumnResult(name = "parroquia", type = String.class),
        @ColumnResult(name = "caton", type = String.class),
        @ColumnResult(name = "otro", type = String.class),
        @ColumnResult(name = "idFormulario", type = String.class)

    })
})

@Entity
@Table(name = "formulario")
public class Formulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_formulario", nullable = false)
    private Long idFormulario;

    @Column(name = "cuadro_clinico")
    private String cuadroClinico;

    @Column(name = "hallazgos")
    private String hallazgos;

    @Column(name = "diagnostico")
    private String diagnostico;

    @Column(name = "diagnostic")
    private String diagnostico2;

    @Column(name = "referencia", length = 1)
    private String referencia;

    @Column(name = "derivacion", length = 1)
    private String derivacion;

    @Column(name = "contrarefrencia", length = 1)
    private String contra;

    @Column(name = "inversa", length = 1)
    private String inversa;

    @Column(name = "cie")
    private String cie1;

    @Column(name = "cie2")
    private String cie2;

    @Column(name = "dato", length = 3)
    private String dato;

    @Column(name = "dato2", length = 3)
    private String dato2;
    @JsonIgnore
    @OneToMany(mappedBy = "formulario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DatosInstitucionales> datos;

    @JsonIgnore
    @OneToMany(mappedBy = "formulario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<RefiereDeriva> refiere;

     @JsonIgnore
    @OneToMany(mappedBy = "formulario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Inversa> inver;
     
     @JsonIgnore
    @OneToMany(mappedBy = "formulario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Contrareferencia> refe;
     
    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_autoriza_id"))
    private Usuario usuario;

    public Formulario() {
    }

    public Formulario(Long idFormulario, String cuadroClinico, String hallazgos, String diagnostico, String diagnostico2, String referencia, String derivacion, String contra, String inversa, String cie1, String cie2, String dato, String dato2, List<DatosInstitucionales> datos, List<RefiereDeriva> refiere, List<Inversa> inver, List<Contrareferencia> refe, Usuario usuario) {
        this.idFormulario = idFormulario;
        this.cuadroClinico = cuadroClinico;
        this.hallazgos = hallazgos;
        this.diagnostico = diagnostico;
        this.diagnostico2 = diagnostico2;
        this.referencia = referencia;
        this.derivacion = derivacion;
        this.contra = contra;
        this.inversa = inversa;
        this.cie1 = cie1;
        this.cie2 = cie2;
        this.dato = dato;
        this.dato2 = dato2;
        this.datos = datos;
        this.refiere = refiere;
        this.inver = inver;
        this.refe = refe;
        this.usuario = usuario;
    }

    

    public Long getIdFormulario() {
        return idFormulario;
    }

    public String getCuadroClinico() {
        return cuadroClinico;
    }

    public String getHallazgos() {
        return hallazgos;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setIdFormulario(long idFormulario) {
        this.idFormulario = idFormulario;
    }

    public void setCuadroClinico(String cuadroClinico) {
        this.cuadroClinico = cuadroClinico;
    }

    public void setHallazgos(String hallazgos) {
        this.hallazgos = hallazgos;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<RefiereDeriva> getRefiere() {
        return refiere;
    }

    public void setRefiere(List<RefiereDeriva> refiere) {
        this.refiere = refiere;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDerivacion() {
        return derivacion;
    }

    public void setDerivacion(String derivacion) {
        this.derivacion = derivacion;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getInversa() {
        return inversa;
    }

    public void setInversa(String inversa) {
        this.inversa = inversa;
    }

    public String getCie1() {
        return cie1;
    }

    public void setCie1(String cie1) {
        this.cie1 = cie1;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public List<DatosInstitucionales> getDatos() {
        return datos;
    }

    public void setDatos(List<DatosInstitucionales> datos) {
        this.datos = datos;
    }

    public String getDiagnostico2() {
        return diagnostico2;
    }

    public void setDiagnostico2(String diagnostico2) {
        this.diagnostico2 = diagnostico2;
    }

    public String getCie2() {
        return cie2;
    }

    public void setCie2(String cie2) {
        this.cie2 = cie2;
    }

    public String getDato2() {
        return dato2;
    }

    public void setDato2(String dato2) {
        this.dato2 = dato2;
    }

    public List<Inversa> getInver() {
        return inver;
    }

    public void setInver(List<Inversa> inver) {
        this.inver = inver;
    }

    public List<Contrareferencia> getRefe() {
        return refe;
    }

    public void setRefe(List<Contrareferencia> refe) {
        this.refe = refe;
    }

    
}
