/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.DatosTarjetaAllDTO;
import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Tarjeta;
import com.ProyectoTDSBackend.security.repository.UsuarioRepository;
import com.ProyectoTDSBackend.service.TarjetaService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author corin
 */
@RestController
@RequestMapping("/tarjeta")
@CrossOrigin({ "*" })
public class TarjetaController {

    //
    private final String imagePath = "src/main/resources/ImgQR/QRCode.png";

    @Autowired
    private TarjetaService servicio;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @ApiOperation("Crea la tarjeta")
    @PostMapping("/creaTarjeta")
    public ResponseEntity<?> create(@RequestBody DatosTarjetaAllDTO tarjeta,
            @RequestParam("identificacion") String identificacion) {

        try {

            if (!usuarioRepository.existsByIdentificacion(identificacion)) {
                return ResponseEntity
                        .badRequest()
                        .body(new Mensaje("Error: NO EXISTE ESTA PERSONA CON ESTA IDENTIFICACIÓN!"));
            }

            Tarjeta tar = new Tarjeta();
            tar.setNumConsultas(tarjeta.getConsultas());
            tar.setTipoaAfiliacion(tarjeta.getAfiliacion());
            tar.setFechaInicio(tarjeta.getFechaInicio());
            tar.setFechaFin(tarjeta.getFechaFin());
            tar.setQR(servicio.generateByteQrCode(identificacion, 255, 255));
            tar.setEstado(tarjeta.getEstado());
            tar.setIdTarjetaEspecialidad(tarjeta.getIdTarjetaEspecialidad());
            servicio.save(tar);
            //servicio.generateImageQR(identificacion, 250, 250, imagePath);
            return new ResponseEntity(new Mensaje(String.valueOf(tar.getIdTarjeta())), HttpStatus.OK);
        } catch (Exception e) {
            System.out.println("tarjeta no creada; " + e.getMessage());
            e.getStackTrace();
            return new ResponseEntity(new Mensaje("Tratamiento no creado"), HttpStatus.BAD_REQUEST);
        }
    }

    // @PostMapping(value = "/creaQR", produces = MediaType.IMAGE_PNG_VALUE)
    // public ResponseEntity<BufferedImage> zxingQR(@RequestBody String text) throws Exception {
    //     return successResponse(servicio.generateQR(text));
    // }

    // @Bean
    // public HttpMessageConverter<BufferedImage> bufferedImageConverter() {
    //     return new BufferedImageHttpMessageConverter();
    // }

    // private ResponseEntity<BufferedImage> successResponse(BufferedImage image) {
    //     return new ResponseEntity<>(image, HttpStatus.OK);
    // }

    @ApiOperation("Muestra una lista de tarjetas")
    @CrossOrigin({ "*" })
    @GetMapping("/listaTarjetas")
    public ResponseEntity<List<Tarjeta>> list() {
        List<Tarjeta> list = servicio.listaTarjetas();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @ApiOperation("Eliminado logico del tarjeta")
    @CrossOrigin({ "*" })
    @PatchMapping("/deleteTarjeta/{id_tarjeta}")
    public ResponseEntity<?> deleteTratamiento(@RequestParam(value = "id_tarjeta") int idTarjeta) {
        Tarjeta tarjeta = servicio.getOne(idTarjeta).get();
        tarjeta.setEstado(0);
        servicio.save(tarjeta);
        return new ResponseEntity(new Mensaje("tarjeta eliminado"), HttpStatus.OK);
    }

    @ApiOperation("Lista de tarjetas con estado 1")
    @GetMapping("/tarjetasActivas")
    @CrossOrigin({ "*" })
    public ResponseEntity<List<Tarjeta>> listaTarjetasA() {
        List<Tarjeta> list = servicio.deleteLogi();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @ApiOperation("Detalles de las tarjetas")
    @GetMapping("/detallesTarjetas/{id}")
    public ResponseEntity<Tarjeta> getById(@PathVariable("id") int id) {
        if (!servicio.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Tarjeta tarjeta = servicio.getOne(id).get();
        return new ResponseEntity(tarjeta, HttpStatus.OK);
    }

    @ApiOperation("Actualizacion de la Tarjeta")
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody Tarjeta tarjeta) {

        Tarjeta tarjetas = servicio.getOne(id).get();
        tarjetas.setNumConsultas(tarjeta.getNumConsultas());
        tarjetas.setTipoaAfiliacion(tarjeta.getTipoaAfiliacion());
        tarjetas.setFechaInicio(tarjeta.getFechaInicio());
        tarjetas.setFechaFin(tarjeta.getFechaFin());
        tarjetas.setQR(tarjeta.getQR());
        tarjetas.setEstado(tarjeta.getEstado());

        servicio.save(tarjetas);

        return new ResponseEntity(new Mensaje("tarjetas actualizadas"), HttpStatus.OK);
    }

    //get Datos de la tarjeta 
    @GetMapping("/getAllDatosTarjeta")
    public ResponseEntity<GenericResponse<DatosTarjetaAllDTO>> searchDateTarjetaUser(@RequestParam String identificacion) {
        return new ResponseEntity<GenericResponse<DatosTarjetaAllDTO>>(servicio.getAllDatosTarjetaUser(identificacion), HttpStatus.OK);
    }

    //update Datos de la tarjeta de un user
    @PutMapping("/updateDatosTarjetaUser")
    public ResponseEntity<GenericResponse<String>> updateDatosTarjetaUser(@RequestBody DatosTarjetaAllDTO datosTarjetaAllDTO) {
        return new ResponseEntity<GenericResponse<String>>(servicio.updateDatosTarjetaUser(datosTarjetaAllDTO), HttpStatus.OK);
    }

}
