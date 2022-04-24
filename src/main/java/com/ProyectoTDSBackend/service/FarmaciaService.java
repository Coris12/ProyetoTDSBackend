package com.ProyectoTDSBackend.service;

import java.util.List;

import com.ProyectoTDSBackend.models.Farmacia;
import com.ProyectoTDSBackend.models.Sucursal;
import com.ProyectoTDSBackend.repository.FarmaciaRepository;
import com.ProyectoTDSBackend.repository.sucursalRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmaciaService {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FarmaciaService.class);

    @Autowired
    private FarmaciaRepository farmaciaRepository;

    @Autowired
    private sucursalRepository sucursalRepository;

    public GenericResponse<String> saveFarmacia(Farmacia farmacia) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (farmacia != null) {
                farmaciaRepository.save(farmacia);
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

    //METODO PARA OBTENER TODAS LAS FARMACIAS
    public GenericResponse<List<Farmacia>> getAllFarmacias() {
        GenericResponse<List<Farmacia>> response = new GenericResponse<>();
        try {
            List<Farmacia> farmacias = farmaciaRepository.listarFarmacias();
            response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
            response.setObject(farmacias);
            response.setStatus(ParametersApp.SUCCESSFUL.value());
        } catch (Exception e) {
            log.error("Error al obtener farmacias: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //METODO PARA OBTENER UNA FARMACIA POR NOMBRE
    public GenericResponse<Farmacia> getFarmaciaByName(String nombreFarmacia) {
        GenericResponse<Farmacia> response = new GenericResponse<>();
        try {
            Farmacia farmacia = farmaciaRepository.findByNombreFarmacia(nombreFarmacia);
            response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
            response.setObject(farmacia);
            response.setStatus(ParametersApp.SUCCESSFUL.value());
        } catch (Exception e) {
            log.error("Error al obtener farmacia: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //METODO PARA ACTUALIZAR UNA FARMACIA
    public GenericResponse<String> updateFarmacia(Sucursal sucursal) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (sucursalRepository.findByIdSucursal(sucursal.getIdSucursal())!=null) {
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
}
