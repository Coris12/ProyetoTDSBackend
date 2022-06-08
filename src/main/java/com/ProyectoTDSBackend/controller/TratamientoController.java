/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Tratamiento;
import com.ProyectoTDSBackend.service.TratamientoService;
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
@RequestMapping("/tratamiento")
@CrossOrigin({"*"})
public class TratamientoController {

    @Autowired
    private TratamientoService servicio;

    @ApiOperation("Crea el tratamiento")
    @PostMapping("/creaTratamiento")
    public ResponseEntity<?> create(@RequestBody Tratamiento tratamiento) {

        try {
            Tratamiento trata = new Tratamiento(
                    tratamiento.getIdTratamiento(),
                    tratamiento.getNombre(),
                    tratamiento.getCodigo(),
                    tratamiento.getCategoria(),
                    tratamiento.getDescripcion(),
                    tratamiento.getCantidad(),
                    tratamiento.getEstado(),
                    tratamiento.getValorUnitario(),
                    tratamiento.getSubtotal(),
                    tratamiento.getTotal()
                   
            );
            trata.setEstado(1);
            servicio.save(trata);

            return new ResponseEntity(new Mensaje("Tratamiento creado exitosamente"), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("Tratamiento no creado; " + e.getMessage());
            return new ResponseEntity(new Mensaje("Tratamiento no creado"), HttpStatus.BAD_REQUEST);
        }
    }

    @ApiOperation("Muestra una lista de tratamientos")
    @CrossOrigin({"*"})
    @GetMapping("/listaTratamientos")
    public ResponseEntity<List<Tratamiento>> list() {
        List<Tratamiento> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @ApiOperation("Eliminado logico del tratamiento")
    @CrossOrigin({"*"})
    @PatchMapping("/deleteTratamiento/{id_tratamiento}")
    public ResponseEntity<?> deleteTratamiento(@RequestParam(value = "id_tratamiento") int idTratamiento) {
        Tratamiento tratamiento = servicio.getOne(idTratamiento).get();
        tratamiento.setEstado(0);
        servicio.save(tratamiento);
        return new ResponseEntity(new Mensaje("empleado eliminado"), HttpStatus.OK);
    }

    @ApiOperation("Lista los tratamientos con estado 1")
    @GetMapping("/tratamientosActivos")
    public ResponseEntity<List<Tratamiento>> search() {
        List<Tratamiento> list = servicio.search();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @ApiOperation("Detalles de los tratamientos")
    @GetMapping("/detallesTratamientos/{id}")
    public ResponseEntity<Tratamiento> getById(@PathVariable("id") int id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Tratamiento tratamiento = servicio.getOne(id).get();
        return new ResponseEntity(tratamiento, HttpStatus.OK);
    }

    @ApiOperation("Actualizacion de los tratamientos")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Tratamiento tratamiento) {

        Tratamiento tratamientos = servicio.getOne(id).get();
        tratamientos.setNombre(tratamiento.getNombre());
        tratamientos.setCodigo(tratamiento.getCodigo());
        tratamientos.setCategoria(tratamiento.getCategoria());
        tratamientos.setDescripcion(tratamiento.getDescripcion());
        tratamientos.setCantidad(tratamiento.getCantidad());
        tratamientos.setValorUnitario(tratamiento.getValorUnitario());
        tratamientos.setSubtotal(tratamiento.getSubtotal());
        tratamientos.setTotal(tratamiento.getTotal());
 
        servicio.save(tratamientos);

        return new ResponseEntity(new Mensaje("Tratamiento actualizado"), HttpStatus.OK);
    }

}
