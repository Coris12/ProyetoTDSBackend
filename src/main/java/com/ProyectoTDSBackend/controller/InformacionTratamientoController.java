package com.ProyectoTDSBackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.Exceptions.MessagExcepciones;
import com.ProyectoTDSBackend.dto.ConsentimientoDto;
import com.ProyectoTDSBackend.dto.InformacionTratamientoDTO;
import com.ProyectoTDSBackend.service.InformacionTratamientoService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/informacionTratamiento")
@Tag(name = "Informacion Tratamiento", description = "Control y mantenimiento de Informacion Tratamiento")
public class InformacionTratamientoController {
 
    @Autowired
    private InformacionTratamientoService informacionTratamientoService;

    @PostMapping(path = "/saveInformacionTratamiento")
    public ResponseEntity<GenericResponse<String>> saveInformacionTratamiento(@RequestBody InformacionTratamientoDTO informacionTratamiento) throws MessagExcepciones {
        return new ResponseEntity<GenericResponse<String>>(informacionTratamientoService.saveInformacionTratamiento(informacionTratamiento), HttpStatus.OK);
    }
    
    @GetMapping(path = "/getAllInformacionTratamientoById")
    public ResponseEntity<GenericResponse<List<InformacionTratamientoDTO>>> getAllInformacionTratamientoById(Integer idConsentimientoFk) {
        return new ResponseEntity<GenericResponse<List<InformacionTratamientoDTO>>>(informacionTratamientoService.getAllInformacionTratamientoById(idConsentimientoFk),
                HttpStatus.OK);
    }
    
    @PutMapping(path = "/updateConsentimientoTratamiento")
    public ResponseEntity<GenericResponse<String>> updateConsentimientoTratamiento(@RequestBody InformacionTratamientoDTO consentimientoTratamientoDto) {
        return new ResponseEntity<GenericResponse<String>>(informacionTratamientoService.updateConsentimientoTratamiento(consentimientoTratamientoDto),
                HttpStatus.OK);
    }
}
