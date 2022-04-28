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
    //    Rol rolAdmin = new Rol(RolNombre.ROLE_ADMIN);
    //    Rol rolePaciente = new Rol(RolNombre.ROLE_PACIENTE);
    //    Rol rolCounter = new Rol(RolNombre.ROLE_COUNTER);
    //    Rol rolLaboratorio = new Rol(RolNombre.ROLE_LABORATORIO);
    //    Rol rolDoctor = new Rol(RolNombre.ROLE_DOCTOR);
    //    Rol rolFarmacia = new Rol(RolNombre.ROLE_FARMACIA);
    //    Rol rolContabilidad = new Rol(RolNombre.ROLE_CONTABILIDAD);
    //    rolService.save(rolAdmin);
    //    rolService.save(rolePaciente);
    //    rolService.save(rolLaboratorio);
    //    rolService.save(rolDoctor);
    //    rolService.save(rolFarmacia);
    //    rolService.save(rolContabilidad);
    }
}
