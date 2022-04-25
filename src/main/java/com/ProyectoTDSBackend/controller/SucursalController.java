package com.ProyectoTDSBackend.controller;

import java.util.List;

import com.ProyectoTDSBackend.models.Sucursal;
import com.ProyectoTDSBackend.service.SucursalService;
import com.ProyectoTDSBackend.util.GenericResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/sucursal")
@Tag(name = "Sucursal", description = "Control y Operaciones sobre las sucursales")
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    @PostMapping(path = "/saveSucursal")
    public ResponseEntity<GenericResponse<String>> saveSucursal(@RequestBody Sucursal sucursal) {
        return new ResponseEntity<GenericResponse<String>>(sucursalService.saveSucursal(sucursal),HttpStatus.OK);
    }

    //Listar todas las sucursales
    @GetMapping(path = "/getAllSucursales")
    public ResponseEntity<GenericResponse<List<Sucursal>>> getAllSucursales() {
        return new ResponseEntity<GenericResponse<List<Sucursal>>>(sucursalService.getAllSucursales(),HttpStatus.OK);
    }

    //Actualizar una sucursal
    @PutMapping(path = "/updateSucursal")
    public ResponseEntity<GenericResponse<String>> updateSucursal(@RequestBody Sucursal sucursal) {
        return new ResponseEntity<GenericResponse<String>>(sucursalService.updateSucursal(sucursal),HttpStatus.OK);
    }
    
}
