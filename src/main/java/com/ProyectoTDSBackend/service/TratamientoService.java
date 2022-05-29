/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Tratamiento;
import com.ProyectoTDSBackend.repository.TratamientoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LENOVO
 */
@Service
@Transactional
public class TratamientoService {
    @Autowired
    TratamientoRepository repositorio;

    
    
    public List<Tratamiento> list() {
        return repositorio.findAll();
    }

    public Optional<Tratamiento> getOne(int id) {
        return repositorio.findById(id);
    }

    public void save(Tratamiento tratamiento) {
        repositorio.save(tratamiento);
    }

    public void delete(int id) {
        repositorio.deleteById(id);
    }

}
