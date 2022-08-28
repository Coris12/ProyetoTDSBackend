/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.security.models.Usuario;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "evolucion_prescripcion")
public class Evolucion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evolucion", nullable = false)
    private Long idEvolucion;

    @Column(name = "indicaciones", nullable = false)
    private String indicaciones;

    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "hora")
    private String hora;

    @Column(name = "evolucion")
    private String evolucion;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_evoluc_id"))
    private Usuario usuario;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_medicamento", foreignKey = @ForeignKey(name = "fk_medi_id"))
    private Medicamentos medicamento;
    
    public Evolucion() {
    }

    public Evolucion(Long idEvolucion, String indicaciones, Date fecha, String hora, String evolucion, Usuario usuario, Medicamentos medicamento) {
        this.idEvolucion = idEvolucion;
        this.indicaciones = indicaciones;
        this.fecha = fecha;
        this.hora = hora;
        this.evolucion = evolucion;
        this.usuario = usuario;
        this.medicamento = medicamento;
    }

  

    public Long getIdEvolucion() {
        return idEvolucion;
    }

    public void setIdEvolucion(Long idEvolucion) {
        this.idEvolucion = idEvolucion;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(String evolucion) {
        this.evolucion = evolucion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Medicamentos getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamentos medicamento) {
        this.medicamento = medicamento;
    }
    
    

}
