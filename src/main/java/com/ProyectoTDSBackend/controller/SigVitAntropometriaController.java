package com.ProyectoTDSBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.models.SigVitAntropometria;
import com.ProyectoTDSBackend.service.SigVitAntropometriaService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@RequestMapping(path = "SigVitAntropometria")
@Tag(name = "SigVitAntropometriaWS", description = "Control y mantenimiento de signos vitales antropometria")
public class SigVitAntropometriaController {
    @Autowired
	private SigVitAntropometriaService servicio;

    @PostMapping(path = "saveSigVitAntropometria")
    public ResponseEntity<GenericResponse<String>> saveSigVitAntropometria(@RequestBody SigVitAntropometria sigVitAntropometria) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveSigVitAntropometria(sigVitAntropometria), HttpStatus.OK);
    }
}
