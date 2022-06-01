/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.Tratamiento;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author LENOVO
 */
public interface TratamientoRepository  extends JpaRepository<Tratamiento, Integer> {
     @Query(value = "select * from tratamientos  where estado=1",nativeQuery = true)
    List<Tratamiento> findTratamientos();
}
