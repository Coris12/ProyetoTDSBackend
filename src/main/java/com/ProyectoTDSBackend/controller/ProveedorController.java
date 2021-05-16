/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.dto.ProductoDto;
import com.ProyectoTDSBackend.dto.ProveedorDto;
import com.ProyectoTDSBackend.models.Producto;
import com.ProyectoTDSBackend.models.Proveedor;
import com.ProyectoTDSBackend.service.ProductoService;
import com.ProyectoTDSBackend.service.ProveedorService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.apache.commons.lang3.StringUtils;
import static org.hibernate.criterion.Projections.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/proveedor")
@CrossOrigin({"*"})
public class ProveedorController {

    @Autowired
    private ProductoService servicioPro;

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
    public ResponseEntity<?> create(@Valid @RequestBody ProveedorDto proveedorDto){
        if(StringUtils.isBlank(proveedorDto.getNombreP()))
            return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
         
        Proveedor proveedor = new Proveedor(proveedorDto.getNombreP());
        servicioProve.save(proveedor);
        
        return new ResponseEntity(new Mensaje(" creado"), HttpStatus.OK);
        
        }
        
    
@CrossOrigin({"*"})
    @GetMapping("/list")
    public ResponseEntity<List<Proveedor>> list() {
        List<Proveedor> list = servicioProve.list();
        return new ResponseEntity(list, HttpStatus.OK);

    }
}
