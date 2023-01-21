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
@Table(name="indices")
public class IndicesCPO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_indice", nullable = false)
    private Long idIndice;
    
    @Column(name="D")
    private int D;
    
    @Column(name="C")
    private int C;
    
    @Column(name="P")
    private int P;
    
    @Column(name="O")
    private int O;
    
    @Column(name="TotalD")
    private int totalD;
    
    @Column(name="d1")
    private int d1;
    
    @Column(name="c1")
    private int c1;
    
    @Column(name="p1")
    private int p1;
    
    @Column(name="o1")
    private int o1;
    
    @Column(name="Totald1")
    private int totald1;
    
    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_odontologia", foreignKey = @ForeignKey(name = "fk_odontolo_id"))
    private Odontologia odontologia;

    public IndicesCPO() {
    }

    public IndicesCPO(Long idIndice, int D, int C, int P, int O, int totalD, int d1, int c1, int p1, int o1, int totald1, Odontologia odontologia) {
        this.idIndice = idIndice;
        this.D = D;
        this.C = C;
        this.P = P;
        this.O = O;
        this.totalD = totalD;
        this.d1 = d1;
        this.c1 = c1;
        this.p1 = p1;
        this.o1 = o1;
        this.totald1 = totald1;
        this.odontologia = odontologia;
    }

    public Long getIdIndice() {
        return idIndice;
    }

    public void setIdIndice(Long idIndice) {
        this.idIndice = idIndice;
    }

    public int getD() {
        return D;
    }

    public void setD(int D) {
        this.D = D;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public int getP() {
        return P;
    }

    public void setP(int P) {
        this.P = P;
    }

    public int getO() {
        return O;
    }

    public void setO(int O) {
        this.O = O;
    }

    public int getTotalD() {
        return totalD;
    }

    public void setTotalD(int totalD) {
        this.totalD = totalD;
    }

    public int getD1() {
        return d1;
    }

    public void setD1(int d1) {
        this.d1 = d1;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getO1() {
        return o1;
    }

    public void setO1(int o1) {
        this.o1 = o1;
    }

    public int getTotald1() {
        return totald1;
    }

    public void setTotald1(int totald1) {
        this.totald1 = totald1;
    }

    public Odontologia getOdontologia() {
        return odontologia;
    }

    public void setOdontologia(Odontologia odontologia) {
        this.odontologia = odontologia;
    }
    
    
}
