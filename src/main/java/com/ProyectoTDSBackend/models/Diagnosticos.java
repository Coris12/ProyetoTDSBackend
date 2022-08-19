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
@Table(name = "DIAGNOSTICOS")
public class Diagnosticos {
    private static final long serialVersionUID = 1542L;
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_DIAGNOSTICOS", nullable = false)
    private long idDiagnosticos;

    @Column(name = "DESCRIPCION_DIAGNOSTICO")
    private String descripcionDiagnostico;

    @Column(name = "CIE", length = 50)
    private String cie;

    @Column(name = "PRE_DEF", length = 3)
    private String preDef;

    @Column(name = "DESCRIPCION_PRE_DEF")
    private String descripcionPreDef;

    @Column(name = "DESCRIPCION_PRE_DEF_CIE", length = 50)
    private String descripcionPreDefCie;

    @Column(name = "DESCRIPCION_PRE_DEF_PRE_DEF", length = 3)
    private String descripcionPreDefPreDef;

    @ManyToOne( cascade = CascadeType.MERGE)
    @JoinColumn(name = "ID_CONSEXTERNA",foreignKey = @ForeignKey(name = "FK_DIAGNOSTICOS_ID"))
    private ConsultaExterna consultaExterna;

    public Diagnosticos() {
    }

    public Diagnosticos(long idDiagnosticos, String descripcionDiagnostico, String cie, String preDef,
            String descripcionPreDef, String descripcionPreDefCie, String descripcionPreDefPreDef,
            ConsultaExterna consultaExterna) {
        this.idDiagnosticos = idDiagnosticos;
        this.descripcionDiagnostico = descripcionDiagnostico;
        this.cie = cie;
        this.preDef = preDef;
        this.descripcionPreDef = descripcionPreDef;
        this.descripcionPreDefCie = descripcionPreDefCie;
        this.descripcionPreDefPreDef = descripcionPreDefPreDef;
        this.consultaExterna = consultaExterna;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getIdDiagnosticos() {
        return idDiagnosticos;
    }

    public void setIdDiagnosticos(long idDiagnosticos) {
        this.idDiagnosticos = idDiagnosticos;
    }

    public String getDescripcionDiagnostico() {
        return descripcionDiagnostico;
    }

    public void setDescripcionDiagnostico(String descripcionDiagnostico) {
        this.descripcionDiagnostico = descripcionDiagnostico;
    }

    public String getCie() {
        return cie;
    }

    public void setCie(String cie) {
        this.cie = cie;
    }
    
    public String getPreDef() {
        return preDef;
    }

    public void setPreDef(String preDef) {
        this.preDef = preDef;
    }

    public String getDescripcionPreDef() {
        return descripcionPreDef;
    }

    public void setDescripcionPreDef(String descripcionPreDef) {
        this.descripcionPreDef = descripcionPreDef;
    }

    public ConsultaExterna getConsultaExterna() {
        return consultaExterna;
    }

    public void setConsultaExterna(ConsultaExterna consultaExterna) {
        this.consultaExterna = consultaExterna;
    }

    public String getDescripcionPreDefCie() {
        return descripcionPreDefCie;
    }

    public void setDescripcionPreDefCie(String descripcionPreDefCie) {
        this.descripcionPreDefCie = descripcionPreDefCie;
    }

    public String getDescripcionPreDefPreDef() {
        return descripcionPreDefPreDef;
    }

    public void setDescripcionPreDefPreDef(String descripcionPreDefPreDef) {
        this.descripcionPreDefPreDef = descripcionPreDefPreDef;
    }

}
