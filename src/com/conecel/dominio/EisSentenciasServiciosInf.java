package com.conecel.dominio;

import java.io.Serializable;

import javax.persistence.*;



import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the EIS_SENTENCIAS_SERVICIOS_INF database table.
 * 
 */
@Entity
@Table(name="EIS_SENTENCIAS_SERVICIOS_INF")
//@Cache(expiry=60000)
@NamedQuery(name="EisSentenciasServiciosInf.findAll", query="SELECT e FROM EisSentenciasServiciosInf e")
public class EisSentenciasServiciosInf implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EisSentenciasServiciosInfPK id;

	@Column(name="CONDICION_GOTO")
	private BigDecimal condicionGoto;

	private String estado;

	@Transient
	private BigDecimal idSentenciaSql;

	@Transient
	private BigDecimal idServicioInformacion;

	@Column(name="ID_SQL_GOTO")
	private BigDecimal idSqlGoto;

	@Column(name="ID_SQL_PADRE")
	private BigDecimal idSqlPadre;

	@Transient
	private String jndi;

	private BigDecimal orden;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="VIGENTE_DESDE")
	private Date vigenteDesde;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="VIGENTE_HASTA")
	private Date vigenteHasta;

	//bi-directional many-to-one association to EisSentenciasSql
	@ManyToOne
	@JoinColumn(name="JID_SENTENCIA_SQL")
	private EisSentenciasSql eisSentenciasSql;

	//bi-directional many-to-one association to EisServiciosInformacion
	@ManyToOne
	@JoinColumn(name="JID_SERVICIO_INFORMACION")
	private EisServiciosInformacion eisServiciosInformacion;

	public EisSentenciasServiciosInf() {
	}

	public EisSentenciasServiciosInfPK getId() {
		return this.id;
	}

	public void setId(EisSentenciasServiciosInfPK id) {
		this.id = id;
	}

	public BigDecimal getCondicionGoto() {
		return this.condicionGoto;
	}

	public void setCondicionGoto(BigDecimal condicionGoto) {
		this.condicionGoto = condicionGoto;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public BigDecimal getIdSentenciaSql() {
		return this.idSentenciaSql;
	}

	public void setIdSentenciaSql(BigDecimal idSentenciaSql) {
		this.idSentenciaSql = idSentenciaSql;
	}

	public BigDecimal getIdServicioInformacion() {
		return this.idServicioInformacion;
	}

	public void setIdServicioInformacion(BigDecimal idServicioInformacion) {
		this.idServicioInformacion = idServicioInformacion;
	}

	public BigDecimal getIdSqlGoto() {
		return this.idSqlGoto;
	}

	public void setIdSqlGoto(BigDecimal idSqlGoto) {
		this.idSqlGoto = idSqlGoto;
	}

	public BigDecimal getIdSqlPadre() {
		return this.idSqlPadre;
	}

	public void setIdSqlPadre(BigDecimal idSqlPadre) {
		this.idSqlPadre = idSqlPadre;
	}

	public String getJndi() {
		return this.jndi;
	}

	public void setJndi(String jndi) {
		this.jndi = jndi;
	}

	public BigDecimal getOrden() {
		return this.orden;
	}

	public void setOrden(BigDecimal orden) {
		this.orden = orden;
	}

	public Date getVigenteDesde() {
		return this.vigenteDesde;
	}

	public void setVigenteDesde(Date vigenteDesde) {
		this.vigenteDesde = vigenteDesde;
	}

	public Date getVigenteHasta() {
		return this.vigenteHasta;
	}

	public void setVigenteHasta(Date vigenteHasta) {
		this.vigenteHasta = vigenteHasta;
	}

	public EisSentenciasSql getEisSentenciasSql() {
		return this.eisSentenciasSql;
	}

	public void setEisSentenciasSql(EisSentenciasSql eisSentenciasSql) {
		this.eisSentenciasSql = eisSentenciasSql;
	}

	public EisServiciosInformacion getEisServiciosInformacion() {
		return this.eisServiciosInformacion;
	}

	public void setEisServiciosInformacion(EisServiciosInformacion eisServiciosInformacion) {
		this.eisServiciosInformacion = eisServiciosInformacion;
	}

}