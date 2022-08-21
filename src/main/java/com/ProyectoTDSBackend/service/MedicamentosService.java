/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Medicamentos;
import com.ProyectoTDSBackend.repository.MedicamentoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author corin
 */
@Service
public class MedicamentosService {

    @Autowired
    private MedicamentoRepository repositorio;
    
      public void saveMedicamento(Medicamentos medicamento) {
        repositorio.save(medicamento);
    }
       public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }
       public Optional<Medicamentos> getOne(Long id) {
        return repositorio.findById(id);
    }


}
