/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.RefiereDeriva;
import com.ProyectoTDSBackend.repository.RefiereRepository;
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
public class RefiereService {

    private static final Logger log = LoggerFactory.getLogger(RefiereDeriva.class);

    @Autowired
    private RefiereRepository repositorio;

    @Transactional
    public GenericResponse<String> saveRefiere(RefiereDeriva refi) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (refi != null) {
                repositorio.save(refi);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(refi.getIdRefiere().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Refiere no guardado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar el refiere : " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public List<RefiereDeriva> list() {
        return repositorio.findAll();
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<RefiereDeriva> getOne(Long id) {
        return repositorio.findById(id);
    }
}
