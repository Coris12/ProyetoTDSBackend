package com.ProyectoTDSBackend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoTDSBackend.dto.ConsentimientoDto;
import com.ProyectoTDSBackend.dto.ConsentimientoListDto;
import com.ProyectoTDSBackend.dto.ConsentimientoTratamientoDto;
import com.ProyectoTDSBackend.models.Consentimiento;
import org.springframework.data.repository.query.Param;

public interface ConsentimientoRepository extends JpaRepository<Consentimiento, Integer> {

    List<Consentimiento> findAllByOrderByIdConsentimientoDesc();
    
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    public List<ConsentimientoTratamientoDto> generarPdfConsentimiento(@Param("idCon") int idCon);
    
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    Optional<ConsentimientoDto> getAllDatosOnlyConsentimientoById(Integer idConsentimiento);

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    List<ConsentimientoListDto> listDataConsentimiento();
    
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE consentimientos"
    +" SET estado = 'i'"
    +" WHERE id_consentimiento = :idConsentimiento", nativeQuery = true)
    void deleteUpdateConsentimiento(Integer idConsentimiento);

}
