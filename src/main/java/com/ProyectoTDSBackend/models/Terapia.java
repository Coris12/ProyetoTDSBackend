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
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "terapia")
public class Terapia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tera", nullable = false)
    private Long idTera;

    @Column(name = "digitalicos")
    private String digitalicos;

    @Column(name = "esteroides")
    private String esteroides;

    @Column(name = "tranquilizantes")
    private String tran;

    @Column(name = "hipotensores")
    private String hipo;

    @Column(name = "otrosT")
    private String otrosT;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "hora")
    private String hora;

    @Column(name = "insuficiente", length = 1)
    private String insu;

    @Column(name = "bueno", length = 1)
    private String bueno;

    @Column(name = "deprimido", length = 1)
    private String depri;

    @Column(name = "elaborado")
    private String elaborado;

    @Column(name = "recordatorio")
    private String recordatorio;

    @Column(name = "medicamento")
    private String medicamento;
    
    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_anes", foreignKey = @ForeignKey(name = "fk_anes_id"))
    private Anestesia anestesia;

    public Terapia() {
    }

    public Terapia(Long idTera, String digitalicos, String esteroides, String tran, String hipo, String otrosT, Date fecha, String hora, String insu, String bueno, String depri, String elaborado, String recordatorio, String medicamento, Anestesia anestesia) {
        this.idTera = idTera;
        this.digitalicos = digitalicos;
        this.esteroides = esteroides;
        this.tran = tran;
        this.hipo = hipo;
        this.otrosT = otrosT;
        this.fecha = fecha;
        this.hora = hora;
        this.insu = insu;
        this.bueno = bueno;
        this.depri = depri;
        this.elaborado = elaborado;
        this.recordatorio = recordatorio;
        this.medicamento = medicamento;
        this.anestesia = anestesia;
    }


    public Long getIdTera() {
        return idTera;
    }

    public void setIdTera(Long idTera) {
        this.idTera = idTera;
    }

    public String getDigitalicos() {
        return digitalicos;
    }

    public void setDigitalicos(String digitalicos) {
        this.digitalicos = digitalicos;
    }

    public String getEsteroides() {
        return esteroides;
    }

    public void setEsteroides(String esteroides) {
        this.esteroides = esteroides;
    }

    public String getTran() {
        return tran;
    }

    public void setTran(String tran) {
        this.tran = tran;
    }

    public String getHipo() {
        return hipo;
    }

    public void setHipo(String hipo) {
        this.hipo = hipo;
    }

    public String getOtrosT() {
        return otrosT;
    }

    public void setOtrosT(String otrosT) {
        this.otrosT = otrosT;
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

    public String getInsu() {
        return insu;
    }

    public void setInsu(String insu) {
        this.insu = insu;
    }

    public String getBueno() {
        return bueno;
    }

    public void setBueno(String bueno) {
        this.bueno = bueno;
    }

    public String getDepri() {
        return depri;
    }

    public void setDepri(String depri) {
        this.depri = depri;
    }

    public String getElaborado() {
        return elaborado;
    }

    public void setElaborado(String elaborado) {
        this.elaborado = elaborado;
    }

    public String getRecordatorio() {
        return recordatorio;
    }

    public void setRecordatorio(String recordatorio) {
        this.recordatorio = recordatorio;
    }

    public Anestesia getAnestesia() {
        return anestesia;
    }

    public void setAnestesia(Anestesia anestesia) {
        this.anestesia = anestesia;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

}
