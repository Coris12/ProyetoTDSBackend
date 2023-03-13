/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Contrareferencia;
import com.ProyectoTDSBackend.repository.ContraRepository;
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
public class ContraService {
      private static final Logger log = LoggerFactory.getLogger(Contrareferencia.class);

    @Autowired
    private ContraRepository repositorio;

    @Transactional
    public GenericResponse<String> saveContrareferencia(Contrareferencia contra) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (contra != null) {
                repositorio.save(contra);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(contra.getIdContra().toString());
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

    public Optional<Contrareferencia> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Contrareferencia> list() {
        return repositorio.findAll();
    }
}
