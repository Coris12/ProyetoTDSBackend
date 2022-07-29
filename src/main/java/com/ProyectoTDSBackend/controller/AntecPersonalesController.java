package com.ProyectoTDSBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.models.AntecPersonales;
import com.ProyectoTDSBackend.service.AntecPersonaleService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@RequestMapping(path = "AntecPersonales")
@Tag(name = "AntecPersonalesWS", description = "Control y mantenimiento de antecedentes personales")
public class AntecPersonalesController {
    
    @Autowired
	private AntecPersonaleService servicio;

    @PostMapping(path = "saveAntecPersonales")
    public ResponseEntity<GenericResponse<String>> saveAntecPersonales(@RequestBody AntecPersonales antecPersonales) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveAntecPersonal(antecPersonales), HttpStatus.OK);
    }
}
