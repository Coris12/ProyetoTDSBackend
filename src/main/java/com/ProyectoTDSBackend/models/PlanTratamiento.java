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
@Table(name = "PLAN_TRATAMIENTO")
public class PlanTratamiento {
 
    private static final long serialVersionUID = 1542L;
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PLAN_TRATAMIENTO", nullable = false)
    private long idPlanTratamiento;

    @Column(name = "M", length = 500)
    private String m;

    @Column(name = "I", length = 500)
    private String i;

    @Column(name = "L", length = 500)
    private String l;

    @Column(name = "R", length = 500)
    private String r;

    @Column(name = "C", length = 500)
    private String c;

    @Column(name = "T", length = 500)
    private String t;

    @Column(name = "O", length = 500)
    private String o;

    @ManyToOne( cascade = CascadeType.MERGE)
    @JoinColumn(name = "ID_CONSEXTERNA",foreignKey = @ForeignKey(name = "FK_PLAN_TRATAMIENTO_ID"))
    private ConsultaExterna consultaExterna;

    public PlanTratamiento() {
    }

    public PlanTratamiento(long idPlanTratamiento, String m, String i, String l, String r, String c, String t, String o,
            ConsultaExterna consultaExterna) {
        this.idPlanTratamiento = idPlanTratamiento;
        this.m = m;
        this.i = i;
        this.l = l;
        this.r = r;
        this.c = c;
        this.t = t;
        this.o = o;
        this.consultaExterna = consultaExterna;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getIdPlanTratamiento() {
        return idPlanTratamiento;
    }

    public void setIdPlanTratamiento(long idPlanTratamiento) {
        this.idPlanTratamiento = idPlanTratamiento;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public ConsultaExterna getConsultaExterna() {
        return consultaExterna;
    }

    public void setConsultaExterna(ConsultaExterna consultaExterna) {
        this.consultaExterna = consultaExterna;
    }
}
