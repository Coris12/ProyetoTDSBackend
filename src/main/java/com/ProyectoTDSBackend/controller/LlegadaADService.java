/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.controller;

import com.ProyectoTDSBackend.models.LLegadaAd;
import com.ProyectoTDSBackend.service.AdLlegadaServce;
import com.ProyectoTDSBackend.util.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author corin
 */
@CrossOrigin
@RestController
@RequestMapping(path = "admisionLLe")
public class LlegadaADService {
        @Autowired
	private AdLlegadaServce servicio;

    @PostMapping(path = "saveAdmisionLlegada")
    public ResponseEntity<GenericResponse<String>> saveLlegada(@RequestBody LLegadaAd llegada) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveLlegada(llegada), HttpStatus.OK);
    }

}
