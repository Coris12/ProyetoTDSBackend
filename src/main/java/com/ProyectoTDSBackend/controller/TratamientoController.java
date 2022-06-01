/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Tratamiento;
import com.ProyectoTDSBackend.service.TratamientoService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/tratamiento")
@CrossOrigin({"*"})
public class TratamientoController {

    @Autowired
    private TratamientoService servicio;

    @ApiOperation("Crea el tratamiento")
    @PostMapping("/creaTratamiento")
    public ResponseEntity<?> create(@RequestBody Tratamiento tratamiento) {

        try {
            Tratamiento trata = new Tratamiento(
                    tratamiento.getIdTratamiento(),
                    tratamiento.getNombre(),
                    tratamiento.getCodigo(),
                    tratamiento.getCategoria(),
                    tratamiento.getDescripcion(),
                    tratamiento.getCantidad(),
                    tratamiento.getValor_unitario(),
                    tratamiento.getSubtotal(),
                    tratamiento.getTotal(),
                    tratamiento.getCliente(),
                    tratamiento.getEmpleado()
            );
            servicio.save(trata);

            return new ResponseEntity(new Mensaje("Tratamiento creado exitosamente"), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Tratamiento no creado; " + e.getMessage());
            return new ResponseEntity(new Mensaje("Tratamiento no creado"), HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation("Muestra una lista de tratamientos")
    @CrossOrigin({"*"})
    @GetMapping("/listaTratamientos")
    public ResponseEntity<List<Tratamiento>> list() {
        List<Tratamiento> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
