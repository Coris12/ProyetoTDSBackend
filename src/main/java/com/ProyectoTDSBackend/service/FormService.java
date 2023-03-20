/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.dto.FormDto;
import com.ProyectoTDSBackend.dto.FormularioDto;
import com.ProyectoTDSBackend.models.Formulario;
import com.ProyectoTDSBackend.repository.FormularioRepository;
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
@Transactional
public class FormService {
    private static final Logger log = LoggerFactory.getLogger(Formulario.class);

    @Autowired
    private FormularioRepository repositorio;

    @Transactional
    public GenericResponse<String> saveFormulario(Formulario formulario) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (formulario != null) {
                repositorio.save(formulario);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(formulario.getIdFormulario().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Formulario no guardado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar el admision : " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public boolean existsById(Long id) {
        return repositorio.existsById(id);
    }

    public Optional<Formulario> getOne(Long id) {
        return repositorio.findById(id);
    }

    public List<Formulario> list() {
        return repositorio.findAll();
    }
    
    
      public List<Formulario> getbyidconvocatoria(Long id) {
        return repositorio.findid(id);
    }

    public GenericResponse<FormularioDto> getFormularioById(Long idFor) {
        GenericResponse<FormularioDto> response = new GenericResponse<>();
        try {
            FormularioDto FormularioDto = repositorio.getFormularioById(idFor);
            if (FormularioDto != null) {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());

                //System.out.println("Motivo consut: "+consultaExternaByIdDTO.getMotivoConsulta().getBytes().toString());
                response.setObject(FormularioDto);
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al obtener la formulario por id: " + e.getMessage());
            response.setMessage(ParametersApp.SERVER_ERROR.getReasonPhrase());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

       public List<FormDto> generarPdf(Long idForm) {
        List<FormDto> generaPdf = repositorio.generarPdfForm(idForm);
        return generaPdf;
    } 
}
