/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Accidente;
import com.ProyectoTDSBackend.service.AccidenteService;
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
@RequestMapping("/accidente")
public class AccidenteController {

    @Autowired
    private AccidenteService servicio;

    @PostMapping(path = "saveAccidente")
    public ResponseEntity<GenericResponse<String>> saveAccidente(@RequestBody Accidente acciden) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveLlegada(acciden), HttpStatus.OK);
    }

    @GetMapping("/detallesAccidente/{id}")
    public ResponseEntity<Accidente> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Accidente ad = servicio.getOne(id).get();
        return new ResponseEntity(ad, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de Admision")
    @CrossOrigin({"*"})
    @GetMapping("/listaAccidente")
    public ResponseEntity<List<Accidente>> list() {
        List<Accidente> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

}
