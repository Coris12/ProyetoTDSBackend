/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoTDSBackend.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author corin
 */
@Entity
@Table(name="proveedor")
public class Proveedor {
    @Id
    @GeneratedValue  
    private int idP;
    private String nombreP;
    
  //Clave foranea manytoone
   @OneToMany(mappedBy="proveedor", cascade=CascadeType.MERGE, fetch=FetchType.LAZY)
	private List<Producto> productos = new ArrayList<>();
   /* @OneToMany(mappedBy = "proveedor",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Producto> producto;*/
   
    public Proveedor() {
    }

    public Proveedor(int idP, String nombreP) {
        this.idP = idP;
        this.nombreP = nombreP;
    }

    
    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

  
    public Proveedor(String nombreP) {
        this.nombreP = nombreP;
    }

   

    
    
}
