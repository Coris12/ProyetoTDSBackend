/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.models.PlanesDiagnostico;
import com.ProyectoTDSBackend.service.PlanesService;
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
@RequestMapping(path = "planesDiagnostico")
public class PlanesController {
    
    @Autowired
	private PlanesService servicio;

    @PostMapping(path = "savePlanes")
    public ResponseEntity<GenericResponse<String>> saveAntecPersonales(@RequestBody PlanesDiagnostico planes) {
        return new ResponseEntity<GenericResponse<String>>(servicio.savePlanesD(planes), HttpStatus.OK);
    }
}
