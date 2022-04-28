/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.dto.ProductoDto;
import com.ProyectoTDSBackend.models.Producto;
import com.ProyectoTDSBackend.service.ProductoService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/producto")
@CrossOrigin({"*"})
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @ApiOperation("Muestra una lista de productos")
    @CrossOrigin({"*"})
    @GetMapping("/lista")
    public ResponseEntity<List<Producto>> list() {
        List<Producto> list = productoService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @ApiIgnore
    @GetMapping("/detail/{id}")
    public ResponseEntity<Producto> getById(@PathVariable("id") int id) {
        if (!productoService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Producto producto = productoService.getOne(id).get();
        return new ResponseEntity(producto, HttpStatus.OK);
    }

    @ApiIgnore
    @GetMapping("/detailname/{nombre}")
    public ResponseEntity<Producto> getByNombre(@PathVariable("nombre") String nombre) {
        if (!productoService.existsByNombre(nombre)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Producto producto = productoService.getByNombre(nombre).get();
        return new ResponseEntity(producto, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Producto productos) {
       
        Producto producto = new Producto(
                productos.getIdProducto(),
                productos.getCategoriaProducto(),
                productos.getCodigoRef(),
                productos.getNombreProducto(),
                productos.getInventarioProducto(),
                productos.getFechaExp(),
                productos.getRegSanitario(),
                productos.getCodBarra(),
                productos.getDescripcionProducto(),
                productos.getPrecioProducto(),
                productos.getEstadoProducto(),
                productos.getStockProducto(),
                productos.getProveedor());

        producto.setEstadoProducto(1);
        productoService.save(producto);

        return new ResponseEntity(new Mensaje("producto creado"), HttpStatus.OK);
    }

 
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Producto productoDto) {

        Producto producto = productoService.getOne(id).get();
        producto.setNombreProducto(productoDto.getNombreProducto());
        producto.setPrecioProducto(productoDto.getPrecioProducto());
        producto.setCategoriaProducto(productoDto.getCategoriaProducto());
        producto.setCodBarra(productoDto.getCodBarra());
        producto.setCodigoRef(productoDto.getCodigoRef());
        producto.setDescripcionProducto(productoDto.getDescripcionProducto());
        producto.setFechaExp(productoDto.getFechaExp());
        producto.setInventarioProducto(productoDto.getInventarioProducto());
        producto.setRegSanitario(productoDto.getRegSanitario());
        producto.setStockProducto(productoDto.getStockProducto());

        productoService.save(producto);

        return new ResponseEntity(new Mensaje("producto actualizado"), HttpStatus.OK);
    }

    @CrossOrigin({"*"})
    @PatchMapping("/deleteLogic/{id}")
    public ResponseEntity<?> deleteLogic(@PathVariable("id") int id, @RequestBody ProductoDto productoDto) {
        Producto producto = productoService.getOne(id).get();
        producto.setEstadoProducto(0);
        productoService.save(producto);
        return new ResponseEntity(new Mensaje("producto actualizado"), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Producto>> search() {
        List<Producto> list = productoService.search();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!productoService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        productoService.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

}
