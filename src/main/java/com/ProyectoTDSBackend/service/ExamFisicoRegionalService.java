package com.ProyectoTDSBackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoTDSBackend.models.ExamFisicoRegional;
import com.ProyectoTDSBackend.repository.ExamFisicoRegionalRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class ExamFisicoRegionalService {
    private static final Logger log = LoggerFactory.getLogger(ExamFisicoRegionalService.class);
    
    @Autowired
    private ExamFisicoRegionalRepository examFisicoRegionalRepository;

    public GenericResponse<String> saveExamFisicoRegional(ExamFisicoRegional examFisicoRegional) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (examFisicoRegional != null) {
                examFisicoRegionalRepository.save(examFisicoRegional);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("EXAMEN FISICO REGIONAL GUARDADO: "+examFisicoRegional.getIdExamFisicoRegional().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Examen físico regional no guardado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar el examen físico regional: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
}
