package com.ProyectoTDSBackend.dto;

import java.util.Date;

public class ConsultaExternaByIdDTO {
    private String duracionConsulta;
    private String nombresProfesional;
    private String identificacion;
    private int idConsexterna; 
    private String establecimiento; 
    private String nombres; 
    private String sexo; 
    private int historiaClinica;
    private String motivoConsulta; 
    private String enfermedadActual; 
    private Date fecha;
    private String clinicos; 
    private String quirurgicos; 
    private boolean cardiopatia; 
    private boolean diabetes; 
    private boolean enfCardiovasculares;
    private boolean hipertension;
    private boolean cancer;
    private boolean tuberculosis;
    private boolean enfMentales;
    private boolean enfInfecciosas;
    private boolean malformaciones;
    private boolean otros;
    private String familiares;
    private String organoSentido;
    private String respiratorio;
    private String cardiovascular;
    private String digestivo;
    private String genital;
    private String urinario;
    private String musculoEsqueletico;
    private String endocrino;
    private String hemolenfatico;
    private String nervioso;
    private String descripcion;
    private Date fechaMedicion;
    private double temperatura;
    private String presionArterial;
    private int pulso;
    private double frecRespiratoria;
    private double peso;
    private double talla;
    private String cabeza;
    private String cuello;
    private String torax;
    private String abdomen;
    private String pelvis;
    private String extremidades;
    private String observaciones;
    private String descripcionDiagnostico;
    private String cie;
    private String preDef;
    private String descripcionPreDef;
    private String descripcionPreDefCie;
    private String descripcionPreDefPreDef;
    private String m;
    private String i;
    private String l;
    private String r;
    private String c;
    private String t;
    private String o;

    public ConsultaExternaByIdDTO() {
    }
 
    public ConsultaExternaByIdDTO(String duracionConsulta, String nombresProfesional, String identificacion,
            int idConsexterna, String establecimiento, String nombres, String sexo, int historiaClinica,
            String motivoConsulta, String enfermedadActual, Date fecha, String clinicos, String quirurgicos,
            boolean cardiopatia, boolean diabetes, boolean enfCardiovasculares, boolean hipertension, boolean cancer,
            boolean tuberculosis, boolean enfMentales, boolean enfInfecciosas, boolean malformaciones, boolean otros,
            String familiares, String organoSentido, String respiratorio, String cardiovascular, String digestivo,
            String genital, String urinario, String musculoEsqueletico, String endocrino, String hemolenfatico,
            String nervioso, String descripcion, Date fechaMedicion, double temperatura, String presionArterial,
            int pulso, double frecRespiratoria, double peso, double talla, String cabeza, String cuello, String torax,
            String abdomen, String pelvis, String extremidades, String observaciones, String descripcionDiagnostico,
            String cie, String preDef, String descripcionPreDef, String descripcionPreDefCie,
            String descripcionPreDefPreDef, String m, String i, String l, String r, String c, String t, String o) {
        this.duracionConsulta = duracionConsulta;
        this.nombresProfesional = nombresProfesional;
        this.identificacion = identificacion;
        this.idConsexterna = idConsexterna;
        this.establecimiento = establecimiento;
        this.nombres = nombres;
        this.sexo = sexo;
        this.historiaClinica = historiaClinica;
        this.motivoConsulta = motivoConsulta;
        this.enfermedadActual = enfermedadActual;
        this.fecha = fecha;
        this.clinicos = clinicos;
        this.quirurgicos = quirurgicos;
        this.cardiopatia = cardiopatia;
        this.diabetes = diabetes;
        this.enfCardiovasculares = enfCardiovasculares;
        this.hipertension = hipertension;
        this.cancer = cancer;
        this.tuberculosis = tuberculosis;
        this.enfMentales = enfMentales;
        this.enfInfecciosas = enfInfecciosas;
        this.malformaciones = malformaciones;
        this.otros = otros;
        this.familiares = familiares;
        this.organoSentido = organoSentido;
        this.respiratorio = respiratorio;
        this.cardiovascular = cardiovascular;
        this.digestivo = digestivo;
        this.genital = genital;
        this.urinario = urinario;
        this.musculoEsqueletico = musculoEsqueletico;
        this.endocrino = endocrino;
        this.hemolenfatico = hemolenfatico;
        this.nervioso = nervioso;
        this.descripcion = descripcion;
        this.fechaMedicion = fechaMedicion;
        this.temperatura = temperatura;
        this.presionArterial = presionArterial;
        this.pulso = pulso;
        this.frecRespiratoria = frecRespiratoria;
        this.peso = peso;
        this.talla = talla;
        this.cabeza = cabeza;
        this.cuello = cuello;
        this.torax = torax;
        this.abdomen = abdomen;
        this.pelvis = pelvis;
        this.extremidades = extremidades;
        this.observaciones = observaciones;
        this.descripcionDiagnostico = descripcionDiagnostico;
        this.cie = cie;
        this.preDef = preDef;
        this.descripcionPreDef = descripcionPreDef;
        this.descripcionPreDefCie = descripcionPreDefCie;
        this.descripcionPreDefPreDef = descripcionPreDefPreDef;
        this.m = m;
        this.i = i;
        this.l = l;
        this.r = r;
        this.c = c;
        this.t = t;
        this.o = o;
    }


    public String getDuracionConsulta() {
        return duracionConsulta;
    }

    public void setDuracionConsulta(String duracionConsulta) {
        this.duracionConsulta = duracionConsulta;
    }

    public String getNombresProfesional() {
        return nombresProfesional;
    }

    public void setNombresProfesional(String nombresProfesional) {
        this.nombresProfesional = nombresProfesional;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdConsexterna() {
        return idConsexterna;
    }

    public void setIdConsexterna(int idConsexterna) {
        this.idConsexterna = idConsexterna;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
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

    public int getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(int historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getEnfermedadActual() {
        return enfermedadActual;
    }

    public void setEnfermedadActual(String enfermedadActual) {
        this.enfermedadActual = enfermedadActual;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getClinicos() {
        return clinicos;
    }

    public void setClinicos(String clinicos) {
        this.clinicos = clinicos;
    }

    public String getQuirurgicos() {
        return quirurgicos;
    }

    public void setQuirurgicos(String quirurgicos) {
        this.quirurgicos = quirurgicos;
    }

    public boolean isCardiopatia() {
        return cardiopatia;
    }

    public void setCardiopatia(boolean cardiopatia) {
        this.cardiopatia = cardiopatia;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isEnfCardiovasculares() {
        return enfCardiovasculares;
    }

    public void setEnfCardiovasculares(boolean enfCardiovasculares) {
        this.enfCardiovasculares = enfCardiovasculares;
    }

    public boolean isHipertension() {
        return hipertension;
    }

    public void setHipertension(boolean hipertension) {
        this.hipertension = hipertension;
    }

    public boolean isCancer() {
        return cancer;
    }

    public void setCancer(boolean cancer) {
        this.cancer = cancer;
    }

    public boolean isTuberculosis() {
        return tuberculosis;
    }

    public void setTuberculosis(boolean tuberculosis) {
        this.tuberculosis = tuberculosis;
    }

    public boolean isEnfMentales() {
        return enfMentales;
    }

    public void setEnfMentales(boolean enfMentales) {
        this.enfMentales = enfMentales;
    }

    public boolean isEnfInfecciosas() {
        return enfInfecciosas;
    }

    public void setEnfInfecciosas(boolean enfInfecciosas) {
        this.enfInfecciosas = enfInfecciosas;
    }

    public boolean isMalformaciones() {
        return malformaciones;
    }

    public void setMalformaciones(boolean malformaciones) {
        this.malformaciones = malformaciones;
    }

    public boolean isOtros() {
        return otros;
    }

    public void setOtros(boolean otros) {
        this.otros = otros;
    }

    public String getFamiliares() {
        return familiares;
    }

    public void setFamiliares(String familiares) {
        this.familiares = familiares;
    }

    public String getOrganoSentido() {
        return organoSentido;
    }

    public void setOrganoSentido(String organoSentido) {
        this.organoSentido = organoSentido;
    }

    public String getRespiratorio() {
        return respiratorio;
    }

    public void setRespiratorio(String respiratorio) {
        this.respiratorio = respiratorio;
    }

    public String getCardiovascular() {
        return cardiovascular;
    }

    public void setCardiovascular(String cardiovascular) {
        this.cardiovascular = cardiovascular;
    }

    public String getDigestivo() {
        return digestivo;
    }

    public void setDigestivo(String digestivo) {
        this.digestivo = digestivo;
    }

    public String getGenital() {
        return genital;
    }

    public void setGenital(String genital) {
        this.genital = genital;
    }

    public String getUrinario() {
        return urinario;
    }

    public void setUrinario(String urinario) {
        this.urinario = urinario;
    }

    public String getMusculoEsqueletico() {
        return musculoEsqueletico;
    }

    public void setMusculoEsqueletico(String musculoEsqueletico) {
        this.musculoEsqueletico = musculoEsqueletico;
    }

    public String getEndocrino() {
        return endocrino;
    }

    public void setEndocrino(String endocrino) {
        this.endocrino = endocrino;
    }

    public String getHemolenfatico() {
        return hemolenfatico;
    }

    public void setHemolenfatico(String hemolenfatico) {
        this.hemolenfatico = hemolenfatico;
    }

    public String getNervioso() {
        return nervioso;
    }

    public void setNervioso(String nervioso) {
        this.nervioso = nervioso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaMedicion() {
        return fechaMedicion;
    }

    public void setFechaMedicion(Date fechaMedicion) {
        this.fechaMedicion = fechaMedicion;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getPresionArterial() {
        return presionArterial;
    }

    public void setPresionArterial(String presionArterial) {
        this.presionArterial = presionArterial;
    }

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    public double getFrecRespiratoria() {
        return frecRespiratoria;
    }

    public void setFrecRespiratoria(double frecRespiratoria) {
        this.frecRespiratoria = frecRespiratoria;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDescripcionDiagnostico() {
        return descripcionDiagnostico;
    }

    public void setDescripcionDiagnostico(String descripcionDiagnostico) {
        this.descripcionDiagnostico = descripcionDiagnostico;
    }

    public String getCie() {
        return cie;
    }

    public void setCie(String cie) {
        this.cie = cie;
    }

    public String getPreDef() {
        return preDef;
    }

    public void setPreDef(String preDef) {
        this.preDef = preDef;
    }

    public String getDescripcionPreDef() {
        return descripcionPreDef;
    }

    public void setDescripcionPreDef(String descripcionPreDef) {
        this.descripcionPreDef = descripcionPreDef;
    }

    public String getDescripcionPreDefCie() {
        return descripcionPreDefCie;
    }

    public void setDescripcionPreDefCie(String descripcionPreDefCie) {
        this.descripcionPreDefCie = descripcionPreDefCie;
    }

    public String getDescripcionPreDefPreDef() {
        return descripcionPreDefPreDef;
    }

    public void setDescripcionPreDefPreDef(String descripcionPreDefPreDef) {
        this.descripcionPreDefPreDef = descripcionPreDefPreDef;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }
}
