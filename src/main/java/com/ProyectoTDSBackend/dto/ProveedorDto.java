/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author corin
 */
public class ProveedorDto {

    @NotBlank
    private String nombreP;

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP= nombreP;
    }

    public ProveedorDto(String nombreP) {
        this.nombreP = nombreP;
    }

    public ProveedorDto() {
    }

}
