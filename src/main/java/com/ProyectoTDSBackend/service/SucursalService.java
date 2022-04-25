package com.ProyectoTDSBackend.service;

import java.util.List;

import com.ProyectoTDSBackend.models.Sucursal;
import com.ProyectoTDSBackend.repository.sucursalRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SucursalService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FarmaciaService.class);
    
    @Autowired
    private sucursalRepository sucursalRepository;

    public GenericResponse<String> saveSucursal(Sucursal sucursal) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (sucursal != null) {
                sucursalRepository.save(sucursal);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Guardado exitoso");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("No se pudo guardar");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar farmacia: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //obtener todas las sucursales
    public GenericResponse<List<Sucursal>> getAllSucursales() {
        GenericResponse<List<Sucursal>> response = new GenericResponse<>();
        try {
            List<Sucursal> sucursales = sucursalRepository.findAll();
            response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
            response.setObject(sucursales);
            response.setStatus(ParametersApp.SUCCESSFUL.value());
        } catch (Exception e) {
            log.error("Error al obtener farmacias: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }  
    
    //Actualizar una sucursal
    public GenericResponse<String> updateSucursal(Sucursal sucursal) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if(sucursalRepository.findByIdSucursal(sucursal.getIdSucursal()) != null){
                sucursalRepository.save(sucursal);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Actualizado exitoso");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("No se pudo actualizar");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al actualizar farmacia: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }


    //eliminar una sucursal
    public GenericResponse<String> deleteSucursal(Long idSucursal) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if(sucursalRepository.findByIdSucursal(idSucursal) != null){
                sucursalRepository.deleteById(idSucursal);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Eliminado exitoso");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("No se pudo eliminar");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al eliminar farmacia: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
}
