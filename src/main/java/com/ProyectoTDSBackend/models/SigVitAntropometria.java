package com.ProyectoTDSBackend.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ForeignKey;

@Entity
@Table(name = "SIGVIT_ANTROPOMETRIA")
public class SigVitAntropometria {
    private static final long serialVersionUID = 1542L;
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_SIGVIT_ANT")
    private Long idSigVitAnt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_MEDICION")
    private Date fechaMedicion;

    @Column(name = "TEMPERATURA")
    private Double temperatura;

    @Column(name = "PRESION_ARTERIAL", length = 30)
    private String presionArterial;

    @Column(name = "PULSO")
    private Integer pulso;

    @Column(name = "PESO")
    private Double peso;

    @Column(name = "TALLA")
    private Double talla;

    @Column(name = "FREC_RESPIRATORIA")
    private Double frecRespiratoria;

    @OneToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ID_CONSEXTERNA", foreignKey = @ForeignKey(name = "FK_SIGVIT_ANT_ID"))    
    private ConsultaExterna consultaExterna;

    public SigVitAntropometria() {
    }

    public SigVitAntropometria(Long idSigVitAnt, Date fechaMedicion, Double temperatura, String presionArterial,
            Integer pulso, Double peso, Double talla, Double frecRespiratoria, ConsultaExterna consultaExterna) {
        this.idSigVitAnt = idSigVitAnt;
        this.fechaMedicion = fechaMedicion;
        this.temperatura = temperatura;
        this.presionArterial = presionArterial;
        this.pulso = pulso;
        this.peso = peso;
        this.talla = talla;
        this.frecRespiratoria = frecRespiratoria;
        this.consultaExterna = consultaExterna;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getIdSigVitAnt() {
        return idSigVitAnt;
    }

    public void setIdSigVitAnt(Long idSigVitAnt) {
        this.idSigVitAnt = idSigVitAnt;
    }

    public Date getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(Date fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public Integer getPulso() {
        return pulso;
    }

    public void setPulso(Integer pulso) {
        this.pulso = pulso;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getTalla() {
        return talla;
    }

    public void setTalla(Double talla) {
        this.talla = talla;
    }

    public Double getFrecRespiratoria() {
        return frecRespiratoria;
    }

    public void setFrecRespiratoria(Double frecRespiratoria) {
        this.frecRespiratoria = frecRespiratoria;
    }

    public ConsultaExterna getConsultaExterna() {
        return consultaExterna;
    }

    public void setConsultaExterna(ConsultaExterna consultaExterna) {
        this.consultaExterna = consultaExterna;
    }

    
}
