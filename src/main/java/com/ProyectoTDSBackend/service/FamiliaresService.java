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
import com.ProyectoTDSBackend.dto.ListaFamiliaresDTO;
import com.ProyectoTDSBackend.models.Familiares;
import com.ProyectoTDSBackend.repository.FamiliaresRepository;
import com.ProyectoTDSBackend.security.models.Usuario;
import com.ProyectoTDSBackend.security.repository.UsuarioRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
// @Transactional(value = "transactionManager", propagation =
// Propagation.REQUIRES_NEW, rollbackFor = {Throwable.class})
public class FamiliaresService {
    private static final Logger log = LoggerFactory.getLogger(FamiliaresService.class);

    @Autowired
    private FamiliaresRepository familiaresRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

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

    // LISTAR FAMILIARES pertenecientes a un usuario
    public GenericResponse<List<ListaFamiliaresDTO>> listarFamiliares(int ui) {
        GenericResponse<List<ListaFamiliaresDTO>> response = new GenericResponse<>();
        try {
            List<ListaFamiliaresDTO> listFmlDto = new ArrayList<>();
            familiaresRepository.listAllFamilyOfUser(ui).forEach(listFam -> {
                ListaFamiliaresDTO fDTO = new ListaFamiliaresDTO();
                fDTO.setIdFamiliares(listFam.getIdFamiliares());
                fDTO.setIdentificacion(listFam.getIdentificacion());
                fDTO.setNombres(listFam.getNombres());
                fDTO.setIdenUsuarioFamiliar(listFam.getIdenUsuarioFamiliar());
                fDTO.setTipoFamiliar(listFam.getTipoFamiliar());
                fDTO.setUsuarioId(listFam.getUsuarioId());
                fDTO.setEstado(listFam.getEstado());
                listFmlDto.add(fDTO);
            });
            response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
            response.setObject(listFmlDto);
            response.setStatus(ParametersApp.SUCCESSFUL.value());
        } catch (Exception e) {
            response.setStatus(ParametersApp.SERVER_ERROR.value());
            log.error("ERROR", e);
        }
        return response;
    }

    // eliminar familiar
    public GenericResponse<String> eliminarFamiliar(int fId) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (familiaresRepository.findById((long) fId) != null) {
                familiaresRepository.deleteUpdateFamiliares(fId);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("FAMILIAR ELIMINADO");// NO QUITAR EL MENSAJE O VERIFICA EL FRONT
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("No se pudo ELIMINAR EL FAMILIAR");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            response.setStatus(ParametersApp.SERVER_ERROR.value());
            log.error("ERROR", e);
        }
        return response;
    }

    // actualizar familiar
    public GenericResponse<String> actualizarFamiliar(ListaFamiliaresDTO familiaresDto) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            Familiares fam = familiaresRepository.findById(familiaresDto.getIdFamiliares()).get();
            if (fam != null) {
                Usuario usuario = usuarioRepository.findById(familiaresDto.getIdenUsuarioFamiliar()).get();
                if (usuario.getId() != 0) {
                    try {
                        fam.setEstado(familiaresDto.getEstado());
                        fam.setIdFamiliares(familiaresDto.getIdFamiliares());
                        fam.setIdenUsuarioFamiliar(familiaresDto.getIdenUsuarioFamiliar());
                        usuario.setIdentificacion(familiaresDto.getIdentificacion());
                        usuario.setNombres(familiaresDto.getNombres());
                        fam.setTipoFamiliar(familiaresDto.getTipoFamiliar());
                        familiaresRepository.save(fam);
                        Long convertLong = Long.valueOf(fam.getIdFamiliares());
                        response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                        response.setObject(convertLong.toString() + " FAMILIAR ACTUALIZADO");
                        response.setStatus(ParametersApp.SUCCESSFUL.value());
                    } catch (Exception e) {
                        throw new MessagExcepciones("TRANSACTIONAL USUARIO ERROR EN EL ID ROLLBACKFOR");
                    }
                } else {
                    response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                    response.setObject("NO SE PUDO EDITAR EL FAMILIAR");
                    response.setStatus(ParametersApp.SUCCESSFUL.value());
                }
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO SE PUDO EDITAR EL FAMILIAR");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("ERROR AL GUARDAR FAMILIARES: ");
            e.printStackTrace(System.out);
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
}
