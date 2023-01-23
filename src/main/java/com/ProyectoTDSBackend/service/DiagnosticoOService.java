/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.DiagnosticoO;
import com.ProyectoTDSBackend.repository.DiagnosticoORepository;
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
public class DiagnosticoOService {
     private static final Logger log = LoggerFactory.getLogger(DiagnosticoO.class);

    @Autowired
    private DiagnosticoORepository repositorio; 
    
    @Transactional
    public GenericResponse<String> saveDiagnosticoO(DiagnosticoO diagnostico) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (diagnostico != null) {
                repositorio.save(diagnostico);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(diagnostico.getIdDiagnostico().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("equipo no guardado  no guardada");
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

    public Optional<DiagnosticoO> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<DiagnosticoO> list() {
        return repositorio.findAll();
    }
}
