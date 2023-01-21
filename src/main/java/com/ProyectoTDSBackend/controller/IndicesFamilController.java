/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.models.IndicesF;
import com.ProyectoTDSBackend.service.IndicesFamiService;
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
@RequestMapping(path = "indicesAntecedentesF")
public class IndicesFamilController {
    
    @Autowired
	private IndicesFamiService servicio;

    @PostMapping(path = "saveIndiceAntecPersonales")
    public ResponseEntity<GenericResponse<String>> saveAntecPersonales(@RequestBody IndicesF antecPersonales) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveIndiceAntecPersonal(antecPersonales), HttpStatus.OK);
    }
}
