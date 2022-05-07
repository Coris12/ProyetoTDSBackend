/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Cliente;
import com.ProyectoTDSBackend.service.ClienteService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

        try {
            Cliente cli = new Cliente(
                    cliente.getId_cliente(),
                    cliente.getObservaciones(),
                    cliente.getEstado(),
                    cliente.getUsuario()
            );
            cliente.setEstado(1);
            servicio.save(cliente);

            return new ResponseEntity(new Mensaje("Cliente creado exitosamente"), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("error crear cliente: " + e.getMessage());
            return new ResponseEntity(new Mensaje("Cliente no fue creado"), HttpStatus.BAD_REQUEST);
        }

    }

    @ApiOperation("Eliminado logico de cliente")
    @CrossOrigin({"*"})
    @PatchMapping("/deleteCliente/{id_cliente}")
    public ResponseEntity<?> deleteCliente(@RequestParam(value = "id_cliente") int idCliente) {
        Cliente cliente = servicio.getOne(idCliente).get();
        cliente.setEstado(0);
        servicio.save(cliente);
        return new ResponseEntity(new Mensaje("cliente eliminado"), HttpStatus.OK);
    }

}
