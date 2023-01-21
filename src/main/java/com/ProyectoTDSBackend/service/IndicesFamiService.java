/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.IndicesF;
import com.ProyectoTDSBackend.repository.IndicesAnteFRepository;
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
public class IndicesFamiService {
     private static final Logger log = LoggerFactory.getLogger(IndicesF.class);
    
    @Autowired
    private IndicesAnteFRepository repository;

    public GenericResponse<String> saveIndiceAntecPersonal(IndicesF antecPersonales){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (antecPersonales != null) {
                repository.save(antecPersonales);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("ANTECEDENTES PERSONALES GUARDADOS CORRECTAMENTE: "+antecPersonales.getIdIndiceF().toString());
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
