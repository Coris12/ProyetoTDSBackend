package com.ProyectoTDSBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.models.PlanTratamiento;
import com.ProyectoTDSBackend.service.PlanTratamientoService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin
@RestController
@RequestMapping(path = "PlanTratamiento")
@Tag(name = "PlanTratamientoWS", description = "Control y mantenimiento de planes de tratamiento")
public class PlanTratamientoController {
    @Autowired
	private PlanTratamientoService servicio;

    @PostMapping(path = "savePlanTratamiento")
    public ResponseEntity<GenericResponse<String>> savePlanTratamiento(@RequestBody PlanTratamiento planTratamiento) {
        return new ResponseEntity<GenericResponse<String>>(servicio.savePlanTratamiento(planTratamiento), HttpStatus.OK);
    }
}
