/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.dto.ProductosDto;
import com.ProyectoTDSBackend.models.Producto;
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
public interface ProductoRepository extends JpaRepository<Producto, Long> {

    Optional<Producto> findByNombreProducto(String nombre);

    boolean existsByNombreProducto(String nombre);

    //@Query(value = "select * from productos  where estado =1", nativeQuery = true)
    //List<Producto> search(int estado);

    @Query(value = "select * from productos  where estado_producto =1",nativeQuery = true)
    List<Producto> findAllActiveUsersNative();

    
    
    
    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(value = "select p.id_producto,\n"
            + "p.categoria_producto,\n"
            + "p.cod_barra_producto,\n"
            + "p.codigo_ref_producto,\n"
            + "p.costo_promedio,\n"
            + "p.descripcion_producto,\n"
            + "p.fecha_exp_producto,\n"
            + "p.inventario_producto,\n"
            + "p.nombre_producto,\n"
            + "p.precio_producto,\n"
            + "p.reg_sanitario_producto,\n"
            + "p.stock,\n"
            + "p.ultimo_costo,\n"
            + "s.nombre_suc,\n"
            + "s.id_sucursal\n"
            + "from productos p join sucursal s\n"
            + "on p.id_sucursal = s.id_sucursal\n"
            + "where s.id_sucursal = :id", nativeQuery = true)
    List<Producto> findid(@Param("id") Long id);

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    public Producto getproductoByIdSucursal(Long idsuc);
}
