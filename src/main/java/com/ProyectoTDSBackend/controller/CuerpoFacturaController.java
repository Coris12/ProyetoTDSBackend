/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.CuerpoFactura;
import com.ProyectoTDSBackend.service.CuerpoFacturaService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author corin
 */
@RestController
@RequestMapping("/CuerpoFactura")
@CrossOrigin({"*"})
public class CuerpoFacturaController {

    @Autowired
    CuerpoFacturaService cuerpoService;

    @ApiOperation("lista del cuerpo Factura")
    @CrossOrigin({"*"})
    @GetMapping("/lista")
    public ResponseEntity<List<CuerpoFactura>> list() {
        List<CuerpoFactura> list = cuerpoService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @ApiOperation("Detalle del cuerpo de la Factura")
    @GetMapping("/detail/{id}")
    public ResponseEntity<CuerpoFactura> getById(@PathVariable("id") Long id) {
        if (!cuerpoService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        CuerpoFactura cuerpo = cuerpoService.getOne(id).get();
        return new ResponseEntity(cuerpo, HttpStatus.OK);
    }

    @ApiOperation("Crear el cuerpo de la factura")
    @PostMapping("/crear")
    public ResponseEntity<?> create(@RequestBody CuerpoFactura cuerpos) {

        if (cuerpos.getCantidad() < 0) {
            return new ResponseEntity(new Mensaje("la cantidad debe ser mayor que 0"), HttpStatus.BAD_REQUEST);
        }
        if (cuerpos.getDescuento() < 0) {
            return new ResponseEntity(new Mensaje("el descuento debe ser mayor que 0"), HttpStatus.BAD_REQUEST);
        }

        CuerpoFactura cuerpo = new CuerpoFactura(
            cuerpos.getIdCuerpo(),
            cuerpos.getCantidad(),
            cuerpos.getTotal(),
            cuerpos.getSubtotal(),
            cuerpos.getDescuento(),
            cuerpos.getIva(),
            cuerpos.getId_producto(),
            cuerpos.getProducto()
                );
                

        cuerpoService.save(cuerpo);

        return new ResponseEntity(new Mensaje("cuerpo de la factura creado"), HttpStatus.OK);
    }

    @ApiOperation("Actualizar el cuerpo de la factura")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody CuerpoFactura cuerpo) {
        if (!cuerpoService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }

        if (cuerpo.getCantidad() < 0) {
            return new ResponseEntity(new Mensaje("la cantidad debe ser mayor que 0"), HttpStatus.BAD_REQUEST);
        }

        CuerpoFactura cuerpos = cuerpoService.getOne(id).get();
        cuerpos.setCantidad(cuerpo.getCantidad());
        cuerpos.setDescuento(cuerpo.getDescuento());
        cuerpos.setIva(cuerpo.getIva());
        cuerpos.setSubtotal(cuerpo.getSubtotal());
        cuerpos.setTotal(cuerpo.getTotal());
        cuerpoService.save(cuerpos);

        return new ResponseEntity(new Mensaje("cuerpo de la factura actualizado"), HttpStatus.OK);
    }

    @ApiOperation("Eliminar el cuerpo de la factura")
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        if (!cuerpoService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        cuerpoService.delete(id);
        return new ResponseEntity(new Mensaje("cuerpo de la factura eliminado eliminado"), HttpStatus.OK);
    }


    //Guardar producto en cuerpo de factura
    @ApiOperation("Guardar producto en cuerpo de factura")
    @PostMapping(path = "/GuardarCuerpoFactura")
	public ResponseEntity<GenericResponse<String>> GuardarCuerpoFactura(@RequestBody CuerpoFactura cuerpoFactura) {
		return new ResponseEntity<GenericResponse<String>>(cuerpoService.saveCuerpoFactura(cuerpoFactura), HttpStatus.OK);
	}

}
