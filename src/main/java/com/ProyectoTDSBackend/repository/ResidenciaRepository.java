package com.ProyectoTDSBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyectoTDSBackend.models.Residencia;

public interface ResidenciaRepository extends JpaRepository<Residencia, Long> {
    
}
