package com.ProyectoTDSBackend.service;

import java.util.Date;
import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProyectoTDSBackend.dto.ConstExternaListDTO;
import com.ProyectoTDSBackend.dto.ConsultaExternaByIdDTO;
import com.ProyectoTDSBackend.models.ConsultaExterna;
import com.ProyectoTDSBackend.repository.ConsultaExternaRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

@Service
public class ConsultaExternaService {
    private static final Logger log = LoggerFactory.getLogger(ConsultaExternaService.class);

    @Autowired
    private ConsultaExternaRepository consultaExternaRepository;

    @Transactional
    public GenericResponse<String> saveConsultaExterna(ConsultaExterna consultaExterna) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExterna != null) {
                consultaExternaRepository.save(consultaExterna);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(consultaExterna.getIdConsexterna().toString());
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("Consulta externa no guardada");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }

        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    // Obtener el máximo de historia clinica
    public GenericResponse<Integer> getMaxHistoriaClinica() {
        GenericResponse<Integer> response = new GenericResponse<>();
        try {
            Integer maxHistoriaClinica = consultaExternaRepository.getMaxHistoriaClinica();
            if (maxHistoriaClinica != null) {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(maxHistoriaClinica + 1);
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al obtener el máximo de historia clinica: " + e.getMessage());
            response.setMessage(ParametersApp.SERVER_ERROR.getReasonPhrase());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    // comprobar si existe un registro con el mismo número de historia clinica
    public GenericResponse<Integer> comprobarHistoriaClinica(int historiaClinica) {
        GenericResponse<Integer> response = new GenericResponse<>();
        try {
            Integer countHistoriaClinica = consultaExternaRepository.comprobarHistoriaClinica(historiaClinica);
            if (countHistoriaClinica != null) {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(countHistoriaClinica);
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al comprobar la historia clinica: " + e.getMessage());
            response.setMessage(ParametersApp.SERVER_ERROR.getReasonPhrase());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    // Obtener lista de consultas externas
    public GenericResponse<List<ConstExternaListDTO>> getConsultasExternas() {
        GenericResponse<List<ConstExternaListDTO>> response = new GenericResponse<>();
        try {
            // Iterable<ConsultaExterna> consultasExternas =
            // consultaExternaRepository.findAll();
            List<ConstExternaListDTO> consultasExternas = consultaExternaRepository.getConsultaExterna();
            if (consultasExternas != null) {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(consultasExternas);
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al obtener la lista de consultas externas: " + e.getMessage());
            response.setMessage(ParametersApp.SERVER_ERROR.getReasonPhrase());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    // Obtener una consulta externa por id
    public GenericResponse<ConsultaExternaByIdDTO> getConsultaExternaById(int idConExt) {
        GenericResponse<ConsultaExternaByIdDTO> response = new GenericResponse<>();
        try {
            ConsultaExternaByIdDTO consultaExternaByIdDTO = consultaExternaRepository.getConsultaExternaById(idConExt);
            if (consultaExternaByIdDTO != null) {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                
                System.out.println("Motivo consut: "+consultaExternaByIdDTO.getMotivoConsulta().getBytes().toString());

                response.setObject(consultaExternaByIdDTO);
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al obtener la consulta externa por id: " + e.getMessage());
            response.setMessage(ParametersApp.SERVER_ERROR.getReasonPhrase());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    public GenericResponse<String> updateConsultaExterna(String enfActual, String establecimiento, Date fecha, String motConsulta, String durConsulta, String nombreProfesional, int idConExt) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExternaRepository.findById((long) idConExt).isPresent()) {
                consultaExternaRepository.updateConsultaExterna(enfActual, establecimiento, fecha, motConsulta, durConsulta, nombreProfesional, idConExt);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(idConExt + " actualizado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO EXISTE ESTA CONSULTA EXTERNA");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //Actualizar antecedentes personales
    public GenericResponse<String> updateAntecedentesPersonales(String clinicos, String quirurgicos, int idConExt) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExternaRepository.findById((long) idConExt).isPresent()) {
                consultaExternaRepository.updateAntecPersonales(clinicos, quirurgicos, idConExt);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(idConExt + " actualizado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO EXISTE ESTA CONSULTA EXTERNA");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //Actualizar antecedentes familiares
    public GenericResponse<String> updateAntecedentesFamiliares(boolean cancer, boolean cardiopatia, boolean diabetes, boolean enfCardio, boolean enfInfec, boolean enfMental, String familiares, boolean hipertension, boolean malformaciones, boolean otros, boolean tuberculosis, int idConExt) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExternaRepository.findById((long) idConExt).isPresent()) {
                consultaExternaRepository.updateAntecFamiliares(cancer, cardiopatia, diabetes, enfCardio, enfInfec, enfMental, familiares, hipertension, malformaciones, otros, tuberculosis, idConExt);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(idConExt + " actualizado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO EXISTE ESTA CONSULTA EXTERNA");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //Actualizar revision de organos del sentido 
    public GenericResponse<String> updateRevisionOrganos(String cardiovascular, String descripcion, String digestivo, String endocrino, String genital, String hemolenfatico, String musEsq, String nervioso, String orgSen, String respiratorio, String urinario, int idConExt){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExternaRepository.findById((long) idConExt).isPresent()) {
                consultaExternaRepository.updateRevOrganosSistema(cardiovascular, descripcion, digestivo, endocrino, genital, hemolenfatico, musEsq, nervioso, orgSen, respiratorio, urinario, idConExt);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(idConExt + " actualizado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO EXISTE ESTA CONSULTA EXTERNA");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //Actualizar signos vitales
    public GenericResponse<String> updateSignosVitales(Date fechaMed, int freResp, double peso, String preArt, int pulso, double talla, double temp, int idConExt){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExternaRepository.findById((long) idConExt).isPresent()) {
                consultaExternaRepository.updateSigVitAntropometria(fechaMed, freResp, peso, preArt, pulso, talla, temp, idConExt);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(idConExt + " actualizado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO EXISTE ESTA CONSULTA EXTERNA");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //Actualizar Examen fisico regional
    public GenericResponse<String> updateExamenFisicoRegional(String abdomen, String cabeza, String cuello, String extremidades, String observaciones, String pelvis, String torax, int idConExt){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExternaRepository.findById((long) idConExt).isPresent()) {
                consultaExternaRepository.updateExamFisicoRegional(abdomen, cabeza, cuello, extremidades, observaciones, pelvis, torax, idConExt);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(idConExt + " actualizado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO EXISTE ESTA CONSULTA EXTERNA");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    // Actualizar diagnostico
    public GenericResponse<String> updateDiagnostico(String cie, String desDiag, String desPreDef, String desPreDefCie, String desPreDefPreDef, String preDef, int idConExt){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExternaRepository.findById((long) idConExt).isPresent()) {
                consultaExternaRepository.updateDiagnostico(cie, desDiag, desPreDef, desPreDefCie, desPreDefPreDef, preDef, idConExt);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(idConExt + " actualizado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO EXISTE ESTA CONSULTA EXTERNA");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    // Actualizar update plan tratamiento
    public GenericResponse<String> updatePlanTratamiento(String c, String i, String l, String m, String o, String r, String t, int idConExt){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExternaRepository.findById((long) idConExt).isPresent()) {
                consultaExternaRepository.updatePlanTratamiento(c, i, l, m, o, r, t, idConExt);;
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(idConExt + " actualizado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO EXISTE ESTA CONSULTA EXTERNA");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    // update estado consulta externa
    public GenericResponse<String> updateEstadoConsultaExterna(int idConExt){
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if (consultaExternaRepository.findById((long) idConExt).isPresent()) {
                consultaExternaRepository.updateEstadoConsultaExterna(idConExt);
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(idConExt + " estado actualizado");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            } else {
                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject("NO EXISTE ESTA CONSULTA EXTERNA");
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }
        } catch (Exception e) {
            log.error("Error al guardar la consulta externa: " + e.getMessage());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //generar pdf
    public List<ConsultaExternaByIdDTO> generarPdf(Long idConExt){
        List<ConsultaExternaByIdDTO> generaPdf = consultaExternaRepository.generarPdfConsultaExterna(idConExt);
        return generaPdf;
    }
}
