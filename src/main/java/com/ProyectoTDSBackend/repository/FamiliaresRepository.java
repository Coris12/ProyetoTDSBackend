package com.ProyectoTDSBackend.repository;
import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoTDSBackend.dto.FamiliaresAllDTO;
import com.ProyectoTDSBackend.models.Familiares;

public interface FamiliaresRepository extends JpaRepository<Familiares, Long> {

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    List<FamiliaresAllDTO> getAllFamiliares(int usuarioId) throws SQLException; 

}
