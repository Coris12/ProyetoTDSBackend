/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Evolucion;
import com.ProyectoTDSBackend.service.EvolucionService;
import com.ProyectoTDSBackend.util.GenericResponse;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author corin
 */

@RestController
@RequestMapping("/evoluciones")
@CrossOrigin(origins = "*")
public class EvolucionController {
      @Autowired
    private EvolucionService servicio;
    
     @PostMapping(path = "saveEvolucion")
    public ResponseEntity<GenericResponse<String>> saveEvolucion(@RequestBody Evolucion evolucion) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveMedicamento(evolucion), HttpStatus.OK);
    }
    
    @GetMapping("/detallesEvolucion/{id}")
    public ResponseEntity<Evolucion> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Evolucion evolucion = servicio.getOne(id).get();
        return new ResponseEntity(evolucion, HttpStatus.OK);
    }
    
    @ApiOperation("Muestra una lista de evoluciones")
    @CrossOrigin({"*"})
    @GetMapping("/listaEvolucion")
    public ResponseEntity<List<Evolucion>> list() {
        List<Evolucion> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
