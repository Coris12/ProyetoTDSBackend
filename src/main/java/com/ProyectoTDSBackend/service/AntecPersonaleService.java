package com.ProyectoTDSBackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoTDSBackend.models.AntecPersonales;
import com.ProyectoTDSBackend.repository.AntecPersonalesRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class AntecPersonaleService {
    private static final Logger log = LoggerFactory.getLogger(AntecPersonaleService.class);
    
    @Autowired
    private AntecPersonalesRepository antecPersonaleRepository;

    public GenericResponse<String> saveAntecPersonal(AntecPersonales antecPersonales){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (antecPersonales != null) {
                antecPersonaleRepository.save(antecPersonales);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("ANTECEDENTES PERSONALES GUARDADOS CORRECTAMENTE: "+antecPersonales.getIdAntecPersonales().toString());
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
