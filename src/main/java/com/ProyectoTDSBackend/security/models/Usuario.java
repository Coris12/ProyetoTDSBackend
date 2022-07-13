/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.security.models;

import com.ProyectoTDSBackend.dto.DatosTarjetaDto;
import com.ProyectoTDSBackend.models.ConsultaExterna;
import com.ProyectoTDSBackend.models.Familiares;
import com.ProyectoTDSBackend.models.Residencia;
import com.ProyectoTDSBackend.models.Tarjeta;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import javax.persistence.ConstructorResult;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.ColumnResult;

/**
 *
 * @author LENOVO
 */

@NamedNativeQueries({
    @NamedNativeQuery(name = "DatosTarjetaDto.getDatosTarjetaUser", query = "", resultSetMapping = "getDatosTarjetaUser"),
})

@SqlResultSetMappings({
    @SqlResultSetMapping(name = "getDatosTarjetaUser", classes = {
        @ConstructorResult(targetClass = DatosTarjetaDto.class, columns = {
            @ColumnResult(name = "id", type = Long.class),
            @ColumnResult(name = "idRecidencia", type = Long.class),
            @ColumnResult(name = "nombres", type = String.class),
            @ColumnResult(name = "direccion", type = String.class),
            @ColumnResult(name = "celular", type = String.class),
            @ColumnResult(name = "nacionalidad", type = String.class),
            @ColumnResult(name = "pais", type = String.class),
            @ColumnResult(name = "provincia", type = String.class),
            @ColumnResult(name = "canton", type = String.class),
            @ColumnResult(name = "parroquia", type = String.class)
        })
    })
})

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String identificacion;

    @NotNull
    private String nombres;

    @NotNull
    private String direccion;

    @NotNull
    private String celular;

    @NotNull
    private String profesion;

    @NotNull
    private String sexo;

    @NotNull
    @Email
    private String email;

    @NotNull
    private String ciudad;

    @NotNull
    @Column
    private int estado;

    @Column(unique = true)
    private String nombreUsuario;

    @NotNull
    private String password;

    @NotNull
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "usuario_id"),
            inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<ConsultaExterna> consultaExterna;

    @OneToOne
    @JoinColumn(name = "id_tarjeta")
    private Tarjeta tarjeta;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Familiares> familiares;

    @JsonIgnore
	@OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Residencia> post;

    public Usuario() {
    }

    public Usuario(String identificacion, String nombres, String direccion, String celular, String profesion, String sexo, String email, String ciudad, int estado, String nombreUsuario, String password) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.direccion = direccion;
        this.celular = celular;
        this.profesion = profesion;
        this.sexo = sexo;
        this.email = email;
        this.ciudad = ciudad;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public Usuario(int id, String identificacion, String nombres, String direccion, String celular, String profesion,
            String sexo, @Email String email, String ciudad, int estado, String nombreUsuario, String password,
            Set<Rol> roles, List<ConsultaExterna> consultaExterna) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.direccion = direccion;
        this.celular = celular;
        this.profesion = profesion;
        this.sexo = sexo;
        this.email = email;
        this.ciudad = ciudad;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.roles = roles;
        this.consultaExterna = consultaExterna;
    }

    public Usuario(int id, String identificacion, String nombres, String direccion, String celular, String profesion,
            String sexo, @Email String email, String ciudad, int estado, String nombreUsuario, String password,
            Set<Rol> roles, List<ConsultaExterna> consultaExterna, Tarjeta tarjeta, List<Familiares> familiares) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.direccion = direccion;
        this.celular = celular;
        this.profesion = profesion;
        this.sexo = sexo;
        this.email = email;
        this.ciudad = ciudad;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.roles = roles;
        this.consultaExterna = consultaExterna;
        this.tarjeta = tarjeta;
        this.familiares = familiares;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public List<ConsultaExterna> getConsultaExterna() {
        return consultaExterna;
    }

    public void setConsultaExterna(List<ConsultaExterna> consultaExterna) {
        this.consultaExterna = consultaExterna;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public List<Familiares> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(List<Familiares> familiares) {
        this.familiares = familiares;
    }

}
