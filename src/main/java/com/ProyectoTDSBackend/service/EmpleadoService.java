/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Empleado;
import com.ProyectoTDSBackend.repository.EmpleadoRepository;
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
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository repositorio;
    
     public List<Empleado> list() {
        return repositorio.findAll();
    }

    public Optional<Empleado> getOne(int id) {
        return repositorio.findById(id);
    }

    public void save(Empleado empleado) {
        repositorio.save(empleado);
    }

    public void delete(int id) {
        repositorio.deleteById(id);
    }

    public boolean existsById(int id) {
        return repositorio.existsById(id);
    }
    
    public List<Empleado> search() {
        return repositorio.findEmpleadosActivos();
    }

}
