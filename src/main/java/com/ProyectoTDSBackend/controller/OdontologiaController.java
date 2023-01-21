/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Odontologia;
import com.ProyectoTDSBackend.service.OdontologiaService;
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
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/odontologia")
public class OdontologiaController {
      @Autowired
    private OdontologiaService service;

     @PostMapping(path = "saveOdontologia")
    public ResponseEntity<GenericResponse<String>> saveOdontologia(@RequestBody Odontologia odontologia) {
        return new ResponseEntity<GenericResponse<String>>(service.saveOdontologia(odontologia), HttpStatus.OK);
    }

    @GetMapping("/detallesOdontologia/{id}")
    public ResponseEntity<Odontologia> getById(@PathVariable("id") Long id) {
        if (!service.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Odontologia odontologia = service.getOne(id).get();
        return new ResponseEntity(odontologia, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de odontologia")
    @CrossOrigin({"*"})
    @GetMapping("/listaOdontologia")
    public ResponseEntity<List<Odontologia>> list() {
        List<Odontologia> list = service.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

}
