/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.dto.ProveedorDto;
import com.ProyectoTDSBackend.models.Producto;
import com.ProyectoTDSBackend.models.Proveedor;
import com.ProyectoTDSBackend.service.ProveedorService;
import java.util.List;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 *
 * @author corin
 */
@RestController
@RequestMapping("/proveedor")
@CrossOrigin({"*"})
public class ProveedorController {

    @Autowired
    private ProveedorService servicioProve;

    /* public String registrarProveedor(Proveedor obj, HttpSession session) {
        try {
            Proveedor objSalida = servicioProve.insertarProveedor(obj);
            if (objSalida == null) {
                session.setAttribute("Mensaje", "registro correcto");
            } else {
                session.setAttribute("Mensaje", "error registro");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "registrarProveedor";
    }*/
    @CrossOrigin({"*"})
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/insertar")
    public ResponseEntity<?> create(@Valid @RequestBody ProveedorDto proveedorDto) {
        if (StringUtils.isBlank(proveedorDto.getNombreProveedor())) {
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Proveedor proveedor = new Proveedor(proveedorDto.getNombreProveedor());
        proveedor.setEstado(1);
        servicioProve.save(proveedor);

        return new ResponseEntity(new Mensaje(" creado"), HttpStatus.OK);

    }

    @ApiIgnore
    @GetMapping("/detail/{id}")
    public ResponseEntity<Proveedor> getById(@PathVariable("id") int id) {
        if (!servicioProve.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Proveedor proveedor = servicioProve.getOne(id).get();
        return new ResponseEntity(proveedor, HttpStatus.OK);
    }

    @CrossOrigin({"*"})
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/updateProveedor/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody ProveedorDto proveedorDto) {
        if (!servicioProve.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        if (servicioProve.existsByNombre(proveedorDto.getNombreProveedor()) && servicioProve.getByNombre(proveedorDto.getNombreProveedor()).get().getIdProveedor()!= id) {
            return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(proveedorDto.getNombreProveedor())) {
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }

        Proveedor proveedor = servicioProve.getOne(id).get();
        proveedor.setNombreProveedor(proveedorDto.getNombreProveedor());
        servicioProve.save(proveedor);
        return new ResponseEntity(new Mensaje("producto actualizado"), HttpStatus.OK);
    }
    @PutMapping("/deleteLogicProveedor/{id}")
    public ResponseEntity<?> deleteLogicProveedor(@PathVariable("id") int id, @RequestBody ProveedorDto proveedorDto) {
        Proveedor proveedor = servicioProve.getOne(id).get();
        proveedor.setEstado(0);
        servicioProve.save(proveedor);
        return new ResponseEntity(new Mensaje("producto actualizado"), HttpStatus.OK);
    }

   

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!servicioProve.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        servicioProve.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @CrossOrigin({"*"})
    @GetMapping("/list")
    public ResponseEntity<List<Proveedor>> list() {
        List<Proveedor> list = servicioProve.list();
        return new ResponseEntity(list, HttpStatus.OK);

    }
}
