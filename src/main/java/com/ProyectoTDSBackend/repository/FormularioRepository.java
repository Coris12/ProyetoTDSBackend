/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.repository;

import com.ProyectoTDSBackend.dto.FormularioDto;
import com.ProyectoTDSBackend.models.Formulario;
import com.ProyectoTDSBackend.util.GenericResponse;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author LENOVO
 */
public interface FormularioRepository extends JpaRepository<Formulario, Long> {

    @Query(value = "select u.nombres, u.direccion, u.celular, f.cuadro_clinico, f.diagnostico, f.hallazgos,\n"
            + "d.districto, d.area, d.entidad, d.establecimiento, d.hist_clin_num, d.tipo,\n"
            + "rede.entidad_sistema, rede.especiali_referido, rede.establecimiento_referido, \n"
            + "rede.fecha, rede.servicio_referido, rede.entidad_sistema, rede.anio, rede.dia,d.id_datos,rede.id_refiere,m.id_motivo ,\n"
            + "rede.mes, rede.entidad, rede.especialidad, rede.servicio,f.id_formulario,r.id_usuario,\n"
            + "r.provincia, r.nacionalidad, r.pais, r.parroquia, r.canton,\n"
            + "m.otro, m.referencia\n"
            + "from  usuario u\n"
            + "join formulario f\n"
            + "on  u.id = f.id_usuario\n"
            + "join datos_institucionales d\n"
            + "on f.id_datos = d.id_datos\n"
            + "join refiere_deriva rede\n"
            + "on f.id_refiere = rede.id_refiere\n"
            + "join motivos m \n"
            + "on rede.id_motivo = m.id_motivo\n"
            + "join residencia r \n"
            + "on r.id_usuario = u.id\n"
            + "where u.id= :id", nativeQuery = true)
    List<Formulario> findid(@Param("id") Integer id);

    @Transactional(value = "transactionManager", propagation = Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
    @Query(nativeQuery = true)
    public FormularioDto getFormularioById(int idFor);

}
