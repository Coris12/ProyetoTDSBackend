/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Cliente;
import com.ProyectoTDSBackend.models.Proveedor;
import com.ProyectoTDSBackend.repository.ProveedorRepository;
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
public class ProveedorService {

    @Autowired
    private ProveedorRepository repositorio;

    public List<Proveedor> list() {
        return repositorio.findAll();
    }

    public Optional<Proveedor> getOne(int id) {
        return repositorio.findById(id);
    }

    public void save(Proveedor proveedor) {
        repositorio.save(proveedor);
    }

    public void delete(int id) {
        repositorio.deleteById(id);
    }

    public boolean existsById(int id) {
        return repositorio.existsById(id);
    }
}
