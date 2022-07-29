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
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
                    empleado.getIdEmpleado(),
                    empleado.getCargoEmple(),
                    empleado.getEstado(),
                    empleado.getUsuario(),
                    empleado.getFarmacia()
            );
            emple.setEstado(1);
            servicio.save(emple);

            return new ResponseEntity(new Mensaje("Empleado creado exitosamente"), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Empleado no creado " + e.getMessage());
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

    @ApiOperation("Lista los empleados  con estado 1")
    @GetMapping("/empleadosActivos")
    public ResponseEntity<List<Empleado>> search() {
        List<Empleado> list = servicio.search();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @ApiOperation("Detalle de los empleados")
    @GetMapping("/detailEmpleado/{id}")
    public ResponseEntity<Empleado> getById(@PathVariable("id") int id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Empleado emple = servicio.getOne(id).get();
        return new ResponseEntity(emple, HttpStatus.OK);
    }

    @ApiOperation("Actualiza los empleados")
    @CrossOrigin({"*"})
    @PutMapping("/update Empleado/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Empleado empleado) {

        Empleado emple = servicio.getOne(id).get();
        emple.setCargoEmple(empleado.getCargoEmple());
        emple.setFarmacia(empleado.getFarmacia());
        emple.setUsuario(empleado.getUsuario());

        servicio.save(emple);

        return new ResponseEntity(new Mensaje("Empleado actualizado"), HttpStatus.OK);
    }

}
