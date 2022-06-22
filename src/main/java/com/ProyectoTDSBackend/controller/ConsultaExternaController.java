package com.ProyectoTDSBackend.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.dto.ConstExternaListDTO;
import com.ProyectoTDSBackend.dto.ConsultaExternaByIdDTO;
import com.ProyectoTDSBackend.models.ConsultaExterna;
import com.ProyectoTDSBackend.service.ConsultaExternaService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@CrossOrigin
@RestController
@RequestMapping(path = "consultaExterna")
@Tag(name = "ConsultaExternaWS", description = "Control y mantenimiento de consulta externa")
public class ConsultaExternaController {
    
    @Autowired
	private ConsultaExternaService servicio;

    @PostMapping(path = "saveConsultaExterna")
    public ResponseEntity<GenericResponse<String>> saveConsultaExterna(@RequestBody ConsultaExterna consultaExterna) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveConsultaExterna(consultaExterna), HttpStatus.OK);
    }

    //Obtener el máximo de historia clinica
    @GetMapping(path = "getMaxHistoriaClinica")
    public ResponseEntity<GenericResponse<Integer>> getMaxHistoriaClinica() {
        return new ResponseEntity<GenericResponse<Integer>>(servicio.getMaxHistoriaClinica(), HttpStatus.OK);
    }

    //comprobar si existe un registro con el mismo número de historia clinica
    @GetMapping(path = "comprobarHistoriaClinica")
    public ResponseEntity<GenericResponse<Integer>> comprobarHistoriaClinica(int historiaClinica) {
        return new ResponseEntity<GenericResponse<Integer>>(servicio.comprobarHistoriaClinica(historiaClinica), HttpStatus.OK);
    }

    //listar todos los registros de consulta externa
    @GetMapping(path = "getConsultaExterna")
    public ResponseEntity<GenericResponse<List<ConstExternaListDTO>>> getConsultaExterna() {
        return new ResponseEntity<GenericResponse<List<ConstExternaListDTO>>>(servicio.getConsultasExternas(), HttpStatus.OK);
    }

    //consulta externa por id
    @GetMapping(path = "getConsultaExternaById")
    public ResponseEntity<GenericResponse<ConsultaExternaByIdDTO>> getConsultaExternaById(int idConExt) {
        return new ResponseEntity<GenericResponse<ConsultaExternaByIdDTO>>(servicio.getConsultaExternaById(idConExt), HttpStatus.OK);
    }

    //actualizar consulta externa
    @PutMapping(path = "updateConsultaExterna")
    public ResponseEntity<GenericResponse<String>> updateConsultaExterna(@RequestParam String enfActual, String establecimiento, @RequestParam("fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fecha, String motConsulta, String durConsulta, String nombreProfesional, int idConExt) {
        return new ResponseEntity<GenericResponse<String>>(servicio.updateConsultaExterna(enfActual, establecimiento, fecha, motConsulta, durConsulta, nombreProfesional, idConExt), HttpStatus.OK);
    }

    //Actualizar antecedentes personales
    @PutMapping(path = "updateAntecedentesPersonales")
    public ResponseEntity<GenericResponse<String>> updateAntecedentesPersonales(String clinicos, String quirurgicos, int idConExt) {
        return new ResponseEntity<GenericResponse<String>>(servicio.updateAntecedentesPersonales(clinicos, quirurgicos, idConExt), HttpStatus.OK);
    }

    //Actualizar antecedentes familiares
    @PutMapping(path = "updateAntecedentesFamiliares")
    public ResponseEntity<GenericResponse<String>> updateAntecedentesFamiliares(boolean cancer, boolean cardiopatia, boolean diabetes, boolean enfCardio, boolean enfInfec, boolean enfMental, String familiares, boolean hipertension, boolean malformaciones, boolean otros, boolean tuberculosis, int idConExt) {
        return new ResponseEntity<GenericResponse<String>>(servicio.updateAntecedentesFamiliares(cancer, cardiopatia, diabetes, enfCardio, enfInfec, enfMental, familiares, hipertension, malformaciones, otros, tuberculosis, idConExt), HttpStatus.OK);
    }

    //Actualizar revision de organos del sentido 
    @PutMapping(path = "updateRevisionOrganosSentido")
    public ResponseEntity<GenericResponse<String>> updateRevisionOrganosSentido(String cardiovascular, String descripcion, String digestivo, String endocrino, String genital, String hemolenfatico, String musEsq, String nervioso, String orgSen, String respiratorio, String urinario, int idConExt){
        return new ResponseEntity<GenericResponse<String>>(servicio.updateRevisionOrganos(cardiovascular, descripcion, digestivo, endocrino, genital, hemolenfatico, musEsq, nervioso, orgSen, respiratorio, urinario, idConExt), HttpStatus.OK);
    }

    //Actualizar signos vitales
    @PutMapping(path = "updateSignosVitales")
    public ResponseEntity<GenericResponse<String>> updateSignosVitales(@RequestParam("fechaMed") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaMed , int freResp, double peso, String preArt, int pulso, double talla, double temp, int idConExt){
        return new ResponseEntity<GenericResponse<String>>(servicio.updateSignosVitales(fechaMed, freResp, peso, preArt, pulso, talla, temp, idConExt), HttpStatus.OK);
    }

    //Actualizar Examen fisico regional
    @PutMapping(path = "updateExamenFisicoRegional")
    public ResponseEntity<GenericResponse<String>> updateExamenFisicoRegional(String abdomen, String cabeza, String cuello, String extremidades, String observaciones, String pelvis, String torax, int idConExt){
        return new ResponseEntity<GenericResponse<String>>(servicio.updateExamenFisicoRegional(abdomen, cabeza, cuello, extremidades, observaciones, pelvis, torax, idConExt), HttpStatus.OK);
    }

    //Actualizar diagnostico
    @PutMapping(path = "updateDiagnostico")
    public ResponseEntity<GenericResponse<String>> updateDiagnostico(String cie, String desDiag, String desPreDef, String desPreDefCie, String desPreDefPreDef, String preDef, int idConExt){
        return new ResponseEntity<GenericResponse<String>>(servicio.updateDiagnostico(cie, desDiag, desPreDef, desPreDefCie, desPreDefPreDef, preDef, idConExt), HttpStatus.OK);
    }

    //Actualizar tratamiento
    @PutMapping(path = "updateTratamiento")
    public ResponseEntity<GenericResponse<String>> updateTratamiento(String c, String i, String l, String m, String o, String r, String t, int idConExt){
        return new ResponseEntity<GenericResponse<String>>(servicio.updatePlanTratamiento(c, i, l, m, o, r, t, idConExt), HttpStatus.OK);
    }

    //Actualizar estado de consulta externa
    @PutMapping(path = "updateEstadoConsultaExterna")
    public ResponseEntity<GenericResponse<String>> updateEstadoConsultaExterna(int idConExt){
        return new ResponseEntity<GenericResponse<String>>(servicio.updateEstadoConsultaExterna(idConExt), HttpStatus.OK);
    }

    // Metodo generar codigos aleatorios
    public String generarCodigoAleatorio() {
        String codigo = "";
        for (int i = 0; i < 10; i++) {
            codigo += (int) (Math.random() * 10);
        }
        return codigo;
    } 

    // Generar pdf
    @GetMapping(path = "generarPdf")
    public ResponseEntity<byte[]> generarPdf(long idConExt) throws JRException, FileNotFoundException {
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(servicio.generarPdf(idConExt));
        if (beanCollectionDataSource.getData().size() > 0) {
            JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/Reports/ExamExternoAnamnesis.jrxml"));
                    HashMap<String, Object> map = new HashMap<>();
                    JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
                    ConsultaExternaByIdDTO consultaExternaByIdDTO = servicio.generarPdf(idConExt).get(0);
                    int idCE = consultaExternaByIdDTO.getIdConsexterna(); 
                    byte[] data = JasperExportManager.exportReportToPdf(report);
                    ContentDisposition contentDisposition = ContentDisposition.builder("attachment")
                    .filename("CONSULTA_EXTERNA" + idCE + "_" + generarCodigoAleatorio() + ".pdf")
                    .build();
                    HttpHeaders headers = new HttpHeaders();
            headers.setContentDisposition(contentDisposition);
            return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}

