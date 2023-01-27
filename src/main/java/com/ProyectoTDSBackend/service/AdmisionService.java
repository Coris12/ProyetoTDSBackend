/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Admision;
import com.ProyectoTDSBackend.repository.AdmisionRepository;
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
@Transactional
public class AdmisionService {
        private static final Logger log = LoggerFactory.getLogger(Admision.class);

    @Autowired
    private AdmisionRepository repositorio;

    @Transactional
    public GenericResponse<String> saveAdmision(Admision admi) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (admi != null) {
                repositorio.save(admi);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(admi.getIdAdmision().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Admision no guardado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar el admision : " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<Admision> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Admision> list() {
        return repositorio.findAll();
    }

}
