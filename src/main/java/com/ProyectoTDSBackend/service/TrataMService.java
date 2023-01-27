/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.TrataM;
import com.ProyectoTDSBackend.repository.TrataMRepository;
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
public class TrataMService {
    private static final Logger log = LoggerFactory.getLogger(TrataM.class);

    @Autowired
    private TrataMRepository repositorio;

    @Transactional
    public GenericResponse<String> saveTrata(TrataM trata) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (trata != null) {
                repositorio.save(trata);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(trata.getIdTrat().toString());
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
