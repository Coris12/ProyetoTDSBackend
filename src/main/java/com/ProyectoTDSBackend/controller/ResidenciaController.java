package com.ProyectoTDSBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.dto.ResidenciaDto;
import com.ProyectoTDSBackend.service.ResidenciaService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/residencia")
@Tag(name = "RESIDENCIAWS", description = "Control y mantenimiento de RESIDENCIA")
public class ResidenciaController {

    @Autowired
    private ResidenciaService recidenciaService;

    @PostMapping(path = "save")
    public ResponseEntity<GenericResponse<String>> guardarResidencia(@RequestBody ResidenciaDto  residenciaDto){
        return new ResponseEntity<GenericResponse<String>> (recidenciaService.saveRecidencia(residenciaDto), HttpStatus.OK);
    }

    @PutMapping(path = "updateResidencia")
	public ResponseEntity<GenericResponse<String>> updateResidencia(@RequestBody ResidenciaDto residenciaDto){
		return new ResponseEntity<GenericResponse<String>>(recidenciaService.updateRecidencia(residenciaDto), HttpStatus.OK);
	}
}
