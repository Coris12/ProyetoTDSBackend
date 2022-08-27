package com.ProyectoTDSBackend.service;

import java.util.List;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoTDSBackend.Exceptions.MessagExcepciones;
import com.ProyectoTDSBackend.dto.ConsentimientoDto;
import com.ProyectoTDSBackend.dto.InformacionTratamientoDTO;
import com.ProyectoTDSBackend.models.InformacionTratamiento;
import com.ProyectoTDSBackend.repository.InformacionTratamientoRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class InformacionTratamientoService {

    private static final Logger log = LoggerFactory.getLogger(InformacionTratamientoService.class);

    @Autowired
    private InformacionTratamientoRepository informacionTratamientoRepository;

    @Transactional(rollbackFor = { MessagExcepciones.class })
    public GenericResponse<String> saveInformacionTratamiento(InformacionTratamientoDTO informacionTratamiento) throws MessagExcepciones {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (informacionTratamiento.getIdConsentimientoFK()== null || informacionTratamiento.getIdConsentimientoFK() == 0 ) {
                response.setMessage("ERROR AL INTENTAR GUARDAR INFORMACIÓN TRATAMIENTO ID NULO O CERO");
                response.setObject(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
                response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
                log.error("ID CONSENTIMIENTOFK NO PUEDE SER NULO");
                throw new MessagExcepciones("TRANSACTIONAL USUARIO ERROR EN EL ID ROLLBACKFOR");
            }
            
            InformacionTratamiento infoTrat = new InformacionTratamiento();
            infoTrat.setIdConsentimientoFK(informacionTratamiento.getIdConsentimientoFK());
            infoTrat.setProposito(informacionTratamiento.getProposito());
            infoTrat.setProcedimientoPropuesto(informacionTratamiento.getProcedimientoPropuesto());
            infoTrat.setResultadoEsperado(informacionTratamiento.getResultadoEsperado());
            infoTrat.setRiesgoComplicaciones(informacionTratamiento.getRiesgoComplicaciones());
            infoTrat.setNombreProfesionalTrat(informacionTratamiento.getNombreProfesionalTrat());
            infoTrat.setEspecialidad(informacionTratamiento.getEspecialidad());
            infoTrat.setTelefono(informacionTratamiento.getTelefono());
            infoTrat.setCodigo(informacionTratamiento.getCodigo());

            informacionTratamientoRepository.save(infoTrat);
            response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
            response.setObject("INFORMACION TRATAMIENTO GUARDADO!");
            response.setStatus(ParametersApp.SUCCESSFUL.value());
        } catch (Exception e) {
            log.error("ERROR AL GUARDAR INFORMACION TRATAMIENTO");
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }
    
    public GenericResponse<List<InformacionTratamientoDTO>> getAllInformacionTratamientoById(Integer idConsentimientoFk) {
        GenericResponse<List<InformacionTratamientoDTO>> response = new GenericResponse<>();
        try {
        	
        	if(idConsentimientoFk == null) {
        		log.error("ID NULO!");
                response.setMessage("ID NO PUEDE SER NULO");
                response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
                return response; 
        	}
        	
        	if(!informacionTratamientoRepository.existsById(idConsentimientoFk)) {
        		log.error("NO EXISTE INFORMACION CON ESE ID!");
                response.setMessage("NO EXISTE ESA INFORMACION");
                response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
                return response; 
        	}
        	
            List<InformacionTratamientoDTO> consentimiento = informacionTratamientoRepository.getAllDatosOnlyInformacionTratamientoById(idConsentimientoFk);
            if (Objects.isNull(consentimiento) || !consentimiento.isEmpty()) {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(consentimiento);
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                log.error("NO SE ENCONTRARON REGISTROS!");
                response.setMessage("NO SE ENCONTRARON REGISTROS");
                response.setStatus(ParametersApp.EMPTY_RECORD.value());
            }
        } catch (Exception e) {
            log.error("Error: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());

        }
        return response;
    }
    
    public GenericResponse<String> updateConsentimientoTratamiento(InformacionTratamientoDTO informacionTratamientoDTO) {
		GenericResponse<String> response = new GenericResponse<>();

		try {
			if(informacionTratamientoDTO.getIdInfTrat()==null || informacionTratamientoDTO.getIdInfTrat()==0) {
				log.error("ID TRATAMIENTO NULO");
				response.setMessage("NO SE PUEDO EDITAR EL TRATAMIENTO DE CONSENTIMIENTO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				response.setObject(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
				return response;
			}
			
			if(informacionTratamientoDTO.getIdConsentimientoFK()==null || informacionTratamientoDTO.getIdConsentimientoFK()==0) {
				log.error("ID CONSENTIMIENTO FK ES NULO");
				response.setMessage("NO SE PUEDO EDITAR EL TRATAMIENTO DE CONSENTIMIENTO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				response.setObject(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
				return response;
			}
			
			if (!informacionTratamientoRepository.existsById(informacionTratamientoDTO.getIdInfTrat())) {
				log.error("NO EXISTE UN TRATAMIENTO DE CONSENTIMIENTO CON ESE ID");
				response.setMessage("NO SE PUEDO EDITAR EL TRATAMIENTO DE CONSENTIMIENTO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				response.setObject(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
				return response;
			}
			
			InformacionTratamiento tratamiento = new InformacionTratamiento(); 
			tratamiento.setIdInfTrat(informacionTratamientoDTO.getIdInfTrat());
			tratamiento.setCodigo(informacionTratamientoDTO.getCodigo());
			tratamiento.setEspecialidad(informacionTratamientoDTO.getEspecialidad());
			tratamiento.setIdConsentimientoFK(informacionTratamientoDTO.getIdConsentimientoFK());
			tratamiento.setNombreProfesionalTrat(informacionTratamientoDTO.getNombreProfesionalTrat());
			tratamiento.setProcedimientoPropuesto(informacionTratamientoDTO.getNombreProfesionalTrat());
			tratamiento.setProcedimientoPropuesto(informacionTratamientoDTO.getProcedimientoPropuesto());
			tratamiento.setProposito(informacionTratamientoDTO.getProposito());
			tratamiento.setResultadoEsperado(informacionTratamientoDTO.getResultadoEsperado());
			tratamiento.setRiesgoComplicaciones(informacionTratamientoDTO.getRiesgoComplicaciones());
			tratamiento.setTelefono(informacionTratamientoDTO.getTelefono());
			informacionTratamientoRepository.save(tratamiento);
			response.setMessage("EDITADO CORRECTAMENTE CONSENTIMIENTO TRATAMIENTO");
			response.setObject(ParametersApp.SUCCESSFUL.getReasonPhrase());
			response.setStatus(ParametersApp.SUCCESSFUL.value());
		} catch (Exception e) {
			log.error("Error: " + e.getMessage());
			response.setStatus(ParametersApp.SERVER_ERROR.value());
		}
		return response;
	}
}
