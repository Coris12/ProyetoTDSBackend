/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.security.models.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
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
@Table(name = "aneste")
public class Anestesia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_anes", nullable = false)
    private Long idAnes;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "estatura")
    private int estatura;

    @Column(name = "peso")
    private int peso;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "servicio")
    private String servicio;

    @Column(name = "sala")
    private String sala;

    @Column(name = "cama")
    private int cama;

    @Column(name = "preoperatorio")
    private String pre;

    @Column(name = "postoperatorio")
    private String post;

    @Column(name = "propuesta")
    private String propuesta;

    @Column(name = "Cirujano")
    private String cirujano;

    @Column(name = "ayudanteC")
    private String ayudanteC;

    @Column(name = "realizada")
    private String realizada;

    @Column(name = "anesteciologo")
    private String anestecio;

    @Column(name = "ayudanteA")
    private String ayudanteA;

    @Column(name = "intrumentista")
    private String intrumentista;

    @Column(name = "tipoD")
    private String tipoD;

    @Column(name = "horaA")
    private int horaA;

    @Column(name = "minA")
    private int minA;

    @Column(name = "horaO")
    private int horaO;

    @Column(name = "minO")
    private int minO;

    @JsonIgnore
    @OneToMany(mappedBy = "anestesia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Tecnicas> tecnica;
    
    @JsonIgnore
    @OneToMany(mappedBy = "anestesia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Infusion> infuncion;
    
    @JsonIgnore
    @OneToMany(mappedBy = "anestesia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Complicaciones> compli;
    
    @JsonIgnore
    @OneToMany(mappedBy = "anestesia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Region> region;
    
     @JsonIgnore
    @OneToMany(mappedBy = "anestesia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Terapia> terapia;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_autoriza_id"))
    private Usuario usuario;

    public Anestesia() {
    }

    public List<Region> getRegion() {
        return region;
    }

    public void setRegion(List<Region> region) {
        this.region = region;
    }

    public List<Terapia> getTerapia() {
        return terapia;
    }

    public void setTerapia(List<Terapia> terapia) {
        this.terapia = terapia;
    }


    

    public Long getIdAnes() {
        return idAnes;
    }

    public void setIdAnes(Long idAnes) {
        this.idAnes = idAnes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getCama() {
        return cama;
    }

    public void setCama(int cama) {
        this.cama = cama;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(String propuesta) {
        this.propuesta = propuesta;
    }

    public String getCirujano() {
        return cirujano;
    }

    public void setCirujano(String cirujano) {
        this.cirujano = cirujano;
    }

    public String getAyudanteC() {
        return ayudanteC;
    }

    public void setAyudanteC(String ayudanteC) {
        this.ayudanteC = ayudanteC;
    }

    public String getRealizada() {
        return realizada;
    }

    public void setRealizada(String realizada) {
        this.realizada = realizada;
    }

    public String getAnestecio() {
        return anestecio;
    }

    public void setAnestecio(String anestecio) {
        this.anestecio = anestecio;
    }

    public String getAyudanteA() {
        return ayudanteA;
    }

    public void setAyudanteA(String ayudanteA) {
        this.ayudanteA = ayudanteA;
    }

    public String getIntrumentista() {
        return intrumentista;
    }

    public void setIntrumentista(String intrumentista) {
        this.intrumentista = intrumentista;
    }

    public String getTipoD() {
        return tipoD;
    }

    public void setTipoD(String tipoD) {
        this.tipoD = tipoD;
    }

    public int getHoraA() {
        return horaA;
    }

    public void setHoraA(int horaA) {
        this.horaA = horaA;
    }

    public int getMinA() {
        return minA;
    }

    public void setMinA(int minA) {
        this.minA = minA;
    }

    public int getHoraO() {
        return horaO;
    }

    public void setHoraO(int horaO) {
        this.horaO = horaO;
    }

    public int getMinO() {
        return minO;
    }

    public void setMinO(int minO) {
        this.minO = minO;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Tecnicas> getTecnica() {
        return tecnica;
    }

    public void setTecnica(List<Tecnicas> tecnica) {
        this.tecnica = tecnica;
    }

    public List<Infusion> getInfuncion() {
        return infuncion;
    }

    public void setInfuncion(List<Infusion> infuncion) {
        this.infuncion = infuncion;
    }

    public List<Complicaciones> getCompli() {
        return compli;
    }

    public void setCompli(List<Complicaciones> compli) {
        this.compli = compli;
    }

}
