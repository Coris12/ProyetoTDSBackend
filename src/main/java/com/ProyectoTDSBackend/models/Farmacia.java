package com.ProyectoTDSBackend.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

    @Column(name = "id_empleado")
	private Long idEmpleado;

    @Column(name = "id_producto")
    private Long idProducto;

    //principal
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_sucursal", foreignKey = @ForeignKey(name = "fk_farmacia_sucursal"))
    private Sucursal sucursal;

    public Farmacia() {
    }

    public Farmacia(Long idFarmacia, Long idEmpleado, Long idProducto) {
        this.idFarmacia = idFarmacia;
        this.idEmpleado = idEmpleado;
        this.idProducto = idProducto;
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

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

}
