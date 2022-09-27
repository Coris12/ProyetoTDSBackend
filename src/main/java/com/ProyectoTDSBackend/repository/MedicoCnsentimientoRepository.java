/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.dto.ConsentimientoMeDTO;
import com.ProyectoTDSBackend.models.MedicoConsentimiento;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author corin
 */
public interface MedicoCnsentimientoRepository extends JpaRepository<MedicoConsentimiento, Long> {
      @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    public List<ConsentimientoMeDTO> generarPdfConsen(@Param("idme") int idme);
}
