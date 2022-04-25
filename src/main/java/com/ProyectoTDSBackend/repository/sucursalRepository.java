package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.Sucursal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface sucursalRepository extends JpaRepository<Sucursal, Long> {
    //buscar por id
    Sucursal findByIdSucursal(Long idSucursal);

    //buscar por nombre
    Sucursal findByNombreSuc(String nombreSuc);

    //listar todas las sucursales
    //List<Sucursal> listarSucursales();
}
