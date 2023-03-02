/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Region;
import com.ProyectoTDSBackend.service.RegionService;
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
@RequestMapping("/region")
@CrossOrigin(origins = "*")
public class RegionController {
    @Autowired
    private RegionService servicio;

    @PostMapping(path = "saveRegion")
    public ResponseEntity<GenericResponse<String>> saveRegion(@RequestBody Region reg) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveRegion(reg), HttpStatus.OK);
    }

    @GetMapping("/detallesRegion/{id}")
    public ResponseEntity<Region> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Region reg = servicio.getOne(id).get();
        return new ResponseEntity(reg, HttpStatus.OK);
    }

    @CrossOrigin({"*"})
    @GetMapping("/listaRegion")
    public ResponseEntity<List<Region>> list() {
        List<Region> list = servicio.list();
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
