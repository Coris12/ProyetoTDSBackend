package com.ProyectoTDSBackend.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoTDSBackend.Exceptions.MessagExcepciones;
import com.ProyectoTDSBackend.dto.ConsentimientoDto;
import com.ProyectoTDSBackend.dto.ConsentimientoListDto;
import com.ProyectoTDSBackend.dto.ConsentimientoTraDto;
import com.ProyectoTDSBackend.dto.ConsentimientoTratamientoDto;
import com.ProyectoTDSBackend.models.Consentimiento;
import com.ProyectoTDSBackend.repository.ConsentimientoRepository;
import com.ProyectoTDSBackend.repository.InformacionTratamientoRepository;
import com.ProyectoTDSBackend.security.repository.UsuarioRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class ConsentimientoService {

	private static final Logger log = LoggerFactory.getLogger(ConsentimientoService.class);

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private ConsentimientoRepository consentimientoRepository;

	@Autowired
	private InformacionTratamientoRepository informacionTratamientoRepository;

	@Transactional(rollbackFor = { MessagExcepciones.class })
	public GenericResponse<String> saveConsentimiento(ConsentimientoDto consentimientoDto) {
		GenericResponse<String> response = new GenericResponse<>();
		try {

			if (consentimientoDto == null) {
				response.setMessage("EL OBJETO ESTA VACÍO, NADA PARA GUARDAR");
				response.setObject("CONSENTIMIENTO NO GUARDADO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				return response;
			}

			if (consentimientoDto.getIdUsuario() == null || consentimientoDto.getIdUsuario() == 0) {
				response.setMessage("ID USUARIO ES NULO O CERO");
				response.setObject("CONSENTIMIENTO NO GUARDADO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				return response;
			}

			if (!usuarioRepository.existsById(consentimientoDto.getIdUsuario())) {
				response.setMessage("NO EXISTE UN USUARIO CON ESTE ID");
				response.setObject("CONSENTIMIENTO NO GUARDADO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				return response;
			}

			Consentimiento consentimiento = new Consentimiento();
			consentimiento.setCama(consentimientoDto.getCama());
			consentimiento.setCanton(consentimientoDto.getCanton());
			consentimiento.setCodUd(consentimientoDto.getCodUd());
			consentimiento.setEstado('a');
			consentimiento.setFecha(consentimientoDto.getFecha());
			consentimiento.setInstutucionSistema(consentimientoDto.getInstutucionSistema());
			consentimiento.setNumeroHistoriaClinica(consentimientoDto.getNumeroHistoriaClinica());
			consentimiento.setParroquia(consentimientoDto.getParroquia());
			consentimiento.setProvincia(consentimientoDto.getProvincia());
			consentimiento.setSala(consentimientoDto.getSala());
			consentimiento.setServicio(consentimientoDto.getServicio());
			consentimiento.setUnidadOperativa(consentimientoDto.getUnidadOperativa());
			consentimiento.setIdUsuario(consentimientoDto.getIdUsuario());
			consentimientoRepository.save(consentimiento);

			response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
			response.setObject(consentimiento.getIdConsentimiento().toString());
			response.setStatus(ParametersApp.SUCCESSFUL.value());
		} catch (Exception e) {
			log.error("Error al guardar Consentimiento: " + e.getMessage());
			response.setStatus(ParametersApp.SERVER_ERROR.value());
		}
		return response;
	}

	public GenericResponse<List<ConsentimientoListDto>> getListConsentimientos() {
		GenericResponse<List<ConsentimientoListDto>> response = new GenericResponse<>();
		try {
			List<ConsentimientoListDto> consentimiento = consentimientoRepository.listDataConsentimiento();
			if (consentimiento != null) {
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

	public GenericResponse<String> updateConsentimiento(ConsentimientoDto consentimientoDto) {
		GenericResponse<String> response = new GenericResponse<>();

		try {
			if(consentimientoDto.getIdConsentimiento()==null || consentimientoDto.getIdConsentimiento()==0) {
				log.error("IDCONSENTIMIENTO NULO");
				response.setMessage("NO SE PUEDO EDITAR EL CONSENTIMIENTO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				response.setObject(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
				return response;
			}
			if (!consentimientoRepository.existsById(consentimientoDto.getIdConsentimiento())) {
				log.error("NO EXISTE UN CONSENTIMIENTO POR ESE ID");
				response.setMessage("NO SE PUEDO EDITAR EL CONSENTIMIENTO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				response.setObject(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
				return response;
			}
			
			if(consentimientoDto.getIdUsuario()==null || consentimientoDto.getIdUsuario()==0) {
				log.error("IDUSUARIO NO PUEDE SER NULO");
				response.setMessage("NO EXISTE UN ID PARA USUARIO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				response.setObject(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
				return response;
			}
			// consentimientoRepository.findById(consentimientoDto.getIdConsentimiento()).get();
			Consentimiento consentimiento = new Consentimiento();
			consentimiento.setIdConsentimiento(consentimientoDto.getIdConsentimiento());
			consentimiento.setIdUsuario(consentimientoDto.getIdUsuario());
			consentimiento.setCama(consentimientoDto.getCama());
			consentimiento.setCanton(consentimientoDto.getCanton());
			consentimiento.setCodUd(consentimientoDto.getCodUd());
			consentimiento.setEstado('a');
			consentimiento.setFecha(consentimientoDto.getFecha());
			consentimiento.setInstutucionSistema(consentimientoDto.getInstutucionSistema());
			consentimiento.setNumeroHistoriaClinica(consentimientoDto.getNumeroHistoriaClinica());
			consentimiento.setParroquia(consentimientoDto.getParroquia());
			consentimiento.setProvincia(consentimientoDto.getProvincia());
			consentimiento.setSala(consentimientoDto.getSala());
			consentimiento.setServicio(consentimientoDto.getServicio());
			consentimiento.setUnidadOperativa(consentimientoDto.getUnidadOperativa());
			consentimientoRepository.save(consentimiento);
			response.setMessage("EDITADO CORRECTAMENTE CONSENTIMIENTO");
			response.setObject(ParametersApp.SUCCESSFUL.getReasonPhrase());
			response.setStatus(ParametersApp.SUCCESSFUL.value());
		} catch (Exception e) {
			log.error("Error: " + e.getMessage());
			response.setStatus(ParametersApp.SERVER_ERROR.value());
		}
		return response;
	}

	public GenericResponse<String> eliminarConsentimiento(Integer idConsentimiento) {
		GenericResponse<String> response = new GenericResponse<>();
		try {
			if (idConsentimiento == null || idConsentimiento == 0) {
				response.setMessage("ID NULO O CERO");
				response.setObject(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				return response;
			}

			if (!consentimientoRepository.existsById(idConsentimiento)) {
				response.setMessage("NO EXISTE UN CONCENTIMIENTO CON ESE ID");
				response.setObject(ParametersApp.PROCESS_NOT_COMPLETED.getReasonPhrase());
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				return response;
			}

			consentimientoRepository.deleteUpdateConsentimiento(idConsentimiento);
			response.setMessage("CONSENTIMIENTO ELIMINADO");
			response.setObject(ParametersApp.SUCCESSFUL.getReasonPhrase());
			response.setStatus(ParametersApp.SUCCESSFUL.value());

		} catch (Exception e) {
			response.setStatus(ParametersApp.SERVER_ERROR.value());
			log.error("ERROR", e);
		}
		return response;
	}

	public GenericResponse<Optional<ConsentimientoDto>> getOneConsentimientoById(Integer idConsentimiento) {
		GenericResponse<Optional<ConsentimientoDto>> response = new GenericResponse<>();
		try {

			if (idConsentimiento == null) {
				log.error("ID NULO!");
				response.setMessage("ID NO PUEDE SER NULO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				return response;
			}

			if (!consentimientoRepository.existsById(idConsentimiento)) {
				log.error("NO EXISTE UN CONSENTIMIENTO CON ESE ID!");
				response.setMessage("NO EXISTE ESE CONSENTIMIENTO");
				response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
				return response;
			}

			Optional<ConsentimientoDto> consentimiento = consentimientoRepository
					.getAllDatosOnlyConsentimientoById(idConsentimiento);
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
        
          public List<ConsentimientoTraDto> generarPdf(int idCon){
        List<ConsentimientoTraDto> generaPdf = consentimientoRepository.generarPdfConsentimiento(idCon);
        return generaPdf;
    }
}
