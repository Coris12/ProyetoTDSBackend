/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Autorizacion;
import com.ProyectoTDSBackend.repository.AutorizacionRepository;
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
@Transactional
public class AutorizacionService {
        private static final Logger log = LoggerFactory.getLogger(Autorizacion.class);

     @Autowired
    private AutorizacionRepository repositorio; 
    
    @Transactional
    public GenericResponse<String> saveHistoria(Autorizacion autorizacion) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (autorizacion != null) {
                repositorio.save(autorizacion);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(autorizacion.getIdAutorizacion().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("autorizacion no guardado  no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar autorizacion: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<Autorizacion> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Autorizacion> list() {
        return repositorio.findAll();
    }
    
    
}
