/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.dto.EvolucionDTO;
import com.ProyectoTDSBackend.security.models.Usuario;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@NamedNativeQueries({
    @NamedNativeQuery(name = "Evolucion.generarPdfEvolucionPrescripcion", query = "", resultSetMapping = "generarPdfEvolucionPrescripcion")
})

@SqlResultSetMapping(name = "generarPdfEvolucionPrescripcion", classes = {
    @ConstructorResult(targetClass = EvolucionDTO.class, columns = {
        @ColumnResult(name = "evolucion", type = String.class),
        @ColumnResult(name = "fecha", type = Date.class),
        @ColumnResult(name = "hora", type = String.class),
        @ColumnResult(name = "indicaciones", type = String.class),
        @ColumnResult(name = "medicamento_ad", type = String.class),
        @ColumnResult(name = "nombres", type = String.class),
        @ColumnResult(name = "sexo", type = String.class),
        @ColumnResult(name = "establecimiento", type = String.class),})
})
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
    private Date fecha;

    @Column(name = "hora")
    private String hora;

    @Column(name = "evolucion")
    private String evolucion;

    @Column(name = "medicamento_ad")
    private String medicamentoAD;

    @Column(name = "establecimiento")
    private String establecimiento;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_evoluc_id"))
    private Usuario usuario;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_medicamento", foreignKey = @ForeignKey(name = "fk_medi_id"))
    private Medicamentos medicamento;

    public Evolucion() {
    }

    public Evolucion(Long idEvolucion, String indicaciones, Date fecha, String hora, String evolucion, String medicamentoAD, String establecimiento, Usuario usuario, Medicamentos medicamento) {
        this.idEvolucion = idEvolucion;
        this.indicaciones = indicaciones;
        this.fecha = fecha;
        this.hora = hora;
        this.evolucion = evolucion;
        this.medicamentoAD = medicamentoAD;
        this.establecimiento = establecimiento;
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

    public String getMedicamentoAD() {
        return medicamentoAD;
    }

    public void setMedicamentoAD(String medicamentoAD) {
        this.medicamentoAD = medicamentoAD;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

}
