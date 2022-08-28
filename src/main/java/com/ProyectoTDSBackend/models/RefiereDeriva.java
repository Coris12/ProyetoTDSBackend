/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import java.util.Date;
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
@Table(name = "refiere_deriva")
public class RefiereDeriva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_refiere", nullable = false)
    private int idRefiere;

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

    @OneToOne
    @JoinColumn(name = "id_motivo")
    private Motivos motivo;

    public RefiereDeriva() {
    }

    public RefiereDeriva(int idRefiere, String entidadSistema, String establecimientoRefer, String servicioReferido, String especialidadReferido, Date fecha, Motivos motivo) {
        this.idRefiere = idRefiere;
        this.entidadSistema = entidadSistema;
        this.establecimientoRefer = establecimientoRefer;
        this.servicioReferido = servicioReferido;
        this.especialidadReferido = especialidadReferido;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    
    public int getIdRefiere() {
        return idRefiere;
    }

    public void setIdRefiere(int idRefiere) {
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

    public Motivos getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivos motivo) {
        this.motivo = motivo;
    }
    
    

}
