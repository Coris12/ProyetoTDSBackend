/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.IndicesCPO;
import com.ProyectoTDSBackend.service.IndiceService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author corin
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/indices")
public class IndiceControlller {
      @Autowired
    private IndiceService service;

     @PostMapping(path = "saveIndice")
    public ResponseEntity<GenericResponse<String>> saveIndice(@RequestBody IndicesCPO indice) {
        return new ResponseEntity<GenericResponse<String>>(service.saveIndice(indice), HttpStatus.OK);
    }

    @GetMapping("/detallesIndice/{id}")
    public ResponseEntity<IndicesCPO> getById(@PathVariable("id") Long id) {
        if (!service.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        IndicesCPO indice = service.getOne(id).get();
        return new ResponseEntity(indice, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de indices")
    @CrossOrigin({"*"})
    @GetMapping("/listaIndice")
    public ResponseEntity<List<IndicesCPO>> list() {
        List<IndicesCPO> list = service.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

}
