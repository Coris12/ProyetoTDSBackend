package com.ProyectoTDSBackend.controller;

import java.util.List;

import com.ProyectoTDSBackend.models.Factura;
import com.ProyectoTDSBackend.service.FacturaService;
import com.ProyectoTDSBackend.util.GenericResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/factura")
@Tag(name = "FacturaWS", description = "Control y mantenimiento de factura" )
public class FacturaController {
    
    @Autowired
	private FacturaService servicio;

    //Guardar factura
    @PostMapping(path = "/saveFactura")
    public ResponseEntity<GenericResponse<String>> saveFactura(@RequestBody Factura factura) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveFactura(factura),HttpStatus.OK);
    }

    //Listar todas las facturas
    @GetMapping(path = "/getAllFacturas")
    public ResponseEntity<GenericResponse<List<Factura>>> getAllFacturas() {
        return new ResponseEntity<GenericResponse<List<Factura>>>(servicio.getAllFacturas(),HttpStatus.OK);
    }
}
