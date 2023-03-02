/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Terapia;
import com.ProyectoTDSBackend.service.TerapiaService;
import com.ProyectoTDSBackend.util.GenericResponse;
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
@RequestMapping("/terapia")
@CrossOrigin(origins = "*")
public class TerapiaController {

    @Autowired
    private TerapiaService servicio;

    @PostMapping(path = "saveTerapia")
    public ResponseEntity<GenericResponse<String>> saveTerapia(@RequestBody Terapia reg) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveTerapia(reg), HttpStatus.OK);
    }

    @GetMapping("/detallesTerapia/{id}")
    public ResponseEntity<Terapia> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Terapia ter = servicio.getOne(id).get();
        return new ResponseEntity(ter, HttpStatus.OK);
    }

    @CrossOrigin({"*"})
    @GetMapping("/listaTerapia")
    public ResponseEntity<List<Terapia>> list() {
        List<Terapia> list = servicio.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
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
