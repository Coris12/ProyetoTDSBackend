/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Producto;
import com.ProyectoTDSBackend.models.Proveedor;
import com.ProyectoTDSBackend.service.ProveedorService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
            prove.setEstado(1);
            servicio.save(prove);

            return new ResponseEntity(new Mensaje("Proveedor creado exitosamente"), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Proveedor no creado; " + e.getMessage());
            return new ResponseEntity(new Mensaje("Proveedor no creado"), HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation("Muestra una lista de proveedores")
    @CrossOrigin({"*"})
    @GetMapping("/listaProveedores")
    public ResponseEntity<List<Proveedor>> list() {
        List<Proveedor> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @ApiOperation("Eliminado logico del proveedor")
    @CrossOrigin({"*"})
    @PatchMapping("/deleteProveedor/{id_proveedor}")
    public ResponseEntity<?> deleteEmpleado(@RequestParam(value = "id_proveedor") int idProveedor) {
        Proveedor proveedor = servicio.getOne(idProveedor).get();
        proveedor.setEstado(0);
        servicio.save(proveedor);
        return new ResponseEntity(new Mensaje("proveedor eliminado"), HttpStatus.OK);
    }

    @ApiOperation("Lista los proveedores con estado 1")
    @CrossOrigin({"*"})
    @GetMapping("/proveedoresActivos")
    public ResponseEntity<List<Proveedor>> search() {
        List<Proveedor> list = servicio.search();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @ApiOperation("Actualiza los proveedores")
    @CrossOrigin({"*"})
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Proveedor proveedor) {

        Proveedor provee = servicio.getOne(id).get();
        provee.setNombre_comercial_pro(proveedor.getNombre_comercial_pro());
        provee.setUsuario(proveedor.getUsuario());
        

        servicio.save(provee);

        return new ResponseEntity(new Mensaje("proveedor actualizado"), HttpStatus.OK);
    }
    
    @ApiOperation("Detalle los proveedores")
    @CrossOrigin({"*"})
    @GetMapping("/detail/{id}")
    public ResponseEntity<Producto> getById(@PathVariable("id") int id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Proveedor proveedor = servicio.getOne(id).get();
        return new ResponseEntity(proveedor, HttpStatus.OK);
    }
}
