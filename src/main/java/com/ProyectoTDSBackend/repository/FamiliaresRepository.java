package com.ProyectoTDSBackend.repository;
import java.sql.SQLException;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoTDSBackend.dto.FamiliaresAllDTO;
import com.ProyectoTDSBackend.dto.ListaFamiliaresDTO;
import com.ProyectoTDSBackend.models.Familiares;
import com.ProyectoTDSBackend.security.models.Usuario;

public interface FamiliaresRepository extends JpaRepository<Familiares, Long> {

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    List<ListaFamiliaresDTO> listAllFamilyOfUser(int ui); 

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    List<FamiliaresAllDTO> getAllFamiliares(int usuarioId) throws SQLException; 

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    @Query(value = "UPDATE familiares"
    +" SET estado = 'd'"
    +" WHERE id_familiares = :fId", nativeQuery = true)
    void deleteUpdateFamiliares(int fId);

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Modifying
    void findByIdenUsuarioFamiliar(int idF);
}
