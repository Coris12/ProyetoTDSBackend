/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Lesiones;
import com.ProyectoTDSBackend.repository.LesionesRepository;
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
public class LesionesService {
    
    private static final Logger log = LoggerFactory.getLogger(Lesiones.class);

    @Autowired
    private LesionesRepository repositorio;

    @Transactional
    public GenericResponse<String> saveLesion(Lesiones le) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (le != null) {
                repositorio.save(le);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(le.getIdLesiones().toString());
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

    public Optional<Lesiones> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Lesiones> list() {
        return repositorio.findAll();
    }
}
