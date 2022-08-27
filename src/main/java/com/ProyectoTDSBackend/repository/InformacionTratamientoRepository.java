package com.ProyectoTDSBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoTDSBackend.dto.InformacionTratamientoDTO;
import com.ProyectoTDSBackend.models.InformacionTratamiento;

public interface InformacionTratamientoRepository extends JpaRepository<InformacionTratamiento, Integer>{
  
	@Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    List<InformacionTratamientoDTO> getAllDatosOnlyInformacionTratamientoById(Integer idConsentimientoFk);
	
}
