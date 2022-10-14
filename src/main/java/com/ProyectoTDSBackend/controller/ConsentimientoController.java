package com.ProyectoTDSBackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.Exceptions.MessagExcepciones;
import com.ProyectoTDSBackend.dto.ConsentimientoDto;
import com.ProyectoTDSBackend.dto.ConsentimientoListDto;
import com.ProyectoTDSBackend.dto.ConsentimientoTraDto;
import com.ProyectoTDSBackend.dto.ConsentimientoTratamientoDto;
import com.ProyectoTDSBackend.models.Consentimiento;
import com.ProyectoTDSBackend.service.ConsentimientoService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/consentimiento")
@Tag(name = "ConsentimientoWs", description = "Control y mantenimiento de consentimiento")
public class ConsentimientoController {
    @Autowired
    private ConsentimientoService consentimientoService;

    @PostMapping(path = "/saveConsentimiento")
    public ResponseEntity<GenericResponse<String>> saveConsentimiento(@RequestBody ConsentimientoDto consentimiento) {
        return new ResponseEntity<GenericResponse<String>>(consentimientoService.saveConsentimiento(consentimiento),
                HttpStatus.OK);
    }

    @PutMapping(path = "/updateConsentimiento")
    public ResponseEntity<GenericResponse<String>> updateConsentimiento(@RequestBody ConsentimientoDto consentimientoDto) {
        return new ResponseEntity<GenericResponse<String>>(consentimientoService.updateConsentimiento(consentimientoDto),
                HttpStatus.OK);
    }

    @GetMapping(path = "/listAllConsentimientos")
    public ResponseEntity<GenericResponse<List<ConsentimientoListDto>>> listAllConsentimientos() {
        return new ResponseEntity<GenericResponse<List<ConsentimientoListDto>>>(consentimientoService.getListConsentimientos(),
                HttpStatus.OK);
    }
    
  //ELIMNAR CONSENTIMIENTO POR UPDATE.
    @PutMapping(path = "deleteConsentimiento")
    public ResponseEntity<GenericResponse<String>> deleteConsentimiento(@RequestParam("idConsentimiento") Integer idConsentimiento)  {
        return new ResponseEntity<GenericResponse<String>>(consentimientoService.eliminarConsentimiento(idConsentimiento), HttpStatus.OK);
    }
    
    @GetMapping(path = "/getOneConsentimientoById")
    public ResponseEntity<GenericResponse<Optional<ConsentimientoDto>>> getOneConsentimientoById(Integer idConsentimiento) {
        return new ResponseEntity<GenericResponse<Optional<ConsentimientoDto>>>(consentimientoService.getOneConsentimientoById(idConsentimiento),
                HttpStatus.OK);
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
    public ResponseEntity<byte[]> generarPdf(int idCon) throws JRException, FileNotFoundException {
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(consentimientoService.generarPdf(idCon));
        if (beanCollectionDataSource.getData().size() > 0) {
            JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/Reports/ConsentimientoInformado.jrxml"));
            HashMap<String, Object> map = new HashMap<>();
            JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
            ConsentimientoTraDto consentimientoDTO = consentimientoService.generarPdf(idCon).get(0);
            int idCo = consentimientoDTO.getId_consentimiento();
            byte[] data = JasperExportManager.exportReportToPdf(report);
            ContentDisposition contentDisposition = ContentDisposition.builder("attachment")
                    .filename("Consentimiento Informado" + idCo + "_" + generarCodigoAleatorio() + ".pdf")
                    .build();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentDisposition(contentDisposition);
            return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
