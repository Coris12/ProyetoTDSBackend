package com.ProyectoTDSBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.models.AntecFamiliares;
import com.ProyectoTDSBackend.service.AntecFamiliareService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@RequestMapping(path = "AntecFamiliares")
@Tag(name = "AntecFamiliaresWS", description = "Control y mantenimiento de antecedentes familiares")
public class AntecFamiliaresController {
    
    @Autowired
	private AntecFamiliareService servicio;

    @PostMapping(path = "saveAntecFamiliares")
    public ResponseEntity<GenericResponse<String>> saveAntecFamiliares(@RequestBody AntecFamiliares antecFamiliares) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveAntecFamiliare(antecFamiliares), HttpStatus.OK);
    }
}
