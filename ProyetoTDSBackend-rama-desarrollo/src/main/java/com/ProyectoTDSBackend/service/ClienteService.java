/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.models.Cliente;
import com.ProyectoTDSBackend.repository.ClienteRepository;
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
public class ClienteService {

    private static final Logger log = LoggerFactory.getLogger(ClienteService.class);

    @Autowired
    private ClienteRepository repositorio;

    public List<Cliente> list() {
        return repositorio.findAll();
    }

    public Optional<Cliente> getOne(int id) {
        return repositorio.findById(id);
    }

    public void save(Cliente cliente) {
        repositorio.save(cliente);
    }

    public void delete(int id) {
        repositorio.deleteById(id);
    }

    public boolean existsById(int id) {
        return repositorio.existsById(id);
    }

    public GenericResponse<Cliente> getIdCliente(int id) {
        GenericResponse<Cliente> response = new GenericResponse<>();
        try {
            Cliente cliente = repositorio.findById(id).get();
            if (cliente != null) {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(cliente);
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            // TODO: handle exception
            log.error("ERROR", e);
            response.setMessage(ParametersApp.SERVER_ERROR.getReasonPhrase());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
}
