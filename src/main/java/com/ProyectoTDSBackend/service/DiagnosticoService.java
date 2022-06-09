package com.ProyectoTDSBackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoTDSBackend.models.Diagnosticos;
import com.ProyectoTDSBackend.repository.DiagnosticosRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class DiagnosticoService {
    private static final Logger log = LoggerFactory.getLogger(AntecPersonaleService.class);
    
    @Autowired
    private DiagnosticosRepository diagnosticoRepository;

    public GenericResponse<String> saveDiagnostico(Diagnosticos diagnostico){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (diagnostico != null) {
                diagnosticoRepository.save(diagnostico);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("DIAGNOSTICO GUARDADO CORRECTAMENTE: "+diagnostico.getIdDiagnosticos());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Diagnostico no guardado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar el diagnostico: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;    
    }
}
