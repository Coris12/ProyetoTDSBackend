package com.ProyectoTDSBackend.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;


@Entity
@Table(name = "EXAM_FISICO_REGIONAL")
public class ExamFisicoRegional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EXAM_FISICO_REGIONAL", nullable = false)
    private Long idExamFisicoRegional;

    @Column(name = "CABEZA", length = 2)
    private String cabeza;

    @Column(name = "CUELLO", length = 2)
    private String cuello;

    @Column(name = "TORAX", length = 2)
    private String torax;

    @Column(name = "ABDOMEN", length = 2)
    private String abdomen;

    @Column(name = "PELVIS", length = 2)
    private String pelvis;

    @Column(name = "EXTREMIDADES", length = 2)
    private String extremidades;

    @Column(name = "OBSERVACIONES")
    private String observaciones;

    @OneToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ID_CONSEXTERNA", foreignKey = @ForeignKey(name = "FK_EXAM_FISICO_REGIONAL_ID"))
    private ConsultaExterna consultaExterna;

    public ExamFisicoRegional() {
    }

    public ExamFisicoRegional(Long idExamFisicoRegional, String cabeza, String cuello, String torax, String abdomen,
            String pelvis, String extremidades, String observaciones, ConsultaExterna consultaExterna) {
        this.idExamFisicoRegional = idExamFisicoRegional;
        this.cabeza = cabeza;
        this.cuello = cuello;
        this.torax = torax;
        this.abdomen = abdomen;
        this.pelvis = pelvis;
        this.extremidades = extremidades;
        this.observaciones = observaciones;
        this.consultaExterna = consultaExterna;
    }

    public Long getIdExamFisicoRegional() {
        return idExamFisicoRegional;
    }

    public void setIdExamFisicoRegional(Long idExamFisicoRegional) {
        this.idExamFisicoRegional = idExamFisicoRegional;
    }

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getTorax() {
        return torax;
    }

    public void setTorax(String torax) {
        this.torax = torax;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getPelvis() {
        return pelvis;
    }

    public void setPelvis(String pelvis) {
        this.pelvis = pelvis;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public ConsultaExterna getConsultaExterna() {
        return consultaExterna;
    }

    public void setConsultaExterna(ConsultaExterna consultaExterna) {
        this.consultaExterna = consultaExterna;
    }

    
}
