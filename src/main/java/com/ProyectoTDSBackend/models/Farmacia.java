package com.ProyectoTDSBackend.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "farmacia")
public class Farmacia {
    private static final long serialVersionUID = 1542L;
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_farmacia", nullable = false)
	private Long idFarmacia;


    @Column(name = "id_producto")
    private Long idProducto;

    //principal
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_sucursal", foreignKey = @ForeignKey(name = "fk_farmacia_sucursal"))
    private Sucursal sucursal;

    @OneToMany(mappedBy = "farmacia", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Empleado> empleados;

    public Farmacia() {
    }

    public Farmacia(Long idFarmacia, Long idProducto, Sucursal sucursal, List<Empleado> empleados) {
        this.idFarmacia = idFarmacia;
        this.idProducto = idProducto;
        this.sucursal = sucursal;
        this.empleados = empleados;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getIdFarmacia() {
        return idFarmacia;
    }

    public void setIdFarmacia(Long idFarmacia) {
        this.idFarmacia = idFarmacia;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

}
