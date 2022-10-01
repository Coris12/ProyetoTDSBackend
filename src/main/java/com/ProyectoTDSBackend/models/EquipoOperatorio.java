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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "equipos")
public class EquipoOperatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Equipo", nullable = false)
    private Long idEquipo;

    @Column(name = "cirujano", nullable = false)
    private String cirujano;

    @Column(name = "primer_ayudante", nullable = false)
    private String primerAyudante;

    @Column(name = "segundo_ayudante", nullable = false)
    private String segundoAyudante;

    @Column(name = "tercer_ayudante", nullable = false)
    private String tercerAyudante;

    @Column(name = "instrumentista", nullable = false)
    private String instrumentista;

    @Column(name = "anestesiologo", nullable = false)
    private String anestesiologo;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "hora_inicio", nullable = false)
    private String horaInicio;

    @Column(name = "hora_fin", nullable = false)
    private String horaFin;
    
     @Column(name = "tipo_anestesia", nullable = false)
    private String tipoAnestesia;
     
     @ManyToOne()
     @JoinColumn(name = "id_protocolo")
     private Protocolos protocolo;

    public EquipoOperatorio() {
    }

    public EquipoOperatorio(Long idEquipo, String cirujano, String primerAyudante, String segundoAyudante, String tercerAyudante, String instrumentista, String anestesiologo, Date fecha, String horaInicio, String horaFin, String tipoAnestesia, Protocolos protocolo) {
        this.idEquipo = idEquipo;
        this.cirujano = cirujano;
        this.primerAyudante = primerAyudante;
        this.segundoAyudante = segundoAyudante;
        this.tercerAyudante = tercerAyudante;
        this.instrumentista = instrumentista;
        this.anestesiologo = anestesiologo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.tipoAnestesia = tipoAnestesia;
        this.protocolo = protocolo;
    }

    public Long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getCirujano() {
        return cirujano;
    }

    public void setCirujano(String cirujano) {
        this.cirujano = cirujano;
    }

    public String getPrimerAyudante() {
        return primerAyudante;
    }

    public void setPrimerAyudante(String primerAyudante) {
        this.primerAyudante = primerAyudante;
    }

    public String getSegundoAyudante() {
        return segundoAyudante;
    }

    public void setSegundoAyudante(String segundoAyudante) {
        this.segundoAyudante = segundoAyudante;
    }

    public String getTercerAyudante() {
        return tercerAyudante;
    }

    public void setTercerAyudante(String tercerAyudante) {
        this.tercerAyudante = tercerAyudante;
    }

    public String getInstrumentista() {
        return instrumentista;
    }

    public void setInstrumentista(String instrumentista) {
        this.instrumentista = instrumentista;
    }

    public String getAnestesiologo() {
        return anestesiologo;
    }

    public void setAnestesiologo(String anestesiologo) {
        this.anestesiologo = anestesiologo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getTipoAnestesia() {
        return tipoAnestesia;
    }

    public void setTipoAnestesia(String tipoAnestesia) {
        this.tipoAnestesia = tipoAnestesia;
    }

    public Protocolos getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(Protocolos protocolo) {
        this.protocolo = protocolo;
    }
     
     
     
}
