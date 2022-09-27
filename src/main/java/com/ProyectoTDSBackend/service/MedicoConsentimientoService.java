/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.dto.ConsentimientoMeDTO;
import com.ProyectoTDSBackend.models.MedicoConsentimiento;
import com.ProyectoTDSBackend.repository.MedicoCnsentimientoRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author corin
 */
@Service
public class MedicoConsentimientoService {
    
    
     private static final Logger log = LoggerFactory.getLogger(MedicoConsentimiento.class);

    @Autowired
    private MedicoCnsentimientoRepository repositorio;

     @Transactional
    public GenericResponse<String> saveMedicoCon(MedicoConsentimiento medico) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (medico != null) {
                medico.setEstado(1);
                repositorio.save(medico);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(medico.getIdMediC().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("consentimiento medico  no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar la evolucion: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<MedicoConsentimiento> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<MedicoConsentimiento> list() {
        return repositorio.findAll();
    }
    
      public List<ConsentimientoMeDTO> generarPdf(int idme){
        List<ConsentimientoMeDTO> generaPdf = repositorio.generarPdfConsen(idme);
        return generaPdf;
    }
}
