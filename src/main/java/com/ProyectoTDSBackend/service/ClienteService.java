/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Cliente;
import com.ProyectoTDSBackend.repository.ClienteRepository;
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
public class ClienteService {

    @Autowired
    private ClienteRepository repositorio;

    public List<Cliente> list() {
        return repositorio.findAll();
    }

    public Optional<Cliente> getOne(int id) {
        return repositorio.findById(id);
    }

    public void save(Cliente cliente) {
        repositorio.save(cliente);
    }

    public void delete(int id) {
        repositorio.deleteById(id);
    }

    public boolean existsById(int id) {
        return repositorio.existsById(id);
    }
}
