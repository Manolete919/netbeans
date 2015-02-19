package com.conecel.dominio;

import java.io.Serializable;

import javax.persistence.*;



import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the EIS_SERVICIOS_INFORMACION database table.
 * 
 */
@Entity
@Table(name="EIS_SERVICIOS_INFORMACION")
//@Cache(expiry=60000)
@NamedQuery(name="EisServiciosInformacion.findAll", query="SELECT e FROM EisServiciosInformacion e")
public class EisServiciosInformacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="JID_SERVICIO_INFORMACION")
	private String jidServicioInformacion;

	private String comportamiento;

	private String descripcion;

	@Column(name="DEVOLVER_TRAMA")
	private String devolverTrama;

	@Column(name="ELEMENTOS_RAIZ")
	private String elementosRaiz;

	private String estado;

	@Column(name="FORMATO_SALIDA")
	private String formatoSalida;

	private BigDecimal horario;

	@Column(name="ID_CLASE_SERVICIO")
	private BigDecimal idClaseServicio;

	@Transient
	private BigDecimal idServicioInformacion;

	@Transient
	private String jndi;

	private String nombre;

	@Column(name="RAIZ_PRINCIPAL")
	private String raizPrincipal;

	@Column(name="SEPARADOR_COLUMNA")
	private String separadorColumna;

	@Column(name="SEPARADOR_PARAMETRO")
	private String separadorParametro;

	@Column(name="SEPARADOR_REGISTRO")
	private String separadorRegistro;

	@Column(name="SEPARADOR_RESULTADOS")
	private String separadorResultados;

	@Column(name="VALOR_DEFECTO_COD_ERROR")
	private BigDecimal valorDefectoCodError;

	@Column(name="VALOR_DEFECTO_MSG_ERROR")
	private String valorDefectoMsgError;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="VIGENTE_DESDE")
	private Date vigenteDesde;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="VIGENTE_HASTA")
	private Date vigenteHasta;

	//bi-directional many-to-one association to EisRuteo
	@OneToMany(mappedBy="eisServiciosInformacion")
	private List<EisRuteo> eisRuteos;

	//bi-directional many-to-one association to EisSentenciasServiciosInf
	@OneToMany(mappedBy="eisServiciosInformacion")
	private List<EisSentenciasServiciosInf> eisSentenciasServiciosInfs;

	//bi-directional many-to-one association to EisClasesServicio
	@ManyToOne
	@JoinColumn(name="JID_CLASE_SERVICIO")
	private EisClasesServicio eisClasesServicio;

	public EisServiciosInformacion() {
	}

	public String getJidServicioInformacion() {
		return this.jidServicioInformacion;
	}

	public void setJidServicioInformacion(String jidServicioInformacion) {
		this.jidServicioInformacion = jidServicioInformacion;
	}

	public String getComportamiento() {
		return this.comportamiento;
	}

	public void setComportamiento(String comportamiento) {
		this.comportamiento = comportamiento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDevolverTrama() {
		return this.devolverTrama;
	}

	public void setDevolverTrama(String devolverTrama) {
		this.devolverTrama = devolverTrama;
	}

	public String getElementosRaiz() {
		return this.elementosRaiz;
	}

	public void setElementosRaiz(String elementosRaiz) {
		this.elementosRaiz = elementosRaiz;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFormatoSalida() {
		return this.formatoSalida;
	}

	public void setFormatoSalida(String formatoSalida) {
		this.formatoSalida = formatoSalida;
	}

	public BigDecimal getHorario() {
		return this.horario;
	}

	public void setHorario(BigDecimal horario) {
		this.horario = horario;
	}

	public BigDecimal getIdClaseServicio() {
		return this.idClaseServicio;
	}

	public void setIdClaseServicio(BigDecimal idClaseServicio) {
		this.idClaseServicio = idClaseServicio;
	}

	public BigDecimal getIdServicioInformacion() {
		return this.idServicioInformacion;
	}

	public void setIdServicioInformacion(BigDecimal idServicioInformacion) {
		this.idServicioInformacion = idServicioInformacion;
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

	public String getRaizPrincipal() {
		return this.raizPrincipal;
	}

	public void setRaizPrincipal(String raizPrincipal) {
		this.raizPrincipal = raizPrincipal;
	}

	public String getSeparadorColumna() {
		return this.separadorColumna;
	}

	public void setSeparadorColumna(String separadorColumna) {
		this.separadorColumna = separadorColumna;
	}

	public String getSeparadorParametro() {
		return this.separadorParametro;
	}

	public void setSeparadorParametro(String separadorParametro) {
		this.separadorParametro = separadorParametro;
	}

	public String getSeparadorRegistro() {
		return this.separadorRegistro;
	}

	public void setSeparadorRegistro(String separadorRegistro) {
		this.separadorRegistro = separadorRegistro;
	}

	public String getSeparadorResultados() {
		return this.separadorResultados;
	}

	public void setSeparadorResultados(String separadorResultados) {
		this.separadorResultados = separadorResultados;
	}

	public BigDecimal getValorDefectoCodError() {
		return this.valorDefectoCodError;
	}

	public void setValorDefectoCodError(BigDecimal valorDefectoCodError) {
		this.valorDefectoCodError = valorDefectoCodError;
	}

	public String getValorDefectoMsgError() {
		return this.valorDefectoMsgError;
	}

	public void setValorDefectoMsgError(String valorDefectoMsgError) {
		this.valorDefectoMsgError = valorDefectoMsgError;
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

	public List<EisRuteo> getEisRuteos() {
		return this.eisRuteos;
	}

	public void setEisRuteos(List<EisRuteo> eisRuteos) {
		this.eisRuteos = eisRuteos;
	}

	public EisRuteo addEisRuteo(EisRuteo eisRuteo) {
		getEisRuteos().add(eisRuteo);
		eisRuteo.setEisServiciosInformacion(this);

		return eisRuteo;
	}

	public EisRuteo removeEisRuteo(EisRuteo eisRuteo) {
		getEisRuteos().remove(eisRuteo);
		eisRuteo.setEisServiciosInformacion(null);

		return eisRuteo;
	}

	public List<EisSentenciasServiciosInf> getEisSentenciasServiciosInfs() {
		return this.eisSentenciasServiciosInfs;
	}

	public void setEisSentenciasServiciosInfs(List<EisSentenciasServiciosInf> eisSentenciasServiciosInfs) {
		this.eisSentenciasServiciosInfs = eisSentenciasServiciosInfs;
	}

	public EisSentenciasServiciosInf addEisSentenciasServiciosInf(EisSentenciasServiciosInf eisSentenciasServiciosInf) {
		getEisSentenciasServiciosInfs().add(eisSentenciasServiciosInf);
		eisSentenciasServiciosInf.setEisServiciosInformacion(this);

		return eisSentenciasServiciosInf;
	}

	public EisSentenciasServiciosInf removeEisSentenciasServiciosInf(EisSentenciasServiciosInf eisSentenciasServiciosInf) {
		getEisSentenciasServiciosInfs().remove(eisSentenciasServiciosInf);
		eisSentenciasServiciosInf.setEisServiciosInformacion(null);

		return eisSentenciasServiciosInf;
	}

	public EisClasesServicio getEisClasesServicio() {
		return this.eisClasesServicio;
	}

	public void setEisClasesServicio(EisClasesServicio eisClasesServicio) {
		this.eisClasesServicio = eisClasesServicio;
	}

}