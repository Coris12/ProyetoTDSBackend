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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.Exceptions.MessagExcepciones;
import com.ProyectoTDSBackend.dto.ConsentimientoDto;
import com.ProyectoTDSBackend.dto.ConsentimientoListDto;
import com.ProyectoTDSBackend.dto.ConsentimientoTratamientoDto;
import com.ProyectoTDSBackend.models.Consentimiento;
import com.ProyectoTDSBackend.service.ConsentimientoService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/consentimiento")
@Tag(name = "ConsentimientoWs", description = "Control y mantenimiento de consentimiento")
public class ConsentimientoController {
    @Autowired
    private ConsentimientoService consentimientoService;

    @PostMapping(path = "/saveConsentimiento")
    public ResponseEntity<GenericResponse<String>> saveConsentimiento(@RequestBody ConsentimientoDto consentimiento) {
        return new ResponseEntity<GenericResponse<String>>(consentimientoService.saveConsentimiento(consentimiento),
                HttpStatus.OK);
    }

    @PutMapping(path = "/updateConsentimiento")
    public ResponseEntity<GenericResponse<String>> updateConsentimiento(@RequestBody ConsentimientoDto consentimientoDto) {
        return new ResponseEntity<GenericResponse<String>>(consentimientoService.updateConsentimiento(consentimientoDto),
                HttpStatus.OK);
    }

    @GetMapping(path = "/listAllConsentimientos")
    public ResponseEntity<GenericResponse<List<ConsentimientoListDto>>> listAllConsentimientos() {
        return new ResponseEntity<GenericResponse<List<ConsentimientoListDto>>>(consentimientoService.getListConsentimientos(),
                HttpStatus.OK);
    }
    
  //ELIMNAR CONSENTIMIENTO POR UPDATE.
    @PutMapping(path = "deleteConsentimiento")
    public ResponseEntity<GenericResponse<String>> deleteConsentimiento(@RequestParam("idConsentimiento") Integer idConsentimiento)  {
        return new ResponseEntity<GenericResponse<String>>(consentimientoService.eliminarConsentimiento(idConsentimiento), HttpStatus.OK);
    }
    
    @GetMapping(path = "/getOneConsentimientoById")
    public ResponseEntity<GenericResponse<Optional<ConsentimientoDto>>> getOneConsentimientoById(Integer idConsentimiento) {
        return new ResponseEntity<GenericResponse<Optional<ConsentimientoDto>>>(consentimientoService.getOneConsentimientoById(idConsentimiento),
                HttpStatus.OK);
    }
}
