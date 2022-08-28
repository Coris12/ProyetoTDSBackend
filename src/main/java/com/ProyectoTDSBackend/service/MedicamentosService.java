/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Medicamentos;
import com.ProyectoTDSBackend.repository.MedicamentoRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author corin
 */
@Service
public class MedicamentosService {

    private static final Logger log = LoggerFactory.getLogger(Medicamentos.class);

    @Autowired
    private MedicamentoRepository repositorio;

    @Transactional
    public GenericResponse<String> saveMedicamento(Medicamentos medicamento) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (medicamento != null) {
                repositorio.save(medicamento);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(medicamento.getIdMedicamentos().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Consulta externa no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<Medicamentos> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Medicamentos> list() {
        return repositorio.findAll();
    }
}
