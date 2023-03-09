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
public class AdmisionDto {

    private int idAd;
    private String canton;
    private String cod_ud;
    private String direccp;
    private String emergencia;
    private String empresa;
    private Date fecha;
    private Date fechaa;
    private String fuente;
    private String instruccion;
    private String institucion_sistema;
    private String nombre;
    private String numero;
    private String ocupacion;
    private String parantesco;
    private String parroquia;
    private String persona;
    private String provincia;
    private String referidod;
    private String servicio;
    private String telefono;
    private String tipos;
    private String unida_operativa;
    private int num_cli;
    private String nombres;
    private String celular;
    private String barrio;
    private String parro;
    private String can;
    private String provi;
    private String nacionalidad;
    private String sexo;
    private String estado_civil;
    private String direccion;
    private String ambulancia;
    private String ambulatorio;
    private String otrot;
    private String causac;
    private String descrip;
    private String grupo;
    private String hora;
    private String motivo;
    private String obstretica;
    private String policia;
    private String quirurgica;
    private String trauma;
    private boolean familiar;
    private boolean abusof;
    private boolean abusos;
    private boolean ahogamiento;
    private boolean ialcoholica;
    private boolean almientaria;
    private boolean anafilaxia;
    private boolean aplastamiento;
    private boolean apsicologico;
    private boolean caida;
    private boolean vcorto;
    private String descr;
    private String direcciona;
    private boolean drogas;
    private boolean enve;
    private boolean alientoe;
    private boolean c_extraño;
    private Date fechae;
    private boolean armaf;
    private boolean gases;
    private boolean moderdura;
    private String nombrea;
    private boolean policial;
    private boolean quemadura;
    private boolean rina;
    private boolean transito;
    private int valor;
    private boolean otrav;
    private boolean picadura;
    private boolean otrai;
    private boolean otroa;
    private boolean alergico;
    private boolean clinico;
    private String decripcione;
    private String descriciona;
    private boolean condicion_estable;
    private boolean condicion_inestable;
    private boolean farmacolo;
    private boolean ginecologico;
    private boolean via_aerea;
    private boolean via_obstruida;
    private boolean otroe;
    private boolean psiquiatrico;
    private boolean quirurgico;
    private boolean traumato;
    private String abdomens;
    private int t_axilar;
    private int t_bucal;
    private String cabezas;
    private int capilar;
    private String columnas;
    private String cuello;
    private String descripcions;
    private String extremidades;
    private int fcardiaca;
    private int motora;
    private int ocular;
    private int satura;
    private String pelvis;
    private int peso;
    private int presion;
    private String pupilad;
    private String pupilai;
    private int frespiratoria;
    private int talla;
    private String torax;
    private int totals;
    private int verbal;
    private String via_obstruidasp;
    private String cerrada;
    private String cortante;
    private String esguince;
    private String excoracion;
    private String expuesta;
    private String extraña;
    private String hematoma;
    private String hemorragia;
    private String inflamacion;
    private String deformacion;
    private String moderdural;
    private String penetrante;
    private String picadural;
    private String quemaduraf;
    private String abortos;
    private String borramiento;
    private String cesareas;
    private String contraciones;
    private String dilatacion;
    private Date fecham;
    private String fetal;
    private String frecuenciam;
    private String gestas;
    private String membranas;
    private String partos;
    private String plano;
    private String presentacion;
    private String semanas;
    private String sangrado;
    private int tiempo;
    private String uterina;
    private String util;
    private boolean abdomeno;
    private boolean biometricas;
    private boolean electro_car;
    private String descripciono;
    private boolean ecoabdomen;
    private boolean electrolitos;
    private boolean endoscopia;
    private boolean gastrometira;
    private boolean interconsulta;
    private boolean osea;
    private boolean otroso;
    private boolean ecopelvica;
    private boolean resonancia;
    private boolean quimicaso;
    private boolean tomografia;
    private boolean toraxo;
    private boolean uroanalisis;
    private String cie1;
    private String cie2;
    private String cie3;
    private String descripcion1;
    private String descripcion2;
    private String descripcion3;
    private String d1;
    private String d2;
    private String d3;
    private String cie1a;
    private String cie2a;
    private String cie3a;
    private String descripcion1a;
    private String descripcion2a;
    private String descripcion3a;
    private String d1a;
    private String d2a;
    private String d3a;
    private String indicaciones;
    private String medicamento1;
    private String medicamento2;
    private String medicamento3;
    private String posologia;
    private String posologia2;
    private String posologia3;
    private boolean cexterna;
    private String causaa;
    private String codigoa;
    private int diasa;
    private boolean domicilio;
    private boolean establea;
    private String establecimientoa;
    private Date fechas;
    private boolean inestablea;
    private boolean internacion;
    private boolean muerto;
    private String nombrep;
    private boolean observaciona;
    private boolean referenciaa;
    private String servicioa;
    private boolean vivo;

    public AdmisionDto() {
    }

    public AdmisionDto(String canton, String cod_ud, String direccp, String emergencia, String empresa, Date fecha, Date fechaa, String fuente, String instruccion, String institucion_sistema, String nombre, String numero, String ocupacion, String parantesco, String parroquia, String persona, String provincia, String referidod, String servicio, String telefono, String tipos, String unida_operativa, int num_cli, String nombres, String celular, String barrio, String parro, String can, String provi, String nacionalidad, String sexo, String estado_civil, String direccion, String ambulancia, String ambulatorio, String otrot, String causac, String descrip, String grupo, String hora, String motivo, String obstretica, String policia, String quirurgica, String trauma, boolean familiar, boolean abusof, boolean abusos, boolean ahogamiento, boolean ialcoholica, boolean almientaria, boolean anafilaxia, boolean aplastamiento, boolean apsicologico, boolean caida, boolean vcorto, String descr, String direcciona, boolean drogas, boolean enve, boolean alientoe, boolean c_extraño, Date fechae, boolean armaf, boolean gases, boolean moderdura, String nombrea, boolean policial, boolean quemadura, boolean rina, boolean transito, int valor, boolean otrav, boolean picadura, boolean otrai, boolean otroa, boolean alergico, boolean clinico, String decripcione, String descriciona, boolean condicion_estable, boolean condicion_inestable, boolean farmacolo, boolean ginecologico, boolean via_aerea, boolean via_obstruida, boolean otroe, boolean psiquiatrico, boolean quirurgico, boolean traumato, String abdomens, int t_axilar, int t_bucal, String cabezas, int capilar, String columnas, String cuello, String descripcions, String extremidades, int fcardiaca, int motora, int ocular, int satura, String pelvis, int peso, int presion, String pupilad, String pupilai, int frespiratoria, int talla, String torax, int totals, int verbal, String via_obstruidasp, String cerrada, String cortante, String esguince, String excoracion, String expuesta, String extraña, String hematoma, String hemorragia, String inflamacion, String deformacion, String moderdural, String penetrante, String picadural, String quemaduraf, String abortos, String borramiento, String cesareas, String contraciones, String dilatacion, Date fecham, String fetal, String frecuenciam, String gestas, String membranas, String partos, String plano, String presentacion, String semanas, String sangrado, int tiempo, String uterina, String util, boolean abdomeno, boolean biometricas, boolean electro_car, String descripciono, boolean ecoabdomen, boolean electrolitos, boolean endoscopia, boolean gastrometira, boolean interconsulta, boolean osea, boolean otroso, boolean ecopelvica, boolean resonancia, boolean quimicaso, boolean tomografia, boolean toraxo, boolean uroanalisis, String cie1, String cie2, String cie3, String descripcion1, String descripcion2, String descripcion3, String d1, String d2, String d3, String cie1a, String cie2a, String cie3a, String descripcion1a, String descripcion2a, String descripcion3a, String d1a, String d2a, String d3a, String indicaciones, String medicamento1, String medicamento2, String medicamento3, String posologia, String posologia2, String posologia3, boolean cexterna, String causaa, String codigoa, int diasa, boolean domicilio, boolean establea, String establecimientoa, Date fechas, boolean inestablea, boolean internacion, boolean muerto, String nombrep, boolean observaciona, boolean referenciaa, String servicioa, boolean vivo) {
        this.canton = canton;
        this.cod_ud = cod_ud;
        this.direccp = direccp;
        this.emergencia = emergencia;
        this.empresa = empresa;
        this.fecha = fecha;
        this.fechaa = fechaa;
        this.fuente = fuente;
        this.instruccion = instruccion;
        this.institucion_sistema = institucion_sistema;
        this.nombre = nombre;
        this.numero = numero;
        this.ocupacion = ocupacion;
        this.parantesco = parantesco;
        this.parroquia = parroquia;
        this.persona = persona;
        this.provincia = provincia;
        this.referidod = referidod;
        this.servicio = servicio;
        this.telefono = telefono;
        this.tipos = tipos;
        this.unida_operativa = unida_operativa;
        this.num_cli = num_cli;
        this.nombres = nombres;
        this.celular = celular;
        this.barrio = barrio;
        this.parro = parro;
        this.can = can;
        this.provi = provi;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
        this.estado_civil = estado_civil;
        this.direccion = direccion;
        this.ambulancia = ambulancia;
        this.ambulatorio = ambulatorio;
        this.otrot = otrot;
        this.causac = causac;
        this.descrip = descrip;
        this.grupo = grupo;
        this.hora = hora;
        this.motivo = motivo;
        this.obstretica = obstretica;
        this.policia = policia;
        this.quirurgica = quirurgica;
        this.trauma = trauma;
        this.familiar = familiar;
        this.abusof = abusof;
        this.abusos = abusos;
        this.ahogamiento = ahogamiento;
        this.ialcoholica = ialcoholica;
        this.almientaria = almientaria;
        this.anafilaxia = anafilaxia;
        this.aplastamiento = aplastamiento;
        this.apsicologico = apsicologico;
        this.caida = caida;
        this.vcorto = vcorto;
        this.descr = descr;
        this.direcciona = direcciona;
        this.drogas = drogas;
        this.enve = enve;
        this.alientoe = alientoe;
        this.c_extraño = c_extraño;
        this.fechae = fechae;
        this.armaf = armaf;
        this.gases = gases;
        this.moderdura = moderdura;
        this.nombrea = nombrea;
        this.policial = policial;
        this.quemadura = quemadura;
        this.rina = rina;
        this.transito = transito;
        this.valor = valor;
        this.otrav = otrav;
        this.picadura = picadura;
        this.otrai = otrai;
        this.otroa = otroa;
        this.alergico = alergico;
        this.clinico = clinico;
        this.decripcione = decripcione;
        this.descriciona = descriciona;
        this.condicion_estable = condicion_estable;
        this.condicion_inestable = condicion_inestable;
        this.farmacolo = farmacolo;
        this.ginecologico = ginecologico;
        this.via_aerea = via_aerea;
        this.via_obstruida = via_obstruida;
        this.otroe = otroe;
        this.psiquiatrico = psiquiatrico;
        this.quirurgico = quirurgico;
        this.traumato = traumato;
        this.abdomens = abdomens;
        this.t_axilar = t_axilar;
        this.t_bucal = t_bucal;
        this.cabezas = cabezas;
        this.capilar = capilar;
        this.columnas = columnas;
        this.cuello = cuello;
        this.descripcions = descripcions;
        this.extremidades = extremidades;
        this.fcardiaca = fcardiaca;
        this.motora = motora;
        this.ocular = ocular;
        this.satura = satura;
        this.pelvis = pelvis;
        this.peso = peso;
        this.presion = presion;
        this.pupilad = pupilad;
        this.pupilai = pupilai;
        this.frespiratoria = frespiratoria;
        this.talla = talla;
        this.torax = torax;
        this.totals = totals;
        this.verbal = verbal;
        this.via_obstruidasp = via_obstruidasp;
        this.cerrada = cerrada;
        this.cortante = cortante;
        this.esguince = esguince;
        this.excoracion = excoracion;
        this.expuesta = expuesta;
        this.extraña = extraña;
        this.hematoma = hematoma;
        this.hemorragia = hemorragia;
        this.inflamacion = inflamacion;
        this.deformacion = deformacion;
        this.moderdural = moderdural;
        this.penetrante = penetrante;
        this.picadural = picadural;
        this.quemaduraf = quemaduraf;
        this.abortos = abortos;
        this.borramiento = borramiento;
        this.cesareas = cesareas;
        this.contraciones = contraciones;
        this.dilatacion = dilatacion;
        this.fecham = fecham;
        this.fetal = fetal;
        this.frecuenciam = frecuenciam;
        this.gestas = gestas;
        this.membranas = membranas;
        this.partos = partos;
        this.plano = plano;
        this.presentacion = presentacion;
        this.semanas = semanas;
        this.sangrado = sangrado;
        this.tiempo = tiempo;
        this.uterina = uterina;
        this.util = util;
        this.abdomeno = abdomeno;
        this.biometricas = biometricas;
        this.electro_car = electro_car;
        this.descripciono = descripciono;
        this.ecoabdomen = ecoabdomen;
        this.electrolitos = electrolitos;
        this.endoscopia = endoscopia;
        this.gastrometira = gastrometira;
        this.interconsulta = interconsulta;
        this.osea = osea;
        this.otroso = otroso;
        this.ecopelvica = ecopelvica;
        this.resonancia = resonancia;
        this.quimicaso = quimicaso;
        this.tomografia = tomografia;
        this.toraxo = toraxo;
        this.uroanalisis = uroanalisis;
        this.cie1 = cie1;
        this.cie2 = cie2;
        this.cie3 = cie3;
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.descripcion3 = descripcion3;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.cie1a = cie1a;
        this.cie2a = cie2a;
        this.cie3a = cie3a;
        this.descripcion1a = descripcion1a;
        this.descripcion2a = descripcion2a;
        this.descripcion3a = descripcion3a;
        this.d1a = d1a;
        this.d2a = d2a;
        this.d3a = d3a;
        this.indicaciones = indicaciones;
        this.medicamento1 = medicamento1;
        this.medicamento2 = medicamento2;
        this.medicamento3 = medicamento3;
        this.posologia = posologia;
        this.posologia2 = posologia2;
        this.posologia3 = posologia3;
        this.cexterna = cexterna;
        this.causaa = causaa;
        this.codigoa = codigoa;
        this.diasa = diasa;
        this.domicilio = domicilio;
        this.establea = establea;
        this.establecimientoa = establecimientoa;
        this.fechas = fechas;
        this.inestablea = inestablea;
        this.internacion = internacion;
        this.muerto = muerto;
        this.nombrep = nombrep;
        this.observaciona = observaciona;
        this.referenciaa = referenciaa;
        this.servicioa = servicioa;
        this.vivo = vivo;
    }

    public int getIdAd() {
        return idAd;
    }

    public void setIdAd(int idAd) {
        this.idAd = idAd;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getCod_ud() {
        return cod_ud;
    }

    public void setCod_ud(String cod_ud) {
        this.cod_ud = cod_ud;
    }

    public String getDireccp() {
        return direccp;
    }

    public void setDireccp(String direccp) {
        this.direccp = direccp;
    }

    public String getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(String emergencia) {
        this.emergencia = emergencia;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaa() {
        return fechaa;
    }

    public void setFechaa(Date fechaa) {
        this.fechaa = fechaa;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public String getInstitucion_sistema() {
        return institucion_sistema;
    }

    public void setInstitucion_sistema(String institucion_sistema) {
        this.institucion_sistema = institucion_sistema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getParantesco() {
        return parantesco;
    }

    public void setParantesco(String parantesco) {
        this.parantesco = parantesco;
    }

    public String getParroquia() {
        return parroquia;
    }

    public void setParroquia(String parroquia) {
        this.parroquia = parroquia;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getReferidod() {
        return referidod;
    }

    public void setReferidod(String referidod) {
        this.referidod = referidod;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getUnida_operativa() {
        return unida_operativa;
    }

    public void setUnida_operativa(String unida_operativa) {
        this.unida_operativa = unida_operativa;
    }

    public int getNum_cli() {
        return num_cli;
    }

    public void setNum_cli(int num_cli) {
        this.num_cli = num_cli;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getParro() {
        return parro;
    }

    public void setParro(String parro) {
        this.parro = parro;
    }

    public String getCan() {
        return can;
    }

    public void setCan(String can) {
        this.can = can;
    }

    public String getProvi() {
        return provi;
    }

    public void setProvi(String provi) {
        this.provi = provi;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAmbulancia() {
        return ambulancia;
    }

    public void setAmbulancia(String ambulancia) {
        this.ambulancia = ambulancia;
    }

    public String getAmbulatorio() {
        return ambulatorio;
    }

    public void setAmbulatorio(String ambulatorio) {
        this.ambulatorio = ambulatorio;
    }

    public String getOtrot() {
        return otrot;
    }

    public void setOtrot(String otrot) {
        this.otrot = otrot;
    }

    public String getCausac() {
        return causac;
    }

    public void setCausac(String causac) {
        this.causac = causac;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObstretica() {
        return obstretica;
    }

    public void setObstretica(String obstretica) {
        this.obstretica = obstretica;
    }

    public String getPolicia() {
        return policia;
    }

    public void setPolicia(String policia) {
        this.policia = policia;
    }

    public String getQuirurgica() {
        return quirurgica;
    }

    public void setQuirurgica(String quirurgica) {
        this.quirurgica = quirurgica;
    }

    public String getTrauma() {
        return trauma;
    }

    public void setTrauma(String trauma) {
        this.trauma = trauma;
    }

    public boolean isFamiliar() {
        return familiar;
    }

    public void setFamiliar(boolean familiar) {
        this.familiar = familiar;
    }

    public boolean isAbusof() {
        return abusof;
    }

    public void setAbusof(boolean abusof) {
        this.abusof = abusof;
    }

    public boolean isAbusos() {
        return abusos;
    }

    public void setAbusos(boolean abusos) {
        this.abusos = abusos;
    }

    public boolean isAhogamiento() {
        return ahogamiento;
    }

    public void setAhogamiento(boolean ahogamiento) {
        this.ahogamiento = ahogamiento;
    }

    public boolean isIalcoholica() {
        return ialcoholica;
    }

    public void setIalcoholica(boolean ialcoholica) {
        this.ialcoholica = ialcoholica;
    }

    public boolean isAlmientaria() {
        return almientaria;
    }

    public void setAlmientaria(boolean almientaria) {
        this.almientaria = almientaria;
    }

    public boolean isAnafilaxia() {
        return anafilaxia;
    }

    public void setAnafilaxia(boolean anafilaxia) {
        this.anafilaxia = anafilaxia;
    }

    public boolean isAplastamiento() {
        return aplastamiento;
    }

    public void setAplastamiento(boolean aplastamiento) {
        this.aplastamiento = aplastamiento;
    }

    public boolean isApsicologico() {
        return apsicologico;
    }

    public void setApsicologico(boolean apsicologico) {
        this.apsicologico = apsicologico;
    }

    public boolean isCaida() {
        return caida;
    }

    public void setCaida(boolean caida) {
        this.caida = caida;
    }

    public boolean isVcorto() {
        return vcorto;
    }

    public void setVcorto(boolean vcorto) {
        this.vcorto = vcorto;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

   
    public String getDirecciona() {
        return direcciona;
    }

    public void setDirecciona(String direcciona) {
        this.direcciona = direcciona;
    }

    public boolean isDrogas() {
        return drogas;
    }

    public void setDrogas(boolean drogas) {
        this.drogas = drogas;
    }

    public boolean isEnve() {
        return enve;
    }

    public void setEnve(boolean enve) {
        this.enve = enve;
    }

    public boolean isAlientoe() {
        return alientoe;
    }

    public void setAlientoe(boolean alientoe) {
        this.alientoe = alientoe;
    }

    public boolean isC_extraño() {
        return c_extraño;
    }

    public void setC_extraño(boolean c_extraño) {
        this.c_extraño = c_extraño;
    }

    public Date getFechae() {
        return fechae;
    }

    public void setFechae(Date fechae) {
        this.fechae = fechae;
    }

    public boolean isArmaf() {
        return armaf;
    }

    public void setArmaf(boolean armaf) {
        this.armaf = armaf;
    }

    public boolean isGases() {
        return gases;
    }

    public void setGases(boolean gases) {
        this.gases = gases;
    }

    public boolean isModerdura() {
        return moderdura;
    }

    public void setModerdura(boolean moderdura) {
        this.moderdura = moderdura;
    }

    public String getNombrea() {
        return nombrea;
    }

    public void setNombrea(String nombrea) {
        this.nombrea = nombrea;
    }

    public boolean isPolicial() {
        return policial;
    }

    public void setPolicial(boolean policial) {
        this.policial = policial;
    }

    public boolean isQuemadura() {
        return quemadura;
    }

    public void setQuemadura(boolean quemadura) {
        this.quemadura = quemadura;
    }

    public boolean isRina() {
        return rina;
    }

    public void setRina(boolean rina) {
        this.rina = rina;
    }

    public boolean isTransito() {
        return transito;
    }

    public void setTransito(boolean transito) {
        this.transito = transito;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean isOtrav() {
        return otrav;
    }

    public void setOtrav(boolean otrav) {
        this.otrav = otrav;
    }

    public boolean isPicadura() {
        return picadura;
    }

    public void setPicadura(boolean picadura) {
        this.picadura = picadura;
    }

    public boolean isOtrai() {
        return otrai;
    }

    public void setOtrai(boolean otrai) {
        this.otrai = otrai;
    }

    public boolean isOtroa() {
        return otroa;
    }

    public void setOtroa(boolean otroa) {
        this.otroa = otroa;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isClinico() {
        return clinico;
    }

    public void setClinico(boolean clinico) {
        this.clinico = clinico;
    }

    public String getDecripcione() {
        return decripcione;
    }

    public void setDecripcione(String decripcione) {
        this.decripcione = decripcione;
    }

    public String getDescriciona() {
        return descriciona;
    }

    public void setDescriciona(String descriciona) {
        this.descriciona = descriciona;
    }

    public boolean isCondicion_estable() {
        return condicion_estable;
    }

    public void setCondicion_estable(boolean condicion_estable) {
        this.condicion_estable = condicion_estable;
    }

    public boolean isCondicion_inestable() {
        return condicion_inestable;
    }

    public void setCondicion_inestable(boolean condicion_inestable) {
        this.condicion_inestable = condicion_inestable;
    }

    public boolean isFarmacolo() {
        return farmacolo;
    }

    public void setFarmacolo(boolean farmacolo) {
        this.farmacolo = farmacolo;
    }

    public boolean isGinecologico() {
        return ginecologico;
    }

    public void setGinecologico(boolean ginecologico) {
        this.ginecologico = ginecologico;
    }

    public boolean isVia_aerea() {
        return via_aerea;
    }

    public void setVia_aerea(boolean via_aerea) {
        this.via_aerea = via_aerea;
    }

    public boolean isVia_obstruida() {
        return via_obstruida;
    }

    public void setVia_obstruida(boolean via_obstruida) {
        this.via_obstruida = via_obstruida;
    }

    public boolean isOtroe() {
        return otroe;
    }

    public void setOtroe(boolean otroe) {
        this.otroe = otroe;
    }

    public boolean isPsiquiatrico() {
        return psiquiatrico;
    }

    public void setPsiquiatrico(boolean psiquiatrico) {
        this.psiquiatrico = psiquiatrico;
    }

    public boolean isQuirurgico() {
        return quirurgico;
    }

    public void setQuirurgico(boolean quirurgico) {
        this.quirurgico = quirurgico;
    }

    public boolean isTraumato() {
        return traumato;
    }

    public void setTraumato(boolean traumato) {
        this.traumato = traumato;
    }

    public String getAbdomens() {
        return abdomens;
    }

    public void setAbdomens(String abdomens) {
        this.abdomens = abdomens;
    }

    public int getT_axilar() {
        return t_axilar;
    }

    public void setT_axilar(int t_axilar) {
        this.t_axilar = t_axilar;
    }

    public int getT_bucal() {
        return t_bucal;
    }

    public void setT_bucal(int t_bucal) {
        this.t_bucal = t_bucal;
    }

    public String getCabezas() {
        return cabezas;
    }

    public void setCabezas(String cabezas) {
        this.cabezas = cabezas;
    }

    public int getCapilar() {
        return capilar;
    }

    public void setCapilar(int capilar) {
        this.capilar = capilar;
    }

    public String getColumnas() {
        return columnas;
    }

    public void setColumnas(String columnas) {
        this.columnas = columnas;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getDescripcions() {
        return descripcions;
    }

    public void setDescripcions(String descripcions) {
        this.descripcions = descripcions;
    }

    public String getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(String extremidades) {
        this.extremidades = extremidades;
    }

    public int getFcardiaca() {
        return fcardiaca;
    }

    public void setFcardiaca(int fcardiaca) {
        this.fcardiaca = fcardiaca;
    }

    public int getMotora() {
        return motora;
    }

    public void setMotora(int motora) {
        this.motora = motora;
    }

    public int getOcular() {
        return ocular;
    }

    public void setOcular(int ocular) {
        this.ocular = ocular;
    }

    public int getSatura() {
        return satura;
    }

    public void setSatura(int satura) {
        this.satura = satura;
    }

    public String getPelvis() {
        return pelvis;
    }

    public void setPelvis(String pelvis) {
        this.pelvis = pelvis;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPresion() {
        return presion;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public String getPupilad() {
        return pupilad;
    }

    public void setPupilad(String pupilad) {
        this.pupilad = pupilad;
    }

    public String getPupilai() {
        return pupilai;
    }

    public void setPupilai(String pupilai) {
        this.pupilai = pupilai;
    }

    public int getFrespiratoria() {
        return frespiratoria;
    }

    public void setFrespiratoria(int frespiratoria) {
        this.frespiratoria = frespiratoria;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTorax() {
        return torax;
    }

    public void setTorax(String torax) {
        this.torax = torax;
    }

    public int getTotals() {
        return totals;
    }

    public void setTotals(int totals) {
        this.totals = totals;
    }

    public int getVerbal() {
        return verbal;
    }

    public void setVerbal(int verbal) {
        this.verbal = verbal;
    }

    public String getVia_obstruidasp() {
        return via_obstruidasp;
    }

    public void setVia_obstruidasp(String via_obstruidasp) {
        this.via_obstruidasp = via_obstruidasp;
    }

    public String getCerrada() {
        return cerrada;
    }

    public void setCerrada(String cerrada) {
        this.cerrada = cerrada;
    }

    public String getCortante() {
        return cortante;
    }

    public void setCortante(String cortante) {
        this.cortante = cortante;
    }

    public String getEsguince() {
        return esguince;
    }

    public void setEsguince(String esguince) {
        this.esguince = esguince;
    }

    public String getExcoracion() {
        return excoracion;
    }

    public void setExcoracion(String excoracion) {
        this.excoracion = excoracion;
    }

    public String getExpuesta() {
        return expuesta;
    }

    public void setExpuesta(String expuesta) {
        this.expuesta = expuesta;
    }

    public String getExtraña() {
        return extraña;
    }

    public void setExtraña(String extraña) {
        this.extraña = extraña;
    }

    public String getHematoma() {
        return hematoma;
    }

    public void setHematoma(String hematoma) {
        this.hematoma = hematoma;
    }

    public String getHemorragia() {
        return hemorragia;
    }

    public void setHemorragia(String hemorragia) {
        this.hemorragia = hemorragia;
    }

    public String getInflamacion() {
        return inflamacion;
    }

    public void setInflamacion(String inflamacion) {
        this.inflamacion = inflamacion;
    }

    public String getDeformacion() {
        return deformacion;
    }

    public void setDeformacion(String deformacion) {
        this.deformacion = deformacion;
    }

    public String getModerdural() {
        return moderdural;
    }

    public void setModerdural(String moderdural) {
        this.moderdural = moderdural;
    }

    public String getPenetrante() {
        return penetrante;
    }

    public void setPenetrante(String penetrante) {
        this.penetrante = penetrante;
    }

    public String getPicadural() {
        return picadural;
    }

    public void setPicadural(String picadural) {
        this.picadural = picadural;
    }

    public String getQuemaduraf() {
        return quemaduraf;
    }

    public void setQuemaduraf(String quemaduraf) {
        this.quemaduraf = quemaduraf;
    }

    public String getAbortos() {
        return abortos;
    }

    public void setAbortos(String abortos) {
        this.abortos = abortos;
    }

    public String getBorramiento() {
        return borramiento;
    }

    public void setBorramiento(String borramiento) {
        this.borramiento = borramiento;
    }

    public String getCesareas() {
        return cesareas;
    }

    public void setCesareas(String cesareas) {
        this.cesareas = cesareas;
    }

    public String getContraciones() {
        return contraciones;
    }

    public void setContraciones(String contraciones) {
        this.contraciones = contraciones;
    }

    public String getDilatacion() {
        return dilatacion;
    }

    public void setDilatacion(String dilatacion) {
        this.dilatacion = dilatacion;
    }

    public Date getFecham() {
        return fecham;
    }

    public void setFecham(Date fecham) {
        this.fecham = fecham;
    }

    public String getFetal() {
        return fetal;
    }

    public void setFetal(String fetal) {
        this.fetal = fetal;
    }

    public String getFrecuenciam() {
        return frecuenciam;
    }

    public void setFrecuenciam(String frecuenciam) {
        this.frecuenciam = frecuenciam;
    }

    public String getGestas() {
        return gestas;
    }

    public void setGestas(String gestas) {
        this.gestas = gestas;
    }

    public String getMembranas() {
        return membranas;
    }

    public void setMembranas(String membranas) {
        this.membranas = membranas;
    }

    public String getPartos() {
        return partos;
    }

    public void setPartos(String partos) {
        this.partos = partos;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getSemanas() {
        return semanas;
    }

    public void setSemanas(String semanas) {
        this.semanas = semanas;
    }

    public String getSangrado() {
        return sangrado;
    }

    public void setSangrado(String sangrado) {
        this.sangrado = sangrado;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getUterina() {
        return uterina;
    }

    public void setUterina(String uterina) {
        this.uterina = uterina;
    }

    public String getUtil() {
        return util;
    }

    public void setUtil(String util) {
        this.util = util;
    }

    public boolean isAbdomeno() {
        return abdomeno;
    }

    public void setAbdomeno(boolean abdomeno) {
        this.abdomeno = abdomeno;
    }

    public boolean isBiometricas() {
        return biometricas;
    }

    public void setBiometricas(boolean biometricas) {
        this.biometricas = biometricas;
    }

    public boolean isElectro_car() {
        return electro_car;
    }

    public void setElectro_car(boolean electro_car) {
        this.electro_car = electro_car;
    }

    public String getDescripciono() {
        return descripciono;
    }

    public void setDescripciono(String descripciono) {
        this.descripciono = descripciono;
    }

    public boolean isEcoabdomen() {
        return ecoabdomen;
    }

    public void setEcoabdomen(boolean ecoabdomen) {
        this.ecoabdomen = ecoabdomen;
    }

    public boolean isElectrolitos() {
        return electrolitos;
    }

    public void setElectrolitos(boolean electrolitos) {
        this.electrolitos = electrolitos;
    }

    public boolean isEndoscopia() {
        return endoscopia;
    }

    public void setEndoscopia(boolean endoscopia) {
        this.endoscopia = endoscopia;
    }

    public boolean isGastrometira() {
        return gastrometira;
    }

    public void setGastrometira(boolean gastrometira) {
        this.gastrometira = gastrometira;
    }

    public boolean isInterconsulta() {
        return interconsulta;
    }

    public void setInterconsulta(boolean interconsulta) {
        this.interconsulta = interconsulta;
    }

    public boolean isOsea() {
        return osea;
    }

    public void setOsea(boolean osea) {
        this.osea = osea;
    }

    public boolean isOtroso() {
        return otroso;
    }

    public void setOtroso(boolean otroso) {
        this.otroso = otroso;
    }

    public boolean isEcopelvica() {
        return ecopelvica;
    }

    public void setEcopelvica(boolean ecopelvica) {
        this.ecopelvica = ecopelvica;
    }

    public boolean isResonancia() {
        return resonancia;
    }

    public void setResonancia(boolean resonancia) {
        this.resonancia = resonancia;
    }

    public boolean isQuimicaso() {
        return quimicaso;
    }

    public void setQuimicaso(boolean quimicaso) {
        this.quimicaso = quimicaso;
    }

    public boolean isTomografia() {
        return tomografia;
    }

    public void setTomografia(boolean tomografia) {
        this.tomografia = tomografia;
    }

    public boolean isToraxo() {
        return toraxo;
    }

    public void setToraxo(boolean toraxo) {
        this.toraxo = toraxo;
    }

    public boolean isUroanalisis() {
        return uroanalisis;
    }

    public void setUroanalisis(boolean uroanalisis) {
        this.uroanalisis = uroanalisis;
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

    public String getCie3() {
        return cie3;
    }

    public void setCie3(String cie3) {
        this.cie3 = cie3;
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

    public String getDescripcion3() {
        return descripcion3;
    }

    public void setDescripcion3(String descripcion3) {
        this.descripcion3 = descripcion3;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getCie1a() {
        return cie1a;
    }

    public void setCie1a(String cie1a) {
        this.cie1a = cie1a;
    }

    public String getCie2a() {
        return cie2a;
    }

    public void setCie2a(String cie2a) {
        this.cie2a = cie2a;
    }

    public String getCie3a() {
        return cie3a;
    }

    public void setCie3a(String cie3a) {
        this.cie3a = cie3a;
    }

    public String getDescripcion1a() {
        return descripcion1a;
    }

    public void setDescripcion1a(String descripcion1a) {
        this.descripcion1a = descripcion1a;
    }

    public String getDescripcion2a() {
        return descripcion2a;
    }

    public void setDescripcion2a(String descripcion2a) {
        this.descripcion2a = descripcion2a;
    }

    public String getDescripcion3a() {
        return descripcion3a;
    }

    public void setDescripcion3a(String descripcion3a) {
        this.descripcion3a = descripcion3a;
    }

    public String getD1a() {
        return d1a;
    }

    public void setD1a(String d1a) {
        this.d1a = d1a;
    }

    public String getD2a() {
        return d2a;
    }

    public void setD2a(String d2a) {
        this.d2a = d2a;
    }

    public String getD3a() {
        return d3a;
    }

    public void setD3a(String d3a) {
        this.d3a = d3a;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public String getMedicamento1() {
        return medicamento1;
    }

    public void setMedicamento1(String medicamento1) {
        this.medicamento1 = medicamento1;
    }

    public String getMedicamento2() {
        return medicamento2;
    }

    public void setMedicamento2(String medicamento2) {
        this.medicamento2 = medicamento2;
    }

    public String getMedicamento3() {
        return medicamento3;
    }

    public void setMedicamento3(String medicamento3) {
        this.medicamento3 = medicamento3;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getPosologia2() {
        return posologia2;
    }

    public void setPosologia2(String posologia2) {
        this.posologia2 = posologia2;
    }

    public String getPosologia3() {
        return posologia3;
    }

    public void setPosologia3(String posologia3) {
        this.posologia3 = posologia3;
    }

    public boolean isCexterna() {
        return cexterna;
    }

    public void setCexterna(boolean cexterna) {
        this.cexterna = cexterna;
    }

    public String getCausaa() {
        return causaa;
    }

    public void setCausaa(String causaa) {
        this.causaa = causaa;
    }

    public String getCodigoa() {
        return codigoa;
    }

    public void setCodigoa(String codigoa) {
        this.codigoa = codigoa;
    }

    public int getDiasa() {
        return diasa;
    }

    public void setDiasa(int diasa) {
        this.diasa = diasa;
    }

    public boolean isDomicilio() {
        return domicilio;
    }

    public void setDomicilio(boolean domicilio) {
        this.domicilio = domicilio;
    }

    public boolean isEstablea() {
        return establea;
    }

    public void setEstablea(boolean establea) {
        this.establea = establea;
    }

    public String getEstablecimientoa() {
        return establecimientoa;
    }

    public void setEstablecimientoa(String establecimientoa) {
        this.establecimientoa = establecimientoa;
    }

    public Date getFechas() {
        return fechas;
    }

    public void setFechas(Date fechas) {
        this.fechas = fechas;
    }

    public boolean isInestablea() {
        return inestablea;
    }

    public void setInestablea(boolean inestablea) {
        this.inestablea = inestablea;
    }

    public boolean isInternacion() {
        return internacion;
    }

    public void setInternacion(boolean internacion) {
        this.internacion = internacion;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public boolean isObservaciona() {
        return observaciona;
    }

    public void setObservaciona(boolean observaciona) {
        this.observaciona = observaciona;
    }

    public boolean isReferenciaa() {
        return referenciaa;
    }

    public void setReferenciaa(boolean referenciaa) {
        this.referenciaa = referenciaa;
    }

    public String getServicioa() {
        return servicioa;
    }

    public void setServicioa(String servicioa) {
        this.servicioa = servicioa;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

}
