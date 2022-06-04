package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.Sucursal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface sucursalRepository extends JpaRepository<Sucursal, Long> {

    boolean existsByNombreSuc(String nombre);

       @Query(value = "select * from sucursal where estado = 1", nativeQuery = true)
    List<Sucursal> findSucursal();


}
