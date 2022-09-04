/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Cliente;
import com.ProyectoTDSBackend.models.Formulario;
import com.ProyectoTDSBackend.repository.FormularioRepository;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LENOVO
 */
@Service
@Transactional
public class FormularioService {
    
    

    private static final Logger log = LoggerFactory.getLogger(ClienteService.class);
    
    @Autowired
    private FormularioRepository repositorio;
    
     public void save(Formulario formulario) {
        repositorio.save(formulario);
    }
     
     public List<Formulario> list() {
        return repositorio.findAll();
    }

}
