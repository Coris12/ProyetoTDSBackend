/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.util;

import com.ProyectoTDSBackend.security.enums.RolNombre;
import com.ProyectoTDSBackend.security.models.Rol;
import com.ProyectoTDSBackend.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author LENOVO
 */
@Component
public class CreateRoles implements CommandLineRunner {

    @Autowired
    RolService rolService;

    @Override
    public void run(String... args) throws Exception {
        /*Rol rolCoordinador = new Rol(RolNombre.ROLE_COORDINADOR);
        Rol rolEstudiante = new Rol(RolNombre.ROLE_ESTUDIANTE);
        Rol rolTribunal = new Rol(RolNombre.ROLE_TRIBUNAL);
        Rol rolTutor=new Rol (RolNombre.ROLE_TUTOR);
        rolService.save(rolCoordinador);
        rolService.save(rolEstudiante);
        rolService.save(rolTribunal);
        rolService.save(rolTutor);*/
    }
}
