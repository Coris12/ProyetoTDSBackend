/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.Evolucion;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author corin
 */
public interface EvolucionRepository extends JpaRepository<Evolucion, Long>{
    
}
