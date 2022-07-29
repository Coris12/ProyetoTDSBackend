package com.ProyectoTDSBackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ProyectoTDSBackend.security.enums.NomEspTarjeta;

@Entity
@Table(name = "TARJETA_ESPECIALIDAD")
public class TarjetaEspecialidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TARJETA_ESPECIALIDAD", nullable = false)
    private Long idTarjetaEspcialidad;  

    @Enumerated(EnumType.STRING)
    @Column(name = "TIPO_ESPECIALIDAD", length = 60)
    private NomEspTarjeta tipoEspecialidad;

    public TarjetaEspecialidad() {
    }

    public TarjetaEspecialidad(Long idTarjetaEspcialidad, NomEspTarjeta tipoEspecialidad) {
        this.idTarjetaEspcialidad = idTarjetaEspcialidad;
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public TarjetaEspecialidad(NomEspTarjeta tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

    public Long getIdTarjetaEspcialidad() {
        return idTarjetaEspcialidad;
    }

    public void setIdTarjetaEspcialidad(Long idTarjetaEspcialidad) {
        this.idTarjetaEspcialidad = idTarjetaEspcialidad;
    }

    public NomEspTarjeta getTipoEspecialidad() {
        return tipoEspecialidad;
    }

    public void setTipoEspecialidad(NomEspTarjeta tipoEspecialidad) {
        this.tipoEspecialidad = tipoEspecialidad;
    }

}
