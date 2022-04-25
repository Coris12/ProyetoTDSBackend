/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Cliente;
import com.ProyectoTDSBackend.models.CuerpoFactura;
import com.ProyectoTDSBackend.service.ClienteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/cliente")
@CrossOrigin({"*"})

public class ClienteController {

    @Autowired
    private ClienteService servicio;

    @ApiOperation("Crea al cliente")
    @PostMapping("/crearCliente")
    public ResponseEntity<?> create(@RequestBody Cliente cliente) {

        Cliente cli = new Cliente(
                cliente.getId_cliente(),
                cliente.getObservaciones(),
                cliente.getUsuario()
        );

        servicio.save(cliente);

        return new ResponseEntity(new Mensaje("Cliente creado exitosamente"), HttpStatus.OK);
    }

}
