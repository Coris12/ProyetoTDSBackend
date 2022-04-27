package com.ProyectoTDSBackend.service;

import java.util.List;

import javax.transaction.Transactional;

import com.ProyectoTDSBackend.models.Sucursal;
import com.ProyectoTDSBackend.repository.sucursalRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SucursalService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FarmaciaService.class);
    
    @Autowired
    sucursalRepository sucursalRepository;

    //listar todas las sucursales
    public GenericResponse<List<Sucursal>> getAllSucursales() {
        GenericResponse<List<Sucursal>> response = new GenericResponse<>();
        try {
            List<Sucursal> sucursales = sucursalRepository.findAll();
            response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
            response.setObject(sucursales);
            response.setStatus(ParametersApp.SUCCESSFUL.value());
        } catch (Exception e) {
            log.error("Error al obtener sucursales: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //simple save
    public Sucursal save(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    public void save2(Sucursal sucursal){
        sucursalRepository.save(sucursal);
    }

    //Guardar sucursal
    public GenericResponse<String> saveSucursal(Sucursal sucursal) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (sucursal != null) {
                System.out.println("Sucursal: " + sucursal.toString());
                sucursalRepository.save(sucursal);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Guardado exitoso de: " + sucursal.getIdSucursal()+" :"+sucursal.getNombreSuc());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("No se pudo guardar");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar sucursal: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsByNombre(String nombre) {
        return sucursalRepository.existsByNombreSuc(nombre);
    }
    
}
