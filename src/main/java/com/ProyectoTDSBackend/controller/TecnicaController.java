/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Tecnicas;
import com.ProyectoTDSBackend.service.TecnicasService;
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
@RequestMapping("/Tecnicas")
@CrossOrigin(origins = "*")
public class TecnicaController {
   
    @Autowired
    private TecnicasService servicio;

    @PostMapping(path = "saveTecnica")
    public ResponseEntity<GenericResponse<String>> saveTecnica(@RequestBody Tecnicas tec) {
        return new ResponseEntity<GenericResponse<String>>(servicio.savetecnicas(tec), HttpStatus.OK);
    }

    @GetMapping("/detallesTecnicas/{id}")
    public ResponseEntity<Tecnicas> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Tecnicas tec = servicio.getOne(id).get();
        return new ResponseEntity(tec, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de las historias clinicas")
    @CrossOrigin({"*"})
    @GetMapping("/listaDiagnostico")
    public ResponseEntity<List<Tecnicas>> list() {
        List<Tecnicas> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    // Metodo generar codigos aleatorios

    public String generarCodigoAleatorio() {
        String codigo = "";
        for (int i = 0; i < 10; i++) {
            codigo += (int) (Math.random() * 10);
        }
        return codigo;
    } 
}
