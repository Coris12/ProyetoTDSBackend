/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.EquipoOperatorio;
import com.ProyectoTDSBackend.repository.EquipoQuiRepository;
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
public class EquipoQuirurService {
 
    private static final Logger log = LoggerFactory.getLogger(EquipoOperatorio.class);

    @Autowired
    private EquipoQuiRepository repositorio; 
    
    @Transactional
    public GenericResponse<String> saveEquipo(EquipoOperatorio equipo) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (equipo != null) {
                repositorio.save(equipo);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(equipo.getIdEquipo().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("equipo no guardado  no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar equipo: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<EquipoOperatorio> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<EquipoOperatorio> list() {
        return repositorio.findAll();
    }
    
    
    
}