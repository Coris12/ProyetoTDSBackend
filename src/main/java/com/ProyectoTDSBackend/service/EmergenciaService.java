/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Emergencia;
import com.ProyectoTDSBackend.repository.EmergenciaRepository;
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
public class EmergenciaService {
    private static final Logger log = LoggerFactory.getLogger(Emergencia.class);

    @Autowired
    private EmergenciaRepository repositorio;

    @Transactional
    public GenericResponse<String> saveEmergencia(Emergencia enfe) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (enfe != null) {
                repositorio.save(enfe);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(enfe.getIdEmergencia().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("enfermedad no guardado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar el enfermeda : " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<Emergencia> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Emergencia> list() {
        return repositorio.findAll();
    }
}
