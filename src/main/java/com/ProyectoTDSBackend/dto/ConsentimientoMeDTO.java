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
public class ConsentimientoMeDTO {

    private int idMediC;
    private String alergia;
    private String cedula;
    private String codigo;
    private String direccion;
    private int edad;
    private String especialidad;
    private Date fecha;
    private Date fecha_nac;
    private String nombre_doc;
    private String nombrep;
    private String cedula_pa;
    private String procedimientos;
    private String telefono;
    private String entidad;

    public ConsentimientoMeDTO() {
    }

    public ConsentimientoMeDTO(String alergia, String cedula, String codigo, String direccion, int edad, String especialidad, Date fecha, Date fecha_nac, String nombre_doc, String nombrep, String cedula_pa, String procedimientos, String telefono, String entidad) {
        this.alergia = alergia;
        this.cedula = cedula;
        this.codigo = codigo;
        this.direccion = direccion;
        this.edad = edad;
        this.especialidad = especialidad;
        this.fecha = fecha;
        this.fecha_nac = fecha_nac;
        this.nombre_doc = nombre_doc;
        this.nombrep = nombrep;
        this.cedula_pa = cedula_pa;
        this.procedimientos = procedimientos;
        this.telefono = telefono;
        this.entidad = entidad;
    }

   
    public int getIdMediC() {
        return idMediC;
    }

    public void setIdMediC(int idMediC) {
        this.idMediC = idMediC;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNombre_doc() {
        return nombre_doc;
    }

    public void setNombre_doc(String nombre_doc) {
        this.nombre_doc = nombre_doc;
    }

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombrep) {
        this.nombrep = nombrep;
    }

    public String getCedula_pa() {
        return cedula_pa;
    }

    public void setCedula_pa(String cedula_pa) {
        this.cedula_pa = cedula_pa;
    }

    public String getProcedimientos() {
        return procedimientos;
    }

    public void setProcedimientos(String procedimientos) {
        this.procedimientos = procedimientos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    
}
