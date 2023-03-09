/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.dto.AnestesiaDto;
import com.ProyectoTDSBackend.security.models.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
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
    @NamedNativeQuery(name = "Anestesia.generarPdfAnes", query = "", resultSetMapping = "Anestesia.generarPdfAnes")
})

@SqlResultSetMapping(name = "generarPdfAnes", classes = {
    @ConstructorResult(targetClass = AnestesiaDto.class, columns = {
        @ColumnResult(name = "nombres", type = String.class),
        @ColumnResult(name = "sexo", type = String.class),
        @ColumnResult(name = "numcli", type = Integer.class),
        @ColumnResult(name = "edad", type = Integer.class),
        @ColumnResult(name = "anesteciologo", type = String.class),
        @ColumnResult(name = "ayudantea", type = String.class),
        @ColumnResult(name = "ayudantec", type = String.class),
        @ColumnResult(name = "cama", type = Integer.class),
        @ColumnResult(name = "cirujano", type = String.class),
        @ColumnResult(name = "estatura", type = Integer.class),
        @ColumnResult(name = "fecha", type = Date.class),
        @ColumnResult(name = "horaa", type = Integer.class),
        @ColumnResult(name = "horao", type = Integer.class),
        @ColumnResult(name = "intrumentista", type = String.class),
        @ColumnResult(name = "mina", type = Integer.class),
        @ColumnResult(name = "mino", type = Integer.class),
        @ColumnResult(name = "ocupacion", type = String.class),
        @ColumnResult(name = "peso", type = Integer.class),
        @ColumnResult(name = "post", type = String.class),
        @ColumnResult(name = "pre", type = String.class),
        @ColumnResult(name = "propuesta", type = String.class),
        @ColumnResult(name = "realizada", type = String.class),
        @ColumnResult(name = "sala", type = String.class),
        @ColumnResult(name = "servicio", type = String.class),
        @ColumnResult(name = "tecnica", type = String.class),
        @ColumnResult(name = "tipod", type = String.class),
        @ColumnResult(name = "abierto", type = String.class),
        @ColumnResult(name = "apsepsia", type = String.class),
        @ColumnResult(name = "cerrado", type = String.class),
        @ColumnResult(name = "cir", type = String.class),
        @ColumnResult(name = "conductiva", type = String.class),
        @ColumnResult(name = "conti", type = String.class),
        @ColumnResult(name = "continuaa", type = String.class),
        @ColumnResult(name = "espidural", type = String.class),
        @ColumnResult(name = "general", type = String.class),
        @ColumnResult(name = "habon", type = String.class),
        @ColumnResult(name = "hiperbara", type = String.class),
        @ColumnResult(name = "i", type = String.class),
        @ColumnResult(name = "manguito", type = String.class),
        @ColumnResult(name = "mascara", type = String.class),
        @ColumnResult(name = " media", type = String.class),
        @ColumnResult(name = "nasal", type = String.class),
        @ColumnResult(name = "nivel", type = String.class),
        @ColumnResult(name = "oral", type = String.class),
        @ColumnResult(name = "rap", type = String.class),
        @ColumnResult(name = "raquidea", type = String.class),
        @ColumnResult(name = "semi_cerrado", type = String.class),
        @ColumnResult(name = "taponamiento", type = String.class),
        @ColumnResult(name = "topica", type = String.class),
        @ColumnResult(name = "tubo", type = String.class),
        @ColumnResult(name = "vaiven", type = String.class),
        @ColumnResult(name = "simple", type = String.class),
        @ColumnResult(name = "puncion_lat", type = String.class),
        @ColumnResult(name = "anteriora", type = String.class),
        @ColumnResult(name = "apgar", type = String.class),
        @ColumnResult(name = "atrimias", type = String.class),
        @ColumnResult(name = "conducido", type = String.class),
        @ColumnResult(name = "congenitas", type = String.class),
        @ColumnResult(name = "dextrosas", type = String.class),
        @ColumnResult(name = "ecg", type = String.class),
        @ColumnResult(name = "tecnicas", type = String.class),
        @ColumnResult(name = "expansores", type = String.class),
        @ColumnResult(name = "hematologico", type = String.class),
        @ColumnResult(name = "hemorragia", type = String.class),
        @ColumnResult(name = "hipertensiom", type = String.class),
        @ColumnResult(name = "hora", type = String.class),
        @ColumnResult(name = "horad", type = String.class),
        @ColumnResult(name = "horai", type = String.class),
        @ColumnResult(name = "infarto", type = String.class),
        @ColumnResult(name = "otros", type = String.class),
        @ColumnResult(name = "pa", type = String.class),
        @ColumnResult(name = "po", type = String.class),
        @ColumnResult(name = "quimicas", type = String.class),
        @ColumnResult(name = "ringer", type = String.class),
        @ColumnResult(name = "sangre", type = String.class),
        @ColumnResult(name = "total", type = Integer.class),
        @ColumnResult(name = "uro", type = String.class),
        @ColumnResult(name = "valvulares", type = String.class),
        @ColumnResult(name = "atrri", type = String.class),
        @ColumnResult(name = "cambiot", type = String.class),
        @ColumnResult(name = "cardiaco", type = String.class),
        @ColumnResult(name = "comentario", type = String.class),
        @ColumnResult(name = "perforacion", type = String.class),
        @ColumnResult(name = "esmpamo", type = String.class),
        @ColumnResult(name = "grupos", type = String.class),
        @ColumnResult(name = "hipert", type = String.class),
        @ColumnResult(name = "informacion", type = String.class),
        @ColumnResult(name = "insuficiente", type = String.class),
        @ColumnResult(name = "r1", type = String.class),
        @ColumnResult(name = "r2", type = String.class),
        @ColumnResult(name = "r3", type = String.class),
        @ColumnResult(name = "r4", type = String.class),
        @ColumnResult(name = "r5", type = String.class),
        @ColumnResult(name = "depresion", type = String.class),
        @ColumnResult(name = "vomito", type = String.class),
        @ColumnResult(name = "cabeza", type = String.class),
        @ColumnResult(name = "cefalea", type = String.class),
        @ColumnResult(name = "convul", type = String.class),
        @ColumnResult(name = "craneales", type = String.class),
        @ColumnResult(name = "cuello", type = String.class),
        @ColumnResult(name = "diabetes", type = String.class),
        @ColumnResult(name = "electro", type = String.class),
        @ColumnResult(name = "endo", type = String.class),
        @ColumnResult(name = "extremidades", type = String.class),
        @ColumnResult(name = " extradural", type = String.class),
        @ColumnResult(name = "habitos", type = String.class),
        @ColumnResult(name = "intradural", type = String.class),
        @ColumnResult(name = "intrato", type = String.class),
        @ColumnResult(name = "trumatismo", type = String.class),
        @ColumnResult(name = "obstretica", type = String.class),
        @ColumnResult(name = "otross", type = String.class),
        @ColumnResult(name = "peri", type = String.class),
        @ColumnResult(name = "renal", type = String.class),
        @ColumnResult(name = " sentido", type = String.class),
        @ColumnResult(name = "shocks", type = String.class),
        @ColumnResult(name = "extrato", type = String.class),
        @ColumnResult(name = "toxe", type = String.class),
        @ColumnResult(name = "abdomen", type = String.class),
        @ColumnResult(name = "conciencia", type = String.class),
        @ColumnResult(name = "descripcion", type = String.class),
        @ColumnResult(name = "otrosr", type = String.class),
        @ColumnResult(name = "bueno", type = String.class),
        @ColumnResult(name = "deprimido", type = String.class),
        @ColumnResult(name = "digi", type = String.class),
        @ColumnResult(name = "elaborado", type = String.class),
        @ColumnResult(name = "esteroides", type = String.class),
        @ColumnResult(name = "fech", type = Date.class),
        @ColumnResult(name = "hipotensores", type = String.class),
        @ColumnResult(name = "horat", type = String.class),
        @ColumnResult(name = "insuficientes", type = String.class),
        @ColumnResult(name = "otrost", type = String.class),
        @ColumnResult(name = "recordatorio", type = String.class),
        @ColumnResult(name = "tranqui", type = String.class),
        @ColumnResult(name = "medicamento", type = String.class),})
})
@Entity
@Table(name = "aneste")
public class Anestesia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_anes", nullable = false)
    private Long idAnes;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "estatura")
    private int estatura;

    @Column(name = "peso")
    private int peso;

    @Column(name = "ocupacion")
    private String ocupacion;

    @Column(name = "servicio")
    private String servicio;

    @Column(name = "sala")
    private String sala;

    @Column(name = "cama")
    private int cama;

    @Column(name = "preoperatorio")
    private String pre;

    @Column(name = "postoperatorio")
    private String post;

    @Column(name = "propuesta")
    private String propuesta;

    @Column(name = "Cirujano")
    private String cirujano;

    @Column(name = "ayudanteC")
    private String ayudanteC;

    @Column(name = "realizada")
    private String realizada;

    @Column(name = "anesteciologo")
    private String anestecio;

    @Column(name = "ayudanteA")
    private String ayudanteA;

    @Column(name = "intrumentista")
    private String intrumentista;

    @Column(name = "tipoD")
    private String tipoD;

    @Column(name = "horaA")
    private int horaA;

    @Column(name = "minA")
    private int minA;

    @Column(name = "horaO")
    private int horaO;

    @Column(name = "minO")
    private int minO;

    @JsonIgnore
    @OneToMany(mappedBy = "anestesia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Tecnicas> tecnica;
    
    @JsonIgnore
    @OneToMany(mappedBy = "anestesia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Infusion> infuncion;
    
    @JsonIgnore
    @OneToMany(mappedBy = "anestesia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Complicaciones> compli;
    
    @JsonIgnore
    @OneToMany(mappedBy = "anestesia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Region> region;
    
     @JsonIgnore
    @OneToMany(mappedBy = "anestesia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Terapia> terapia;

    @ManyToOne(optional = true, cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_usuario", foreignKey = @ForeignKey(name = "fk_autoriza_id"))
    private Usuario usuario;

    public Anestesia() {
    }

    public List<Region> getRegion() {
        return region;
    }

    public void setRegion(List<Region> region) {
        this.region = region;
    }

    public List<Terapia> getTerapia() {
        return terapia;
    }

    public void setTerapia(List<Terapia> terapia) {
        this.terapia = terapia;
    }


    

    public Long getIdAnes() {
        return idAnes;
    }

    public void setIdAnes(Long idAnes) {
        this.idAnes = idAnes;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
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

    public int getCama() {
        return cama;
    }

    public void setCama(int cama) {
        this.cama = cama;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(String propuesta) {
        this.propuesta = propuesta;
    }

    public String getCirujano() {
        return cirujano;
    }

    public void setCirujano(String cirujano) {
        this.cirujano = cirujano;
    }

    public String getAyudanteC() {
        return ayudanteC;
    }

    public void setAyudanteC(String ayudanteC) {
        this.ayudanteC = ayudanteC;
    }

    public String getRealizada() {
        return realizada;
    }

    public void setRealizada(String realizada) {
        this.realizada = realizada;
    }

    public String getAnestecio() {
        return anestecio;
    }

    public void setAnestecio(String anestecio) {
        this.anestecio = anestecio;
    }

    public String getAyudanteA() {
        return ayudanteA;
    }

    public void setAyudanteA(String ayudanteA) {
        this.ayudanteA = ayudanteA;
    }

    public String getIntrumentista() {
        return intrumentista;
    }

    public void setIntrumentista(String intrumentista) {
        this.intrumentista = intrumentista;
    }

    public String getTipoD() {
        return tipoD;
    }

    public void setTipoD(String tipoD) {
        this.tipoD = tipoD;
    }

    public int getHoraA() {
        return horaA;
    }

    public void setHoraA(int horaA) {
        this.horaA = horaA;
    }

    public int getMinA() {
        return minA;
    }

    public void setMinA(int minA) {
        this.minA = minA;
    }

    public int getHoraO() {
        return horaO;
    }

    public void setHoraO(int horaO) {
        this.horaO = horaO;
    }

    public int getMinO() {
        return minO;
    }

    public void setMinO(int minO) {
        this.minO = minO;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Tecnicas> getTecnica() {
        return tecnica;
    }

    public void setTecnica(List<Tecnicas> tecnica) {
        this.tecnica = tecnica;
    }

    public List<Infusion> getInfuncion() {
        return infuncion;
    }

    public void setInfuncion(List<Infusion> infuncion) {
        this.infuncion = infuncion;
    }

    public List<Complicaciones> getCompli() {
        return compli;
    }

    public void setCompli(List<Complicaciones> compli) {
        this.compli = compli;
    }

}
