package com.ProyectoTDSBackend.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoTDSBackend.Exceptions.MessagExcepciones;
import com.ProyectoTDSBackend.dto.FamiliaresAllDTO;
import com.ProyectoTDSBackend.models.Familiares;
import com.ProyectoTDSBackend.repository.FamiliaresRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
// @Transactional(value = "transactionManager", propagation =
// Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
public class FamiliaresService {
    private static final Logger log = LoggerFactory.getLogger(FamiliaresService.class);

    @Autowired
    private FamiliaresRepository familiaresRepository;

    @Transactional(rollbackFor = { MessagExcepciones.class })
    public GenericResponse<String> saveFamiliares(Familiares familiares) throws MessagExcepciones {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (familiares != null) {
                if (familiares.getUsuario().getId() != 0) {
                    try {
                        familiaresRepository.save(familiares);
                        Long convertLong = Long.valueOf(familiares.getIdFamiliares());
                        response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                        response.setObject(convertLong.toString());
                        response.setStatus(ParametersApp.SUCCESSFUL.value());
                    } catch (Exception e) {
                        throw new MessagExcepciones("TRANSACTIONAL USUARIO ERROR EN EL ID ROLLBACKFOR");
                    }
                }
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO SE PUDO GUARDAR LOS FAMILIARES");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("ERROR AL GUARDAR FAMILIARES: ");
            e.printStackTrace(System.out);
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<FamiliaresAllDTO> listFamiliares(int usuarioId) {
        List<FamiliaresAllDTO> listaF = new ArrayList<>();
        try {
            familiaresRepository.getAllFamiliares(usuarioId).forEach(listFam -> {
                FamiliaresAllDTO fDTO = new FamiliaresAllDTO();
                fDTO.setIdFamiliares(listFam.getIdFamiliares());
                fDTO.setNombres(listFam.getNombres());
                fDTO.setUsuarioId(listFam.getUsuarioId());
                fDTO.setIdenUsuarioFamiliar(listFam.getIdenUsuarioFamiliar());
                fDTO.setTipoFamiliar(listFam.getTipoFamiliar());
                listaF.add(fDTO);
            });
            return listaF;
        } catch (Exception e) {
            log.error("ERROR: ", e);
            return new ArrayList<FamiliaresAllDTO>();
        }
    }
}
