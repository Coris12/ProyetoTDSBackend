package com.ProyectoTDSBackend.controller;

import java.util.List;

import com.ProyectoTDSBackend.dto.Mensaje;
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
@Tag(name = "Sucursal", description = "Control y Operaciones sobre las sucursales")
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


    @PostMapping(path = "saveSucursal")
    public ResponseEntity<GenericResponse<String>> saveSucursal(@RequestBody Sucursal sucursal) {
        return new ResponseEntity<GenericResponse<String>>(sucursalService.saveSucursal(sucursal), HttpStatus.OK);
    }

    //Guardar sucursal
    @ApiOperation(value = "Guardar Sucursal", notes = "Guarda una sucursal")
    @PostMapping(path = "save")
    public Sucursal saveSucursal2(@RequestBody Sucursal sucursal) {
        return sucursalService.save(sucursal);
    }


     @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Sucursal sucursal) {
            //return new ResponseEntity(new Mensaje(), HttpStatus.BAD_REQUEST);

        // if (sucursal.getTelefonoSuc() < 0) {
        //     return new ResponseEntity(new Mensaje("el precio debe ser mayor que 0"), HttpStatus.BAD_REQUEST);
        // }
        // if (sucursalService.existsByNombre(sucursal.getNombreSuc())) {
        //     return new ResponseEntity(new Mensaje("ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        // }
        Sucursal suc = new Sucursal(
                sucursal.getIdSucursal(),
                sucursal.getNombreSuc(),
                sucursal.getCorreoSuc(),
                sucursal.getTelefonoSuc(),
                sucursal.getDireccionSuc());

                sucursalService.save2(sucursal);

        return new ResponseEntity(new Mensaje("producto creado"), HttpStatus.OK);
    }
    
}
