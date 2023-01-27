/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.IngresoDia;
import com.ProyectoTDSBackend.repository.IngresoDiaRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;
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
public class IngresoDiaService {
    private static final Logger log = LoggerFactory.getLogger(IngresoDia.class);

    @Autowired
    private IngresoDiaRepository repositorio;

    @Transactional
    public GenericResponse<String> saveDiagnosticoIngreso(IngresoDia dia) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (dia != null) {
                repositorio.save(dia);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(dia.getIdDiagI().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("diagnostico ingreso no guardado");
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
}
