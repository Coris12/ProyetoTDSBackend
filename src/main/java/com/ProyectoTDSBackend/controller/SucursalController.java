package com.ProyectoTDSBackend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Cliente;
import com.ProyectoTDSBackend.models.Sucursal;
import com.ProyectoTDSBackend.service.SucursalService;
import com.ProyectoTDSBackend.util.GenericResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@Tag(name = "FacturaWS", description = "Control y mantenimiento de Sucursal" )
@RequestMapping("/sucursal")
@CrossOrigin({"*"})
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    //listar todas las sucursales
    @ApiOperation("Listar todas las sucursales")
    @GetMapping(path = "getAllSucursales")
    public ResponseEntity<GenericResponse<List<Sucursal>>> ListAllSucursales() {
        return new ResponseEntity<GenericResponse<List<Sucursal>>>(sucursalService.getAllSucursales(), HttpStatus.OK);
    }

    //Guardar sucursal
    @ApiOperation("Crear sucursal")
    @CrossOrigin
	@PostMapping(path = "crearSucursal")
	public  ResponseEntity<GenericResponse<String>> guardarFactura(@RequestBody Sucursal sucursal){
		return new ResponseEntity<GenericResponse<String>> (sucursalService.saveSucursal(sucursal), HttpStatus.OK);
	}


    //Obtener sucursal por id
    @ApiOperation("Obtener sucursal por id")
    @GetMapping(path = "getSucursalById")
    public ResponseEntity<GenericResponse<Sucursal>> getSucursalById(@RequestParam("id") Long id) {
        return new ResponseEntity<GenericResponse<Sucursal>>(sucursalService.getSucursalById(id), HttpStatus.OK);
    }
}
