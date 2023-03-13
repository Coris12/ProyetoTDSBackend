/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Inversa;
import com.ProyectoTDSBackend.service.InversaService;
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

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/inversa")
public class InversaController {
    @Autowired
    private InversaService service;

     @PostMapping(path = "saveInversa")
    public ResponseEntity<GenericResponse<String>> saveInversa(@RequestBody Inversa inver) {
        return new ResponseEntity<GenericResponse<String>>(service.saveInversa(inver), HttpStatus.OK);
    }

    @GetMapping("/detallesInversa/{id}")
    public ResponseEntity<Inversa> getById(@PathVariable("id") Long id) {
        if (!service.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Inversa inver = service.getOne(id).get();
        return new ResponseEntity(inver, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de Admision")
    @CrossOrigin({"*"})
    @GetMapping("/listaDatos")
    public ResponseEntity<List<Inversa>> list() {
        List<Inversa> list = service.list();
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
