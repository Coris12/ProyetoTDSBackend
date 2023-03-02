/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Infusion;
import com.ProyectoTDSBackend.repository.InfunsionRepository;
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
public class InfunsionService {
    private static final Logger log = LoggerFactory.getLogger(Infusion.class);

    @Autowired
    private InfunsionRepository repositorio; 
    
    @Transactional
    public GenericResponse<String> saveInfunsion(Infusion in) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (in != null) {
                repositorio.save(in);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(in.getIdInfu().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("historia clinica no guardado  no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar diagnostico: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<Infusion> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Infusion> list() {
        return repositorio.findAll();
    }
}
