/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.dto.ProtocoloDTO;
import com.ProyectoTDSBackend.models.Protocolos;
import com.ProyectoTDSBackend.repository.ProtocoloRepository;
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
public class ProtocoloService {
    private static final Logger log = LoggerFactory.getLogger(Protocolos.class);

    @Autowired
    private ProtocoloRepository repositorio; 
    
    @Transactional
    public GenericResponse<String> saveDiagnostico(Protocolos protocolo) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (protocolo != null) {
                protocolo.setEstado(1);
                repositorio.save(protocolo);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(protocolo.getIdProtocolo().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("diagnostico no guardado  no guardada");
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

    public Optional<Protocolos> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Protocolos> list() {
        return repositorio.findAll();
    }
    public List<ProtocoloDTO> generarPdf(int proto){
        List<ProtocoloDTO> generaPdf = repositorio.generarPdfProtocolo(proto);
        return generaPdf;
    }
    
}
