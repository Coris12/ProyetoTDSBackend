/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Accidente;
import com.ProyectoTDSBackend.repository.AccidenteRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author corin
 */
@Service
public class AccidenteService {

    private static final Logger log = LoggerFactory.getLogger(Accidente.class);

    @Autowired
    private AccidenteRepository repository;

    public GenericResponse<String> saveLlegada(Accidente acc) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (acc != null) {
                repository.save(acc);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("ADMISION LLEGADA AMBULACIA GUARDADOS CORRECTAMENTE: " + acc.getIdAccidente().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Antecedentes personales no guardados");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar los antecedentes personales: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    public Optional<Accidente> getOne(Long id) {
        return repository.findById(id);
    }
    
    public List<Accidente> list() {
        return repository.findAll();
    }
}
