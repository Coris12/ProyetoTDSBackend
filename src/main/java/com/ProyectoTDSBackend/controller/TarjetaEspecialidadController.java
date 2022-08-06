package com.ProyectoTDSBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.models.TarjetaEspecialidad;
import com.ProyectoTDSBackend.service.TarjetaEspecialidadService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/TajetaEspecialidad")
@Tag(name = "TajetaEspecialidadWS", description = "Control y mantenimiento de tarjeta especialidad")
public class TarjetaEspecialidadController {
    
    @Autowired
    private TarjetaEspecialidadService servicio;

    @GetMapping("/getAllTarjetaEspecialidad")
    public ResponseEntity<GenericResponse<List<TarjetaEspecialidad>>> getAllTarjetaEspecialidad() {
        return new ResponseEntity<GenericResponse<List<TarjetaEspecialidad>>>(servicio.listarTarjetaEspecialidad(), HttpStatus.OK);
    }



}
