/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import java.util.Date;
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
@Table(name = "accidente")
public class Accidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_accidente", nullable = false)
    private Long idAccidente;

    @Column(name = "nombre")
    private String nombreE;

    @Column(name = "direccion")
    private String direccionE;

    @Column(name = "Policial")
    private boolean policial;

    @Column(name = "fechaE")
    private Date fecha;

    @Column(name = "transito")
    private boolean transito;

    @Column(name = "caida")
    private boolean caida;

    @Column(name = "quemadura")
    private boolean quemadura;

    @Column(name = "moderdura")
    private boolean mode;

    @Column(name = "ahogamiento")
    private boolean ahogamiento;

    @Column(name = "cExtraño")
    private boolean extraño;

    @Column(name = "Aplastamiento")
    private boolean aplas;

    @Column(name = "otroA")
    private boolean otroa;

    @Column(name = "ArmaF")
    private boolean fuego;

    @Column(name = "anafilaxia")
    private boolean ana;

    @Column(name = "Ialcoholica")
    private boolean alcolica;

    @Column(name = "Vcorto")
    private boolean corto;

    @Column(name = "Almientaria")
    private boolean alimentaria;

    @Column(name = "riña")
    private boolean rina;

    @Column(name = "drogas")
    private boolean drogas;

    @Column(name = "familiar")
    private boolean VFamiliar;

    @Column(name = "gases")
    private boolean gases;

    @Column(name = "AbusoF")
    private boolean abusoF;

    @Column(name = "OtraI")
    private boolean otraI;

    @Column(name = "Apsicologico")
    private boolean apsicolgico;

    @Column(name = "envenenamiento")
    private boolean enve;

    @Column(name = "Picadura")
    private boolean picadura;

    @Column(name = "alientoE")
    private boolean etilico;

    @Column(name = "descripcion")
    private String desc;

    @Column(name = "Valor")
    private int valor;

    @Column(name = "otraV")
    private boolean otaraV;

    @Column(name = "AbusoS")
    private boolean abusoS;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_dmision", foreignKey = @ForeignKey(name = "FK_ACCIDENTE_ID"))
    private Admision admision;

    public Accidente() {
    }

    public Accidente(Long idAccidente, String nombreE, String direccionE, boolean policial, Date fecha, boolean transito, boolean caida, boolean quemadura, boolean mode, boolean ahogamiento, boolean extraño, boolean aplas, boolean otroa, boolean fuego, boolean ana, boolean alcolica, boolean corto, boolean alimentaria, boolean rina, boolean drogas, boolean VFamiliar, boolean gases, boolean abusoF, boolean otraI, boolean apsicolgico, boolean enve, boolean picadura, boolean etilico, String desc, int valor, boolean otaraV, boolean abusoS, Admision admision) {
        this.idAccidente = idAccidente;
        this.nombreE = nombreE;
        this.direccionE = direccionE;
        this.policial = policial;
        this.fecha = fecha;
        this.transito = transito;
        this.caida = caida;
        this.quemadura = quemadura;
        this.mode = mode;
        this.ahogamiento = ahogamiento;
        this.extraño = extraño;
        this.aplas = aplas;
        this.otroa = otroa;
        this.fuego = fuego;
        this.ana = ana;
        this.alcolica = alcolica;
        this.corto = corto;
        this.alimentaria = alimentaria;
        this.rina = rina;
        this.drogas = drogas;
        this.VFamiliar = VFamiliar;
        this.gases = gases;
        this.abusoF = abusoF;
        this.otraI = otraI;
        this.apsicolgico = apsicolgico;
        this.enve = enve;
        this.picadura = picadura;
        this.etilico = etilico;
        this.desc = desc;
        this.valor = valor;
        this.otaraV = otaraV;
        this.abusoS = abusoS;
        this.admision = admision;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getIdAccidente() {
        return idAccidente;
    }

    public void setIdAccidente(Long idAccidente) {
        this.idAccidente = idAccidente;
    }

    public boolean isTransito() {
        return transito;
    }

    public void setTransito(boolean transito) {
        this.transito = transito;
    }

    public boolean isCaida() {
        return caida;
    }

    public void setCaida(boolean caida) {
        this.caida = caida;
    }

    public boolean isQuemadura() {
        return quemadura;
    }

    public void setQuemadura(boolean quemadura) {
        this.quemadura = quemadura;
    }

    public boolean isMode() {
        return mode;
    }

    public void setMode(boolean mode) {
        this.mode = mode;
    }

    public boolean isAhogamiento() {
        return ahogamiento;
    }

    public void setAhogamiento(boolean ahogamiento) {
        this.ahogamiento = ahogamiento;
    }

    public boolean isExtraño() {
        return extraño;
    }

    public void setExtraño(boolean extraño) {
        this.extraño = extraño;
    }

    public boolean isAplas() {
        return aplas;
    }

    public void setAplas(boolean aplas) {
        this.aplas = aplas;
    }

    public boolean isOtroa() {
        return otroa;
    }

    public void setOtroa(boolean otroa) {
        this.otroa = otroa;
    }

    public boolean isFuego() {
        return fuego;
    }

    public void setFuego(boolean fuego) {
        this.fuego = fuego;
    }

    public boolean isAna() {
        return ana;
    }

    public void setAna(boolean ana) {
        this.ana = ana;
    }

    public boolean isAlcolica() {
        return alcolica;
    }

    public void setAlcolica(boolean alcolica) {
        this.alcolica = alcolica;
    }

    public boolean isCorto() {
        return corto;
    }

    public void setCorto(boolean corto) {
        this.corto = corto;
    }

    public boolean isAlimentaria() {
        return alimentaria;
    }

    public void setAlimentaria(boolean alimentaria) {
        this.alimentaria = alimentaria;
    }

    public boolean isRina() {
        return rina;
    }

    public void setRina(boolean rina) {
        this.rina = rina;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }

    public boolean isVFamiliar() {
        return VFamiliar;
    }

    public void setVFamiliar(boolean VFamiliar) {
        this.VFamiliar = VFamiliar;
    }

    public boolean isGases() {
        return gases;
    }

    public void setGases(boolean gases) {
        this.gases = gases;
    }

    public boolean isAbusoF() {
        return abusoF;
    }

    public void setAbusoF(boolean abusoF) {
        this.abusoF = abusoF;
    }

    public boolean isOtraI() {
        return otraI;
    }

    public void setOtraI(boolean otraI) {
        this.otraI = otraI;
    }

    public boolean isApsicolgico() {
        return apsicolgico;
    }

    public void setApsicolgico(boolean apsicolgico) {
        this.apsicolgico = apsicolgico;
    }

    public boolean isEnve() {
        return enve;
    }

    public void setEnve(boolean enve) {
        this.enve = enve;
    }

    public boolean isPicadura() {
        return picadura;
    }

    public void setPicadura(boolean picadura) {
        this.picadura = picadura;
    }

    public boolean isEtilico() {
        return etilico;
    }

    public void setEtilico(boolean etilico) {
        this.etilico = etilico;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Admision getAdmision() {
        return admision;
    }

    public void setAdmision(Admision admision) {
        this.admision = admision;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDireccionE() {
        return direccionE;
    }

    public void setDireccionE(String direccionE) {
        this.direccionE = direccionE;
    }

    public boolean isPolicial() {
        return policial;
    }

    public void setPolicial(boolean policial) {
        this.policial = policial;
    }

    public boolean isOtaraV() {
        return otaraV;
    }

    public void setOtaraV(boolean otaraV) {
        this.otaraV = otaraV;
    }

    public boolean isAbusoS() {
        return abusoS;
    }

    public void setAbusoS(boolean abusoS) {
        this.abusoS = abusoS;
    }

}
