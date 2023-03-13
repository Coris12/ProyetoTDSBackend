/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.dto.FormularioDto;
import com.ProyectoTDSBackend.models.DatosInstitucionales;
import com.ProyectoTDSBackend.repository.DatosInsRepository;
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

public class DatosService {
     private static final Logger log = LoggerFactory.getLogger(DatosInstitucionales.class);

    @Autowired
    private DatosInsRepository repositorio;

    @Transactional
    public GenericResponse<String> saveDatos(DatosInstitucionales datos) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (datos != null) {
                repositorio.save(datos);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(datos.getIdDatos().toString());
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

    public Optional<DatosInstitucionales> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<DatosInstitucionales> list() {
        return repositorio.findAll();
    }

    /*   public List<FormularioDto> generarPdf(Long idAd) {
        List<FormularioDto> generaPdf = repositorio.generarPdfAd(idAd);
        return generaPdf;
    } */
}
