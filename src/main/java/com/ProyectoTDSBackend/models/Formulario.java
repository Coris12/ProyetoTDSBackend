/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.dto.FormularioDto;
import com.ProyectoTDSBackend.dto.MedicamentoDTO;
import com.ProyectoTDSBackend.security.models.Usuario;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
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
    private int idFormulario;

    @Column(name = "cuadro_clinico")
    private String cuadro_clinico;

    @Column(name = "hallazgos")
    private String hallazgos;

    @Column(name = "diagnostico")
    private String diagnostico;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "id_datos")
    private DatosInstitucionales datos;

    @OneToOne
    @JoinColumn(name = "id_refiere")
    private RefiereDeriva refiere;

    public Formulario() {
    }

    public Formulario(int idFormulario, String cuadro_clinico, String hallazgos, String diagnostico, Usuario usuario, DatosInstitucionales datos, RefiereDeriva refiere) {
        this.idFormulario = idFormulario;
        this.cuadro_clinico = cuadro_clinico;
        this.hallazgos = hallazgos;
        this.diagnostico = diagnostico;
        this.usuario = usuario;
        this.datos = datos;
        this.refiere = refiere;
    }

    public int getIdFormulario() {
        return idFormulario;
    }

    public String getCuadro_clinico() {
        return cuadro_clinico;
    }

    public String getHallazgos() {
        return hallazgos;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }

    public void setCuadro_clinico(String cuadro_clinico) {
        this.cuadro_clinico = cuadro_clinico;
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

    public DatosInstitucionales getDatos() {
        return datos;
    }

    public void setDatos(DatosInstitucionales datos) {
        this.datos = datos;
    }

    public RefiereDeriva getRefiere() {
        return refiere;
    }

    public void setRefiere(RefiereDeriva refiere) {
        this.refiere = refiere;
    }

}
