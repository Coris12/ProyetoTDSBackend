package com.ProyectoTDSBackend.controller;

import java.util.List;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Cliente;
import com.ProyectoTDSBackend.models.Sucursal;
import com.ProyectoTDSBackend.service.SucursalService;
import com.ProyectoTDSBackend.util.GenericResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/sucursal")
@CrossOrigin({"*"})
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    //si funciona
    //listar todas las sucursales
    @ApiOperation("Listar todas las sucursales")
    @GetMapping(path = "getAllSucursales")
    public ResponseEntity<GenericResponse<List<Sucursal>>> ListAllSucursales() {
        return new ResponseEntity<GenericResponse<List<Sucursal>>>(sucursalService.getAllSucursales(), HttpStatus.OK);
    }

    @ApiOperation("Crear sucursal")
    @PostMapping("/crearSucursal")
    public ResponseEntity<?> create(@org.springframework.web.bind.annotation.RequestBody Sucursal sucursal) {

        try {
            Sucursal suc = new Sucursal(
                    sucursal.getIdSucursal(),
                    sucursal.getCorreoSuc(),
                    sucursal.getDireccionSuc(),
                    sucursal.getTelefonoSuc(),
                    sucursal.getNombreSuc()
            );
            sucursalService.save(sucursal);

            return new ResponseEntity(new Mensaje("sucursal creada"), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("error crear sucursal: " + e.getMessage());
            return new ResponseEntity(new Mensaje("sucursal no fue creada"), HttpStatus.BAD_REQUEST);
        }

    }
   
}
