package com.ProyectoTDSBackend.repository;

import java.util.List;

import com.ProyectoTDSBackend.dto.FactConsFinalDTO;
import com.ProyectoTDSBackend.dto.FacturaDatosDTO;
import com.ProyectoTDSBackend.models.Factura;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface FacturaRespository extends JpaRepository<Factura, Long> {

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    public List<FacturaDatosDTO> getPdfFacturaUsuario(@Param("idFactura") Long idFactura);

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    public List<FactConsFinalDTO> getPdfFacturaConsFinal(@Param("idFactura") Long idFactura);

}
