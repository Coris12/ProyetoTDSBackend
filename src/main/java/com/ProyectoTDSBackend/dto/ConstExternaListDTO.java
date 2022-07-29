package com.ProyectoTDSBackend.dto;

import java.util.Date;

public class ConstExternaListDTO {
    private int id_consexterna; 
    private String nombres;   
    private int historia_clinica;
    private Date fecha;
    private String nombresProfesional;

    public ConstExternaListDTO(int id_consexterna, String nombres, int historia_clinica, Date fecha,
            String nombresProfesional) {
        this.id_consexterna = id_consexterna;
        this.nombres = nombres;
        this.historia_clinica = historia_clinica;
        this.fecha = fecha;
        this.nombresProfesional = nombresProfesional;
    }

    public ConstExternaListDTO() {
    }

    public int getId_consexterna() {
        return id_consexterna;
    }

    public void setId_consexterna(int id_consexterna) {
        this.id_consexterna = id_consexterna;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getHistoria_clinica() {
        return historia_clinica;
    }

    public void setHistoria_clinica(int historia_clinica) {
        this.historia_clinica = historia_clinica;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombresProfesional() {
        return nombresProfesional;
    }

    public void setNombresProfesional(String nombresProfesional) {
        this.nombresProfesional = nombresProfesional;
    } 
}
