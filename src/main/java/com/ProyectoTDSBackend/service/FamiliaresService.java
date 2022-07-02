package com.ProyectoTDSBackend.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoTDSBackend.dto.FamiliaresAllDTO;
import com.ProyectoTDSBackend.dto.FamiliaresDTO;
import com.ProyectoTDSBackend.models.Familiares;
import com.ProyectoTDSBackend.repository.FamiliaresRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class FamiliaresService {
    private static final Logger log = LoggerFactory.getLogger(FamiliaresService.class);

    @Autowired
    private FamiliaresRepository familiaresRepository;

    public GenericResponse<String> saveFamiliares(Familiares familiares) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if(familiares != null){
                familiaresRepository.save(familiares);
                Long convertLong = Long.valueOf(familiares.getIdFamiliares());
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(convertLong.toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }else{
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO SE PUDO GUARDAR LOS FAMILIARES");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("ERROR AL GUARDAR FAMILIARES: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public List<FamiliaresAllDTO> listFamiliares(int usuarioId){
        List<FamiliaresAllDTO> listaF = new ArrayList<>();
        try {
            familiaresRepository.getAllFamiliares(usuarioId).forEach(listFam->{
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
