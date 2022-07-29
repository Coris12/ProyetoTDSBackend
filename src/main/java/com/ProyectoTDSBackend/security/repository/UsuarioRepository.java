/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.security.repository;

import com.ProyectoTDSBackend.dto.DatosTarjetaDto;
import com.ProyectoTDSBackend.security.models.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LENOVO
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByNombreUsuario(String nombreUsuario);

    boolean existsByNombreUsuario(String nombreUsuario);

    boolean existsByEmail(String email);

    Usuario findByid(int id);

    //Buscar usuario por identificacion
    Usuario findByIdentificacion(String identificacion);

    @Query(value = "select * from usuario usu, usuario_rol rol where usu.id = rol.usuario_id and rol.rol_id =2;", nativeQuery = true)
    List<Usuario> list();

    @Query(value = "select * from usuario usu, usuario_rol rol where usu.id = rol.usuario_id and rol.rol_id !=2 and rol.rol_id !=1;", nativeQuery = true)
    List<Usuario> listaEmpleados();

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    Optional<DatosTarjetaDto> getDatosTarjetaUser(@Param("identificacion") String identificacion);
}
