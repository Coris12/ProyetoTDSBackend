/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.DiagnosticoAI;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author corin
 */
public interface DiagnosticoAIRepository extends JpaRepository<DiagnosticoAI, Long> {
    
}
