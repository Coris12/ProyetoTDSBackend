/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.models.DiagnosticoAI;
import com.ProyectoTDSBackend.service.DiagnosticoAIService;
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
@RequestMapping("/diagnosticoAlta")
public class DiagnsticoAIController {
    @Autowired
	private DiagnosticoAIService servicio;

    @PostMapping(path = "saveDiagnosticoAlta")
    public ResponseEntity<GenericResponse<String>> saveDiagnosticoA(@RequestBody DiagnosticoAI diag) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveDiagnosticoAlta(diag), HttpStatus.OK);
    }
}
