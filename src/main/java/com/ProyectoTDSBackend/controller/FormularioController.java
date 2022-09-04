/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Formulario;
import com.ProyectoTDSBackend.service.ClienteService;
import com.ProyectoTDSBackend.service.FormularioService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/formulario")
@CrossOrigin({"*"})
public class FormularioController {

    @Autowired
    private FormularioService servicio;

    @ApiOperation("Crea al formulario")
    @PostMapping("/crearFormulario")
    public ResponseEntity<?> create(@RequestBody Formulario formulario) {

        try {
            Formulario form = new Formulario(
                    formulario.getIdFormulario(),
                    formulario.getCuadro_clinico(),
                    formulario.getHallazgos(),
                    formulario.getDiagnostico(),
                    formulario.getUsuario(),
                    formulario.getDatos(),
                    formulario.getRefiere()
            );
            servicio.save(form);
            int id = formulario.getIdFormulario();
            return new ResponseEntity<>(new Mensaje(String.valueOf(id)), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("error crear al crear el formulario: " + e.getMessage());
            return new ResponseEntity(new Mensaje("Formulario no fue creado"), HttpStatus.BAD_REQUEST);
        }

    }
    
    @ApiOperation("Muestra una lista de los formularios")
    @CrossOrigin({"*"})
    @GetMapping("/listaForms")
    public ResponseEntity<List<Formulario>> list() {
        List<Formulario> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

}
