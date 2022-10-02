/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.security.models.Usuario;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "historia_clinica")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historia", nullable = false)
    private Long idHistoria;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "num_cli", nullable = false)
    private int numCl;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "procedencia", nullable = false)
    private String procedencia;

    @Column(name = "residencia", nullable = false)
    private String residencia;

    @Column(name = "estado_civil", nullable = false)
    private String estadoCivil;

    @Column(name = "religion", nullable = false)
    private String religion;

    @Column(name = "motivo", nullable = false)
    private String motivo;

    @Column(name = "enfermedad", nullable = false)
    private String enfermedad;

    @Column(name = "alergia", nullable = false)
    private String alergia;

    @Column(name = "app", nullable = false)
    private String app;

    @Column(name = "apf", nullable = false)
    private String apf;

    @Column(name = "tipo_sangre", nullable = false)
    private String tipoSangre;

    @Column(name = "habitos", nullable = false)
    private String habitos;

    @Column(name = "ta", nullable = false)
    private String ta;

    @Column(name = "fc", nullable = false)
    private String fc;

    @Column(name = "spo2", nullable = false)
    private String spo2;

    @Column(name = "fr", nullable = false)
    private String fr;

    @Column(name = "examen", nullable = false)
    private String examen;

    @Column(name = "realizado", nullable = false)
    private String realizado;

    @Column(name = "dr", nullable = false)
    private String dr;

    @Column(name = "t", nullable = false)
    private int tem;
    
     @Column(name = "dx", nullable = false)
    private String dx;

    @Column(name = "estado", nullable = false)
    private int estado;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Usuario usuario;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Long idHistoria, Date fecha, int numCl, int edad, String procedencia, String residencia, String estadoCivil, String religion, String motivo, String enfermedad, String alergia, String app, String apf, String tipoSangre, String habitos, String ta, String fc, String spo2, String fr, String examen, String realizado, String dr, int tem, String dx, int estado, Usuario usuario) {
        this.idHistoria = idHistoria;
        this.fecha = fecha;
        this.numCl = numCl;
        this.edad = edad;
        this.procedencia = procedencia;
        this.residencia = residencia;
        this.estadoCivil = estadoCivil;
        this.religion = religion;
        this.motivo = motivo;
        this.enfermedad = enfermedad;
        this.alergia = alergia;
        this.app = app;
        this.apf = apf;
        this.tipoSangre = tipoSangre;
        this.habitos = habitos;
        this.ta = ta;
        this.fc = fc;
        this.spo2 = spo2;
        this.fr = fr;
        this.examen = examen;
        this.realizado = realizado;
        this.dr = dr;
        this.tem = tem;
        this.dx = dx;
        this.estado = estado;
        this.usuario = usuario;
    }


   

    public Long getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(Long idHistoria) {
        this.idHistoria = idHistoria;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumCl() {
        return numCl;
    }

    public void setNumCl(int numCl) {
        this.numCl = numCl;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
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

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApf() {
        return apf;
    }

    public void setApf(String apf) {
        this.apf = apf;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getTa() {
        return ta;
    }

    public void setTa(String ta) {
        this.ta = ta;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getSpo2() {
        return spo2;
    }

    public void setSpo2(String spo2) {
        this.spo2 = spo2;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public int getTem() {
        return tem;
    }

    public void setTem(int tem) {
        this.tem = tem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public String getRealizado() {
        return realizado;
    }

    public void setRealizado(String realizado) {
        this.realizado = realizado;
    }

    public String getDr() {
        return dr;
    }

    public void setDr(String dr) {
        this.dr = dr;
    }

    public String getDx() {
        return dx;
    }

    public void setDx(String dx) {
        this.dx = dx;
    }

    
}
