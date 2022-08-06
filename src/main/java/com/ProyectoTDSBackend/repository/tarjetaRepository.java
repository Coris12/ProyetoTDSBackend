/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.dto.DatosTarjetaAllDTO;
import com.ProyectoTDSBackend.models.Tarjeta;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author corin
 */
public interface tarjetaRepository extends JpaRepository<Tarjeta, Integer>{
    
    @Query(value = "select * from tarjeta  where estado=1",nativeQuery = true)
    List<Tarjeta> findTarjetas();

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    Optional<DatosTarjetaAllDTO> getAllDatosTarjeta(@Param("identificacion") String identificacion) throws SQLException; 

}
