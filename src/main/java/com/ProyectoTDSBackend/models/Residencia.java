package com.ProyectoTDSBackend.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ProyectoTDSBackend.security.models.Usuario;

@Entity
@Table(name = "residencia")
public class Residencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_RECIDENCIA", nullable = false)
    private long idRecidencia;

    @Column(name = "PROVINCIA", length = 60)
    public String provincia;

    @Column(name = "CANTON", length = 60)
    public String canton;

    @Column(name = "PARROQUIA", length = 60)
    public String parroquia;

    @Column(name = "BARRIO", length = 60)
    public String barrio;

    @Column(name = "ZONA", length = 100)
    private String zona;

    @Column(name = "ID_USUARIO", unique = false)
    public Long IdUsuario;

    @Column(name = "PAIS", length = 100)
    public String pais;

    @Column(name = "NACIONALIDAD", length = 100)
    public String nacionalidad;

    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Usuario usuario;

    public Residencia() {
    }

    public Residencia(long idRecidencia, String provincia, String canton, String parroquia, String barrio, String zona,
            Long idUsuario, String pais, String nacionalidad, Usuario usuario) {
        this.idRecidencia = idRecidencia;
        this.provincia = provincia;
        this.canton = canton;
        this.parroquia = parroquia;
        this.barrio = barrio;
        this.zona = zona;
        IdUsuario = idUsuario;
        this.pais = pais;
        this.nacionalidad = nacionalidad;
        this.usuario = usuario;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public long getIdRecidencia() {
        return idRecidencia;
    }

    public void setIdRecidencia(long idRecidencia) {
        this.idRecidencia = idRecidencia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Long getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        IdUsuario = idUsuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
