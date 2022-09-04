/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.models.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author LENOVO
 */
public interface FormularioRepository extends JpaRepository<Formulario, Integer> {
    
}
