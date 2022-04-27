/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Empleado;
import com.ProyectoTDSBackend.service.EmpleadoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */

@RestController
@RequestMapping("/empleado")
@CrossOrigin({"*"})
public class EmpleadoController {
   @Autowired
    private EmpleadoService servicio;
    
    @ApiOperation("Crea al empleado")
    @PostMapping("/crearEmpleado")
    public ResponseEntity<?> create(@RequestBody Empleado empleado) {
        
        try {
               Empleado emple = new Empleado(
                empleado.getId_empleado(),
                empleado.getCargo_emple(),
                empleado.getEstado(),
                empleado.getUsuario()
        );
        empleado.setEstado(1);
        servicio.save(empleado);
        
        return new ResponseEntity(new Mensaje("Empleado creado exitosamente"), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Empleado no creado "+ e.getMessage());
        return new ResponseEntity(new Mensaje("Empleado no  creado"), HttpStatus.BAD_REQUEST);
        }
    }
    
    
    @ApiOperation("Eliminado logico del empleado")
    @CrossOrigin({"*"})
    @PatchMapping("/deleteEmpleado/{id_empleado}")
    public ResponseEntity<?> deleteEmpleado(@RequestParam(value = "id_empleado") int idempleado) {
        Empleado empleado = servicio.getOne(idempleado).get();
        empleado.setEstado(0);
        servicio.save(empleado);
        return new ResponseEntity(new Mensaje("empleado eliminado"), HttpStatus.OK);
    }
}
