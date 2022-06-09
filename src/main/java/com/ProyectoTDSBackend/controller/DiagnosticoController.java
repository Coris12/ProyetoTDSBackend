package com.ProyectoTDSBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.models.Diagnosticos;
import com.ProyectoTDSBackend.service.DiagnosticoService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@RequestMapping(path = "Diagnosticos")
@Tag(name = "DiagnosticosWS", description = "Control y mantenimiento de diagnósticos")
public class DiagnosticoController {
    
    @Autowired
	private DiagnosticoService servicio;

    @PostMapping(path = "saveDiagnostico")
    public ResponseEntity<GenericResponse<String>> saveDiagnostico(@RequestBody Diagnosticos diagnostico) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveDiagnostico(diagnostico), HttpStatus.OK);
    }
}
