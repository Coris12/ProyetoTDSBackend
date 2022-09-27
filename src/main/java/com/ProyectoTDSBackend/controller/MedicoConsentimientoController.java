/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.ConsentimientoMeDTO;
import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.MedicoConsentimiento;
import com.ProyectoTDSBackend.service.MedicoConsentimientoService;
import com.ProyectoTDSBackend.util.GenericResponse;
import io.swagger.annotations.ApiOperation;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author corin
 */

@RestController
@RequestMapping("/consentimientoMedico")
@CrossOrigin(origins = "*")
public class MedicoConsentimientoController {
    @Autowired
    private MedicoConsentimientoService servicio;
      @PostMapping(path = "saveConsentimientoMedico")
    public ResponseEntity<GenericResponse<String>> saveConsentimientoM(@RequestBody MedicoConsentimiento medico) {
        medico.setEstado(1);
        return new ResponseEntity<GenericResponse<String>>(servicio.saveMedicoCon(medico), HttpStatus.OK);
    }

    @GetMapping("/detallesConsenti/{id}")
    public ResponseEntity<MedicoConsentimiento> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        MedicoConsentimiento medi = servicio.getOne(id).get();
        return new ResponseEntity(medi, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de evoluciones")
    @CrossOrigin({"*"})
    @GetMapping("/listaConsen")
    public ResponseEntity<List<MedicoConsentimiento>> list() {
        List<MedicoConsentimiento> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
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
    public ResponseEntity<byte[]> generarPdf(int idme) throws JRException, FileNotFoundException {
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(servicio.generarPdf(idme));
        if (beanCollectionDataSource.getData().size() > 0) {
            JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/Reports/ConsentimientoMedico.jrxml"));
            HashMap<String, Object> map = new HashMap<>();
            JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
            ConsentimientoMeDTO ConDTO = servicio.generarPdf(idme).get(0);
            int idCo = ConDTO.getIdMediC();
            byte[] data = JasperExportManager.exportReportToPdf(report);
            ContentDisposition contentDisposition = ContentDisposition.builder("attachment")
                    .filename("COnsentimiento medico" + idCo + "_" + generarCodigoAleatorio() + ".pdf")
                    .build();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentDisposition(contentDisposition);
            return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
