/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Lesiones;
import com.ProyectoTDSBackend.service.LesionesService;
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
@RequestMapping("/lesiones")
public class LesionesController {
    @Autowired
    private LesionesService servicio;

    @PostMapping(path = "saveLesion")
    public ResponseEntity<GenericResponse<String>> saveLesion(@RequestBody Lesiones lesion) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveLesion(lesion), HttpStatus.OK);
    }

    @GetMapping("/detallesLesion/{id}")
    public ResponseEntity<Lesiones> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Lesiones ad = servicio.getOne(id).get();
        return new ResponseEntity(ad, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de lesiones")
    @CrossOrigin({"*"})
    @GetMapping("/listaLesiones")
    public ResponseEntity<List<Lesiones>> list() {
        List<Lesiones> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
