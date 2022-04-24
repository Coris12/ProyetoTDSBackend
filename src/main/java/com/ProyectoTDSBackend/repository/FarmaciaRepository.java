package com.ProyectoTDSBackend.repository;

import java.util.List;

import com.ProyectoTDSBackend.models.Farmacia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {

    @Query(value = "SELECT f.id_farmacia, s.id_sucursal, s.nombre_suc, s.correo_suc, s.telefono_suc, s.direccion_suc"
    +"FROM farmacia f" 
    +"JOIN sucursal s"
    +"ON f.id_farmacia=s.id_farmacia", nativeQuery = true)
    List<Farmacia> listarFarmacias();
    
    Farmacia findByIdFarmacia(Long idFarmacia);
}
