/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.dto.ProducDto;
import com.ProyectoTDSBackend.dto.ProductosDto;
import com.ProyectoTDSBackend.models.Producto;
import com.ProyectoTDSBackend.models.Sucursal;
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
            + "p.reg_sanitario_producto,p.estado_producto,\n"
            + "p.stock,\n"
            + "p.ultimo_costo,"
            + "p.id_proveedor,\n"
            + "s.nombre_suc,\n"
            + "s.id_sucursal\n"
            + "from productos p join sucursal s\n"
            + "on p.id_sucursal = s.id_sucursal and p.estado_producto='1'"
            + "join proveedor pro on pro.id_proveedor=p.id_proveedor\n"
            + "where s.id_sucursal = :id_sucursal", nativeQuery = true)
    List<Producto> findId(@Param("id_sucursal") Long id_sucursal);

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    public ProducDto getProductoByIdProducto(Long id_sucursal);
}
