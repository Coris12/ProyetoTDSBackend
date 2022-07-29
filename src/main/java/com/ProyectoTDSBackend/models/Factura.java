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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.ColumnResult;

import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.ConstructorResult;

import com.ProyectoTDSBackend.dto.FactConsFinalDTO;
import com.ProyectoTDSBackend.dto.FacturaDatosDTO;

@NamedNativeQueries({
        @NamedNativeQuery(name = "Factura.getPdfFacturaUsuario", query = "", resultSetMapping = "getPdfFacturaUsuario"),
        @NamedNativeQuery(name = "Factura.getPdfFacturaConsFinal", query = "", resultSetMapping = "getPdfFacturaConsFinal")
})

@SqlResultSetMappings({
        @SqlResultSetMapping(name = "getPdfFacturaUsuario", classes = {
                @ConstructorResult(targetClass = FacturaDatosDTO.class, columns = {
                        @ColumnResult(name = "fecha", type = Date.class),
                        @ColumnResult(name = "identificacion", type = String.class),
                        @ColumnResult(name = "nombres", type = String.class),
                        @ColumnResult(name = "celular", type = String.class),
                        @ColumnResult(name = "email", type = String.class),
                        @ColumnResult(name = "id_factura", type = Integer.class),
                        @ColumnResult(name = "id_cliente", type = Integer.class),
                        @ColumnResult(name = "precio_producto", type = Double.class),
                        @ColumnResult(name = "nombre_producto", type = String.class),
                        @ColumnResult(name = "direccion", type = String.class),
                        @ColumnResult(name = "cantidad", type = Integer.class),
                        @ColumnResult(name = "descuento", type = Double.class),
                        @ColumnResult(name = "iva", type = Double.class),
                        @ColumnResult(name = "subtotal", type = Double.class),
                        @ColumnResult(name = "total", type = Double.class)
                })
        }),

        @SqlResultSetMapping(name = "getPdfFacturaConsFinal", classes = {
                @ConstructorResult(targetClass = FactConsFinalDTO.class, columns = {
                        @ColumnResult(name = "idFactura", type = Long.class),
                        @ColumnResult(name = "fecha", type = Date.class),
                        @ColumnResult(name = "cantidad", type = Integer.class),
                        @ColumnResult(name = "nombreProducto", type = String.class),
                        @ColumnResult(name = "precioProducto", type = Double.class),
                        @ColumnResult(name = "descuento", type = Double.class),
                        @ColumnResult(name = "iva", type = Double.class),
                        @ColumnResult(name = "subtotal", type = Double.class),
                        @ColumnResult(name = "total", type = Double.class)
                })
        })
})

@Entity
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura", nullable = false)
    private Long idFactura;

    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    // @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente",
    // insertable = false, updatable = false)
    // @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

    @Column(name = "tipo_factura")
    private String tipo_factura;

    // @OneToMany(mappedBy = "factura", fetch = FetchType.LAZY)
    // private List<CuerpoFactura> cuerpoFactura;

    // vale
    @OneToMany(mappedBy = "factura", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
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

    // public Long getId_factura() {
    //     return this.idFactura != null ? this.idFactura : 0;
    // }
}
