/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.DiagnosticoO;
import com.ProyectoTDSBackend.service.DiagnosticoOService;
import com.ProyectoTDSBackend.util.GenericResponse;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author corin
 */
@RestController
@RequestMapping("/diagnosticoO")
@CrossOrigin(origins = "*")
public class DiagnosticoOController {

    @Autowired
    private DiagnosticoOService service;

    @PostMapping(path = "saveIndice")
    public ResponseEntity<GenericResponse<String>> saveDiagnostico(@RequestBody DiagnosticoO diagnostico) {
        return new ResponseEntity<GenericResponse<String>>(service.saveDiagnosticoO(diagnostico), HttpStatus.OK);
    }

    @GetMapping("/detallesDiagnostico/{id}")
    public ResponseEntity<DiagnosticoO> getById(@PathVariable("id") Long id) {
        if (!service.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        DiagnosticoO diagnostico = service.getOne(id).get();
        return new ResponseEntity(diagnostico, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de indices")
    @CrossOrigin({"*"})
    @GetMapping("/listaDiagnostico")
    public ResponseEntity<List<DiagnosticoO>> list() {
        List<DiagnosticoO> list = service.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

}
