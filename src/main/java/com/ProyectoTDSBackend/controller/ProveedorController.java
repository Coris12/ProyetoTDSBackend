/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Proveedor;
import com.ProyectoTDSBackend.service.ProveedorService;
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
@RequestMapping("/proveedor")
@CrossOrigin({"*"})

public class ProveedorController {

    @Autowired
    private ProveedorService servicio;

    @ApiOperation("Crea al proveedor")
    @PostMapping("/cerarProveedor")
    public ResponseEntity<?> create(@RequestBody Proveedor proveedor) {

        try {
            Proveedor prove = new Proveedor(
                    proveedor.getId_proveedor(),
                    proveedor.getNombre_comercial_pro(),
                    proveedor.getEstado(),
                    proveedor.getUsuario()
            );
            proveedor.setEstado(1);
            servicio.save(prove);

            return new ResponseEntity(new Mensaje("Proveedor creado exitosamente"), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Proveedor no creado; " + e.getMessage());
            return new ResponseEntity(new Mensaje("Proveedor no creado"), HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation("Eliminado logico del proveedor")
    @CrossOrigin({"*"})
    @PatchMapping("/deleteProveedor/{id_empleado}")
    public ResponseEntity<?> deleteEmpleado(@RequestParam(value = "id_proveedor") int idProveedor) {
        Proveedor proveedor = servicio.getOne(idProveedor).get();
        proveedor.setEstado(0);
        servicio.save(proveedor);
        return new ResponseEntity(new Mensaje("proveedor eliminado"), HttpStatus.OK);
    }
}
