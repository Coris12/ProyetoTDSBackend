/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Inversa;
import com.ProyectoTDSBackend.repository.InversaRepository;
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
public class InversaService {
     private static final Logger log = LoggerFactory.getLogger(Inversa.class);

    @Autowired
    private InversaRepository repositorio;

    @Transactional
    public GenericResponse<String> saveInversa(Inversa inver) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (inver != null) {
                repositorio.save(inver);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(inver.getIdInversa().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Contra no guardado");
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

    public Optional<Inversa> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Inversa> list() {
        return repositorio.findAll();
    }
}
