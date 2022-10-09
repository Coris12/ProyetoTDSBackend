/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.OrganosDonados;
import com.ProyectoTDSBackend.service.OrganosService;
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
@RequestMapping("/organosDonados")
@CrossOrigin(origins = "*")
public class OrganosController {
     @Autowired
    private OrganosService servicio;

    @PostMapping(path = "saveOrganosDonados")
    public ResponseEntity<GenericResponse<String>> saveOrganos(@RequestBody OrganosDonados organos) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveHistoria(organos), HttpStatus.OK);
    }

    @GetMapping("/detallesOrganosDonados/{id}")
    public ResponseEntity<OrganosDonados> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        OrganosDonados organos = servicio.getOne(id).get();
        return new ResponseEntity(organos, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de los organos donados")
    @CrossOrigin({"*"})
    @GetMapping("/listaOrganosDonados")
    public ResponseEntity<List<OrganosDonados>> list() {
        List<OrganosDonados> list = servicio.list();
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
