/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

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
@Table(name = "llegada")
public class LLegadaAd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_llegada", nullable = false)
    private Long idLlegada;

    @Column(name = "Ambulancia", length = 1)
    private String ambulancia;

    @Column(name = "Ambulatorio", length = 1)
    private String ambulat;

    @Column(name = "OtroT", length = 1)
    private String otro;
    
    @Column(name = "Hora")
    private String hora;

    @Column(name = "Trauma", length = 1)
    private String trauma;
    
    @Column(name = "CausaC", length = 1)
    private String causaC;
    
    @Column(name = "Obstetrica", length = 1)
    private String obstretica;
    
    @Column(name = "Quirurgica", length = 1)
    private String quirurgica;
    
    @Column(name = "policia", length = 1)
    private String policia;
    
    @Column(name = "motivo", length = 1)
    private String motivo;
    
    @Column(name = "Grupo")
    private String grupo;
    
    @Column (name="Descrip")
    private String desc;
    
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_dmision", foreignKey = @ForeignKey(name = "FK_LLEGADA_ID"))
    private Admision admision;

    public LLegadaAd() {
    }

    public LLegadaAd(Long idLlegada, String ambulancia, String ambulat, String otro, String hora, String trauma, String causaC, String obstretica, String quirurgica, String policia, String motivo, String grupo, String desc, Admision admision) {
        this.idLlegada = idLlegada;
        this.ambulancia = ambulancia;
        this.ambulat = ambulat;
        this.otro = otro;
        this.hora = hora;
        this.trauma = trauma;
        this.causaC = causaC;
        this.obstretica = obstretica;
        this.quirurgica = quirurgica;
        this.policia = policia;
        this.motivo = motivo;
        this.grupo = grupo;
        this.desc = desc;
        this.admision = admision;
    }

 

    public Long getIdLlegada() {
        return idLlegada;
    }

    public void setIdLlegada(Long idLlegada) {
        this.idLlegada = idLlegada;
    }

    public String getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(String ambulancia) {
        this.ambulancia = ambulancia;
    }

    public String getAmbulat() {
        return ambulat;
    }

    public void setAmbulat(String ambulat) {
        this.ambulat = ambulat;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTrauma() {
        return trauma;
    }

    public void setTrauma(String trauma) {
        this.trauma = trauma;
    }

    public String getCausaC() {
        return causaC;
    }

    public void setCausaC(String causaC) {
        this.causaC = causaC;
    }

    public String getObstretica() {
        return obstretica;
    }

    public void setObstretica(String obstretica) {
        this.obstretica = obstretica;
    }

    public String getQuirurgica() {
        return quirurgica;
    }

    public void setQuirurgica(String quirurgica) {
        this.quirurgica = quirurgica;
    }

    public String getPolicia() {
        return policia;
    }

    public void setPolicia(String policia) {
        this.policia = policia;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
