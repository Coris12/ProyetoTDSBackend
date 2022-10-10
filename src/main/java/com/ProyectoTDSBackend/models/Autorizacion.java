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
@Table(name = "autorizacion")

public class Autorizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_autorizacion", nullable = false)
    private Integer idAutorizacion;
    @Column(name = "institucion_sistema")
    private String instutucionSistema;

    @Column(name = "unidad_operativa")
    private String unidadOperativa;

    @Column(name = "cod_ud")
    private String codUd;

    @Column(name = "numero_historia_clinica")
    private Integer numeroHistoriaClinica;
    private String servicio;
    private String sala;
    private String cama;

    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss[.SSS][.SS][.S]")
    private Date fecha;
    private String parroquia;
    private String canton;
    private String provincia;
    private String nombre;
    
    
    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_autoriza_id"))
    private Usuario usuario;
    
    @Column(name = "parentesco", nullable = false)
    private String parentesco;
    
    @Column(name = "telefono_medico", nullable = false)
    private String telefonoMedico;
    
    @Column(name = "telefono_pari", nullable = false)
    private String telefonoParien;
    
    @Column(name = "telefono_tratante", nullable = false)
    private String telefonoTra;

    @Column(name = "nombre_representante", nullable = false)
    private String nombreRepre;


    @Column(name = "cedula_re", nullable = false)
    private String cedulaRe;

    @Column(name = "cedula_medico", nullable = false)
    private String cedulaMe;
    
    @Column(name = "cedula_tratante", nullable = false)
    private String cedulaTra;


    @Column(name = "nombre_medico", nullable = false)
    private String nombreMedico;
   
    @Column(name = "nombre_medico_tratante", nullable = false)
    private String nombreTratante;
    
     @JsonIgnore
    @OneToMany(mappedBy = "autorizacion")
    private List<OrganosDonados> organo;


    public Autorizacion() {
    }

    public Autorizacion(Integer idAutorizacion, String instutucionSistema, String unidadOperativa, String codUd, Integer numeroHistoriaClinica, String servicio, String sala, String cama, Date fecha, String parroquia, String canton, String provincia, String nombre, Usuario usuario, String parentesco, String telefonoMedico, String telefonoParien, String telefonoTra, String nombreRepre, String cedulaRe, String cedulaMe, String cedulaTra, String nombreMedico, String nombreTratante, List<OrganosDonados> organo) {
        this.idAutorizacion = idAutorizacion;
        this.instutucionSistema = instutucionSistema;
        this.unidadOperativa = unidadOperativa;
        this.codUd = codUd;
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.servicio = servicio;
        this.sala = sala;
        this.cama = cama;
        this.fecha = fecha;
        this.parroquia = parroquia;
        this.canton = canton;
        this.provincia = provincia;
        this.nombre = nombre;
        this.usuario = usuario;
        this.parentesco = parentesco;
        this.telefonoMedico = telefonoMedico;
        this.telefonoParien = telefonoParien;
        this.telefonoTra = telefonoTra;
        this.nombreRepre = nombreRepre;
        this.cedulaRe = cedulaRe;
        this.cedulaMe = cedulaMe;
        this.cedulaTra = cedulaTra;
        this.nombreMedico = nombreMedico;
        this.nombreTratante = nombreTratante;
        this.organo = organo;
    }

    

    public Integer getIdAutorizacion() {
        return idAutorizacion;
    }

    public void setIdAutorizacion(Integer idAutorizacion) {
        this.idAutorizacion = idAutorizacion;
    }

    public String getInstutucionSistema() {
        return instutucionSistema;
    }

    public void setInstutucionSistema(String instutucionSistema) {
        this.instutucionSistema = instutucionSistema;
    }

    public String getUnidadOperativa() {
        return unidadOperativa;
    }

    public void setUnidadOperativa(String unidadOperativa) {
        this.unidadOperativa = unidadOperativa;
    }

    public String getCodUd() {
        return codUd;
    }

    public void setCodUd(String codUd) {
        this.codUd = codUd;
    }

    public Integer getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(Integer numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
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

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getTelefonoMedico() {
        return telefonoMedico;
    }

    public void setTelefonoMedico(String telefonoMedico) {
        this.telefonoMedico = telefonoMedico;
    }

    public String getTelefonoParien() {
        return telefonoParien;
    }

    public void setTelefonoParien(String telefonoParien) {
        this.telefonoParien = telefonoParien;
    }

    public String getTelefonoTra() {
        return telefonoTra;
    }

    public void setTelefonoTra(String telefonoTra) {
        this.telefonoTra = telefonoTra;
    }

    public String getNombreRepre() {
        return nombreRepre;
    }

    public void setNombreRepre(String nombreRepre) {
        this.nombreRepre = nombreRepre;
    }

    public String getCedulaRe() {
        return cedulaRe;
    }

    public void setCedulaRe(String cedulaRe) {
        this.cedulaRe = cedulaRe;
    }

    public String getCedulaMe() {
        return cedulaMe;
    }

    public void setCedulaMe(String cedulaMe) {
        this.cedulaMe = cedulaMe;
    }

    public String getCedulaTra() {
        return cedulaTra;
    }

    public void setCedulaTra(String cedulaTra) {
        this.cedulaTra = cedulaTra;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getNombreTratante() {
        return nombreTratante;
    }

    public void setNombreTratante(String nombreTratante) {
        this.nombreTratante = nombreTratante;
    }

    public List<OrganosDonados> getOrgano() {
        return organo;
    }

    public void setOrgano(List<OrganosDonados> organo) {
        this.organo = organo;
    }

    
    
    
}
