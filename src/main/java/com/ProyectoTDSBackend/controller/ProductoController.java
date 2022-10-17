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
import com.ProyectoTDSBackend.util.GenericResponse;
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
import org.springframework.web.bind.annotation.RequestParam;
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

    @PutMapping(path = "update-producto2")
    public ResponseEntity<GenericResponse<String>> actualizarFarmacia(@RequestBody Producto producto) {
        return new ResponseEntity<GenericResponse<String>>(productoService.updateSucursal(producto), HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Producto> getById(@PathVariable("id") Long id) {
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

    @PostMapping(path = "saveMedicamentos")
    public ResponseEntity<GenericResponse<String>> saveProducto(@RequestBody Producto producto) {
        return new ResponseEntity<GenericResponse<String>>(productoService.saveProducto(producto), HttpStatus.OK);
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
                productos.getStock(),
                productos.getEstadoProducto(),
                productos.getCostoPromedio(),
                productos.getUltimoCosto(),
                productos.getProveedor(),
                productos.getSucursal());

        productos.setEstadoProducto(1);
        productoService.save(productos);

        return new ResponseEntity(new Mensaje("producto creado"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Producto producto) {

        Producto productos = productoService.getOne(id).get();
        productos.setNombreProducto(producto.getNombreProducto());
        productos.setPrecioProducto(producto.getPrecioProducto());
        productos.setCategoriaProducto(producto.getCategoriaProducto());
        productos.setCodBarra(producto.getCodBarra());
        productos.setCodigoRef(producto.getCodigoRef());
        productos.setDescripcionProducto(producto.getDescripcionProducto());
        productos.setFechaExp(producto.getFechaExp());
        productos.setInventarioProducto(producto.getInventarioProducto());
        productos.setRegSanitario(producto.getRegSanitario());
        productos.setStock(producto.getStock());
        productos.setCostoPromedio(producto.getCostoPromedio());
        productos.setUltimoCosto(producto.getUltimoCosto());
        productos.setProveedor(producto.getProveedor());

        productoService.save(productos);

        return new ResponseEntity(new Mensaje("producto actualizado"), HttpStatus.OK);
    }

    @ApiOperation("Eliminado logico del producto")
    @CrossOrigin({"*"})
    @PatchMapping("/deleteProducto/{id_producto}")
    public ResponseEntity<?> deleteProducto(@RequestParam(value = "id_producto") Long idProducto) {
        Producto producto = productoService.getOne(idProducto).get();
        producto.setEstadoProducto(0);
        productoService.save(producto);
        return new ResponseEntity(new Mensaje("proveedor eliminado"), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<List<Producto>> search() {
        List<Producto> list = productoService.search();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        if (!productoService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        productoService.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping(path = "update-productoStock")
    public ResponseEntity<GenericResponse<String>> actualizarStock(@RequestBody Producto producto, @RequestParam Long idProd) {
        return new ResponseEntity<GenericResponse<String>>(productoService.updateProductoStock(producto, idProd), HttpStatus.OK);
    }

    @ApiOperation("Recibe la id de convocatoria para mostrar estudiantes asignados")
    @CrossOrigin({"*"})
    @GetMapping("/getProductoByIdSucursal")
    public List<Producto> getProductoByIdSucursal(@RequestParam(value = "id") Long id) {
        return productoService.getbyidsucursal(id);
    }

}
