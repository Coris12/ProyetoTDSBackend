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
@Table(name = "salud")
public class SaludBucal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_salud", nullable = false)
    private Long idSalud;

    @Column(name = "P16", length = 1)
    private String p16;

    @Column(name = "P17", length = 1)
    private String p17;

    @Column(name = "P55", length = 1)
    private String p55;

    @Column(name = "P11", length = 1)
    private String p11;

    @Column(name = "P21", length = 1)
    private String p21;

    @Column(name = "P51", length = 1)
    private String p51;
    @Column(name = "P26", length = 1)
    private String p26;

    @Column(name = "P27", length = 1)
    private String p27;

    @Column(name = "P65", length = 1)
    private String p65;

    @Column(name = "P36", length = 1)
    private String p36;

    @Column(name = "P37", length = 1)
    private String p37;

    @Column(name = "P75", length = 1)
    private String p75;

    @Column(name = "P31", length = 1)
    private String p31;

    @Column(name = "P41", length = 1)
    private String p41;

    @Column(name = "P71", length = 1)
    private String p71;

    @Column(name = "P46", length = 1)
    private String p46;

    @Column(name = "P47", length = 1)
    private String p47;

    @Column(name = "P85", length = 1)
    private String p85;

    @Column(name = "Placa1")
    private int placa1;

    @Column(name = "Placa2")
    private int placa2;

    @Column(name = "Placa3")
    private int placa3;

    @Column(name = "Placa4")
    private int placa4;

    @Column(name = "Placa5")
    private int placa5;

    @Column(name = "Placa6")
    private int placa6;

    @Column(name = "TotalP1")
    private int toatlP1;

    @Column(name = "Cal1")
    private int cal1;

    @Column(name = "Cal2")
    private int cal2;

    @Column(name = "Cal3")
    private int cal3;

    @Column(name = "Cal4")
    private int cal4;

    @Column(name = "Cal5")
    private int cal5;

    @Column(name = "Cal6")
    private int calcul6;

    @Column(name = "TotalC2")
    private int totalC2;

    @Column(name = "Gin1")
    private int gin1;

    @Column(name = "Gin2")
    private int gin2;

    @Column(name = "Gin3")
    private int gin3;

    @Column(name = "Gin4")
    private int gin4;

    @Column(name = "Gin5")
    private int gin5;

    @Column(name = "Gin6")
    private int gin6;

    @Column(name = "TotalG1")
    private int toatlG1;

    @Column(name = "Leve", length = 1)
    private String leve;

    @Column(name = "Moderada", length = 1)
    private String moderada;

    @Column(name = "Severa", length = 1)
    private String severa;

    @Column(name = "AngleI", length = 1)
    private String angleI;

    @Column(name = "AngleII", length = 1)
    private String angleII;

    @Column(name = "AngleIII", length = 1)
    private String angleIII;

    @Column(name = "LeveF", length = 1)
    private String leveF;

    @Column(name = "ModeradaF", length = 1)
    private String moderadaF;

    @Column(name = "SeveraF", length = 1)
    private String severaF;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_odontologia", foreignKey = @ForeignKey(name = "fk_odontolo_id"))
    private Odontologia odontologia;

    public SaludBucal() {
    }

    public SaludBucal(Long idSalud, String p16, String p17, String p55, String p11, String p21, String p51, String p26, String p27, String p65, String p36, String p37, String p75, String p31, String p41, String p71, String p46, String p47, String p85, int placa1, int placa2, int placa3, int placa4, int placa5, int placa6, int toatlP1, int cal1, int cal2, int cal3, int cal4, int cal5, int calcul6, int totalC2, int gin1, int gin2, int gin3, int gin4, int gin5, int gin6, int toatlG1, String leve, String moderada, String severa, String angleI, String angleII, String angleIII, String leveF, String moderadaF, String severaF, Odontologia odontologia) {
        this.idSalud = idSalud;
        this.p16 = p16;
        this.p17 = p17;
        this.p55 = p55;
        this.p11 = p11;
        this.p21 = p21;
        this.p51 = p51;
        this.p26 = p26;
        this.p27 = p27;
        this.p65 = p65;
        this.p36 = p36;
        this.p37 = p37;
        this.p75 = p75;
        this.p31 = p31;
        this.p41 = p41;
        this.p71 = p71;
        this.p46 = p46;
        this.p47 = p47;
        this.p85 = p85;
        this.placa1 = placa1;
        this.placa2 = placa2;
        this.placa3 = placa3;
        this.placa4 = placa4;
        this.placa5 = placa5;
        this.placa6 = placa6;
        this.toatlP1 = toatlP1;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        this.cal4 = cal4;
        this.cal5 = cal5;
        this.calcul6 = calcul6;
        this.totalC2 = totalC2;
        this.gin1 = gin1;
        this.gin2 = gin2;
        this.gin3 = gin3;
        this.gin4 = gin4;
        this.gin5 = gin5;
        this.gin6 = gin6;
        this.toatlG1 = toatlG1;
        this.leve = leve;
        this.moderada = moderada;
        this.severa = severa;
        this.angleI = angleI;
        this.angleII = angleII;
        this.angleIII = angleIII;
        this.leveF = leveF;
        this.moderadaF = moderadaF;
        this.severaF = severaF;
        this.odontologia = odontologia;
    }

    public Long getIdSalud() {
        return idSalud;
    }

    public void setIdSalud(Long idSalud) {
        this.idSalud = idSalud;
    }

    public String getP16() {
        return p16;
    }

    public void setP16(String p16) {
        this.p16 = p16;
    }

    public String getP17() {
        return p17;
    }

    public void setP17(String p17) {
        this.p17 = p17;
    }

    public String getP55() {
        return p55;
    }

    public void setP55(String p55) {
        this.p55 = p55;
    }

    public String getP11() {
        return p11;
    }

    public void setP11(String p11) {
        this.p11 = p11;
    }

    public String getP21() {
        return p21;
    }

    public void setP21(String p21) {
        this.p21 = p21;
    }

    public String getP26() {
        return p26;
    }

    public void setP26(String p26) {
        this.p26 = p26;
    }

    public String getP27() {
        return p27;
    }

    public void setP27(String p27) {
        this.p27 = p27;
    }

    public String getP65() {
        return p65;
    }

    public void setP65(String p65) {
        this.p65 = p65;
    }

    public String getP36() {
        return p36;
    }

    public void setP36(String p36) {
        this.p36 = p36;
    }

    public String getP37() {
        return p37;
    }

    public void setP37(String p37) {
        this.p37 = p37;
    }

    public String getP75() {
        return p75;
    }

    public void setP75(String p75) {
        this.p75 = p75;
    }

    public String getP31() {
        return p31;
    }

    public void setP31(String p31) {
        this.p31 = p31;
    }

    public String getP51() {
        return p51;
    }

    public void setP51(String p51) {
        this.p51 = p51;
    }
   
    public String getP41() {
        return p41;
    }

    public void setP41(String p41) {
        this.p41 = p41;
    }

    public String getP71() {
        return p71;
    }

    public void setP71(String p71) {
        this.p71 = p71;
    }

    public String getP46() {
        return p46;
    }

    public void setP46(String p46) {
        this.p46 = p46;
    }

    public String getP47() {
        return p47;
    }

    public void setP47(String p47) {
        this.p47 = p47;
    }

    public String getP85() {
        return p85;
    }

    public void setP85(String p85) {
        this.p85 = p85;
    }

    public int getPlaca1() {
        return placa1;
    }

    public void setPlaca1(int placa1) {
        this.placa1 = placa1;
    }

    public int getPlaca2() {
        return placa2;
    }

    public void setPlaca2(int placa2) {
        this.placa2 = placa2;
    }

    public int getPlaca3() {
        return placa3;
    }

    public void setPlaca3(int placa3) {
        this.placa3 = placa3;
    }

    public int getPlaca4() {
        return placa4;
    }

    public void setPlaca4(int placa4) {
        this.placa4 = placa4;
    }

    public int getPlaca5() {
        return placa5;
    }

    public void setPlaca5(int placa5) {
        this.placa5 = placa5;
    }

    public int getPlaca6() {
        return placa6;
    }

    public void setPlaca6(int placa6) {
        this.placa6 = placa6;
    }

    public int getToatlP1() {
        return toatlP1;
    }

    public void setToatlP1(int toatlP1) {
        this.toatlP1 = toatlP1;
    }

    public int getCal1() {
        return cal1;
    }

    public void setCal1(int cal1) {
        this.cal1 = cal1;
    }

    public int getCal2() {
        return cal2;
    }

    public void setCal2(int cal2) {
        this.cal2 = cal2;
    }

    public int getCal3() {
        return cal3;
    }

    public void setCal3(int cal3) {
        this.cal3 = cal3;
    }

    public int getCal4() {
        return cal4;
    }

    public void setCal4(int cal4) {
        this.cal4 = cal4;
    }

    public int getCal5() {
        return cal5;
    }

    public void setCal5(int cal5) {
        this.cal5 = cal5;
    }

    public int getCalcul6() {
        return calcul6;
    }

    public void setCalcul6(int calcul6) {
        this.calcul6 = calcul6;
    }

    public int getTotalC2() {
        return totalC2;
    }

    public void setTotalC2(int totalC2) {
        this.totalC2 = totalC2;
    }

    public int getGin1() {
        return gin1;
    }

    public void setGin1(int gin1) {
        this.gin1 = gin1;
    }

    public int getGin2() {
        return gin2;
    }

    public void setGin2(int gin2) {
        this.gin2 = gin2;
    }

    public int getGin3() {
        return gin3;
    }

    public void setGin3(int gin3) {
        this.gin3 = gin3;
    }

    public int getGin4() {
        return gin4;
    }

    public void setGin4(int gin4) {
        this.gin4 = gin4;
    }

    public int getGin5() {
        return gin5;
    }

    public void setGin5(int gin5) {
        this.gin5 = gin5;
    }

    public int getGin6() {
        return gin6;
    }

    public void setGin6(int gin6) {
        this.gin6 = gin6;
    }

    public int getToatlG1() {
        return toatlG1;
    }

    public void setToatlG1(int toatlG1) {
        this.toatlG1 = toatlG1;
    }

    public String getLeve() {
        return leve;
    }

    public void setLeve(String leve) {
        this.leve = leve;
    }

    public String getModerada() {
        return moderada;
    }

    public void setModerada(String moderada) {
        this.moderada = moderada;
    }

    public String getSevera() {
        return severa;
    }

    public void setSevera(String severa) {
        this.severa = severa;
    }

    public String getAngleI() {
        return angleI;
    }

    public void setAngleI(String angleI) {
        this.angleI = angleI;
    }

    public String getAngleII() {
        return angleII;
    }

    public void setAngleII(String angleII) {
        this.angleII = angleII;
    }

    public String getAngleIII() {
        return angleIII;
    }

    public void setAngleIII(String angleIII) {
        this.angleIII = angleIII;
    }

    public String getLeveF() {
        return leveF;
    }

    public void setLeveF(String leveF) {
        this.leveF = leveF;
    }

    public String getModeradaF() {
        return moderadaF;
    }

    public void setModeradaF(String moderadaF) {
        this.moderadaF = moderadaF;
    }

    public String getSeveraF() {
        return severaF;
    }

    public void setSeveraF(String severaF) {
        this.severaF = severaF;
    }

    public Odontologia getOdontologia() {
        return odontologia;
    }

    public void setOdontologia(Odontologia odontologia) {
        this.odontologia = odontologia;
    }

}
