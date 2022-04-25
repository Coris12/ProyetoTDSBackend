/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;
import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Cliente;
import com.ProyectoTDSBackend.models.Proveedor;
import com.ProyectoTDSBackend.service.ProveedorService;
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
@RequestMapping("/proveedor")
@CrossOrigin({"*"})

public class ProveedorController {
    @Autowired
    private ProveedorService servicio;
    
    @ApiOperation("Crea al proveedor")
    @PostMapping("/cerarProveedor")
    public ResponseEntity<?> create(@RequestBody Proveedor proveedor) {

        Proveedor prove = new Proveedor(
                proveedor.getId_proveedor(),
                proveedor.getNombre_comercial_pro(),
                proveedor.getUsuario()
        );

        servicio.save(prove);

        return new ResponseEntity(new Mensaje("Proveedor creado exitosamente"), HttpStatus.OK);
    }
}
