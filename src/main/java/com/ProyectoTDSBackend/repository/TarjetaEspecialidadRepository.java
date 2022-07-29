package com.ProyectoTDSBackend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProyectoTDSBackend.models.TarjetaEspecialidad;
import com.ProyectoTDSBackend.security.enums.NomEspTarjeta;

public interface TarjetaEspecialidadRepository extends JpaRepository<TarjetaEspecialidad, Long> {
    Optional<TarjetaEspecialidad> findByTipoEspecialidad(NomEspTarjeta nomEspTarjeta);
}
