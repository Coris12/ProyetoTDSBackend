package com.ProyectoTDSBackend.service;

import java.util.List;

import javax.transaction.Transactional;

import com.ProyectoTDSBackend.models.Sucursal;
import com.ProyectoTDSBackend.repository.FarmaciaRepository;
import com.ProyectoTDSBackend.repository.sucursalRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SucursalService {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FarmaciaService.class);
    
    @Autowired
    private sucursalRepository sucursalRepository;

    @Autowired 
    FarmaciaRepository farmaciaRepository;

    //listar todas las sucursales
   public List<Sucursal> listaUsuarios() {
        return sucursalRepository.findAll();
    }

    //Guardar sucursal
    public GenericResponse<String>  saveSucursal(Sucursal sucursal) {
		GenericResponse<String> response = new GenericResponse<>();
		try {
			if (sucursal != null) {
				sucursalRepository.save(sucursal);
				response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
				response.setObject("Sucursal ingresado correctamente");
				response.setStatus(ParametersApp.SUCCESSFUL.value());
			} else {
				response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
				response.setObject("Datos de sucursal no ingresados");
				response.setStatus(ParametersApp.SUCCESSFUL.value());
			}

		} catch (Exception e) {
			log.error("ERROR AL CREAR SUCURSAL", e.getMessage());
			response.setStatus(ParametersApp.SERVER_ERROR.value());
		}
		return response;
	}

    //Obtener sucursal por id
    public GenericResponse<Sucursal> getSucursalById(Long id) {
        GenericResponse<Sucursal> response = new GenericResponse<>();
        try {
            Sucursal sucursal = sucursalRepository.findById(id).get();
            response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
            response.setObject(sucursal);
            response.setStatus(ParametersApp.SUCCESSFUL.value());
        } catch (Exception e) {
            log.error("Error al obtener sucursal: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
    
    public List<Sucursal>search(){
     return sucursalRepository.findSucursal();
    }
    
    public Optional<Sucursal> getOne(Long id) {
        return sucursalRepository.findById(id);
    }
     public boolean existsById(Long id) {
        return sucursalRepository.existsById(id);
    }
}
