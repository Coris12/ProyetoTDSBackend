/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.dto.AnestesiaDto;
import com.ProyectoTDSBackend.models.Anestesia;
import com.ProyectoTDSBackend.repository.AnestesiaRepository;
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
public class AnestesiaService {

    private static final Logger log = LoggerFactory.getLogger(Anestesia.class);

    @Autowired
    private AnestesiaRepository repositorio;

    @Transactional
    public GenericResponse<String> saveAnes(Anestesia anes) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (anes != null) {
                repositorio.save(anes);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(anes.getIdAnes().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("historia clinica no guardado  no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar diagnostico: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<Anestesia> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Anestesia> list() {
        return repositorio.findAll();
    }

    public List<AnestesiaDto> generarPdf(Long idA) {
        List<AnestesiaDto> generaPdf = repositorio.generarPdfAnes(idA);
        return generaPdf;
    }
}
