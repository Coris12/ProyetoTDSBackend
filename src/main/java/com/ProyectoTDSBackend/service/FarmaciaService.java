package com.ProyectoTDSBackend.service;

import java.util.ArrayList;
import java.util.List;

import com.ProyectoTDSBackend.dto.FarmSucursalDTO;
import com.ProyectoTDSBackend.models.Farmacia;
import com.ProyectoTDSBackend.models.Sucursal;
import com.ProyectoTDSBackend.repository.FarmaciaRepository;
import com.ProyectoTDSBackend.repository.sucursalRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FarmaciaService {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(FarmaciaService.class);

    @Autowired
    private FarmaciaRepository farmaciaRepository;

    @Autowired
    private sucursalRepository sucursalRepository;

    public GenericResponse<String> saveFarmacia(Farmacia farmacia) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (farmacia != null) {
                farmaciaRepository.save(farmacia);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Guardado exitoso");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("No se pudo guardar");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar farmacia: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //listar todas las farmacias de FarmaciaRepository
    public GenericResponse<List<FarmSucursalDTO>> getAllFarmacias() {
        GenericResponse<List<FarmSucursalDTO>> response = new GenericResponse<>();
        try {
            List<FarmSucursalDTO> farmacias = farmaciaRepository.getAllFarmacias();
            System.out.println("Farmacia: "+farmacias.size());
            response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
            response.setObject(farmacias);
            response.setStatus(ParametersApp.SUCCESSFUL.value());
        } catch (Exception e) {
            log.error("Error al listar farmacias: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //Actualizar farmacia
    public GenericResponse<String> updateSucursal(Farmacia farmacia) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if(sucursalRepository.findById(farmacia.getSucursal().getIdSucursal())!=null){
                // farmacia.getSucursal().getNombreSuc(); 
                // farmacia.getSucursal().getCorreoSuc();
                // farmacia.getSucursal().getTelefonoSuc();
                sucursalRepository.save(farmacia.getSucursal());
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
				response.setObject("Persona con número de identificacion " + farmacia.getSucursal().getNombreSuc()+ " actualizada correctamente");
				response.setStatus(ParametersApp.SUCCESSFUL.value());
            }else {
				response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
				response.setObject("Persona no existe");
				response.setStatus(ParametersApp.SUCCESSFUL.value());
			}
        } catch (Exception e) {
			// TODO: handle exception
			log.error("ERROR", e);
			response.setStatus(ParametersApp.SERVER_ERROR.value());
		}
		return response;
    }
}
