package com.ProyectoTDSBackend.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoTDSBackend.models.PlanTratamiento;
import com.ProyectoTDSBackend.repository.PlanTratamientoRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class PlanTratamientoService {
    private static final Logger log = LoggerFactory.getLogger(PlanTratamientoService.class);
    
    @Autowired
    private PlanTratamientoRepository planTratamientoRepository;

    public GenericResponse<String> savePlanTratamiento(PlanTratamiento planTratamiento){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (planTratamiento != null) {
                planTratamientoRepository.save(planTratamiento);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("PLAN DE TRATAMIENTO GUARDADO CORRECTAMENTE: "+planTratamiento.getIdPlanTratamiento());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Plan de tratamiento no guardado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar el plan de tratamiento: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;    
    }
}
