package com.conecel.dominio;

import java.io.Serializable;

import javax.persistence.*;



import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the EIS_RUTEOS database table.
 * 
 */
@Entity
@Table(name="EIS_RUTEOS")
//@Cache(expiry=60000)
@NamedQuery(name="EisRuteo.findAll", query="SELECT e FROM EisRuteo e")
public class EisRuteo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="JID_RUTEO")
	private long jidRuteo;

	private String estado;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_DESDE")
	private Date fechaDesde;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_HASTA")
	private Date fechaHasta;

	@Column(name="ID_SERVICIO_INF_ORIGEN")
	private String idServicioInfOrigen;

	@Column(name="JNDI_DESTINO")
	private String jndiDestino;

	@Column(name="JNDI_ORIGEN")
	private String jndiOrigen;

	private String opcion;

	@Column(name="ORDEN_FAILOVER")
	private BigDecimal ordenFailover;

	@Column(name="PESO_BALANCEO")
	private BigDecimal pesoBalanceo;

	//bi-directional many-to-one association to EisServiciosInformacion
	@ManyToOne
	@JoinColumn(name="JID_SERVICIO_INF_DESTINO")
	private EisServiciosInformacion eisServiciosInformacion;

	public EisRuteo() {
	}

	public long getJidRuteo() {
		return this.jidRuteo;
	}

	public void setJidRuteo(long jidRuteo) {
		this.jidRuteo = jidRuteo;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFechaDesde() {
		return this.fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return this.fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public String getIdServicioInfOrigen() {
		return this.idServicioInfOrigen;
	}

	public void setIdServicioInfOrigen(String idServicioInfOrigen) {
		this.idServicioInfOrigen = idServicioInfOrigen;
	}

	public String getJndiDestino() {
		return this.jndiDestino;
	}

	public void setJndiDestino(String jndiDestino) {
		this.jndiDestino = jndiDestino;
	}

	public String getJndiOrigen() {
		return this.jndiOrigen;
	}

	public void setJndiOrigen(String jndiOrigen) {
		this.jndiOrigen = jndiOrigen;
	}

	public String getOpcion() {
		return this.opcion;
	}

	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}

	public BigDecimal getOrdenFailover() {
		return this.ordenFailover;
	}

	public void setOrdenFailover(BigDecimal ordenFailover) {
		this.ordenFailover = ordenFailover;
	}

	public BigDecimal getPesoBalanceo() {
		return this.pesoBalanceo;
	}

	public void setPesoBalanceo(BigDecimal pesoBalanceo) {
		this.pesoBalanceo = pesoBalanceo;
	}

	public EisServiciosInformacion getEisServiciosInformacion() {
		return this.eisServiciosInformacion;
	}

	public void setEisServiciosInformacion(EisServiciosInformacion eisServiciosInformacion) {
		this.eisServiciosInformacion = eisServiciosInformacion;
	}

}