/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.security.models.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "odontologia")
public class Odontologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_odontologia", nullable = false)
    private Long idOdonto;

    @Column(name = "establecimiento")
    private String establecimiento;

    @Column(name = "motivo_consulta")
    private String motivo;

    @Column(name = "enfermedad")
    private String enfermedad;

    @Column(name = "presion_arterial")
    private int presion;

    @Column(name = "temperatura")
    private int temperatura;

    @Column(name = "frec_cardiaca")
    private int frecCardiaca;

    @Column(name = "frec_respira")
    private int frecRespi;

    @JsonIgnore
    @OneToMany(mappedBy = "odontologia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<IndicesCPO> indices;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_evoluc_id"))
    private Usuario usuario;

    @OneToMany(mappedBy = "odontologia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<IndicesF> indicesF;

    public Odontologia() {
    }

    public Odontologia(Long idOdonto, String establecimiento, String motivo, String enfermedad, int presion, int temperatura, int frecCardiaca, int frecRespi, List<IndicesCPO> indices, Usuario usuario, List<IndicesF> indicesF) {
        this.idOdonto = idOdonto;
        this.establecimiento = establecimiento;
        this.motivo = motivo;
        this.enfermedad = enfermedad;
        this.presion = presion;
        this.temperatura = temperatura;
        this.frecCardiaca = frecCardiaca;
        this.frecRespi = frecRespi;
        this.indices = indices;
        this.usuario = usuario;
        this.indicesF = indicesF;
    }

    public Long getIdOdonto() {
        return idOdonto;
    }

    public void setIdOdonto(Long idOdonto) {
        this.idOdonto = idOdonto;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getFrecCardiaca() {
        return frecCardiaca;
    }

    public void setFrecCardiaca(int frecCardiaca) {
        this.frecCardiaca = frecCardiaca;
    }

    public int getFrecRespi() {
        return frecRespi;
    }

    public void setFrecRespi(int frecRespi) {
        this.frecRespi = frecRespi;
    }

    public List<IndicesCPO> getIndices() {
        return indices;
    }

    public void setIndices(List<IndicesCPO> indices) {
        this.indices = indices;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<IndicesF> getIndicesF() {
        return indicesF;
    }

    public void setIndicesF(List<IndicesF> indicesF) {
        this.indicesF = indicesF;
    }

    
}
