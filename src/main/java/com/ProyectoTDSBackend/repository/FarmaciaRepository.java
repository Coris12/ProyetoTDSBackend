package com.ProyectoTDSBackend.repository;

import java.util.List;

import com.ProyectoTDSBackend.dto.FarmSucursalDTO;
import com.ProyectoTDSBackend.models.Farmacia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {
    
    //  @Query(value = "SELECT f.id_farmacia, s.id_sucursal, s.nombre_suc, s.correo_suc, s.telefono_suc, s.direccion_suc "
    //  +"FROM farmacia f INNER JOIN sucursal s ON f.id_sucursal = s.id_sucursal", nativeQuery = true)
    //  //List<Farmacia> listarFarmacias();
    
    @Query(value = "SELECT s FROM  Farmacia f JOIN f.sucursal s where f.idFarmacia IS NOT NULL")
    
   //@Query("SELECT new com.ProyectoTDSBackend.dto.FarmSucursalDTO(f.idFarmacia, s.idSucursal, s.nombreSuc, s.correoSuc, s.telefonoSuc, s.direccionSuc) FROM Farmacia f INNER JOIN f.sucursal s")
   //@Query("SELECT new com.ProyectoTDSBackend.dto.FarmSucursalDTO(f.idFarmacia, s.idSucursal, s.nombreSuc, s.correoSuc, s.telefonoSuc, s.direccionSuc) FROM Farmacia f INNER JOIN f.sucursal s")
    List<FarmSucursalDTO> getAllFarmacias();

    Farmacia findByIdFarmacia(Long idFarmacia);
}
