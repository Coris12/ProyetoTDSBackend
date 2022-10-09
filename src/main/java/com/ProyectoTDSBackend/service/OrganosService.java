/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.OrganosDonados;
import com.ProyectoTDSBackend.repository.OrganosRepository;
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
public class OrganosService {
      private static final Logger log = LoggerFactory.getLogger(OrganosDonados.class);

    @Autowired
    private OrganosRepository repositorio; 
    
    @Transactional
    public GenericResponse<String> saveHistoria(OrganosDonados organos) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (organos != null) {
                repositorio.save(organos);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(organos.getIdOrganos().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Organos donados no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar organos: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<OrganosDonados> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<OrganosDonados> list() {
        return repositorio.findAll();
    }
  
}
