/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@Entity
@Table(name = "Region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_region", nullable = false)
    private Long idRegion;

    @Column(name = "cabeza", length = 1)
    private String cabeza;

    @Column(name = "sentido", length = 1)
    private String sentidos;

    @Column(name = "endoscopia", length = 1)
    private String endoscopia;

    @Column(name = "intradural", length = 1)
    private String intra;

    @Column(name = "extradural", length = 1)
    private String extra;

    @Column(name = "cuello", length = 1)
    private String cuello;

    @Column(name = "extratoraicas", length = 1)
    private String toraicas;

    @Column(name = "intratoraicas", length = 1)
    private String intraTor;

    @Column(name = "extramidades", length = 1)
    private String estramidades;

    @Column(name = "obstreticas", length = 1)
    private String obstreticas;

    @Column(name = "perineales", length = 1)
    private String perinales;

    @Column(name = "abdomen", length = 1)
    private String abdomen;

    @Column(name = "convulsiones")
    private String convulsiones;
    
     @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "craneales")
    private String craneales;

    @Column(name = "conciencia")
    private String conciencia;

    @Column(name = "otrosR")
    private String otrosR;

    @Column(name = "cefalea")
    private String cefalea;

    @Column(name = "habitos")
    private String habitos;

    @Column(name = "diabetes")
    private String diabetes;

    @Column(name = "renal")
    private String renal;

    @Column(name = "electrolitico")
    private String electro;

    @Column(name = "toxemias")
    private String toxemias;

    @Column(name = "Trumatismo")
    private String multiples;

    @Column(name = "shocks")
    private String shocks;

    @Column(name = "otrosS")
    private String otrosS;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_anes", foreignKey = @ForeignKey(name = "fk_anes_id"))
    private Anestesia anestesia;

    public Region() {
    }

    public Region(Long idRegion, String cabeza, String sentidos, String endoscopia, String intra, String extra, String cuello, String toraicas, String intraTor, String estramidades, String obstreticas, String perinales, String abdomen, String convulsiones, String descripcion, String craneales, String conciencia, String otrosR, String cefalea, String habitos, String diabetes, String renal, String electro, String toxemias, String multiples, String shocks, String otrosS, Anestesia anestesia) {
        this.idRegion = idRegion;
        this.cabeza = cabeza;
        this.sentidos = sentidos;
        this.endoscopia = endoscopia;
        this.intra = intra;
        this.extra = extra;
        this.cuello = cuello;
        this.toraicas = toraicas;
        this.intraTor = intraTor;
        this.estramidades = estramidades;
        this.obstreticas = obstreticas;
        this.perinales = perinales;
        this.abdomen = abdomen;
        this.convulsiones = convulsiones;
        this.descripcion = descripcion;
        this.craneales = craneales;
        this.conciencia = conciencia;
        this.otrosR = otrosR;
        this.cefalea = cefalea;
        this.habitos = habitos;
        this.diabetes = diabetes;
        this.renal = renal;
        this.electro = electro;
        this.toxemias = toxemias;
        this.multiples = multiples;
        this.shocks = shocks;
        this.otrosS = otrosS;
        this.anestesia = anestesia;
    }



    public Long getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public String getSentidos() {
        return sentidos;
    }

    public void setSentidos(String sentidos) {
        this.sentidos = sentidos;
    }

    public String getEndoscopia() {
        return endoscopia;
    }

    public void setEndoscopia(String endoscopia) {
        this.endoscopia = endoscopia;
    }

    public String getIntra() {
        return intra;
    }

    public void setIntra(String intra) {
        this.intra = intra;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getToraicas() {
        return toraicas;
    }

    public void setToraicas(String toraicas) {
        this.toraicas = toraicas;
    }

    public String getIntraTor() {
        return intraTor;
    }

    public void setIntraTor(String intraTor) {
        this.intraTor = intraTor;
    }

    public String getEstramidades() {
        return estramidades;
    }

    public void setEstramidades(String estramidades) {
        this.estramidades = estramidades;
    }

    public String getObstreticas() {
        return obstreticas;
    }

    public void setObstreticas(String obstreticas) {
        this.obstreticas = obstreticas;
    }

    public String getPerinales() {
        return perinales;
    }

    public void setPerinales(String perinales) {
        this.perinales = perinales;
    }

    public String getConvulsiones() {
        return convulsiones;
    }

    public void setConvulsiones(String convulsiones) {
        this.convulsiones = convulsiones;
    }

    public String getCraneales() {
        return craneales;
    }

    public void setCraneales(String craneales) {
        this.craneales = craneales;
    }

    public String getCefalea() {
        return cefalea;
    }

    public void setCefalea(String cefalea) {
        this.cefalea = cefalea;
    }

    public String getHabitos() {
        return habitos;
    }

    public void setHabitos(String habitos) {
        this.habitos = habitos;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public String getRenal() {
        return renal;
    }

    public void setRenal(String renal) {
        this.renal = renal;
    }

    public String getElectro() {
        return electro;
    }

    public void setElectro(String electro) {
        this.electro = electro;
    }

    public String getToxemias() {
        return toxemias;
    }

    public void setToxemias(String toxemias) {
        this.toxemias = toxemias;
    }

    public String getMultiples() {
        return multiples;
    }

    public void setMultiples(String multiples) {
        this.multiples = multiples;
    }

    public String getShocks() {
        return shocks;
    }

    public void setShocks(String shocks) {
        this.shocks = shocks;
    }

    public String getOtrosS() {
        return otrosS;
    }

    public void setOtrosS(String otrosS) {
        this.otrosS = otrosS;
    }

    public Anestesia getAnestesia() {
        return anestesia;
    }

    public void setAnestesia(Anestesia anestesia) {
        this.anestesia = anestesia;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getConciencia() {
        return conciencia;
    }

    public void setConciencia(String conciencia) {
        this.conciencia = conciencia;
    }

    public String getOtrosR() {
        return otrosR;
    }

    public void setOtrosR(String otrosR) {
        this.otrosR = otrosR;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

}
