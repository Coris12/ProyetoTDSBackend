package com.ProyectoTDSBackend.service;

import java.util.List;

import com.ProyectoTDSBackend.models.Farmacia;
import com.ProyectoTDSBackend.repository.FarmaciaRepository;
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
}
