/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.Producto;
import com.ProyectoTDSBackend.models.Proveedor;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

/**
 *
 * @author corin
 */
@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {

    Optional<Proveedor> findByNombreP(String nombre);

    boolean existsByNombreP(String nombre);

    /*@Modifying
    @Query(value = "update proveedor set estado=? where idP = ?",
            nativeQuery = true)
    int deleteLogic(Integer estado, Integer idP);*/

    
}
