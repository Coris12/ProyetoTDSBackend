/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Tarjeta;
import com.ProyectoTDSBackend.repository.tarjetaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author corin
 */
@Service
@Transactional
public class TarjetaService {

    @Autowired
    private tarjetaRepository repository;

    public List<Tarjeta> listaTarjetas() {
        return repository.findAll();
    }

    public Optional<Tarjeta> getOne(int id) {
        return repository.findById(id);
    }

    public void save(Tarjeta tarjeta) {
        repository.save(tarjeta);
    }

    public boolean existsById(int id) {
        return repository.existsById(id);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
     public List<Tarjeta> deleteLogi() {
        return repository.findTarjetas();
    }

}
