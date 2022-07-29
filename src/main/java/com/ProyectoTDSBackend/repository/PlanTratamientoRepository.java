package com.ProyectoTDSBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyectoTDSBackend.models.PlanTratamiento;

public interface PlanTratamientoRepository extends JpaRepository<PlanTratamiento, Long> {
    
}
