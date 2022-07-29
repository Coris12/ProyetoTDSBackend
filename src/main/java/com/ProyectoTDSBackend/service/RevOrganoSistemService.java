package com.ProyectoTDSBackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoTDSBackend.models.RevOrganoSistem;
import com.ProyectoTDSBackend.repository.RevOrganoSistemaRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class RevOrganoSistemService {
    private static final Logger log = LoggerFactory.getLogger(RevOrganoSistemService.class);

    @Autowired
    private RevOrganoSistemaRepository revOrganoSistemRepository;

    public GenericResponse<String> saveRevOrganoSistem(RevOrganoSistem revOrganoSistema) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (revOrganoSistema != null) {
                revOrganoSistemRepository.save(revOrganoSistema);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("REVISION ORGANOS Y SISTEMAS GUARDADOS CORRECTAMENTE: "
                        + revOrganoSistema.getIdRevOrganoSistem().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Revision de organos y sistema no guardados");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al Revision de organos y sistemas : " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
}
