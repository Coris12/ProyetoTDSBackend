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
@Table(name="tecnicas")
public class Tecnicas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tec", nullable = false)
    private Long idTecnica;
    
    @Column(name = "general", length = 1)
    private String general;
    
    @Column(name = "abierto", length = 1)
    private String abierto;
    
    @Column(name = "cerrado", length = 1)
    private String cerrado;
    
    @Column(name = "semiCerrado", length = 1)
    private String semiCerrado;
    
    @Column(name = "cir", length = 1)
    private String cir;
    
    @Column(name = "vaiven", length = 1)
    private String vaiven;
    
    @Column(name = "mascara", length = 1)
    private String mascara;
    
    @Column(name = "oral", length = 1)
    private String oral;
    
    @Column(name = "nasal", length = 1)
    private String nasal;
    
    @Column(name = "rap", length = 1)
    private String rap;
    
    @Column(name = "i", length = 1)
    private String i;
    
    @Column(name = "tubo")
    private String tubo;
    
    @Column(name = "simple", length = 1)
    private String simple;
    
    @Column(name = "manguito", length = 1)
    private String manguito;
    
    @Column(name = "taponamiento", length = 1)
    private String tapo;
    
    @Column(name = "topica", length = 1)
    private String topica;
    
    @Column(name = "continuaA", length = 1)
    private String continuaA;
    
    @Column(name = "conductiva", length = 1)
    private String conductiva;
    
    @Column(name = "apsepsia", length = 1)
    private String apsepsia;
    
    @Column(name = "habon", length = 1)
    private String habon;
    
    @Column(name = "raquidea", length = 1)
    private String raquidea;
    
    @Column(name = "espidural", length = 1)
    private String espidural;
    
    @Column(name = "continua", length = 1)
    private String continua;
    
    @Column(name = "media", length = 1)
    private String media;
    
    @Column(name = "puncionLat", length = 1)
    private String lat;
    
    @Column(name = "nivel")
    private String nivel;
    
    @Column(name = "hiperbara", length = 1)
    private String hiperbara;
    
    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_anes", foreignKey = @ForeignKey(name = "fk_anes_id"))
    private Anestesia anestesia;

    public Tecnicas() {
    }

    public Tecnicas(Long idTecnica, String general, String abierto, String cerrado, String semiCerrado, String cir, String vaiven, String mascara, String oral, String nasal, String rap, String i, String tubo, String simple, String manguito, String tapo, String topica, String continuaA, String conductiva, String apsepsia, String habon, String raquidea, String espidural, String continua, String media, String lat, String nivel, String hiperbara, Anestesia anestesia) {
        this.idTecnica = idTecnica;
        this.general = general;
        this.abierto = abierto;
        this.cerrado = cerrado;
        this.semiCerrado = semiCerrado;
        this.cir = cir;
        this.vaiven = vaiven;
        this.mascara = mascara;
        this.oral = oral;
        this.nasal = nasal;
        this.rap = rap;
        this.i = i;
        this.tubo = tubo;
        this.simple = simple;
        this.manguito = manguito;
        this.tapo = tapo;
        this.topica = topica;
        this.continuaA = continuaA;
        this.conductiva = conductiva;
        this.apsepsia = apsepsia;
        this.habon = habon;
        this.raquidea = raquidea;
        this.espidural = espidural;
        this.continua = continua;
        this.media = media;
        this.lat = lat;
        this.nivel = nivel;
        this.hiperbara = hiperbara;
        this.anestesia = anestesia;
    }




    public Long getIdTecnica() {
        return idTecnica;
    }

    public void setIdTecnica(Long idTecnica) {
        this.idTecnica = idTecnica;
    }

    public String getGeneral() {
        return general;
    }

    public void setGeneral(String general) {
        this.general = general;
    }

    public String getAbierto() {
        return abierto;
    }

    public void setAbierto(String abierto) {
        this.abierto = abierto;
    }

    public String getCerrado() {
        return cerrado;
    }

    public void setCerrado(String cerrado) {
        this.cerrado = cerrado;
    }

    public String getSemiCerrado() {
        return semiCerrado;
    }

    public void setSemiCerrado(String semiCerrado) {
        this.semiCerrado = semiCerrado;
    }

    public String getCir() {
        return cir;
    }

    public void setCir(String cir) {
        this.cir = cir;
    }

    public String getVaiven() {
        return vaiven;
    }

    public void setVaiven(String vaiven) {
        this.vaiven = vaiven;
    }

    public String getMascara() {
        return mascara;
    }

    public void setMascara(String mascara) {
        this.mascara = mascara;
    }

    public String getOral() {
        return oral;
    }

    public void setOral(String oral) {
        this.oral = oral;
    }

    public String getNasal() {
        return nasal;
    }

    public void setNasal(String nasal) {
        this.nasal = nasal;
    }

    public String getRap() {
        return rap;
    }

    public void setRap(String rap) {
        this.rap = rap;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getTubo() {
        return tubo;
    }

    public void setTubo(String tubo) {
        this.tubo = tubo;
    }

    public String getManguito() {
        return manguito;
    }

    public void setManguito(String manguito) {
        this.manguito = manguito;
    }

    public String getTapo() {
        return tapo;
    }

    public void setTapo(String tapo) {
        this.tapo = tapo;
    }

    public String getTopica() {
        return topica;
    }

    public void setTopica(String topica) {
        this.topica = topica;
    }

    public String getContinuaA() {
        return continuaA;
    }

    public void setContinuaA(String continuaA) {
        this.continuaA = continuaA;
    }

    public String getConductiva() {
        return conductiva;
    }

    public void setConductiva(String conductiva) {
        this.conductiva = conductiva;
    }

    public String getApsepsia() {
        return apsepsia;
    }

    public void setApsepsia(String apsepsia) {
        this.apsepsia = apsepsia;
    }

    public String getHabon() {
        return habon;
    }

    public void setHabon(String habon) {
        this.habon = habon;
    }

    public String getRaquidea() {
        return raquidea;
    }

    public void setRaquidea(String raquidea) {
        this.raquidea = raquidea;
    }

    public String getEspidural() {
        return espidural;
    }

    public void setEspidural(String espidural) {
        this.espidural = espidural;
    }

    public String getContinua() {
        return continua;
    }

    public void setContinua(String continua) {
        this.continua = continua;
    }

    public Anestesia getAnestesia() {
        return anestesia;
    }

    public void setAnestesia(Anestesia anestesia) {
        this.anestesia = anestesia;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getHiperbara() {
        return hiperbara;
    }

    public void setHiperbara(String hiperbara) {
        this.hiperbara = hiperbara;
    }

    public String getSimple() {
        return simple;
    }

    public void setSimple(String simple) {
        this.simple = simple;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }
    
    
}

