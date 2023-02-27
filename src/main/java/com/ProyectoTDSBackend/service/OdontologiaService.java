/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.dto.OdontologiaDto;
import com.ProyectoTDSBackend.models.Odontologia;
import com.ProyectoTDSBackend.repository.OdontologiaRepository;
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
public class OdontologiaService {
    private static final Logger log = LoggerFactory.getLogger(Odontologia.class);

    @Autowired
    private OdontologiaRepository repositorio;

    @Transactional
    public GenericResponse<String> saveOdontologia(Odontologia odontologia) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (odontologia != null) {
                repositorio.save(odontologia);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(odontologia.getIdOdonto().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Odontologia no guardado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar el indice : " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<Odontologia> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Odontologia> list() {
        return repositorio.findAll();
    }

    public List<OdontologiaDto> generarPdf(Long idOdon) {
        List<OdontologiaDto> generaPdf = repositorio.generarPdfOdon(idOdon);
        return generaPdf;
    } 
    
}
