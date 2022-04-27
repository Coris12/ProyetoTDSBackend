package com.ProyectoTDSBackend.dto;

public class FarmSucursalDTO {
    private Long id_farmacia, id_sucursal;
    private int telefono_suc;
    private String nombre_suc, correo_suc, direccion_suc;

    public FarmSucursalDTO() {
    }

    public FarmSucursalDTO(Long id_farmacia, Long id_sucursal, String nombre_suc, String correo_suc, int telefono_suc,   String direccion_suc) {
        this.id_farmacia = id_farmacia;
        this.id_sucursal = id_sucursal;
        this.telefono_suc = telefono_suc;
        this.nombre_suc = nombre_suc;
        this.correo_suc = correo_suc;
        this.direccion_suc = direccion_suc;
    }


    public Long getId_farmacia() {
        return id_farmacia;
    }

    public void setId_farmacia(Long id_farmacia) {
        this.id_farmacia = id_farmacia;
    }

    public Long getId_sucursal() {
        return id_sucursal;
    }

    public void setId_sucursal(Long id_sucursal) {
        this.id_sucursal = id_sucursal;
    }

    public int getTelefono_suc() {
        return telefono_suc;
    }

    public void setTelefono_suc(int telefono_suc) {
        this.telefono_suc = telefono_suc;
    }

    public String getNombre_suc() {
        return nombre_suc;
    }

    public void setNombre_suc(String nombre_suc) {
        this.nombre_suc = nombre_suc;
    }

    public String getCorreo_suc() {
        return correo_suc;
    }

    public void setCorreo_suc(String correo_suc) {
        this.correo_suc = correo_suc;
    }

    public String getDireccion_suc() {
        return direccion_suc;
    }

    public void setDireccion_suc(String direccion_suc) {
        this.direccion_suc = direccion_suc;
    }
    
}
