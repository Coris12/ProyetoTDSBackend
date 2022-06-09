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

    @Column(name = "CARDIOPATIA", length = 5)
    private String cardiopatia;

    @Column(name = "DIABETES", length = 5)
    private String diabetes;

    @Column(name = "ENF_CARDIOVASCULARES", length = 5)
    private String enfCardiovasculares;

    @Column(name = "HIPERTENSION", length = 5)
    private String hipertension;

    @Column(name = "CANCER", length = 5)
    private String cancer;

    @Column(name = "TUBERCULOSIS", length = 5)
    private String tuberculosis;

    @Column(name = "ENF_MENTALES", length = 5)
    private String enfMentales;

    @Column(name = "ENF_INFECCIOSAS", length = 5)
    private String enfInfecciosas;

    @Column(name = "MALFORMACIONES", length = 5)
    private String malformaciones;

    @Column(name = "OTROS")
    private String otros;

    @Column(name = "FAMILIARES")
    private String familiares;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "ID_CONSEXTERNA", foreignKey = @ForeignKey(name = "FK_ANTEC_FAMILIARES_ID"))
    private ConsultaExterna consultaExterna;

    public AntecFamiliares() {
    }
    
    public AntecFamiliares(Long idAntecFamiliares, String cardiopatia, String diabetes, String enfCardiovasculares,
            String hipertension, String cancer, String tuberculosis, String enfMentales, String enfInfecciosas,
            String malformaciones, String otros, String familiares, ConsultaExterna consultaExterna) {
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

    public String getCardiopatia() {
        return cardiopatia;
    }

    public void setCardiopatia(String cardiopatia) {
        this.cardiopatia = cardiopatia;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getEnfCardiovasculares() {
        return enfCardiovasculares;
    }

    public void setEnfCardiovasculares(String enfCardiovasculares) {
        this.enfCardiovasculares = enfCardiovasculares;
    }

    public String getHipertension() {
        return hipertension;
    }

    public void setHipertension(String hipertension) {
        this.hipertension = hipertension;
    }

    public String getCancer() {
        return cancer;
    }

    public void setCancer(String cancer) {
        this.cancer = cancer;
    }

    public String getTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(String tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public String getEnfMentales() {
        return enfMentales;
    }

    public void setEnfMentales(String enfMentales) {
        this.enfMentales = enfMentales;
    }

    public String getEnfInfecciosas() {
        return enfInfecciosas;
    }

    public void setEnfInfecciosas(String enfInfecciosas) {
        this.enfInfecciosas = enfInfecciosas;
    }

    public String getMalformaciones() {
        return malformaciones;
    }

    public void setMalformaciones(String malformaciones) {
        this.malformaciones = malformaciones;
    }

    public String getOtros() {
        return otros;
    }

    public void setOtros(String otros) {
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
