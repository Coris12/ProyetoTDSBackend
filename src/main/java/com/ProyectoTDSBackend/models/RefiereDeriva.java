/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity
@Table(name = "refiere_deriva")
public class RefiereDeriva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_refiere", nullable = false)
    private Long idRefiere;

    @Column(name = "entidad_sistema", nullable = false)
    private String entidadSistema;

    @Column(name = "establecimiento_referido", nullable = false)
    private String establecimientoRefer;

    @Column(name = "servicio_referido", nullable = false)
    private String servicioReferido;

    @Column(name = "especiali_referido", nullable = false)
    private String especialidadReferido;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_formulario", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Formulario formulario;

    public RefiereDeriva() {
    }

    public RefiereDeriva(Long idRefiere, String entidadSistema, String establecimientoRefer, String servicioReferido, String especialidadReferido, Date fecha, Formulario formulario) {
        this.idRefiere = idRefiere;
        this.entidadSistema = entidadSistema;
        this.establecimientoRefer = establecimientoRefer;
        this.servicioReferido = servicioReferido;
        this.especialidadReferido = especialidadReferido;
        this.fecha = fecha;
        this.formulario = formulario;
    }

    public Long getIdRefiere() {
        return idRefiere;
    }

    public void setIdRefiere(Long idRefiere) {
        this.idRefiere = idRefiere;
    }

    public String getEntidadSistema() {
        return entidadSistema;
    }

    public void setEntidadSistema(String entidadSistema) {
        this.entidadSistema = entidadSistema;
    }

    public String getEstablecimientoRefer() {
        return establecimientoRefer;
    }

    public void setEstablecimientoRefer(String establecimientoRefer) {
        this.establecimientoRefer = establecimientoRefer;
    }

    public String getServicioReferido() {
        return servicioReferido;
    }

    public void setServicioReferido(String servicioReferido) {
        this.servicioReferido = servicioReferido;
    }

    public String getEspecialidadReferido() {
        return especialidadReferido;
    }

    public void setEspecialidadReferido(String especialidadReferido) {
        this.especialidadReferido = especialidadReferido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

}
