/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.ExamenEsto;
import com.ProyectoTDSBackend.service.ExamenEstoService;
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
@RequestMapping("/examenEsto")
@CrossOrigin(origins = "*")
public class ExamenEstoController {
      @Autowired
    private ExamenEstoService service;

     @PostMapping(path = "saveExamenEsto")
    public ResponseEntity<GenericResponse<String>> saveExamenEsto(@RequestBody ExamenEsto examen) {
        return new ResponseEntity<GenericResponse<String>>(service.saveExamenEsto(examen), HttpStatus.OK);
    }

    @GetMapping("/detallesExamenEsto/{id}")
    public ResponseEntity<ExamenEsto> getById(@PathVariable("id") Long id) {
        if (!service.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        ExamenEsto examen = service.getOne(id).get();
        return new ResponseEntity(examen, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de indices")
    @CrossOrigin({"*"})
    @GetMapping("/listaIndice")
    public ResponseEntity<List<ExamenEsto>> list() {
        List<ExamenEsto> list = service.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

}
