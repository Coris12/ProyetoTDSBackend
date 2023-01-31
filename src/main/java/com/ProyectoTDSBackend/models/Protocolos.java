/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.dto.ProtocoloDTO;
import com.ProyectoTDSBackend.security.models.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@NamedNativeQueries({
    @NamedNativeQuery(name = "Protocolos.generarPdfProtocolo", query = "", resultSetMapping = "generarPdfProtocolo")
})
@SqlResultSetMapping(name = "generarPdfProtocolo", classes = {
    @ConstructorResult(targetClass = ProtocoloDTO.class, columns = {
        @ColumnResult(name = "nombres", type = String.class),
        @ColumnResult(name = "postoperatorio", type = String.class),
        @ColumnResult(name = "escrita", type = String.class),
        @ColumnResult(name = "fecha_red", type = Date.class),
        @ColumnResult(name = "n_cama", type = Integer.class),
        @ColumnResult(name = "preoperatorio", type = String.class),
        @ColumnResult(name = "realizada ", type = String.class),
        @ColumnResult(name = "redactado ", type = String.class),
        @ColumnResult(name = "sala ", type = String.class),
        @ColumnResult(name = "servicio ", type = String.class),
        @ColumnResult(name = "tipo_cirujia ", type = String.class),
        @ColumnResult(name = "anestesiologo ", type = String.class),
        @ColumnResult(name = "cirujano ", type = String.class),
        @ColumnResult(name = "fecha ", type = Date.class),
        @ColumnResult(name = "hora_fin ", type = String.class),
        @ColumnResult(name = "hora_inicio ", type = String.class),
        @ColumnResult(name = "instrumentista ", type = String.class),
        @ColumnResult(name = "primer_ayudante ", type = String.class),
        @ColumnResult(name = "segundo_ayudante ", type = String.class),
        @ColumnResult(name = "tercer_ayudante ", type = String.class),
        @ColumnResult(name = "tipo_anestesia ", type = String.class),
        @ColumnResult(name = "complicaciones ", type = String.class),
        @ColumnResult(name = "dieresis ", type = String.class),
        @ColumnResult(name = "examen ", type = String.class),
        @ColumnResult(name = "exploracion ", type = String.class),
        @ColumnResult(name = "exposicion ", type = String.class),
        @ColumnResult(name = "procedimiento", type = String.class),
        @ColumnResult(name = "sintensis ", type = String.class),})
})
@Entity
@Table(name = "protocolo")
public class Protocolos{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_protocolo", nullable = false)
    private Long idProtocolo;

    @Column(name = "servicio", nullable = false)
    private String servicio;

    @Column(name = "sala", nullable = false)
    private String sala;

    @Column(name = "realizada", nullable = false)
    private String realizada;

    @Column(name = "estado", nullable = false)
    private int estado;

    @Column(name = "n_cama", nullable = false)
    private int nCama;

    @Column(name = "preoperatorio", nullable = false)
    private String preoperatorio;

    @Column(name = "postoperatorio", nullable = false)
    private String Postoperatorio;

    @Column(name = "tipo_cirujia", nullable = false)
    private String tipoCirujia;

    @Column(name = "redactado", nullable = false)
    private String redactado;

    @Column(name = "fecha_red", nullable = false)
    private Date fecha;

    @Column(name = "escrita", nullable = false)
    private String escrita;

    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Usuario usuario;

    @JsonIgnore
    @OneToMany(mappedBy = "protocolo")
    private List<EquipoOperatorio> equipo;

    @JsonIgnore
    @OneToMany(mappedBy = "protocolo")
    private List<TiposQuirurgicos> tipo;

    public Protocolos() {
    }

    public Protocolos(Long idProtocolo, String servicio, String sala, String realizada, int estado, int nCama, String preoperatorio, String Postoperatorio, String tipoCirujia, String redactado, Date fecha, String escrita, Usuario usuario) {
        this.idProtocolo = idProtocolo;
        this.servicio = servicio;
        this.sala = sala;
        this.realizada = realizada;
        this.estado = estado;
        this.nCama = nCama;
        this.preoperatorio = preoperatorio;
        this.Postoperatorio = Postoperatorio;
        this.tipoCirujia = tipoCirujia;
        this.redactado = redactado;
        this.fecha = fecha;
        this.escrita = escrita;
        this.usuario = usuario;
    }

    public Long getIdProtocolo() {
        return idProtocolo;
    }

    public void setIdProtocolo(Long idProtocolo) {
        this.idProtocolo = idProtocolo;
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

    public int getnCama() {
        return nCama;
    }

    public void setnCama(int nCama) {
        this.nCama = nCama;
    }

    public String getPreoperatorio() {
        return preoperatorio;
    }

    public void setPreoperatorio(String preoperatorio) {
        this.preoperatorio = preoperatorio;
    }

    public String getPostoperatorio() {
        return Postoperatorio;
    }

    public void setPostoperatorio(String Postoperatorio) {
        this.Postoperatorio = Postoperatorio;
    }

    public String getTipoCirujia() {
        return tipoCirujia;
    }

    public void setTipoCirujia(String tipoCirujia) {
        this.tipoCirujia = tipoCirujia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getRedactado() {
        return redactado;
    }

    public void setRedactado(String redactado) {
        this.redactado = redactado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEscrita() {
        return escrita;
    }

    public void setEscrita(String escrita) {
        this.escrita = escrita;
    }

    public List<EquipoOperatorio> getEquipo() {
        return equipo;
    }

    public void setEquipo(List<EquipoOperatorio> equipo) {
        this.equipo = equipo;
    }

    public List<TiposQuirurgicos> getTipo() {
        return tipo;
    }

    public void setTipo(List<TiposQuirurgicos> tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getRealizada() {
        return realizada;
    }

    public void setRealizada(String realizada) {
        this.realizada = realizada;
    }

}
