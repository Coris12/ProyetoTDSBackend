package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.dto.ResidenciaDto;
import com.ProyectoTDSBackend.models.Residencia;
import com.ProyectoTDSBackend.service.ResidenciaService;
import com.ProyectoTDSBackend.util.GenericResponse;
import io.swagger.annotations.ApiOperation;

import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/residencia")
@Tag(name = "RESIDENCIAWS", description = "Control y mantenimiento de RESIDENCIA")
public class ResidenciaController {

    @Autowired
    private ResidenciaService recidenciaService;

    @PostMapping(path = "save")
    public ResponseEntity<GenericResponse<String>> guardarResidencia(@RequestBody ResidenciaDto residenciaDto) {
        return new ResponseEntity<GenericResponse<String>>(recidenciaService.saveRecidencia(residenciaDto), HttpStatus.OK);
    }

    @PutMapping(path = "updateResidencia")
    public ResponseEntity<GenericResponse<String>> updateResidencia(@RequestBody ResidenciaDto residenciaDto) {
        return new ResponseEntity<GenericResponse<String>>(recidenciaService.updateRecidencia(residenciaDto), HttpStatus.OK);
    }

    @GetMapping("/detallesResidencia/{id}")
    public ResponseEntity<ResidenciaDto> getById(@PathVariable("id") Long id) {
        if (!recidenciaService.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        Residencia ad = recidenciaService.getOne(id).get();
        return new ResponseEntity(ad, HttpStatus.OK);
    }

    @ApiOperation("Muestra una lista de residencias")
    @CrossOrigin({"*"})
    @GetMapping("/listaResidencia")
    public ResponseEntity<List<Residencia>> list() {
        List<Residencia> list = recidenciaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
