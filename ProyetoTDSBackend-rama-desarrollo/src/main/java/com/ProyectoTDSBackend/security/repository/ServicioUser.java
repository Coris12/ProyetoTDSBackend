/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.security.repository;

import com.ProyectoTDSBackend.security.enums.RolNombre;
import com.ProyectoTDSBackend.util.GenericResponse;

/**
 *
 * @author LENOVO
 */
public interface ServicioUser {
    GenericResponse<Object> putPermisos(int id,RolNombre idrol);
}
