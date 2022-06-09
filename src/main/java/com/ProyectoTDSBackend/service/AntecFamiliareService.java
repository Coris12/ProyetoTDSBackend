package com.ProyectoTDSBackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoTDSBackend.models.AntecFamiliares;
import com.ProyectoTDSBackend.repository.AntecFamiliaresRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class AntecFamiliareService {
    private static final Logger log = LoggerFactory.getLogger(AntecFamiliareService.class);
    
    @Autowired
    private AntecFamiliaresRepository antecFamiliareRepository;

    public GenericResponse<String> saveAntecFamiliare(AntecFamiliares antecFamiliare) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (antecFamiliare != null) {
                antecFamiliareRepository.save(antecFamiliare);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Antecedentes familiares guardados correctamente: " + antecFamiliare.getIdAntecFamiliares().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Antecedentes familiares no guardados");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar los antecedentes familiares: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;    
    }
}
