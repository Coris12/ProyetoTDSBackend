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
@Table(name = "SignosE")
public class SignosE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_signos", nullable = false)
    private Long idSgnos;

    @Column(name = "presion")
    private int presion;

    @Column(name = "FCardiaca")
    private int fCardiaca;

    @Column(name = "Frespiratoria")
    private int respira;

    @Column(name = "tBucal")
    private int bucal;

    @Column(name = "tAxilar")
    private int axilar;

    @Column(name = "peso")
    private int peso;

    @Column(name = "talla")
    private int talla;

    @Column(name = "Ocular")
    private int ocular;

    @Column(name = "verbal")
    private int verbal;

    @Column(name = "motora")
    private int motora;

    @Column(name = "Total")
    private int total;

    @Column(name = "pupilaD")
    private String pupilaD;

    @Column(name = "pupilaI")
    private String pupilaI;

    @Column(name = "capilar")
    private int capilar;

    @Column(name = "satura")
    private int oxigeno;

    @Column(name = "viaObstruidaSP", length = 2)
    private String viaObost;

    @Column(name = "cabeza", length = 2)
    private String cabeza;

    @Column(name = "cuello", length = 2)
    private String cuello;

    @Column(name = "torax", length = 2)
    private String torax;

    @Column(name = "abdomen", length = 2)
    private String abdomen;

    @Column(name = "columna", length = 2)
    private String columna;

    @Column(name = "pelvis", length = 2)
    private String pelvis;

    @Column(name = "extremidades", length = 2)
    private String extremidades;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_dmision", foreignKey = @ForeignKey(name = "fk_enfer_id"))
    private Admision admision;

    public SignosE() {
    }

    public SignosE(Long idSgnos, int presion, int fCardiaca, int respira, int bucal, int axilar, int peso, int talla, int ocular, int verbal, int motora, int total, String pupilaD, String pupilaI, int capilar, int oxigeno, String viaObost, String cabeza, String cuello, String torax, String abdomen, String columna, String pelvis, String extremidades, String descripcion, Admision admision) {
        this.idSgnos = idSgnos;
        this.presion = presion;
        this.fCardiaca = fCardiaca;
        this.respira = respira;
        this.bucal = bucal;
        this.axilar = axilar;
        this.peso = peso;
        this.talla = talla;
        this.ocular = ocular;
        this.verbal = verbal;
        this.motora = motora;
        this.total = total;
        this.pupilaD = pupilaD;
        this.pupilaI = pupilaI;
        this.capilar = capilar;
        this.oxigeno = oxigeno;
        this.viaObost = viaObost;
        this.cabeza = cabeza;
        this.cuello = cuello;
        this.torax = torax;
        this.abdomen = abdomen;
        this.columna = columna;
        this.pelvis = pelvis;
        this.extremidades = extremidades;
        this.descripcion = descripcion;
        this.admision = admision;
    }

    public Long getIdSgnos() {
        return idSgnos;
    }

    public void setIdSgnos(Long idSgnos) {
        this.idSgnos = idSgnos;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public int getfCardiaca() {
        return fCardiaca;
    }

    public void setfCardiaca(int fCardiaca) {
        this.fCardiaca = fCardiaca;
    }

    public int getRespira() {
        return respira;
    }

    public void setRespira(int respira) {
        this.respira = respira;
    }

    public int getBucal() {
        return bucal;
    }

    public void setBucal(int bucal) {
        this.bucal = bucal;
    }

    public int getAxilar() {
        return axilar;
    }

    public void setAxilar(int axilar) {
        this.axilar = axilar;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getOcular() {
        return ocular;
    }

    public void setOcular(int ocular) {
        this.ocular = ocular;
    }

    public int getVerbal() {
        return verbal;
    }

    public void setVerbal(int verbal) {
        this.verbal = verbal;
    }

    public int getMotora() {
        return motora;
    }

    public void setMotora(int motora) {
        this.motora = motora;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getPupilaD() {
        return pupilaD;
    }

    public void setPupilaD(String pupilaD) {
        this.pupilaD = pupilaD;
    }

    public String getPupilaI() {
        return pupilaI;
    }

    public void setPupilaI(String pupilaI) {
        this.pupilaI = pupilaI;
    }

    public int getCapilar() {
        return capilar;
    }

    public void setCapilar(int capilar) {
        this.capilar = capilar;
    }

    public int getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(int oxigeno) {
        this.oxigeno = oxigeno;
    }

    public String getViaObost() {
        return viaObost;
    }

    public void setViaObost(String viaObost) {
        this.viaObost = viaObost;
    }

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getTorax() {
        return torax;
    }

    public void setTorax(String torax) {
        this.torax = torax;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public String getPelvis() {
        return pelvis;
    }

    public void setPelvis(String pelvis) {
        this.pelvis = pelvis;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

}
