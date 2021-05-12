/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Producto;
import com.ProyectoTDSBackend.models.Proveedor;
import com.ProyectoTDSBackend.repository.ProveedorRepository;
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
public class ProveedorService {
    @Autowired
    private ProveedorRepository provRepository;
    
    public Proveedor save (Proveedor proveedor){
        return provRepository.save(proveedor);
    }
    
    public List<Proveedor> list(){
        return provRepository.findAll();
    }
      public Optional<Proveedor> getOne(int id){
        return provRepository.findById(id);
    }
}