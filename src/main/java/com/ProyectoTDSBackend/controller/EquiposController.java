/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.EquipoOperatorio;
import com.ProyectoTDSBackend.service.EquipoQuirurService;
import com.ProyectoTDSBackend.util.GenericResponse;
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
@RequestMapping("/equiposOperatorio")
@CrossOrigin(origins = "*")
public class EquiposController {
     @Autowired
    private EquipoQuirurService servicio;

    @PostMapping(path = "saveEquipo")
    public ResponseEntity<GenericResponse<String>> saveEquipo(@RequestBody EquipoOperatorio equipo) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveEquipo(equipo), HttpStatus.OK);
    }

    @GetMapping("/detallesEquipo/{id}")
    public ResponseEntity<EquipoOperatorio> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        EquipoOperatorio equi = servicio.getOne(id).get();
        return new ResponseEntity(equi, HttpStatus.OK);
    }

    @CrossOrigin({"*"})
    @GetMapping("/listaEquipo")
    public ResponseEntity<List<EquipoOperatorio>> list() {
        List<EquipoOperatorio> list = servicio.list();
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
