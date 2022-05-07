/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.security.service.implement;

import com.ProyectoTDSBackend.security.enums.RolNombre;
import com.ProyectoTDSBackend.security.models.Rol;
import com.ProyectoTDSBackend.security.models.Usuario;
import com.ProyectoTDSBackend.security.repository.ServicioUser;
import com.ProyectoTDSBackend.security.repository.UsuarioRepository;
import com.ProyectoTDSBackend.security.service.RolService;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;
import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class UsuarioImple implements ServicioUser {

    @Autowired
    UsuarioRepository usuarioRepository;
    
   @Autowired
    RolService rolser;

    @Override
    public GenericResponse<Object> putPermisos(int id, RolNombre idrol) {
        GenericResponse<Object> response = new GenericResponse<>();
        try {
            Usuario usuario = usuarioRepository.findByid(id);
            if (usuarioRepository.findById(id).isEmpty() == true) {
                response.setMessage(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
                response.setObject("No se puede actualizar la persona porque no se encontro");
                response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
            } else {
                Set<Rol> roles = new HashSet<>();
                roles.add(rolser.getByRolNombre(idrol).get());
                usuario.setRoles(roles);

                usuarioRepository.saveAndFlush(usuario);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Usuario Editado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            response.setMessage(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
            response.setObject("ERROR " + e);
            response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
        }
        return response;
    }

}
