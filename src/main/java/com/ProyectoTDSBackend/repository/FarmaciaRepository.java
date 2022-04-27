package com.ProyectoTDSBackend.repository;

import java.util.List;

import com.ProyectoTDSBackend.dto.FarmaciaDTO;
import com.ProyectoTDSBackend.models.Farmacia;

import org.hibernate.annotations.SourceType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {
    
    // @Query(value = "SELECT f.id_farmacia, s.id_sucursal, s.nombre_suc, s.correo_suc, s.telefono_suc, s.direccion_suc "
    // +"FROM farmacia f INNER JOIN sucursal s ON f.id_sucursal = :s.id_sucursal;", nativeQuery = true)
    // List<Farmacia> listarFarmacias();
    
    //@Query("SELECT new com.ProyectoTDSBackend.dto.FarmaciaDTO(f.id_farmacia, f.nombre_farmacia, f.direccion_farmacia, f.telefono_farmacia, f.correo_farmacia, f.estado_farmacia, s.id_sucursal, s.nombre_suc, s.correo_suc, s.telefono_suc, s.direccion_suc")
//    @Query("SELECT new com.ProyectoTDSBackend.dto.FarmSucursalDTO(f.idFarmacia, s.idSucursal, s.nombreSuc, s.correoSuc, s.telefonoSuc, s.direccionSuc) FROM Farmacia f INNER JOIN f.sucursal s")
//    public List<FarmSucursalDTO> getAllFarmacias();
}
