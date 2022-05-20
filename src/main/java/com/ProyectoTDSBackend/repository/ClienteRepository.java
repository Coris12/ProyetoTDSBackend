/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import java.util.List;

import com.ProyectoTDSBackend.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LENOVO
 */
public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(value = "SELECT *"
    +" FROM cliente c JOIN usuario u"
    +" ON c.id_persona = u.id"
    +" WHERE c.id_persona = :personaId", nativeQuery = true)
    List<Cliente> getClienteId(Integer personaId);
    //Cliente findByPersonaId(int personaId);

    //update observaciones cliente
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE cliente"
    +" SET observaciones = :observaciones"
    +" WHERE id_cliente = :clientId", nativeQuery = true)
    void updateObservaciones(String observaciones, Integer clientId);

    
}
