/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Medicamentos;
import com.ProyectoTDSBackend.service.MedicamentosService;
import com.ProyectoTDSBackend.util.GenericResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@RequestMapping("/medicamentos")
@CrossOrigin(origins = "*")
public class MedicamentosController {

    @Autowired
    private MedicamentosService servicio;
    
     @PostMapping(path = "saveMedicamentos")
    public ResponseEntity<GenericResponse<String>> saveMedicamento(@RequestBody Medicamentos medicamento) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveMedicamento(medicamento), HttpStatus.OK);
    }
    
    @GetMapping("/detallesMedicamentos/{id}")
    public ResponseEntity<Medicamentos> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Medicamentos medicamento = servicio.getOne(id).get();
        return new ResponseEntity(medicamento, HttpStatus.OK);
    }
    
    @ApiOperation("Muestra una lista de medicamentos")
    @CrossOrigin({"*"})
    @GetMapping("/listaMedicamentos")
    public ResponseEntity<List<Medicamentos>> list() {
        List<Medicamentos> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
