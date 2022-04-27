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

    // public GenericResponse<String> saveFarmacia(Farmacia farmacia) {
    //     GenericResponse<String> response = new GenericResponse<>();
    //     try {
    //         if (farmacia != null) {
    //             farmaciaRepository.save(farmacia);
    //             response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
    //             response.setObject("Guardado exitoso");
    //             response.setStatus(ParametersApp.SUCCESSFUL.value());
    //         } else {
    //             response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
    //             response.setObject("No se pudo guardar");
    //             response.setStatus(ParametersApp.SUCCESSFUL.value());
    //         }
    //     } catch (Exception e) {
    //         log.error("Error al guardar farmacia: " + e.getMessage());
    //         response.setStatus(ParametersApp.SERVER_ERROR.value());
    //     }
    //     return response;
    // }

    // //METODO PARA OBTENER TODAS LAS FARMACIAS
    // public GenericResponse<List<Farmacia>> getAllFarmacias() {
    //     GenericResponse<List<Farmacia>> response = new GenericResponse<>();
    //     try {
    //         List<Farmacia> farmacias = farmaciaRepository.listarFarmacias();
    //         response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
    //         response.setObject(farmacias);
    //         response.setStatus(ParametersApp.SUCCESSFUL.value());
    //     } catch (Exception e) {
    //         log.error("Error al obtener farmacias: " + e.getMessage());
    //         response.setStatus(ParametersApp.SERVER_ERROR.value());
    //     }
    //     return response;
    // }

    // //Listar todo
    // public GenericResponse<List<Farmacia>> listAll() {
	// 	GenericResponse<List<Farmacia>> response = new GenericResponse<>();
	// 	try {
	// 		response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
	//         response.setObject(farmaciaRepository.listarFarmacias());
	//         response.setStatus(ParametersApp.SUCCESSFUL.value());	
	// 	} catch (Exception e) {
	// 		log.error("ERROR: ",e.getStackTrace());
	// 		response.setStatus(ParametersApp.SERVER_ERROR.value());	
	// 	}
	// 	return response;
	// }

//    //listar todas las farmacias
//    public List<FarmSucursalDTO> listFarmacias() {
//        System.out.println("Entro a listar farmacias");
//		List<FarmSucursalDTO> listaFDTO = new ArrayList<>();
//		try {
//            System.out.println("Entro a listar farmacias 2");
//            List<FarmSucursalDTO> listaF = farmaciaRepository.getAllFarmacias();
//            System.out.println("listaF.size(); " + listaF.size()); 
//			farmaciaRepository.getAllFarmacias().forEach( farmacia-> {
//				FarmSucursalDTO dto = new FarmSucursalDTO();
//                dto.setId_farmacia(farmacia.getId_farmacia());
//                dto.setNombre_suc(farmacia.getNombre_suc());
//                dto.setCorreo_suc(farmacia.getCorreo_suc());
//                dto.setTelefono_suc(farmacia.getTelefono_suc());
//                dto.setDireccion_suc(farmacia.getDireccion_suc());
//                System.out.println("dto: "+dto.toString());
//                listaFDTO.add(dto);
//			});
//            System.out.println("listaFDTO: "+listaFDTO.toString());
//			return listaFDTO;
//		} catch (Exception e) {
//			log.error("ERROR AL LISTAR LAS FARMACIAS", e.getMessage(), e.getStackTrace());
//			return new ArrayList<FarmSucursalDTO>();
//		}
//	}
}
