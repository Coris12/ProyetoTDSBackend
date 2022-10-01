/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Protocolos;
import com.ProyectoTDSBackend.service.ProtocoloService;
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
@RequestMapping("/diagnostico")
@CrossOrigin(origins = "*")
public class ProtocoloController {

    @Autowired
    private ProtocoloService servicio;

    @PostMapping(path = "saveDiagnostico")
    public ResponseEntity<GenericResponse<String>> saveDiagnostico(@RequestBody Protocolos protocolo) {
        protocolo.setEstado(1);
        return new ResponseEntity<GenericResponse<String>>(servicio.saveDiagnostico(protocolo), HttpStatus.OK);
    }

    @GetMapping("/detallesDiagnostico/{id}")
    public ResponseEntity<Protocolos> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Protocolos proto = servicio.getOne(id).get();
        return new ResponseEntity(proto, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista diagnostico")
    @CrossOrigin({"*"})
    @GetMapping("/listaDiagnostico")
    public ResponseEntity<List<Protocolos>> list() {
        List<Protocolos> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    // Metodo generar codigos aleatorios

    public String generarCodigoAleatorio() {
        String codigo = "";
        for (int i = 0; i < 10; i++) {
            codigo += (int) (Math.random() * 10);
        }
        return codigo;
    }
}
