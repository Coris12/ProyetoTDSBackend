            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Producto;
import com.ProyectoTDSBackend.repository.ProductoRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LENOVO
 */
@Service
@Transactional
public class ProductoService {

    private static final Logger log = LoggerFactory.getLogger(ProductoService.class);

    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> list() {
        return productoRepository.findAll();
    }

    public Optional<Producto> getOne(Long id) {
        return productoRepository.findById(id);
    }

    public Optional<Producto> getByNombre(String nombre) {
        return productoRepository.findByNombreProducto(nombre);
    }

    public void save(Producto producto) {
        productoRepository.save(producto);
    }
     @Transactional
    public GenericResponse<String> saveProducto(Producto producto) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (producto != null) {
                producto.setEstadoProducto(1);
                productoRepository.save(producto);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(producto.getIdProducto().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("diagnostico no guardado  no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar diagnostico: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    
    public GenericResponse<String> updateSucursal(Producto producto) {
        GenericResponse<String> response = new GenericResponse<>();
        productoRepository.save(producto);
        return response;
    }

    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

     public List<Producto> getbyidsucursal(Long id_sucursal){
    	return productoRepository.findId(id_sucursal);
    }
    public boolean existsById(Long id) {
        return productoRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return productoRepository.existsByNombreProducto(nombre);
    }
    public List<Producto>search(){
     return productoRepository.findAllActiveUsersNative();
    }

    public GenericResponse<String> updateProductoStock(Producto producto, Long idProd){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if(productoRepository.findById(idProd) != null){
                if( Integer.parseInt(producto.getStock())>=0){
                    Long id = productoRepository.save(producto).getIdProducto();
                    response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
			        response.setObject("Stock "+id+" actualizada correctamente");
			        response.setStatus(ParametersApp.SUCCESSFUL.value());
                }else{
                    response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
			    response.setObject("Stock con "+producto.getIdProducto()+" no puede ser negativo");
			    response.setStatus(ParametersApp.SUCCESSFUL.value());
                }
            }else{
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("No existe el producto con id "+producto.getIdProducto());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            //TODO: handle exception
            log.error("ERROR",e);
			response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
    
}
