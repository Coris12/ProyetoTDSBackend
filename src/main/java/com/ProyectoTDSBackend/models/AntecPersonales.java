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
@Table(name = "ANTEC_PERSONALES")
public class AntecPersonales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ANTEC_PERSONALES", nullable = false)
    private Long idAntecPersonales;

    @Column(name = "CLINICOS")
    private String clinicos;

    @Column(name = "QUIRURGICOS")
    private String quirurgicos;

    @ManyToOne( cascade = CascadeType.MERGE)
    @JoinColumn(name = "ID_CONSEXTERNA",foreignKey = @ForeignKey(name = "FK_ANTEC_PERSONALES_ID"))
    private ConsultaExterna consultaExterna;

    public AntecPersonales() {
    }

    public AntecPersonales(Long idAntecPersonales, String clinicos, String quirurgicos,
            ConsultaExterna consultaExterna) {
        this.idAntecPersonales = idAntecPersonales;
        this.clinicos = clinicos;
        this.quirurgicos = quirurgicos;
        this.consultaExterna = consultaExterna;
    }

    public AntecPersonales(Long idAntecPersonales, String clinicos, String quirurgicos) {
        this.idAntecPersonales = idAntecPersonales;
        this.clinicos = clinicos;
        this.quirurgicos = quirurgicos;
    }

    public Long getIdAntecPersonales() {
        return idAntecPersonales;
    }

    public void setIdAntecPersonales(Long idAntecPersonales) {
        this.idAntecPersonales = idAntecPersonales;
    }

    public String getClinicos() {
        return clinicos;
    }

    public void setClinicos(String clinicos) {
        this.clinicos = clinicos;
    }

    public String getQuirurgicos() {
        return quirurgicos;
    }

    public void setQuirurgicos(String quirurgicos) {
        this.quirurgicos = quirurgicos;
    }

    public ConsultaExterna getConsultaExterna() {
        return consultaExterna;
    }

    public void setConsultaExterna(ConsultaExterna consultaExterna) {
        this.consultaExterna = consultaExterna;
    }
}
