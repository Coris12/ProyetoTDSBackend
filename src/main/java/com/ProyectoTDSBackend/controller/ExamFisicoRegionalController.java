package com.ProyectoTDSBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.models.ExamFisicoRegional;
import com.ProyectoTDSBackend.service.ExamFisicoRegionalService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@RequestMapping(path = "ExamFisicoRegional")
@Tag(name = "ExamFisicoRegionalWS", description = "Control y mantenimiento de examenes fisicos regionales")
public class ExamFisicoRegionalController {
    @Autowired
	private ExamFisicoRegionalService servicio;

    @PostMapping(path = "saveExamFisicoRegional")
    public ResponseEntity<GenericResponse<String>> saveExamFisicoRegional(@RequestBody ExamFisicoRegional examFisicoRegional) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveExamFisicoRegional(examFisicoRegional), HttpStatus.OK);
    }
}
