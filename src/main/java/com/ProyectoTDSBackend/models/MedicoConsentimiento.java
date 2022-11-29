/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.ProyectoTDSBackend.dto.ConsentimientoMeDTO;
import com.ProyectoTDSBackend.dto.EvolucionDTO;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author corin
 */
@NamedNativeQueries({
    @NamedNativeQuery(name = "MedicoConsentimiento.generarPdfConsen", query = "", resultSetMapping = "generarPdfConsen")
})

@SqlResultSetMapping(name = "generarPdfConsen", classes = {
    @ConstructorResult(targetClass = ConsentimientoMeDTO.class, columns = {
        @ColumnResult(name = "alergia", type = String.class),
        @ColumnResult(name = "cedula", type = String.class),
        @ColumnResult(name = "codigo", type = String.class),
        @ColumnResult(name = "direccion", type = String.class),
        @ColumnResult(name = "edad", type = Integer.class),
        @ColumnResult(name = "especialidad", type = String.class),
        @ColumnResult(name = "fecha", type = Date.class),
        @ColumnResult(name = "fecha_nac", type = Date.class),
        @ColumnResult(name = "nombre_doc", type = String.class),
        @ColumnResult(name = "nombrep", type = String.class),
        @ColumnResult(name = "cedula_pa", type = String.class),
        @ColumnResult(name = "procedimientos", type = String.class),
        @ColumnResult(name = "telefono", type = String.class),
        @ColumnResult(name = "entidad", type = String.class),})
})
@Entity
@Table(name = "medico_consentimiento")

public class MedicoConsentimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_medi_c", nullable = false)
    private Long idMediC;

    @Column(name = "nombreP", nullable = false)
    private String nombrePaciente;

    @Column(name = "cedula", nullable = false)
    private String cedula;

    @Column(name = "procedimientos", nullable = false)
    private String procedimientos;

    @Column(name = "nombreDoc", nullable = false)
    private String nombreDoc;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "especialidad", nullable = false)
    private String especialidad;

    @Column(name = "cedula_pa", nullable = false)
    private String personaA;

    @Column(name = "FECHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "fechaNac")
    private Date fechaNaci;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "telefono", nullable = false)
    private String telefono;

    @Column(name = "alergia", nullable = false)
    private String alergia;

    @Column(name = "estado", nullable = false)
    private int estado;

    @Column(name = "entidad", nullable = false)
    private String entidad;

    public MedicoConsentimiento() {
    }

    public MedicoConsentimiento(Long idMediC, String nombrePaciente, String cedula, String procedimientos, String nombreDoc, String codigo, String especialidad, String personaA, Date fecha, Date fechaNaci, int edad, String direccion, String telefono, String alergia, int estado, String entidad) {
        this.idMediC = idMediC;
        this.nombrePaciente = nombrePaciente;
        this.cedula = cedula;
        this.procedimientos = procedimientos;
        this.nombreDoc = nombreDoc;
        this.codigo = codigo;
        this.especialidad = especialidad;
        this.personaA = personaA;
        this.fecha = fecha;
        this.fechaNaci = fechaNaci;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.alergia = alergia;
        this.estado = estado;
        this.entidad = entidad;
    }

    public Long getIdMediC() {
        return idMediC;
    }

    public void setIdMediC(Long idMediC) {
        this.idMediC = idMediC;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(String procedimientos) {
        this.procedimientos = procedimientos;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getPersonaA() {
        return personaA;
    }

    public void setPersonaA(String personaA) {
        this.personaA = personaA;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaNaci() {
        return fechaNaci;
    }

    public void setFechaNaci(Date fechaNaci) {
        this.fechaNaci = fechaNaci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

}
