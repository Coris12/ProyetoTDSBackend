/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.AnestesiaDto;
import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Anestesia;
import com.ProyectoTDSBackend.service.AnestesiaService;
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
@RequestMapping("/Anestesia")
@CrossOrigin(origins = "*")
public class AnestesiaController {

    @Autowired
    private AnestesiaService servicio;

    @PostMapping(path = "saveAnestesia")
    public ResponseEntity<GenericResponse<String>> saveAnestesia(@RequestBody Anestesia anest) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveAnes(anest), HttpStatus.OK);
    }

    @GetMapping("/detallesAnestesia/{id}")
    public ResponseEntity<Anestesia> getById(@PathVariable("id") Long id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Anestesia anes = servicio.getOne(id).get();
        return new ResponseEntity(anes, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de las historias clinicas")
    @CrossOrigin({"*"})
    @GetMapping("/listaDiagnostico")
    public ResponseEntity<List<Anestesia>> list() {
        List<Anestesia> list = servicio.list();
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
    public ResponseEntity<byte[]> generarPdf(Long idA) throws JRException, FileNotFoundException {
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(servicio.generarPdf(idA));
        if (beanCollectionDataSource.getData().size() > 0) {
            JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/Reports/FichaAnestecia.jrxml"));
            HashMap<String, Object> map = new HashMap<>();
            JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
            AnestesiaDto admis = servicio.generarPdf(idA).get(0);
            int idAn= admis.getIdAnes();
            byte[] data = JasperExportManager.exportReportToPdf(report);
            ContentDisposition contentDisposition = ContentDisposition.builder("attachment")
                    .filename("Ficha Anestesia" + idAn + "_" + generarCodigoAleatorio() + ".pdf")
                    .build();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentDisposition(contentDisposition);
            return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
