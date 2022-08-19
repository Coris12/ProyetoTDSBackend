package com.ProyectoTDSBackend.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "ANTEC_FAMILIARES")
public class AntecFamiliares {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ANTEC_FAMILIARES", nullable = false)
    private Long idAntecFamiliares;

    @Column(name = "CARDIOPATIA")
    private boolean cardiopatia;

    @Column(name = "DIABETES" )
    private boolean diabetes;

    @Column(name = "ENF_CARDIOVASCULARES" )
    private boolean enfCardiovasculares;

    @Column(name = "HIPERTENSION" )
    private boolean hipertension;

    @Column(name = "CANCER" )
    private boolean cancer;

    @Column(name = "TUBERCULOSIS")
    private boolean tuberculosis;

    @Column(name = "ENF_MENTALES")
    private boolean enfMentales;

    @Column(name = "ENF_INFECCIOSAS" )
    private boolean enfInfecciosas;

    @Column(name = "MALFORMACIONES" )
    private boolean malformaciones;

    @Column(name = "OTROS")
    private boolean otros;

    @Column(name = "FAMILIARES", length = 500)
    private String familiares;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "ID_CONSEXTERNA", foreignKey = @ForeignKey(name = "FK_ANTEC_FAMILIARES_ID"))
    private ConsultaExterna consultaExterna;

    public AntecFamiliares() {
    }

    public AntecFamiliares(Long idAntecFamiliares, boolean cardiopatia, boolean diabetes, boolean enfCardiovasculares,
            boolean hipertension, boolean cancer, boolean tuberculosis, boolean enfMentales, boolean enfInfecciosas,
            boolean malformaciones, boolean otros, String familiares, ConsultaExterna consultaExterna) {
        this.idAntecFamiliares = idAntecFamiliares;
        this.cardiopatia = cardiopatia;
        this.diabetes = diabetes;
        this.enfCardiovasculares = enfCardiovasculares;
        this.hipertension = hipertension;
        this.cancer = cancer;
        this.tuberculosis = tuberculosis;
        this.enfMentales = enfMentales;
        this.enfInfecciosas = enfInfecciosas;
        this.malformaciones = malformaciones;
        this.otros = otros;
        this.familiares = familiares;
        this.consultaExterna = consultaExterna;
    }

    public Long getIdAntecFamiliares() {
        return idAntecFamiliares;
    }

    public void setIdAntecFamiliares(Long idAntecFamiliares) {
        this.idAntecFamiliares = idAntecFamiliares;
    }

    public boolean isCardiopatia() {
        return cardiopatia;
    }

    public void setCardiopatia(boolean cardiopatia) {
        this.cardiopatia = cardiopatia;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isEnfCardiovasculares() {
        return enfCardiovasculares;
    }

    public void setEnfCardiovasculares(boolean enfCardiovasculares) {
        this.enfCardiovasculares = enfCardiovasculares;
    }

    public boolean isHipertension() {
        return hipertension;
    }

    public void setHipertension(boolean hipertension) {
        this.hipertension = hipertension;
    }

    public boolean isCancer() {
        return cancer;
    }

    public void setCancer(boolean cancer) {
        this.cancer = cancer;
    }

    public boolean isTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(boolean tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public boolean isEnfMentales() {
        return enfMentales;
    }

    public void setEnfMentales(boolean enfMentales) {
        this.enfMentales = enfMentales;
    }

    public boolean isEnfInfecciosas() {
        return enfInfecciosas;
    }

    public void setEnfInfecciosas(boolean enfInfecciosas) {
        this.enfInfecciosas = enfInfecciosas;
    }

    public boolean isMalformaciones() {
        return malformaciones;
    }

    public void setMalformaciones(boolean malformaciones) {
        this.malformaciones = malformaciones;
    }

    public boolean isOtros() {
        return otros;
    }

    public void setOtros(boolean otros) {
        this.otros = otros;
    }

    public String getFamiliares() {
        return familiares;
    }

    public void setFamiliares(String familiares) {
        this.familiares = familiares;
    }

    public ConsultaExterna getConsultaExterna() {
        return consultaExterna;
    }

    public void setConsultaExterna(ConsultaExterna consultaExterna) {
        this.consultaExterna = consultaExterna;
    }

}
