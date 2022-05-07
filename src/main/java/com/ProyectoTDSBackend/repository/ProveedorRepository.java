/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.Proveedor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author LENOVO
 */
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {

    @Query(value = "select * from proveedor where estado = 1", nativeQuery = true)
    List<Proveedor> findAllActiveUsersNative();
}
