package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.Sucursal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sucursalRepository extends JpaRepository<Sucursal, Long> {

    boolean existsByNombreSuc(String nombre);

    


}
