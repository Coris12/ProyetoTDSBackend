package com.ProyectoTDSBackend.controller;

import java.util.List;

import com.ProyectoTDSBackend.dto.FarmSucursalDTO;
import com.ProyectoTDSBackend.models.Farmacia;
import com.ProyectoTDSBackend.repository.FarmaciaRepository;
import com.ProyectoTDSBackend.service.FarmaciaService;
import com.ProyectoTDSBackend.util.GenericResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * @author willi
 *
 */
@CrossOrigin(origins ="*")
@RestController
@RequestMapping("/farmacia")
@Tag(name = "FarmaciaWS", description = "Control y mantenimiento farmacia" )
public class FaramaciaController {
    @Autowired
	private FarmaciaService servicio;

    //Guardar farmacia
    @PostMapping(path = "/saveFarmacia")
    public ResponseEntity<GenericResponse<String>> saveFarmacia(@RequestBody Farmacia farmacia) {
        return new ResponseEntity<GenericResponse<String>>(servicio.saveFarmacia(farmacia),HttpStatus.OK);
    }


    //Actualizar farmacia
    @PutMapping(path = "update-farmacia")
	public ResponseEntity<GenericResponse<String>> actualizarFarmacia(@RequestBody Farmacia farmacia) {
		return new ResponseEntity<GenericResponse<String>>(servicio.updateSucursal(farmacia), HttpStatus.OK);
	}
}
