/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.service;

import com.ProyectoTDSBackend.dto.DatosTarjetaAllDTO;
import com.ProyectoTDSBackend.models.Residencia;
import com.ProyectoTDSBackend.models.Tarjeta;
import com.ProyectoTDSBackend.models.TarjetaEspecialidad;
import com.ProyectoTDSBackend.repository.ResidenciaRepository;
import com.ProyectoTDSBackend.repository.TarjetaEspecialidadRepository;
import com.ProyectoTDSBackend.repository.tarjetaRepository;
import com.ProyectoTDSBackend.security.models.Usuario;
import com.ProyectoTDSBackend.security.repository.UsuarioRepository;
import com.ProyectoTDSBackend.util.GenericResponse;
import com.ProyectoTDSBackend.util.ParametersApp;

import java.util.List;
import java.util.Optional;

import javax.persistence.NonUniqueResultException;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.FileSystems;
import com.google.zxing.client.j2se.MatrixToImageConfig;


/**
 *
 * @author corin
 */
@Service
@Transactional
public class TarjetaService {

    private static final Logger log = LoggerFactory.getLogger(TarjetaService.class);

    @Autowired
    private tarjetaRepository repository;

    @Autowired
    private ResidenciaRepository residenciaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private TarjetaEspecialidadRepository tarjetaEspecialidadRepository;

    public List<Tarjeta> listaTarjetas() {
        return repository.findAll();
    }

    public Optional<Tarjeta> getOne(int id) {
        return repository.findById(id);
    }

    public void save(Tarjeta tarjeta) {
        repository.save(tarjeta);
    }

    public boolean existsById(int id) {
        return repository.existsById(id);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public List<Tarjeta> deleteLogi() {
        return repository.findTarjetas();
    }

    public BufferedImage generateQR(String text) throws Exception {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        try {
            BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, 200, 200);
            return MatrixToImageWriter.toBufferedImage(bitMatrix);
        } catch (WriterException e) {
            e.printStackTrace();
        }
        return null;
    }

    //
    public byte[] generateByteQrCode(String text, int width, int height) {
        ByteArrayOutputStream outputStream = null;
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        try {
            BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
            outputStream = new ByteArrayOutputStream();
            MatrixToImageConfig config = new MatrixToImageConfig(0xFF000000, 0xFFFFFFFF);
            MatrixToImageWriter.writeToStream(bitMatrix, "PNG", outputStream, config);
        } catch (WriterException | IOException e) {
            e.printStackTrace();
        }
        return outputStream.toByteArray();
    }

    public void generateImageQR(String text, int width, int height, String filePath) throws Exception {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        try {
            BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", FileSystems.getDefault().getPath(filePath));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //listar todos los datos de un usuario con su tarjeta
    public GenericResponse<DatosTarjetaAllDTO> getAllDatosTarjetaUser(String identificacion) {
        GenericResponse<DatosTarjetaAllDTO> response = new GenericResponse<>();
        try {
            if(identificacion == null || identificacion.isEmpty()) {
                log.error("NO SE HA INGRESADO LA IDENTIFICACION");
                response.setMessage("NO SE HA INGRESADO IDENTIFICACION");
                response.setStatus(ParametersApp.PROCESS_NOT_COMPLETED.value());
                return response; 
            }

            if(!usuarioRepository.existsByIdentificacion(identificacion)){
                log.error("NO EXISTE EL USUARIO");
                response.setMessage("NO EXISTE EL USUARIO");
                response.setStatus(ParametersApp.EMPTY_RECORD.value()); 
                return response; 
            }
            Optional<DatosTarjetaAllDTO> dt = repository.getAllDatosTarjeta(identificacion);            

            if(dt.isPresent()){
                DatosTarjetaAllDTO dto = new DatosTarjetaAllDTO();
                dto.setId(dt.get().getId());
                dto.setIdRecidencia(dt.get().getIdRecidencia());
                dto.setNombres(dt.get().getNombres());
                dto.setDireccion(dt.get().getDireccion());
                dto.setCelular(dt.get().getCelular());
                dto.setNacionalidad(dt.get().getNacionalidad());
                dto.setPais(dt.get().getPais());
                dto.setProvincia(dt.get().getProvincia());
                dto.setCanton(dt.get().getCanton());
                dto.setParroquia(dt.get().getParroquia());
                dto.setIdTarjeta(dt.get().getIdTarjeta());
                dto.setAfiliacion(dt.get().getAfiliacion());
                dto.setIdTarjetaEspecialidad(dt.get().getIdTarjetaEspecialidad());
                dto.setTipoEspecialidad(dt.get().getTipoEspecialidad());
                dto.setFechaFin(dt.get().getFechaFin());
                dto.setFechaInicio(dt.get().getFechaInicio());
                dto.setEstado(dt.get().getEstado());
                dto.setConsultas(dt.get().getConsultas());

                response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                response.setObject(dto);
                response.setStatus(ParametersApp.SUCCESSFUL.value());
            }else {
                response.setMessage("CONSULTA VACIA");
                response.setStatus(ParametersApp.SERVER_ERROR.value());
            }
        } catch (NonUniqueResultException e) {
            log.error("ERROR MAS DE UN RESULTADO", e);
            response.setMessage("ERROR MAS DE UN RESULTADO");
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        } catch (Exception e) {
            log.error("ERROR: ", e);
            response.setMessage(ParametersApp.SERVER_ERROR.getReasonPhrase());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

    //update tarjeta de un usuario
    public GenericResponse<String> updateDatosTarjetaUser(DatosTarjetaAllDTO datosTarjetaAllDTO) {
        GenericResponse<String> response = new GenericResponse<>();
        try {
            if(datosTarjetaAllDTO.getAfiliacion()==null || datosTarjetaAllDTO.getAfiliacion().isEmpty()){
                log.info("AFILIACION NULA");
                response.setMessage("AFILIACION NO PUEDE ESTAR VACIA");
                response.setStatus(ParametersApp.SERVER_ERROR.value());
                return response;
            }

            if(!repository.existsById(datosTarjetaAllDTO.getIdTarjeta())){
                log.info("TARJETA NO ENCONTRADA");
                response.setMessage("TARJETA NO ENCONTRADA");
                response.setStatus(ParametersApp.NOT_FOUND_RECORDS.value());
                return response;
            }
            Tarjeta dt = repository.findById(datosTarjetaAllDTO.getIdTarjeta()).get();

            if(dt!=null){
                if(!residenciaRepository.existsById(datosTarjetaAllDTO.getIdRecidencia())){
                    log.error("ERROR NO EXISTE RECIDENCIA CON EL ID SOLICITADO ");
                    response.setStatus(ParametersApp.SERVER_ERROR.value());
                    return response;
                }
                Residencia re = residenciaRepository.findById(datosTarjetaAllDTO.getIdRecidencia()).get();

                if(re!=null){
                    if(!usuarioRepository.existsById(datosTarjetaAllDTO.getId().intValue())){
                        log.error("ERROR NO EXISTE EL USUARIO");
                        response.setStatus(ParametersApp.SERVER_ERROR.value());
                        return response;
                    }

                    
                    Usuario usuario = usuarioRepository.findById(datosTarjetaAllDTO.getId().intValue()).get();
                    //Long convertLong = Long.valueOf(datosTarjetaAllDTO.getIdTarjetaEspecialidad());
                    //TarjetaEspecialidad tarEsp = tarjetaEspecialidadRepository.findById(convertLong).get();
                    //dt.setId(tarjeta.getId());
                    //tarjetaUpdate.setIdRecidencia(tarjeta.getIdRecidencia());
                    usuario.setNombres(datosTarjetaAllDTO.getNombres());
                    usuario.setDireccion(datosTarjetaAllDTO.getDireccion());
                    usuario.setCelular(datosTarjetaAllDTO.getCelular());

                    re.setNacionalidad(datosTarjetaAllDTO.getNacionalidad());
                    re.setPais(datosTarjetaAllDTO.getPais());
                    re.setProvincia(datosTarjetaAllDTO.getProvincia());
                    re.setCanton(datosTarjetaAllDTO.getCanton());
                    re.setParroquia(datosTarjetaAllDTO.getParroquia());
                    //tarjetaUpdate.setIdTarjeta(tarjeta.getIdTarjeta());
                    dt.setTipoaAfiliacion(datosTarjetaAllDTO.getAfiliacion());
                    dt.setIdTarjetaEspecialidad(datosTarjetaAllDTO.getIdTarjetaEspecialidad());
                    dt.setFechaFin(datosTarjetaAllDTO.getFechaFin());
                    dt.setNumConsultas(datosTarjetaAllDTO.getConsultas());
                    //tarEsp.get().setTipoEspecialidad(datosTarjetaAllDTO.getTipoEspecialidad());
                    // repository.save(dt);
                    // usuarioRepository.save(usuario);
                    residenciaRepository.save(re);
                    response.setMessage(ParametersApp.SUCCESSFUL.getReasonPhrase());
                    response.setObject("DATOS DE TARJETA ACTUALIZADOS");//no editar el mensaje verficar en el front
                    response.setStatus(ParametersApp.SUCCESSFUL.value());  
                };
            }else {
                response.setMessage("USUARIO NO ENCONTRADO");
                response.setStatus(ParametersApp.SERVER_ERROR.value());
            }
        } catch (Exception e) {
            log.error("ERROR: ", e);
            response.setMessage(ParametersApp.SERVER_ERROR.getReasonPhrase());
            response.setStatus(ParametersApp.SERVER_ERROR.value());
        }
        return response;
    }

}
