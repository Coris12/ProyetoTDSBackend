/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.security.models;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author LENOVO
 */
public class UsuarioPrincipal implements UserDetails {
   
    private String identificacion;
    
    private String nombres;
    
    private String direccion;
    
    private String celular;
    
    private String sexo;
   
    private String email;
    
    private String ciudad;
   
    private int estado;
  
    private String nombreUsuario;
    
    private String password;
    
    private Collection<? extends GrantedAuthority> authorities;

    public UsuarioPrincipal(String identificacion, String nombres, String direccion, String celular, String sexo, String email, String ciudad, int estado, String nombreUsuario, String password, Collection<? extends GrantedAuthority> authorities) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.direccion = direccion;
        this.celular = celular;
        this.sexo = sexo;
        this.email = email;
        this.ciudad = ciudad;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.authorities = authorities;
    }

   


    public static UsuarioPrincipal build(Usuario usuario){
        List<GrantedAuthority> authorities =
                usuario.getRoles().stream().map(rol -> new SimpleGrantedAuthority(rol
                .getRolNombre().name())).collect(Collectors.toList());
        return new UsuarioPrincipal(
                usuario.getIdentificacion(),
                usuario.getNombres(),
                usuario.getDireccion(),
                usuario.getCelular(),
                usuario.getSexo(),
                usuario.getEmail(),
                usuario.getCiudad(),
                usuario.getEstado(),
                usuario.getNombreUsuario(), 
                usuario.getPassword(), 
                authorities);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return nombreUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getNombre() {
        return nombres;
    }

    public String getEmail() {
        return email;
    } 

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

   

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    
}
