/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.models.Alta;
import com.ProyectoTDSBackend.service.AltaService;
import com.ProyectoTDSBackend.util.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping("/Alta")
public class AltaController {
    @Autowired
	private AltaService servicio;

    @PostMapping(path = "saveAlta")
    public ResponseEntity<GenericResponse<String>> savAlta(@RequestBody Alta alta) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveAlta(alta), HttpStatus.OK);
    }

    
}
