/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.security.service;

import com.ProyectoTDSBackend.dto.DatosTarjetaDto;
import com.ProyectoTDSBackend.security.models.Usuario;
import com.ProyectoTDSBackend.security.repository.UsuarioRepository;
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
 * @author LENOVO
 */
@Service
@Transactional
public class UsuarioService {

    private static final Logger log = LoggerFactory.getLogger(UsuarioService.class);

    @Autowired
    UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public boolean existsByEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public List<Usuario> listaUsuarios() {
        return usuarioRepository.findAll();
    }

    // Buscar usuario por identificacion
    public GenericResponse<Usuario> ObtenerByIdentificacion(String identificacion) {
        GenericResponse<Usuario> response = new GenericResponse<>();
        try {
            if(!usuarioRepository.existsByIdentificacion(identificacion)){
                response.setMessage("NO EXISTE EL USUARIO CON ESTA IDENTIFICACION");
                response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
                return response;
            }

            if (identificacion != null) {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(usuarioRepository.findByIdentificacion(identificacion));
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage("INGRESE UNA IDENTIFICACION");
                response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
                return response; 
            }
        } catch (Exception e) {
            // TODO: handle exception
            log.error("Error al buscar persona por identificacion de usuario: ", e);
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public List<Usuario> search() {
        return usuarioRepository.list();
    }

    public List<Usuario> searchEmp() {
        return usuarioRepository.listaEmpleados();
    }

    // Buscar usuario por identificacion para tarjetas
    public GenericResponse<DatosTarjetaDto> getDatosTarjetaUser(String identificacion) {
        GenericResponse<DatosTarjetaDto> response = new GenericResponse<>();
        try {
            Optional<DatosTarjetaDto> dt = usuarioRepository.getDatosTarjetaUser(identificacion);
            if (dt.isPresent()) {
                DatosTarjetaDto dto = new DatosTarjetaDto();
                dto.setId(dt.get().getId());
                dto.setIdRecidencia(dt.get().getIdRecidencia());
                dto.setNombres(dt.get().getNombres());
                dto.setDireccion(dt.get().getDireccion());
                dto.setCelular(dt.get().getCelular());
                dto.setNacionalidad(dt.get().getNacionalidad());
                dto.setPais(dt.get().getPais());
                dto.setProvincia(dt.get().getProvincia());
                dto.setCanton(dt.get().getCanton());
                dto.setParroquia(dt.get().getParroquia());
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(dto);
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage("USUARIO NO ENCONTRADO");
                response.setStatus(ParametersApp.NOT_FOUND_RECORDS.value());
            }

        } catch (Exception e) {
            log.error("ERROR: ", e);
            response.setMessage(ParametersApp.SERVER_ERROR.getReasonPhrase());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //update idTarjeta de usuario
    public GenericResponse<String> updateIdTarjeta(String identificacion, Integer idTarjeta) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if(identificacion == null || idTarjeta == 0){
                log.error("ERROR: IDENTIFICACION O IDTARJETA SIN VALORES");;
                response.setMessage("ERROR: IDENTIFICACION O IDTARJETA SIN VALORES");
                response.setStatus(ParametersApp.SERVER_ERROR.value());
                return response;
            }
            
            if(usuarioRepository.existsByIdentificacion(identificacion)){
                usuarioRepository.updateIdTarjetaUser(identificacion, idTarjeta);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("actualizada correctamente");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }else{
                log.error("ERROR: USUARIO NO ENCONTRADO");
                response.setMessage("USUARIO NO ENCONTRADO");
                response.setStatus(ParametersApp.NOT_FOUND_RECORDS.value());
                return response;
            }
        } catch (Exception e) {
            log.error("ERROR: ", e);
            response.setMessage(ParametersApp.SERVER_ERROR.getReasonPhrase());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
}
