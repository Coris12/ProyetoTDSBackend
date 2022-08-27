/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.security.models.Usuario;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
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
