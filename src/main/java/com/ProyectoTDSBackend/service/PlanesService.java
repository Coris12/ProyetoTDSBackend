/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.PlanesDiagnostico;
import com.ProyectoTDSBackend.repository.PlanesRepository;
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
public class PlanesService {
     private static final Logger log = LoggerFactory.getLogger(PlanesDiagnostico.class);
    
    @Autowired
    private PlanesRepository repository;

    public GenericResponse<String> savePlanesD(PlanesDiagnostico planes){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (planes != null) {
                repository.save(planes);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("PLANES GUARDADOS CORRECTAMENTE: "+planes.getIdPlanes().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Planes no guardados");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar los planes: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;    
    }
    
}
