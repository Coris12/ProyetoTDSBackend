package com.ProyectoTDSBackend.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "Farmacia")
public class Farmacia {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_farmacia", nullable = false)
	private Long idFarmacia;

    @Column(name = "id_empleado")
	private Long idEmpleado;

    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "id_sucursal")
    private Long idSucursal;

    //uno a muchos
    @OneToMany(mappedBy = "farmacia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Sucursal> sucursal;

    public Farmacia() {
    }

    public Long getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(Long idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Long getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Long idSucursal) {
        this.idSucursal = idSucursal;
    }

    public List<Sucursal> getSucursal() {
        return sucursal;
    }

    public void setSucursal(List<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }
    
}
