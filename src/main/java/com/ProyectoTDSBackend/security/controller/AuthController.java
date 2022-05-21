/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.security.controller;

import com.ProyectoTDSBackend.dto.Mensaje;
import com.ProyectoTDSBackend.models.Cliente;
import com.ProyectoTDSBackend.models.Producto;
import com.ProyectoTDSBackend.security.dto.JwtDto;
import com.ProyectoTDSBackend.security.dto.LoginUsuario;
import com.ProyectoTDSBackend.security.dto.NuevoUsuario;
import com.ProyectoTDSBackend.security.enums.RolNombre;
import com.ProyectoTDSBackend.security.jwt.JwtProvider;
import com.ProyectoTDSBackend.security.models.Rol;
import com.ProyectoTDSBackend.security.models.Usuario;
import com.ProyectoTDSBackend.security.repository.ServicioUser;
import com.ProyectoTDSBackend.security.repository.UsuarioRepository;
import com.ProyectoTDSBackend.security.service.RolService;
import com.ProyectoTDSBackend.security.service.UsuarioService;
import com.ProyectoTDSBackend.util.GenericResponse;
import io.swagger.annotations.ApiOperation;
import java.text.ParseException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    RolService rolService;

    @Autowired
    JwtProvider jwtProvider;

    @Autowired
    UsuarioRepository userRepository;

    @Autowired
    ServicioUser userService;

    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario nuevoUsuario, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(new Mensaje("Campos mal puestos o Email inválido"), HttpStatus.BAD_REQUEST);
        }
        if (usuarioService.existsByNombreUsuario(nuevoUsuario.getNombreUsuario())) {
            return new ResponseEntity(new Mensaje("Nombre de usuario ya se encuentra en uso"), HttpStatus.BAD_REQUEST);
        }

        Usuario usuario
                = new Usuario(
                        nuevoUsuario.getIdentificacion(),
                        nuevoUsuario.getNombres(),
                        nuevoUsuario.getDireccion(),
                        nuevoUsuario.getCelular(),
                        nuevoUsuario.getProfesion(),
                        nuevoUsuario.getSexo(),
                        nuevoUsuario.getEmail(),
                        nuevoUsuario.getCiudad(),
                        nuevoUsuario.getEstado(),
                        nuevoUsuario.getNombreUsuario(),
                        passwordEncoder.encode(nuevoUsuario.getPassword()));
        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_PACIENTE).get());
        if (nuevoUsuario.getRoles().contains("admin")) {
            roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
        }
        usuario.setEstado(1);
        usuario.setRoles(roles);
        usuarioService.save(usuario);
        return new ResponseEntity(new Mensaje("usuario guardado: " + usuario.getId()), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity(new Mensaje("campos mal puestos"), HttpStatus.BAD_REQUEST);
        }
        Authentication authentication
                = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getNombreUsuario(), loginUsuario.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        JwtDto jwtDto = new JwtDto(jwt);
        return new ResponseEntity(jwtDto, HttpStatus.OK);
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtDto> refresh(@RequestBody JwtDto jwtDto) throws ParseException {
        String token = jwtProvider.refreshToken(jwtDto);
        JwtDto jwt = new JwtDto(token);
        return new ResponseEntity(jwt, HttpStatus.OK);
    }

    @ApiOperation("Muestra la lista de usuarios en el sistema")
    @CrossOrigin({"*"})
    @GetMapping("/listaUsuarios")
    public ResponseEntity<List<Usuario>> lista() {
        List<Usuario> list = usuarioService.listaUsuarios();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @CrossOrigin({"*"})
    @PostMapping("/put-persona")
    ResponseEntity<GenericResponse<Object>> putArrendatario(
            @RequestParam(value = "idpersona") int idpersona,
            @RequestParam(value = "rol") RolNombre rol
    ) {
        return new ResponseEntity<GenericResponse<Object>>(userService.putPermisos(idpersona, rol), HttpStatus.OK);
    }

    //Obtener usuario por id
    @CrossOrigin({"*"})
    @GetMapping(path = "get-persona")
    public ResponseEntity<GenericResponse<Usuario>> getPersonaByIdentificacion(@RequestParam("identificacion") String identificacion) {
        return new ResponseEntity<GenericResponse<Usuario>>(usuarioService.ObtenerByIdentificacion(identificacion), HttpStatus.OK);
    }

    @GetMapping("/clientes")
    public ResponseEntity<List<Usuario>> search() {
        List<Usuario> list = usuarioService.search();
        return new ResponseEntity(list, HttpStatus.OK);
    }
}
