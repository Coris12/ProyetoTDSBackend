/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Evolucion;
import com.ProyectoTDSBackend.repository.EvolucionRepository;
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
 * @author corin
 */
@Service
public class EvolucionService {
    
     private static final Logger log = LoggerFactory.getLogger(Evolucion.class);

    @Autowired
    private EvolucionRepository repositorio;

    @Transactional
    public GenericResponse<String> saveMedicamento(Evolucion evolucion) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (evolucion != null) {
                repositorio.save(evolucion);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(evolucion.getIdEvolucion().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Evolucion no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar la evolucion: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<Evolucion> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Evolucion> list() {
        return repositorio.findAll();
    }
}
