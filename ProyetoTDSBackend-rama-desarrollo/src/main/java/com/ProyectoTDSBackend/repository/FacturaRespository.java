package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.Factura;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRespository extends JpaRepository<Factura, Long> {

    
}
