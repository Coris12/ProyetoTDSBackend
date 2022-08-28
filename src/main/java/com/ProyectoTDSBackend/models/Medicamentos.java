/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.security.models.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.sql.Time;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "medicamentos")
public class Medicamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medicamento", nullable = false)
    private Long idMedicamentos;

    @Column(name = "nombre_medicamento", nullable = false)
    private String nombreMedicamento;

    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "hora")
    private String hora;

    @Column(name = "ini_responsable", nullable = false)
    private String inicialesRespon;

    @Column(name = "abreviatura")
    private String abreviaturaFun;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ID_USUARIO", foreignKey = @ForeignKey(name = "FK_MEDICA_ID"))
    private Usuario usuario;
     
    @JsonIgnore
    @OneToMany(mappedBy = "medicamento", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Evolucion> evolucion;
    
  
    public Medicamentos() {
    }

    public Medicamentos(Long idMedicamentos, String nombreMedicamento, Date fecha, String hora, String inicialesRespon, String abreviaturaFun, Usuario usuario) {
        this.idMedicamentos = idMedicamentos;
        this.nombreMedicamento = nombreMedicamento;
        this.fecha = fecha;
        this.hora = hora;
        this.inicialesRespon = inicialesRespon;
        this.abreviaturaFun = abreviaturaFun;
        this.usuario = usuario;
    }

    public Long getIdMedicamentos() {
        return idMedicamentos;
    }

    public void setIdMedicamentos(Long idMedicamentos) {
        this.idMedicamentos = idMedicamentos;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
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

    public String getInicialesRespon() {
        return inicialesRespon;
    }

    public void setInicialesRespon(String inicialesRespon) {
        this.inicialesRespon = inicialesRespon;
    }

    public String getAbreviaturaFun() {
        return abreviaturaFun;
    }

    public void setAbreviaturaFun(String abreviaturaFun) {
        this.abreviaturaFun = abreviaturaFun;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
