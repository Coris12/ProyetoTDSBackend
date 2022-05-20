/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.CuerpoFactura;
import com.ProyectoTDSBackend.repository.CuerpoFacturaRepositorio;
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
public class CuerpoFacturaService {
    private static final Logger log = LoggerFactory.getLogger(CuerpoFacturaService.class);
    @Autowired
    CuerpoFacturaRepositorio cuerpoRepository;

    public List<CuerpoFactura> list() {
        return cuerpoRepository.findAll();
    }

    public Optional<CuerpoFactura> getOne(Long id) {
        return cuerpoRepository.findById(id);
    }

    public void save(CuerpoFactura cuerpoFactura) {
        cuerpoRepository.save(cuerpoFactura);
    }

    public void delete(Long id) {
        cuerpoRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return cuerpoRepository.existsById(id);
    }

    //Guardar cuerpo de factura
    public GenericResponse<String> saveCuerpoFactura(CuerpoFactura cuerpoFactura) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (cuerpoFactura != null) {
                cuerpoRepository.save(cuerpoFactura);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Ingreso exitoso");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Error al ingresar");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }    
        } catch (Exception e) {
            log.error("Error al guardar cuerpo de factura: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
    
    //Guardar cuerpo de factura 2
    public CuerpoFactura saveCuerpoFact(CuerpoFactura cuerpoFactura){
        return cuerpoRepository.save(cuerpoFactura);
    }
    
}
