package com.ProyectoTDSBackend.models;

import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "factura")
public class  Factura {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_factura", nullable = false)
	private Long idFactura;

    @Column(name = "fecha")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

    // @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", insertable = false, updatable = false)
    // @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
	private Cliente cliente;

    @Column(name = "tipo_factura")
    private String tipo_factura;

    // @OneToMany(mappedBy = "factura", fetch = FetchType.LAZY)
	// private List<CuerpoFactura> cuerpoFactura;


    //vale
    @OneToMany(mappedBy = "factura",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<CuerpoFactura> cuerpoFactura;

    public Factura() {
    }

    public Factura(Long idFactura, Date fecha, Cliente cliente, String tipo_factura) {
        this.idFactura = idFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.tipo_factura = tipo_factura;
    }

    

    public Long getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Long idFactura) {
        this.idFactura = idFactura;
    }

    public List<CuerpoFactura> getCuerpoFactura() {
        return cuerpoFactura;
    }

    public void setCuerpoFactura(List<CuerpoFactura> cuerpoFactura) {
        this.cuerpoFactura = cuerpoFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getTipo_factura() {
        return tipo_factura;
    }

    public void setTipo_factura(String tipo_factura) {
        this.tipo_factura = tipo_factura;
    }
}
