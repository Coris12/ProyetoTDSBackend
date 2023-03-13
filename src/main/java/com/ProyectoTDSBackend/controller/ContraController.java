/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Contrareferencia;
import com.ProyectoTDSBackend.service.ContraService;
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
@RequestMapping("/Contrareferencia")
public class ContraController {
    @Autowired
    private ContraService service;

     @PostMapping(path = "saveContra")
    public ResponseEntity<GenericResponse<String>> saveContra(@RequestBody Contrareferencia contra) {
        return new ResponseEntity<GenericResponse<String>>(service.saveContrareferencia(contra), HttpStatus.OK);
    }

    @GetMapping("/detallesContra/{id}")
    public ResponseEntity<Contrareferencia> getById(@PathVariable("id") Long id) {
        if (!service.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Contrareferencia contra = service.getOne(id).get();
        return new ResponseEntity(contra, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de Admision")
    @CrossOrigin({"*"})
    @GetMapping("/listaDatos")
    public ResponseEntity<List<Contrareferencia>> list() {
        List<Contrareferencia> list = service.list();
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
