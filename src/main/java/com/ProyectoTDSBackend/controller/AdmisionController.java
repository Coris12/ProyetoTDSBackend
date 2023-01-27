/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Admision;
import com.ProyectoTDSBackend.service.AdmisionService;
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
@RequestMapping("/admision")
public class AdmisionController {
     @Autowired
    private AdmisionService service;

     @PostMapping(path = "saveAdmision")
    public ResponseEntity<GenericResponse<String>> saveAd(@RequestBody Admision ad) {
        return new ResponseEntity<GenericResponse<String>>(service.saveAdmision(ad), HttpStatus.OK);
    }

    @GetMapping("/detallesIndice/{id}")
    public ResponseEntity<Admision> getById(@PathVariable("id") Long id) {
        if (!service.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Admision ad = service.getOne(id).get();
        return new ResponseEntity(ad, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de Admision")
    @CrossOrigin({"*"})
    @GetMapping("/listaAdmision")
    public ResponseEntity<List<Admision>> list() {
        List<Admision> list = service.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

}
