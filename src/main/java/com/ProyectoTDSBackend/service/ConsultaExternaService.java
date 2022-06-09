package com.ProyectoTDSBackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoTDSBackend.models.ConsultaExterna;
import com.ProyectoTDSBackend.repository.ConsultaExternaRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class ConsultaExternaService {
    private static final Logger log = LoggerFactory.getLogger(ConsultaExternaService.class);

    @Autowired
    private ConsultaExternaRepository consultaExternaRepository;

    public GenericResponse<String> saveConsultaExterna(ConsultaExterna consultaExterna) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExterna != null) {
                consultaExternaRepository.save(consultaExterna);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(consultaExterna.getIdConsexterna().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Consulta externa no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
}
