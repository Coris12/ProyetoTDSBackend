package com.ProyectoTDSBackend.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

import com.ProyectoTDSBackend.dto.FamiliaresAllDTO;
import com.ProyectoTDSBackend.security.models.Usuario;

@NamedNativeQueries({
    @NamedNativeQuery(name = "Familiares.getAllFamiliares", query = "", resultSetMapping = "getAllFamiliares"),
})

@SqlResultSetMappings({
    @SqlResultSetMapping(name = "getAllFamiliares", classes = {
        @ConstructorResult(targetClass = FamiliaresAllDTO.class, columns = {
            @ColumnResult(name = "idFamiliares", type = Long.class),
            @ColumnResult(name = "nombres", type = String.class),
            @ColumnResult(name = "usuarioId", type = String.class),
            @ColumnResult(name = "idenUsuarioFamiliar", type = String.class),
            @ColumnResult(name = "tipoFamiliar", type = String.class),
        })
    })
})

@Entity
@Table(name = "FAMILIARES")
public class Familiares {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FAMILIARES", nullable = false)
    private Long idFamiliares; 

    @Column(name = "TIPO_FAMILIAR",length = 50)
    private String tipoFamiliar; 

    @Column(name = "IDEN_USUARIO_FAMILIAR", length = 50)
    private String idenUsuarioFamiliar; 

    @JoinColumn(name = "usuario_id")
	@ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	private Usuario usuario;

    public Familiares() {
    }

    public Familiares(Long idFamiliares, String tipoFamiliar, String idenUsuarioFamiliar, Usuario usuario) {
        this.idFamiliares = idFamiliares;
        this.tipoFamiliar = tipoFamiliar;
        this.idenUsuarioFamiliar = idenUsuarioFamiliar;
        this.usuario = usuario;
    }

    public Long getIdFamiliares() {
        return idFamiliares;
    }

    public void setIdFamiliares(Long idFamiliares) {
        this.idFamiliares = idFamiliares;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTipoFamiliar() {
        return tipoFamiliar;
    }

    public void setTipoFamiliar(String tipoFamiliar) {
        this.tipoFamiliar = tipoFamiliar;
    }

    public String getIdenUsuarioFamiliar() {
        return idenUsuarioFamiliar;
    }

    public void setIdenUsuarioFamiliar(String idenUsuarioFamiliar) {
        this.idenUsuarioFamiliar = idenUsuarioFamiliar;
    }

}
