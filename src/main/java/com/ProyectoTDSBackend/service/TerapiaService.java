/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Terapia;
import com.ProyectoTDSBackend.repository.TerapiaRepository;
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
public class TerapiaService {
 
    private static final Logger log = LoggerFactory.getLogger(Terapia.class);

    @Autowired
    private TerapiaRepository repositorio;

    @Transactional
    public GenericResponse<String> saveTerapia(Terapia ter) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (ter != null) {
                repositorio.save(ter);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(ter.getIdTera().toString());
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

    public Optional<Terapia> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Terapia> list() {
        return repositorio.findAll();
    }
}
