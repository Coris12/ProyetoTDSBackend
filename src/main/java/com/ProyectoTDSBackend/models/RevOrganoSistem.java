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
@Table(name = "REV_ORGANO_SISTEM")
public class RevOrganoSistem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REV_ORGANO_SISTEM", nullable = false)
    private Long idRevOrganoSistem;

    @Column(name = "ORGANO_SENTIDO", length = 2)
    private String organoSentido;

    @Column(name = "RESPIRATORIO", length = 2)
    private String respiratorio;

    @Column(name = "CARDIOVASCULAR", length = 2)
    private String cardiovascular;

    @Column(name = "DIGESTIVO", length = 2)
    private String digestivo;

    @Column(name = "GENITAL", length = 2)
    private String genital;

    @Column(name = "URINARIO", length = 2)
    private String urinario;

    @Column(name = "MUSCULO_ESQUELETICO", length = 2)
    private String musculoEsqueletico;

    @Column(name = "ENDOCRINO", length = 2)
    private String endocrino;

    @Column(name = "HEMOLENFATICO", length = 2)
    private String hemoLenfatico;

    @Column(name = "NERVIOSO", length = 2)
    private String nervioso;

    
    @Column(name = "DESCRIPCION", length = 1000)
    private String descripcion;

    @ManyToOne( cascade = CascadeType.MERGE)
    @JoinColumn(name = "ID_CONSEXTERNA",foreignKey = @ForeignKey(name = "FK_REV_ORGANO_SISTEM_ID"))
    private ConsultaExterna consultaExterna;

    public RevOrganoSistem() {
    }

    public RevOrganoSistem(Long idRevOrganoSistem, String organoSentido, String respiratorio, String cardiovascular,
            String digestivo, String genital, String urinario, String musculoEsqueletico, String endocrino,
            String hemoLenfatico, String nervioso, String descripcion, ConsultaExterna consultaExterna) {
        this.idRevOrganoSistem = idRevOrganoSistem;
        this.organoSentido = organoSentido;
        this.respiratorio = respiratorio;
        this.cardiovascular = cardiovascular;
        this.digestivo = digestivo;
        this.genital = genital;
        this.urinario = urinario;
        this.musculoEsqueletico = musculoEsqueletico;
        this.endocrino = endocrino;
        this.hemoLenfatico = hemoLenfatico;
        this.nervioso = nervioso;
        this.descripcion = descripcion;
        this.consultaExterna = consultaExterna;
    }

    public Long getIdRevOrganoSistem() {
        return idRevOrganoSistem;
    }

    public void setIdRevOrganoSistem(Long idRevOrganoSistem) {
        this.idRevOrganoSistem = idRevOrganoSistem;
    }

    public String getOrganoSentido() {
        return organoSentido;
    }

    public void setOrganoSentido(String organoSentido) {
        this.organoSentido = organoSentido;
    }

    public String getRespiratorio() {
        return respiratorio;
    }

    public void setRespiratorio(String respiratorio) {
        this.respiratorio = respiratorio;
    }

    public String getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(String cardiovascular) {
        this.cardiovascular = cardiovascular;
    }

    public String getDigestivo() {
        return digestivo;
    }

    public void setDigestivo(String digestivo) {
        this.digestivo = digestivo;
    }

    public String getGenital() {
        return genital;
    }

    public void setGenital(String genital) {
        this.genital = genital;
    }

    public String getUrinario() {
        return urinario;
    }

    public void setUrinario(String urinario) {
        this.urinario = urinario;
    }

    public String getMusculoEsqueletico() {
        return musculoEsqueletico;
    }

    public void setMusculoEsqueletico(String musculoEsqueletico) {
        this.musculoEsqueletico = musculoEsqueletico;
    }

    public String getEndocrino() {
        return endocrino;
    }

    public void setEndocrino(String endocrino) {
        this.endocrino = endocrino;
    }

    public String getHemoLenfatico() {
        return hemoLenfatico;
    }

    public void setHemoLenfatico(String hemoLenfatico) {
        this.hemoLenfatico = hemoLenfatico;
    }

    public String getNervioso() {
        return nervioso;
    }

    public void setNervioso(String nervioso) {
        this.nervioso = nervioso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ConsultaExterna getConsultaExterna() {
        return consultaExterna;
    }

    public void setConsultaExterna(ConsultaExterna consultaExterna) {
        this.consultaExterna = consultaExterna;
    }

    
}
