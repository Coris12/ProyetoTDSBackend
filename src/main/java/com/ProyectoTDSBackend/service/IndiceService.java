/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.IndicesCPO;
import com.ProyectoTDSBackend.repository.IndicesRepository;
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
public class IndiceService {

    private static final Logger log = LoggerFactory.getLogger(IndicesCPO.class);

    @Autowired
    private IndicesRepository repositorio;

    @Transactional
    public GenericResponse<String> saveIndice(IndicesCPO indice) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (indice != null) {
                repositorio.save(indice);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(indice.getIdIndice().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Indice no guardado");
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

    public Optional<IndicesCPO> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<IndicesCPO> list() {
        return repositorio.findAll();
    }

//    public List<EvolucionDTO> generarPdf(String iden) {
//        List<EvolucionDTO> generaPdf = repositorio.generarPdfEvolucionPrescripcion(iden);
//        return generaPdf;
//    }
}
