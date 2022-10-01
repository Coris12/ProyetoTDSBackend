/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.TiposQuirurgicos;
import com.ProyectoTDSBackend.repository.TipoQuirurgicoRepository;
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
public class TipoQuirurgicoService {
    
     private static final Logger log = LoggerFactory.getLogger(TiposQuirurgicos.class);

    @Autowired
    private TipoQuirurgicoRepository repositorio; 
    
    @Transactional
    public GenericResponse<String> saveTipoQuirur(TiposQuirurgicos tipo) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (tipo != null) {
                repositorio.save(tipo);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(tipo.getIdTipo().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Tipos quirurgicos no guardado ");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar Tipos quirurgicos: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<TiposQuirurgicos> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<TiposQuirurgicos> list() {
        return repositorio.findAll();
    }
}
