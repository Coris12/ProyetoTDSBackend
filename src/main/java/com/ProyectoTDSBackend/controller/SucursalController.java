package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@Tag(name = "FacturaWS", description = "Control y mantenimiento de Sucursal")
@RequestMapping("/sucursal")
@CrossOrigin({"*"})
public class SucursalController {

    @Autowired
    private SucursalService sucursalService;

    //listar todas las sucursales
    @ApiOperation("Muestra la lista de usuarios en el sistema")
    @CrossOrigin({"*"})
    @GetMapping("/listaSucursal")
    public ResponseEntity<List<Sucursal>> lista() {
        List<Sucursal> list = sucursalService.listaUsuarios();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    //Guardar sucursal
    @ApiOperation("Crear sucursal")
    @CrossOrigin
    @PostMapping(path = "crearSucursal")
    public ResponseEntity<GenericResponse<String>> guardarFactura(@RequestBody Sucursal sucursal) {
        sucursal.setEstado(1);
        return new ResponseEntity<GenericResponse<String>>(sucursalService.saveSucursal(sucursal), HttpStatus.OK);
    }

    //Obtener sucursal por id
    @ApiOperation("Obtener sucursal por id")
    @GetMapping(path = "getSucursalById")
    public ResponseEntity<GenericResponse<Sucursal>> getSucursalById(@RequestParam("id") Long id) {
        return new ResponseEntity<GenericResponse<Sucursal>>(sucursalService.getSucursalById(id), HttpStatus.OK);
    }

    @ApiOperation("Lista los sucursal con estado 1")
    @GetMapping("/sucursalActivos")
    public ResponseEntity<List<Sucursal>> search() {
        List<Sucursal> list = sucursalService.search();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @ApiOperation("Eliminado logico de Sucursal")
    @CrossOrigin({"*"})
    @PatchMapping("/deleteSucursal/{id_sucursal}")
    public ResponseEntity<?> deleletSucursal(@RequestParam(value = "id_sucursal") Long idSucursal) {
        Sucursal sucursal = sucursalService.getOne(idSucursal).get();
        sucursal.setEstado(0);
        sucursalService.saveSucursal(sucursal);
        return new ResponseEntity(new Mensaje("sucursal eliminado"), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Sucursal> getById(@PathVariable("id") Long id) {
        if (!sucursalService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Sucursal sucu = sucursalService.getOne(id).get();
        return new ResponseEntity(sucu, HttpStatus.OK);
    }

    @ApiOperation("Actualiza las sucursales")
    @CrossOrigin({"*"})
    @PutMapping("/updateSucursal/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Sucursal sucursal) {

        Sucursal su = sucursalService.getOne(id).get();
        su.setNombreSuc(sucursal.getNombreSuc());
        su.setDireccionSuc(sucursal.getDireccionSuc());
        su.setTelefonoSuc(sucursal.getTelefonoSuc());
        su.setCorreoSuc(sucursal.getCorreoSuc());

        sucursalService.saveSucursal(su);

        return new ResponseEntity(new Mensaje("proveedor actualizado"), HttpStatus.OK);
    }

   
}
