
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
public class OdontologiaDto {

    private int idOdonto;
    private String codigo;
    private String diagnostico;
    private String enfermedad;
    private String establecimeinto;
    private Date fecha;
    private String nombres;
    private String sexo;
    private int num_cli;
    private int edad;
    private int frec_cardiaca;
    private int frec_respira;
    private String motivo_consulta;
    private String prescipcion;
    private int presion_arterial;
    private String procedimientos;
    private String sesion;
    private int temperatura;
    private boolean alergia_anes;
    private boolean alergiaa;
    private boolean asma;
    private boolean diabetes;
    private String descripcion;
    private boolean enf_car;
    private boolean hemorragias;
    private boolean otros;
    private boolean tuberculosis;
    private boolean vh_sida;
    private boolean a_t_m;
    private boolean carrillos;
    private String descripcione;
    private boolean glandulas_sa;
    private boolean glangios;
    private boolean labio;
    private boolean lengua;
    private boolean maxilar_su;
    private boolean maxilar_in;
    private boolean mejillas;
    private boolean oro;
    private boolean paladar;
    private boolean piso;
    private String anglei;
    private String angleii;
    private String angleiii;
    private int cal1;
    private int cal2;
    private int cal3;
    private int cal4;
    private int cal5;
    private int cal6;
    private int gin1;
    private int gin2;
    private int gin3;
    private int gin4;
    private int gin5;
    private int gin6;
    private String leve;
    private String levef;
    private String moderada;
    private String moderadaf;
    private String p11;
    private String p16;
    private String p17;
    private String p21;
    private String p26;
    private String p27;
    private String p31;
    private String p36;
    private String p37;
    private String p41;
    private String p46;
    private String p47;
    private String p55;
    private String p65;
    private String p71;
    private String p75;
    private String p85;
    private int placa1;
    private int placa2;
    private int placa3;
    private int placa4;
    private int placa5;
    private int placa6;
    private String severa;
    private String severaf;
    private int totalg1;
    private int totalp1;
    private int totalc2;
    private String p51;
    private int d;
    private int c;
    private int p;
    private int o;
    private int totald;
    private int d1;
    private int c1;
    private int p1;
    private int o1;
    private int totald1;
    private boolean biometrica;
    private boolean otrosp;
    private String quimicas;
    private String descripcionp;
    private boolean rayosx;
    private String cie1;
    private String cie2;
    private String def;
    private String def1;
    private String descripcion1;
    private String descripcion2;
    private Date fechaa;
    private Date fechac;
    private String pre1;
    private String pre2;
    private String profesional;

    
    public OdontologiaDto() {
    }

    public OdontologiaDto(String codigo, String diagnostico, String enfermedad, String establecimeinto, Date fecha, String nombres, String sexo, int num_cli, int edad, int frec_cardiaca, int frec_respira, String motivo_consulta, String prescipcion, int presion_arterial, String procedimientos, String sesion, int temperatura, boolean alergia_anes, boolean alergiaa, boolean asma, boolean diabetes, String descripcion, boolean enf_car, boolean hemorragias, boolean otros, boolean tuberculosis, boolean vh_sida, boolean a_t_m, boolean carrillos, String descripcione, boolean glandulas_sa, boolean glangios, boolean labio, boolean lengua, boolean maxilar_su, boolean maxilar_in, boolean mejillas, boolean oro, boolean paladar, boolean piso, String anglei, String angleii, String angleiii, int cal1, int cal2, int cal3, int cal4, int cal5, int cal6, int gin1, int gin2, int gin3, int gin4, int gin5, int gin6, String leve, String levef, String moderada, String moderadaf, String p11, String p16, String p17, String p21, String p26, String p27, String p31, String p36, String p37, String p41, String p46, String p47, String p55, String p65, String p71, String p75, String p85, int placa1, int placa2, int placa3, int placa4, int placa5, int placa6, String severa, String severaf, int totalg1, int totalp1, int totalc2, String p51, int d, int c, int p, int o, int totald, int d1, int c1, int p1, int o1, int totald1, boolean biometrica, boolean otrosp, String quimicas, String descripcionp, boolean rayosx, String cie1, String cie2, String def, String def1, String descripcion1, String descripcion2, Date fechaa, Date fechac, String pre1, String pre2, String profesional) {
        this.codigo = codigo;
        this.diagnostico = diagnostico;
        this.enfermedad = enfermedad;
        this.establecimeinto = establecimeinto;
        this.fecha = fecha;
        this.nombres = nombres;
        this.sexo = sexo;
        this.num_cli = num_cli;
        this.edad = edad;
        this.frec_cardiaca = frec_cardiaca;
        this.frec_respira = frec_respira;
        this.motivo_consulta = motivo_consulta;
        this.prescipcion = prescipcion;
        this.presion_arterial = presion_arterial;
        this.procedimientos = procedimientos;
        this.sesion = sesion;
        this.temperatura = temperatura;
        this.alergia_anes = alergia_anes;
        this.alergiaa = alergiaa;
        this.asma = asma;
        this.diabetes = diabetes;
        this.descripcion = descripcion;
        this.enf_car = enf_car;
        this.hemorragias = hemorragias;
        this.otros = otros;
        this.tuberculosis = tuberculosis;
        this.vh_sida = vh_sida;
        this.a_t_m = a_t_m;
        this.carrillos = carrillos;
        this.descripcione = descripcione;
        this.glandulas_sa = glandulas_sa;
        this.glangios = glangios;
        this.labio = labio;
        this.lengua = lengua;
        this.maxilar_su = maxilar_su;
        this.maxilar_in = maxilar_in;
        this.mejillas = mejillas;
        this.oro = oro;
        this.paladar = paladar;
        this.piso = piso;
        this.anglei = anglei;
        this.angleii = angleii;
        this.angleiii = angleiii;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
        this.cal4 = cal4;
        this.cal5 = cal5;
        this.cal6 = cal6;
        this.gin1 = gin1;
        this.gin2 = gin2;
        this.gin3 = gin3;
        this.gin4 = gin4;
        this.gin5 = gin5;
        this.gin6 = gin6;
        this.leve = leve;
        this.levef = levef;
        this.moderada = moderada;
        this.moderadaf = moderadaf;
        this.p11 = p11;
        this.p16 = p16;
        this.p17 = p17;
        this.p21 = p21;
        this.p26 = p26;
        this.p27 = p27;
        this.p31 = p31;
        this.p36 = p36;
        this.p37 = p37;
        this.p41 = p41;
        this.p46 = p46;
        this.p47 = p47;
        this.p55 = p55;
        this.p65 = p65;
        this.p71 = p71;
        this.p75 = p75;
        this.p85 = p85;
        this.placa1 = placa1;
        this.placa2 = placa2;
        this.placa3 = placa3;
        this.placa4 = placa4;
        this.placa5 = placa5;
        this.placa6 = placa6;
        this.severa = severa;
        this.severaf = severaf;
        this.totalg1 = totalg1;
        this.totalp1 = totalp1;
        this.totalc2 = totalc2;
        this.p51 = p51;
        this.d = d;
        this.c = c;
        this.p = p;
        this.o = o;
        this.totald = totald;
        this.d1 = d1;
        this.c1 = c1;
        this.p1 = p1;
        this.o1 = o1;
        this.totald1 = totald1;
        this.biometrica = biometrica;
        this.otrosp = otrosp;
        this.quimicas = quimicas;
        this.descripcionp = descripcionp;
        this.rayosx = rayosx;
        this.cie1 = cie1;
        this.cie2 = cie2;
        this.def = def;
        this.def1 = def1;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.fechaa = fechaa;
        this.fechac = fechac;
        this.pre1 = pre1;
        this.pre2 = pre2;
        this.profesional = profesional;
    }



    public int getIdOdonto() {
        return idOdonto;
    }

    public void setIdOdonto(int idOdonto) {
        this.idOdonto = idOdonto;
    }

    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

   

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNum_cli() {
        return num_cli;
    }

    public void setNum_cli(int num_cli) {
        this.num_cli = num_cli;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getFrec_cardiaca() {
        return frec_cardiaca;
    }

    public void setFrec_cardiaca(int frec_cardiaca) {
        this.frec_cardiaca = frec_cardiaca;
    }

    public int getFrec_respira() {
        return frec_respira;
    }

    public void setFrec_respira(int frec_respira) {
        this.frec_respira = frec_respira;
    }

    
    public String getMotivo_consulta() {
        return motivo_consulta;
    }

    public void setMotivo_consulta(String motivo_consulta) {
        this.motivo_consulta = motivo_consulta;
    }

    public String getPrescipcion() {
        return prescipcion;
    }

    public void setPrescipcion(String prescipcion) {
        this.prescipcion = prescipcion;
    }

    public int getPresion_arterial() {
        return presion_arterial;
    }

    public void setPresion_arterial(int presion_arterial) {
        this.presion_arterial = presion_arterial;
    }

    public String getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(String procedimientos) {
        this.procedimientos = procedimientos;
    }

    public String getSesion() {
        return sesion;
    }

    public void setSesion(String sesion) {
        this.sesion = sesion;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public boolean isAlergia_anes() {
        return alergia_anes;
    }

    public void setAlergia_anes(boolean alergia_anes) {
        this.alergia_anes = alergia_anes;
    }

    public boolean isAlergiaa() {
        return alergiaa;
    }

    public void setAlergiaa(boolean alergiaa) {
        this.alergiaa = alergiaa;
    }

    public boolean isAsma() {
        return asma;
    }

    public void setAsma(boolean asma) {
        this.asma = asma;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEnf_car() {
        return enf_car;
    }

    public void setEnf_car(boolean enf_car) {
        this.enf_car = enf_car;
    }

    public boolean isHemorragias() {
        return hemorragias;
    }

    public void setHemorragias(boolean hemorragias) {
        this.hemorragias = hemorragias;
    }

    public boolean isOtros() {
        return otros;
    }

    public void setOtros(boolean otros) {
        this.otros = otros;
    }

    public boolean isTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(boolean tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public boolean isVh_sida() {
        return vh_sida;
    }

    public void setVh_sida(boolean vh_sida) {
        this.vh_sida = vh_sida;
    }

    public boolean isA_t_m() {
        return a_t_m;
    }

    public void setA_t_m(boolean a_t_m) {
        this.a_t_m = a_t_m;
    }

    public boolean isCarrillos() {
        return carrillos;
    }

    public void setCarrillos(boolean carrillos) {
        this.carrillos = carrillos;
    }

    public String getDescripcione() {
        return descripcione;
    }

    public void setDescripcione(String descripcione) {
        this.descripcione = descripcione;
    }

    public boolean isGlandulas_sa() {
        return glandulas_sa;
    }

    public void setGlandulas_sa(boolean glandulas_sa) {
        this.glandulas_sa = glandulas_sa;
    }

    public boolean isGlangios() {
        return glangios;
    }

    public void setGlangios(boolean glangios) {
        this.glangios = glangios;
    }

    public boolean isLabio() {
        return labio;
    }

    public void setLabio(boolean labio) {
        this.labio = labio;
    }

    public boolean isLengua() {
        return lengua;
    }

    public void setLengua(boolean lengua) {
        this.lengua = lengua;
    }

    public boolean isMaxilar_su() {
        return maxilar_su;
    }

    public void setMaxilar_su(boolean maxilar_su) {
        this.maxilar_su = maxilar_su;
    }

    public boolean isMaxilar_in() {
        return maxilar_in;
    }

    public void setMaxilar_in(boolean maxilar_in) {
        this.maxilar_in = maxilar_in;
    }

    public boolean isMejillas() {
        return mejillas;
    }

    public void setMejillas(boolean mejillas) {
        this.mejillas = mejillas;
    }

    public boolean isOro() {
        return oro;
    }

    public void setOro(boolean oro) {
        this.oro = oro;
    }

    public boolean isPaladar() {
        return paladar;
    }

    public void setPaladar(boolean paladar) {
        this.paladar = paladar;
    }

    public boolean isPiso() {
        return piso;
    }

    public void setPiso(boolean piso) {
        this.piso = piso;
    }

    public String getAnglei() {
        return anglei;
    }

    public void setAnglei(String anglei) {
        this.anglei = anglei;
    }

    public String getAngleii() {
        return angleii;
    }

    public void setAngleii(String angleii) {
        this.angleii = angleii;
    }

    public String getAngleiii() {
        return angleiii;
    }

    public void setAngleiii(String angleiii) {
        this.angleiii = angleiii;
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

    public int getCal6() {
        return cal6;
    }

    public void setCal6(int cal6) {
        this.cal6 = cal6;
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

    public String getLeve() {
        return leve;
    }

    public void setLeve(String leve) {
        this.leve = leve;
    }

    public String getLevef() {
        return levef;
    }

    public void setLevef(String levef) {
        this.levef = levef;
    }

    public String getModerada() {
        return moderada;
    }

    public void setModerada(String moderada) {
        this.moderada = moderada;
    }

    public String getModeradaf() {
        return moderadaf;
    }

    public void setModeradaf(String moderadaf) {
        this.moderadaf = moderadaf;
    }

    public String getP11() {
        return p11;
    }

    public void setP11(String p11) {
        this.p11 = p11;
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

    public String getP31() {
        return p31;
    }

    public void setP31(String p31) {
        this.p31 = p31;
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

    public String getP41() {
        return p41;
    }

    public void setP41(String p41) {
        this.p41 = p41;
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

    public String getP55() {
        return p55;
    }

    public void setP55(String p55) {
        this.p55 = p55;
    }

    public String getP65() {
        return p65;
    }

    public void setP65(String p65) {
        this.p65 = p65;
    }

    public String getP71() {
        return p71;
    }

    public void setP71(String p71) {
        this.p71 = p71;
    }

    public String getP75() {
        return p75;
    }

    public void setP75(String p75) {
        this.p75 = p75;
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

    public String getSevera() {
        return severa;
    }

    public void setSevera(String severa) {
        this.severa = severa;
    }

    public String getSeveraf() {
        return severaf;
    }

    public void setSeveraf(String severaf) {
        this.severaf = severaf;
    }



    

    public int getTotalg1() {
        return totalg1;
    }

    public void setTotalg1(int totalg1) {
        this.totalg1 = totalg1;
    }

    public int getTotalp1() {
        return totalp1;
    }

    public void setTotalp1(int totalp1) {
        this.totalp1 = totalp1;
    }

    public int getTotalc2() {
        return totalc2;
    }

    public void setTotalc2(int totalc2) {
        this.totalc2 = totalc2;
    }

    public String getP51() {
        return p51;
    }

    public void setP51(String p51) {
        this.p51 = p51;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getO() {
        return o;
    }

    public void setO(int o) {
        this.o = o;
    }

    public int getTotald() {
        return totald;
    }

    public void setTotald(int totald) {
        this.totald = totald;
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

    public boolean isBiometrica() {
        return biometrica;
    }

    public void setBiometrica(boolean biometrica) {
        this.biometrica = biometrica;
    }

    public boolean isOtrosp() {
        return otrosp;
    }

    public void setOtrosp(boolean otrosp) {
        this.otrosp = otrosp;
    }

    public String getQuimicas() {
        return quimicas;
    }

    public void setQuimicas(String quimicas) {
        this.quimicas = quimicas;
    }

   

    public String getDescripcionp() {
        return descripcionp;
    }

    public void setDescripcionp(String descripcionp) {
        this.descripcionp = descripcionp;
    }

    public boolean isRayosx() {
        return rayosx;
    }

    public void setRayosx(boolean rayosx) {
        this.rayosx = rayosx;
    }

    public String getCie1() {
        return cie1;
    }

    public void setCie1(String cie1) {
        this.cie1 = cie1;
    }

    public String getCie2() {
        return cie2;
    }

    public void setCie2(String cie2) {
        this.cie2 = cie2;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    public String getDef1() {
        return def1;
    }

    public void setDef1(String def1) {
        this.def1 = def1;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public String getDescripcion2() {
        return descripcion2;
    }

    public void setDescripcion2(String descripcion2) {
        this.descripcion2 = descripcion2;
    }

    public Date getFechaa() {
        return fechaa;
    }

    public void setFechaa(Date fechaa) {
        this.fechaa = fechaa;
    }

    public Date getFechac() {
        return fechac;
    }

    public void setFechac(Date fechac) {
        this.fechac = fechac;
    }

    public String getPre1() {
        return pre1;
    }

    public void setPre1(String pre1) {
        this.pre1 = pre1;
    }

    public String getPre2() {
        return pre2;
    }

    public void setPre2(String pre2) {
        this.pre2 = pre2;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public String getEstablecimeinto() {
        return establecimeinto;
    }

    public void setEstablecimeinto(String establecimeinto) {
        this.establecimeinto = establecimeinto;
    }
    
    
}
