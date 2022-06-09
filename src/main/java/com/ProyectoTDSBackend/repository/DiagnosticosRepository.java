package com.ProyectoTDSBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyectoTDSBackend.models.Diagnosticos;

public interface DiagnosticosRepository extends JpaRepository<Diagnosticos, Long> {

}
