package com.ProyectoTDSBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ProyectoTDSBackend.Exceptions.MessagExcepciones;
import com.ProyectoTDSBackend.dto.FamiliaresAllDTO;
import com.ProyectoTDSBackend.dto.ListaFamiliaresDTO;
import com.ProyectoTDSBackend.models.Familiares;
import com.ProyectoTDSBackend.service.FamiliaresService;
import com.ProyectoTDSBackend.util.GenericResponse;

import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/familiares")
@Tag(name = "FamiliaresWS", description = "Control y mantenimiento de Familiares")
public class FamiliaresController {
    @Autowired
    private FamiliaresService servicio;

    // Guardar familiares
    @PostMapping(path = "savefamiliares")
    public ResponseEntity<GenericResponse<String>> savefamiliares(@RequestBody Familiares familiares) throws MessagExcepciones {
        familiares.setEstado("a");
        return new ResponseEntity<GenericResponse<String>>(servicio.saveFamiliares(familiares), HttpStatus.OK);
    }

    //listar familiares
    @GetMapping(path = "listfamiliares")
    public ResponseEntity<List<FamiliaresAllDTO>> listfamiliares(@RequestParam("usuarioId") int usuarioId){
        return new ResponseEntity<List<FamiliaresAllDTO>>(servicio.listFamiliares(usuarioId), HttpStatus.OK);
    }

    //listar familiares pertenecientes a un usuario
    @GetMapping(path = "listfamiliaresusuario")
    public ResponseEntity <GenericResponse<List<ListaFamiliaresDTO>>> listfamiliaresusuario(@RequestParam("ui") int ui){
        return new ResponseEntity <GenericResponse<List<ListaFamiliaresDTO>>>(servicio.listarFamiliares(ui), HttpStatus.OK);
    }

    //ELIMNAR FAMILIARES POR UPDATE.
    @PutMapping(path = "deletefamiliares")
    public ResponseEntity<GenericResponse<String>> deletefamiliares(@RequestParam("fId") int fId) throws MessagExcepciones {
        return new ResponseEntity<GenericResponse<String>>(servicio.eliminarFamiliar(fId), HttpStatus.OK);
    }  
    
    //ACTUALIZAR FAMILIARES
    @PutMapping(path = "updatefamiliares")
    public ResponseEntity<GenericResponse<String>> updatefamiliares(@RequestBody ListaFamiliaresDTO familiaresDTO) throws MessagExcepciones {
        return new ResponseEntity<GenericResponse<String>>(servicio.actualizarFamiliar(familiaresDTO), HttpStatus.OK);
    }

}
