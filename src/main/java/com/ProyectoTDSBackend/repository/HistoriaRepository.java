/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author corin
 */
public interface HistoriaRepository extends JpaRepository<HistoriaClinica, Long> {
    
}