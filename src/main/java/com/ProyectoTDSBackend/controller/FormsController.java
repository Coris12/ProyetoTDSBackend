/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.FormDto;
import com.ProyectoTDSBackend.dto.FormularioDto;
import com.ProyectoTDSBackend.models.Formulario;
import com.ProyectoTDSBackend.service.FormService;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 *
 * @author corin
 */
@RestController
@RequestMapping("/formulario")
@CrossOrigin({"*"})
public class FormsController {
     @Autowired
    private FormService servicio;

      @PostMapping(path = "saveForm")
    public ResponseEntity<GenericResponse<String>> saveFormulario(@RequestBody Formulario form) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveFormulario(form), HttpStatus.OK);
    }
    
    @ApiOperation("Muestra una lista de los formularios")
    @CrossOrigin({"*"})
    @GetMapping("/listaForms")
    public ResponseEntity<List<Formulario>> list() {
        List<Formulario> list = servicio.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    
    @ApiOperation("Recibe la id de convocatoria para mostrar estudiantes asignados")
    @CrossOrigin({"*"})
    @GetMapping("/getByIdUsuario")
    public List<Formulario> getByIdConvocatoria(@RequestParam(value = "id") Long id) {
        return servicio.getbyidconvocatoria(id);
    }
    @ApiIgnore
     @GetMapping(path = "/getFormularioById")
    public ResponseEntity<GenericResponse<FormularioDto>> getFormularioById(long idFor) {
        return new ResponseEntity<GenericResponse<FormularioDto>>(servicio.getFormularioById(idFor), HttpStatus.OK);
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
    public ResponseEntity<byte[]> generarPdf(Long idForm) throws JRException, FileNotFoundException {
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(servicio.generarPdf(idForm));
        if (beanCollectionDataSource.getData().size() > 0) {
            JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/Reports/ReporteFormulario.jrxml"));
            HashMap<String, Object> map = new HashMap<>();
            JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
            FormDto form = servicio.generarPdf(idForm).get(0);
            int idA = form.getIdForm();
            byte[] data = JasperExportManager.exportReportToPdf(report);
            ContentDisposition contentDisposition = ContentDisposition.builder("attachment")
                    .filename("Formulario" + idA + "_" + generarCodigoAleatorio() + ".pdf")
                    .build();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentDisposition(contentDisposition);
            return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

