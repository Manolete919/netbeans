package com.conecel.dominio;

import java.io.Serializable;

import javax.persistence.*;



import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the EIS_SENTENCIAS_SQL database table.
 * 
 */
@Entity
@Table(name="EIS_SENTENCIAS_SQL")
//@Cache(expiry=60000)
@NamedQuery(name="EisSentenciasSql.findAll", query="SELECT e FROM EisSentenciasSql e")
public class EisSentenciasSql implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="JID_SENTENCIA_SQL")
	private long jidSentenciaSql;

	@Column(name="CANTIDAD_PARAMETROS")
	private BigDecimal cantidadParametros;

	private String descripcion;

	@Lob
	@Column(name="EXPRESION_SQL")
	private String expresionSql;

	@Transient
	private BigDecimal idSentenciaSql;

	@Transient
	private String jndi;

	private String nombre;

	//bi-directional many-to-one association to EisSentenciasServiciosInf
	@OneToMany(mappedBy="eisSentenciasSql")
	private List<EisSentenciasServiciosInf> eisSentenciasServiciosInfs;

	public EisSentenciasSql() {
	}

	public long getJidSentenciaSql() {
		return this.jidSentenciaSql;
	}

	public void setJidSentenciaSql(long jidSentenciaSql) {
		this.jidSentenciaSql = jidSentenciaSql;
	}

	public BigDecimal getCantidadParametros() {
		return this.cantidadParametros;
	}

	public void setCantidadParametros(BigDecimal cantidadParametros) {
		this.cantidadParametros = cantidadParametros;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExpresionSql() {
		return this.expresionSql;
	}

	public void setExpresionSql(String expresionSql) {
		this.expresionSql = expresionSql;
	}

	public BigDecimal getIdSentenciaSql() {
		return this.idSentenciaSql;
	}

	public void setIdSentenciaSql(BigDecimal idSentenciaSql) {
		this.idSentenciaSql = idSentenciaSql;
	}

	public String getJndi() {
		return this.jndi;
	}

	public void setJndi(String jndi) {
		this.jndi = jndi;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<EisSentenciasServiciosInf> getEisSentenciasServiciosInfs() {
		return this.eisSentenciasServiciosInfs;
	}

	public void setEisSentenciasServiciosInfs(List<EisSentenciasServiciosInf> eisSentenciasServiciosInfs) {
		this.eisSentenciasServiciosInfs = eisSentenciasServiciosInfs;
	}

	public EisSentenciasServiciosInf addEisSentenciasServiciosInf(EisSentenciasServiciosInf eisSentenciasServiciosInf) {
		getEisSentenciasServiciosInfs().add(eisSentenciasServiciosInf);
		eisSentenciasServiciosInf.setEisSentenciasSql(this);

		return eisSentenciasServiciosInf;
	}

	public EisSentenciasServiciosInf removeEisSentenciasServiciosInf(EisSentenciasServiciosInf eisSentenciasServiciosInf) {
		getEisSentenciasServiciosInfs().remove(eisSentenciasServiciosInf);
		eisSentenciasServiciosInf.setEisSentenciasSql(null);

		return eisSentenciasServiciosInf;
	}

}