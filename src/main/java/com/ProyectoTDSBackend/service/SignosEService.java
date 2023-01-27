/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.SignosE;
import com.ProyectoTDSBackend.repository.SignosERepository;
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
public class SignosEService {
   private static final Logger log = LoggerFactory.getLogger(SignosE.class);

    @Autowired
    private SignosERepository repositorio;

    @Transactional
    public GenericResponse<String> saveSignos(SignosE signos) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (signos != null) {
                repositorio.save(signos);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(signos.getIdSgnos().toString());
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

    public Optional<SignosE> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<SignosE> list() {
        return repositorio.findAll();
    }  
}
