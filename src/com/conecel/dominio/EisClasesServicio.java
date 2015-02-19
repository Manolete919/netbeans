package com.conecel.dominio;

import java.io.Serializable;

import javax.persistence.*;


import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the EIS_CLASES_SERVICIOS database table.
 * 
 */
@Entity
@Table(name="EIS_CLASES_SERVICIOS")
//@Cache(expiry=60000)
@NamedQuery(name="EisClasesServicio.findAll", query="SELECT e FROM EisClasesServicio e")
public class EisClasesServicio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="JID_CLASE_SERVICIO")
	private long jidClaseServicio;

	private String descripcion;

	@Transient
	private BigDecimal idClaseServicio;

	@Transient
	private String jndi;

	private String nombre;

	//bi-directional many-to-one association to EisServiciosInformacion
	@OneToMany(mappedBy="eisClasesServicio")
	private List<EisServiciosInformacion> eisServiciosInformacions;

	public EisClasesServicio() {
	}

	public long getJidClaseServicio() {
		return this.jidClaseServicio;
	}

	public void setJidClaseServicio(long jidClaseServicio) {
		this.jidClaseServicio = jidClaseServicio;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getIdClaseServicio() {
		return this.idClaseServicio;
	}

	public void setIdClaseServicio(BigDecimal idClaseServicio) {
		this.idClaseServicio = idClaseServicio;
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

	public List<EisServiciosInformacion> getEisServiciosInformacions() {
		return this.eisServiciosInformacions;
	}

	public void setEisServiciosInformacions(List<EisServiciosInformacion> eisServiciosInformacions) {
		this.eisServiciosInformacions = eisServiciosInformacions;
	}

	public EisServiciosInformacion addEisServiciosInformacion(EisServiciosInformacion eisServiciosInformacion) {
		getEisServiciosInformacions().add(eisServiciosInformacion);
		eisServiciosInformacion.setEisClasesServicio(this);

		return eisServiciosInformacion;
	}

	public EisServiciosInformacion removeEisServiciosInformacion(EisServiciosInformacion eisServiciosInformacion) {
		getEisServiciosInformacions().remove(eisServiciosInformacion);
		eisServiciosInformacion.setEisClasesServicio(null);

		return eisServiciosInformacion;
	}

}