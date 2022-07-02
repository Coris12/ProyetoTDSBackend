package com.ProyectoTDSBackend.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProyectoTDSBackend.models.Tarjeta;
import com.ProyectoTDSBackend.models.TarjetaEspecialidad;
import com.ProyectoTDSBackend.repository.TarjetaEspecialidadRepository;
import com.ProyectoTDSBackend.security.enums.NomEspTarjeta;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class TarjetaEspecialidadService {
    
    private static final Logger log = LoggerFactory.getLogger(TarjetaEspecialidadService.class);

    @Autowired
    private TarjetaEspecialidadRepository tarjetaEspecialidadRepository;

    //Guardar TarjetaEspecialidad
    public GenericResponse<Optional<TarjetaEspecialidad>> BuscarTarjetaEspecialidad(NomEspTarjeta nomEspTarjeta) {
        GenericResponse<Optional<TarjetaEspecialidad>> response = new GenericResponse<>();
        try {
            if (nomEspTarjeta!= null){
                Optional<TarjetaEspecialidad> tarjetaEsp = tarjetaEspecialidadRepository.findByTipoEspecialidad(nomEspTarjeta); 
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(tarjetaEsp);
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar : " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
    
    //Guardar Tarjeta Especialidad
    public GenericResponse<String> saveTarjetaEspecialidad(TarjetaEspecialidad tarjetaEspecialidad){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if(tarjetaEspecialidad != null){
                tarjetaEspecialidadRepository.save(tarjetaEspecialidad); 
                Long convertLong = Long.valueOf(tarjetaEspecialidad.getIdTarjetaEspcialidad());
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(convertLong.toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("No se pudo guardar");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar TarjetaEspecialidad: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
}
