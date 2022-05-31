package com.ProyectoTDSBackend.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;

import com.ProyectoTDSBackend.dto.FactConsFinalDTO;
import com.ProyectoTDSBackend.dto.FacturaDatosDTO;
import com.ProyectoTDSBackend.models.Factura;
import com.ProyectoTDSBackend.service.FacturaService;
import com.ProyectoTDSBackend.util.GenericResponse;

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

import io.swagger.v3.oas.annotations.tags.Tag;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/factura")
@Tag(name = "FacturaWS", description = "Control y mantenimiento de factura")
public class FacturaController {

    @Autowired
    private FacturaService servicio;

    // Guardar factura
    @PostMapping(path = "/saveFactura")
    public ResponseEntity<GenericResponse<String>> saveFactura(@RequestBody Factura factura) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveFactura(factura), HttpStatus.OK);
    }

    // Listar todas las facturas
    @GetMapping(path = "/getAllFacturas")
    public ResponseEntity<GenericResponse<List<Factura>>> getAllFacturas() {
        return new ResponseEntity<GenericResponse<List<Factura>>>(servicio.getAllFacturas(), HttpStatus.OK);
    }

    // Metodo generar codigos aleatorios
    public String generarCodigoAleatorio() {
        String codigo = "";
        for (int i = 0; i < 10; i++) {
            codigo += (int) (Math.random() * 10);
        }
        return codigo;
    }

    // generar reporte de factura de usuarios y consumidor final
    @GetMapping(path = "/generarPdfUsuario")
    public ResponseEntity<byte[]> generarPdfFacturaUsuario(@RequestParam Long idFactura)
            throws JRException, FileNotFoundException {
        JRBeanCollectionDataSource beanCollectionDataSource = new JRBeanCollectionDataSource(
                servicio.getFacturacionPdfUsuario(idFactura));
        if (beanCollectionDataSource.getData().size() > 0) {
            JasperReport compileReport = JasperCompileManager
                    .compileReport(new FileInputStream("src/main/resources/Reports/ReporteFarmacia.jrxml"));

            HashMap<String, Object> map = new HashMap<>();
            JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource);
            FacturaDatosDTO facturaDatosDTO = servicio.getFacturacionPdfUsuario(idFactura).get(0);
            int idF = facturaDatosDTO.getId_factura();
            String nombres = facturaDatosDTO.getNombres();
            String extaerHora = facturaDatosDTO.getFecha().toString();
            String hora = extaerHora.substring(11, 19);
            String fecha = extaerHora.substring(0, 10);

            byte[] data = JasperExportManager.exportReportToPdf(report);
            ContentDisposition contentDisposition = ContentDisposition.builder("attachment")
                    .filename("Factura_" + idF + "_" + nombres + "_" + fecha + " h" + hora + "_"
                            + generarCodigoAleatorio() + ".pdf")
                    .build();
            HttpHeaders headers = new HttpHeaders();
            headers.setContentDisposition(contentDisposition);
            return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
        } else {
            JRBeanCollectionDataSource beanCollectionDataSource2 = new JRBeanCollectionDataSource(
                    servicio.getFacturacionPdfConsFinal(idFactura));
            if (beanCollectionDataSource2.getData().size() > 0) {
                JasperReport compileReport = JasperCompileManager
                        .compileReport(new FileInputStream("src/main/resources/Reports/pdfConsFinalFarmacia.jrxml"));

                HashMap<String, Object> map = new HashMap<>();
                JasperPrint report = JasperFillManager.fillReport(compileReport, map, beanCollectionDataSource2);
                FactConsFinalDTO faConsFin = servicio.getFacturacionPdfConsFinal(idFactura).get(0);
                Long idF = faConsFin.getIdFactura();
                String extaerHora = faConsFin.getFecha().toString();
                String hora = extaerHora.substring(11, 19);
                String fecha = extaerHora.substring(0, 10);

                byte[] data = JasperExportManager.exportReportToPdf(report);
                ContentDisposition contentDisposition = ContentDisposition.builder("attachment")
                        .filename("Factura_" + idF + "CONSUMIDORFINAL_" + fecha + " h" + hora + "_"
                                + generarCodigoAleatorio() + ".pdf")
                        .build();
                HttpHeaders headers = new HttpHeaders();
                headers.setContentDisposition(contentDisposition);
                return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
            }else{
                System.out.println("No hay datos");
                return null;
            }
        }
    }
}
