package com.ProyectoTDSBackend.service;

import java.util.List;

import com.ProyectoTDSBackend.models.Factura;
import com.ProyectoTDSBackend.repository.FacturaRespository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {
    
    private static final Logger log = LoggerFactory.getLogger(FacturaService.class);
	
    @Autowired
	private FacturaRespository facturaRepository;

    //Guardar factura
    public GenericResponse<String> saveFactura(Factura factura) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            
            if (factura != null) {
                facturaRepository.save(factura);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Guardado exitoso");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("No se pudo guardar");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar factura: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //Obtener todas las facturas
    public GenericResponse<List<Factura>> getAllFacturas() {
        GenericResponse<List<Factura>> response = new GenericResponse<>();
        try {
            List<Factura> facturas = facturaRepository.findAll();
            response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
            response.setObject(facturas);
            response.setStatus(ParametersApp.SUCCESSFUL.value());
        } catch (Exception e) {
            log.error("Error al obtener facturas: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
}
