/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.CuerpoFactura;
import com.ProyectoTDSBackend.repository.CuerpoFacturaRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author corin
 */
@Service
@Transactional
public class CuerpoFacturaService {
    @Autowired
    CuerpoFacturaRepositorio cuerpoRepository;

    public List<CuerpoFactura> list() {
        return cuerpoRepository.findAll();
    }

    public Optional<CuerpoFactura> getOne(int id) {
        return cuerpoRepository.findById(id);
    }

    public void save(CuerpoFactura cuerpoFactura) {
        cuerpoRepository.save(cuerpoFactura);
    }

    public void delete(int id) {
        cuerpoRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return cuerpoRepository.existsById(id);
    }

    
    
}
