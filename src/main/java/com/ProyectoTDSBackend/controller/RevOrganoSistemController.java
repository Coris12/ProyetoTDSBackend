package com.ProyectoTDSBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.models.RevOrganoSistem;
import com.ProyectoTDSBackend.service.RevOrganoSistemService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@RequestMapping(path = "RevOrganoSistem")
@Tag(name = "RevOrganoSistemWS", description = "Control y mantenimiento de revision organos y sistemas")
public class RevOrganoSistemController {
    @Autowired
	private RevOrganoSistemService servicio;

    @PostMapping(path = "saveRevOrganoSistem")
    public ResponseEntity<GenericResponse<String>> saveRevOrganoSistem(@RequestBody RevOrganoSistem revOrganoSistem) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveRevOrganoSistem(revOrganoSistem), HttpStatus.OK);
    }
}
