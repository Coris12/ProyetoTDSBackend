/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Emergencia;
import com.ProyectoTDSBackend.service.EmergenciaService;
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
@RequestMapping("/emergencia")
public class EmergenciaController {

    @Autowired
    private EmergenciaService servicio;

    @PostMapping(path = "saveEmergencia")
    public ResponseEntity<GenericResponse<String>> saveEnfer(@RequestBody Emergencia enfer) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveEmergencia(
                enfer), HttpStatus.OK);
    }

    @GetMapping("/detallesEmergencia/{id}")
    public ResponseEntity<Emergencia> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Emergencia ad = servicio.getOne(id).get();
        return new ResponseEntity(ad, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de Emergencia")
    @CrossOrigin({"*"})
    @GetMapping("/listaEmergencia")
    public ResponseEntity<List<Emergencia>> list() {
        List<Emergencia> list = servicio.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
