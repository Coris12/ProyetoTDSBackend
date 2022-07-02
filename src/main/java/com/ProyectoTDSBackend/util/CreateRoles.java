/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.util;

import com.ProyectoTDSBackend.models.TarjetaEspecialidad;
import com.ProyectoTDSBackend.security.enums.NomEspTarjeta;
import com.ProyectoTDSBackend.security.enums.RolNombre;
import com.ProyectoTDSBackend.security.models.Rol;
import com.ProyectoTDSBackend.security.service.RolService;
import com.ProyectoTDSBackend.service.TarjetaEspecialidadService;

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

    @Autowired
    TarjetaEspecialidadService tarjetaEspecialidadService;

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
    //    rolService.save(rolCounter);
    //    rolService.save(rolLaboratorio);
    //    rolService.save(rolDoctor);
    //    rolService.save(rolFarmacia);
    //    rolService.save(rolContabilidad);
    
    // ////Crear tarjetaEspecialidad
    // TarjetaEspecialidad pediatria = new TarjetaEspecialidad(NomEspTarjeta.PEDIATRIA); 
    // TarjetaEspecialidad ginecologia = new TarjetaEspecialidad(NomEspTarjeta.GINECOLOGIA); 
    // TarjetaEspecialidad psicologia = new TarjetaEspecialidad(NomEspTarjeta.PSICOLOGIA); 
    // TarjetaEspecialidad especialidadGstroCirugGeneral = new TarjetaEspecialidad(NomEspTarjeta.ESPECIALIADADES_GASTRO_CIRUJIA_GENERAL); 
    // TarjetaEspecialidad medicinaGeneral = new TarjetaEspecialidad(NomEspTarjeta.MEDICINA_GENERAL); 
    // tarjetaEspecialidadService.saveTarjetaEspecialidad(pediatria); 
    // tarjetaEspecialidadService.saveTarjetaEspecialidad(ginecologia); 
    // tarjetaEspecialidadService.saveTarjetaEspecialidad(psicologia); 
    // tarjetaEspecialidadService.saveTarjetaEspecialidad(especialidadGstroCirugGeneral); 
    // tarjetaEspecialidadService.saveTarjetaEspecialidad(medicinaGeneral); 
    }
}
