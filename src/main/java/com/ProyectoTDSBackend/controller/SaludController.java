/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.models.SaludBucal;
import com.ProyectoTDSBackend.service.SaludService;
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

@CrossOrigin
@RestController
@RequestMapping(path = "saludBucal")
public class SaludController {
    @Autowired
	private SaludService servicio;

    @PostMapping(path = "saveSalud")
    public ResponseEntity<GenericResponse<String>> saveSalud(@RequestBody SaludBucal salud) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveSalud(salud), HttpStatus.OK);
    }
}