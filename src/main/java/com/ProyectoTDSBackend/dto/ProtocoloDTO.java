/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.dto;

import java.util.Date;

/**
 *
 * @author corin
 */
public class ProtocoloDTO {
    private int idProtocolo;
    private String nombres;
    private String postoperatorio;
    private String escrita;
    private Date fecha_red;
    private int n_cama;
    private String preoperatorio;
    private String realizada;
    private String redactado;
    private String sala;
    private String servicio;
    private String tipo_cirujia;
    private String anestesiologo;
    private String cirujano;
    private Date fecha;
    private String hora_fin;
    private String hora_inicio;
    private String instrumentista;
    private String primer_ayudante;
    private String segundo_ayudante;
    private String tercer_ayudante;
    private String tipo_anestesia;
    private String complicaciones;
    private String dieresis;
    private String examen;
    private String exploracion;
    private String exposicion;
    private String procedimiento;
    private String sintensis;

    public ProtocoloDTO() {
    }

    public ProtocoloDTO(String nombres, String postoperatorio, String escrita, Date fecha_red, int n_cama, String preoperatorio, String realizada, String redactado, String sala, String servicio, String tipo_cirujia, String anestesiologo, String cirujano, Date fecha, String hora_fin, String hora_inicio, String instrumentista, String primer_ayudante, String segundo_ayudante, String tercer_ayudante, String tipo_anestesia, String complicaciones, String dieresis, String examen, String exploracion, String exposicion, String procedimiento, String sintensis) {
        this.nombres = nombres;
        this.postoperatorio = postoperatorio;
        this.escrita = escrita;
        this.fecha_red = fecha_red;
        this.n_cama = n_cama;
        this.preoperatorio = preoperatorio;
        this.realizada = realizada;
        this.redactado = redactado;
        this.sala = sala;
        this.servicio = servicio;
        this.tipo_cirujia = tipo_cirujia;
        this.anestesiologo = anestesiologo;
        this.cirujano = cirujano;
        this.fecha = fecha;
        this.hora_fin = hora_fin;
        this.hora_inicio = hora_inicio;
        this.instrumentista = instrumentista;
        this.primer_ayudante = primer_ayudante;
        this.segundo_ayudante = segundo_ayudante;
        this.tercer_ayudante = tercer_ayudante;
        this.tipo_anestesia = tipo_anestesia;
        this.complicaciones = complicaciones;
        this.dieresis = dieresis;
        this.examen = examen;
        this.exploracion = exploracion;
        this.exposicion = exposicion;
        this.procedimiento = procedimiento;
        this.sintensis = sintensis;
    }

    public int getIdProtocolo() {
        return idProtocolo;
    }

    public void setIdProtocolo(int idProtocolo) {
        this.idProtocolo = idProtocolo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPostoperatorio() {
        return postoperatorio;
    }

    public void setPostoperatorio(String postoperatorio) {
        this.postoperatorio = postoperatorio;
    }

    public String getEscrita() {
        return escrita;
    }

    public void setEscrita(String escrita) {
        this.escrita = escrita;
    }

    public Date getFecha_red() {
        return fecha_red;
    }

    public void setFecha_red(Date fecha_red) {
        this.fecha_red = fecha_red;
    }

    public int getN_cama() {
        return n_cama;
    }

    public void setN_cama(int n_cama) {
        this.n_cama = n_cama;
    }

    

    public String getPreoperatorio() {
        return preoperatorio;
    }

    public void setPreoperatorio(String preoperatorio) {
        this.preoperatorio = preoperatorio;
    }

    public String getRealizada() {
        return realizada;
    }

    public void setRealizada(String realizada) {
        this.realizada = realizada;
    }

    

    public String getRedactado() {
        return redactado;
    }

    public void setRedactado(String redactado) {
        this.redactado = redactado;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getTipo_cirujia() {
        return tipo_cirujia;
    }

    public void setTipo_cirujia(String tipo_cirujia) {
        this.tipo_cirujia = tipo_cirujia;
    }

    public String getAnestesiologo() {
        return anestesiologo;
    }

    public void setAnestesiologo(String anestesiologo) {
        this.anestesiologo = anestesiologo;
    }

    public String getCirujano() {
        return cirujano;
    }

    public void setCirujano(String cirujano) {
        this.cirujano = cirujano;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public String getInstrumentista() {
        return instrumentista;
    }

    public void setInstrumentista(String instrumentista) {
        this.instrumentista = instrumentista;
    }

    public String getPrimer_ayudante() {
        return primer_ayudante;
    }

    public void setPrimer_ayudante(String primer_ayudante) {
        this.primer_ayudante = primer_ayudante;
    }

    public String getSegundo_ayudante() {
        return segundo_ayudante;
    }

    public void setSegundo_ayudante(String segundo_ayudante) {
        this.segundo_ayudante = segundo_ayudante;
    }

    public String getTercer_ayudante() {
        return tercer_ayudante;
    }

    public void setTercer_ayudante(String tercer_ayudante) {
        this.tercer_ayudante = tercer_ayudante;
    }

    public String getTipo_anestesia() {
        return tipo_anestesia;
    }

    public void setTipo_anestesia(String tipo_anestesia) {
        this.tipo_anestesia = tipo_anestesia;
    }

    public String getComplicaciones() {
        return complicaciones;
    }

    public void setComplicaciones(String complicaciones) {
        this.complicaciones = complicaciones;
    }

    public String getDieresis() {
        return dieresis;
    }

    public void setDieresis(String dieresis) {
        this.dieresis = dieresis;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }

    public String getExploracion() {
        return exploracion;
    }

    public void setExploracion(String exploracion) {
        this.exploracion = exploracion;
    }

    public String getExposicion() {
        return exposicion;
    }

    public void setExposicion(String exposicion) {
        this.exposicion = exposicion;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getSintensis() {
        return sintensis;
    }

    public void setSintensis(String sintensis) {
        this.sintensis = sintensis;
    }
    
    
        
    
    
}
