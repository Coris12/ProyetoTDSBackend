package com.ProyectoTDSBackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoTDSBackend.models.SigVitAntropometria;
import com.ProyectoTDSBackend.repository.SigVitAntropometriaRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class SigVitAntropometriaService {

    private static final Logger log = LoggerFactory.getLogger(SigVitAntropometriaService.class);
    
    @Autowired
    private SigVitAntropometriaRepository sigVitAntropometriaRepository;

    public GenericResponse<String> saveSigVitAntropometria(SigVitAntropometria sigVitAntropometria){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (sigVitAntropometria != null) {
                sigVitAntropometriaRepository.save(sigVitAntropometria);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("SIGNOS VITALES ANTROPOMETRIA GUARDADOS CORRECTAMENTE: "+sigVitAntropometria.getIdSigVitAnt().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("SIGNOS VITALES ANTROPOMETRIA NO GUARDADOS");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar los SIGNOS VITALES ANTROPOMETRIA: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;    
    }
}
