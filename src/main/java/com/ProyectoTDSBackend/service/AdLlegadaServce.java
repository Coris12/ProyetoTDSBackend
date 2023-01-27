/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.LLegadaAd;
import com.ProyectoTDSBackend.repository.AdLlegadaRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author corin
 */
@Service
public class AdLlegadaServce {
    private static final Logger log = LoggerFactory.getLogger(LLegadaAd.class);
    
    @Autowired
    private AdLlegadaRepository repository;

    public GenericResponse<String> saveLlegada(LLegadaAd llegada){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (llegada != null) {
                repository.save(llegada);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("ADMISION LLEGADA AMBULACIA GUARDADOS CORRECTAMENTE: "+llegada.getIdLlegada().toString());
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
}
