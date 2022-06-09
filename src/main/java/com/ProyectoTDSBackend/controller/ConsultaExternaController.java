package com.ProyectoTDSBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.models.ConsultaExterna;
import com.ProyectoTDSBackend.service.ConsultaExternaService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@RequestMapping(path = "consultaExterna")
@Tag(name = "ConsultaExternaWS", description = "Control y mantenimiento de consulta externa")
public class ConsultaExternaController {
    
    @Autowired
	private ConsultaExternaService servicio;

    @PostMapping(path = "saveConsultaExterna")
    public ResponseEntity<GenericResponse<String>> saveConsultaExterna(@RequestBody ConsultaExterna consultaExterna) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveConsultaExterna(consultaExterna), HttpStatus.OK);
    }
}
