/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.EvolucionDTO;
import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Evolucion;
import com.ProyectoTDSBackend.service.EvolucionService;
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
@RequestMapping("/evoluciones")
@CrossOrigin(origins = "*")
public class EvolucionController {

    @Autowired
    private EvolucionService servicio;

    @PostMapping(path = "saveEvolucion")
    public ResponseEntity<GenericResponse<String>> saveEvolucion(@RequestBody Evolucion evolucion) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveMedicamento(evolucion), HttpStatus.OK);
    }

    @GetMapping("/detallesEvolucion/{id}")
    public ResponseEntity<Evolucion> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Evolucion evolucion = servicio.getOne(id).get();
        return new ResponseEntity(evolucion, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de evoluciones")
    @CrossOrigin({"*"})
    @GetMapping("/listaEvolucion")
    public ResponseEntity<List<Evolucion>> list() {
        List<Evolucion> list = servicio.list();
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
    public ResponseEntity<byte[]> generarPdf(String iden) throws JRException, FileNotFoundException {
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(servicio.generarPdf(iden));
        if (beanCollectionDataSource.getData().size() > 0) {
            JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/Reports/Evolucion.jrxml"));
            HashMap<String, Object> map = new HashMap<>();
            JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
            EvolucionDTO evolucionDTO = servicio.generarPdf(iden).get(0);
            int idEvo = evolucionDTO.getIdEvolucion();
            byte[] data = JasperExportManager.exportReportToPdf(report);
            ContentDisposition contentDisposition = ContentDisposition.builder("attachment")
                    .filename("Evolucion y Prescripcion" + idEvo + "_" + generarCodigoAleatorio() + ".pdf")
                    .build();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentDisposition(contentDisposition);
            return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
