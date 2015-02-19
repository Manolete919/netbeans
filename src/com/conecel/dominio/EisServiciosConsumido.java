package com.conecel.dominio;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;




/**
 * The persistent class for the EIS_SERVICIOS_CONSUMIDOS database table.
 * 
 */
@Entity
@Table(name="EIS_SERVICIOS_CONSUMIDOS")
//@Cache(expiry=60000)
@NamedQuery(name="EisServiciosConsumido.findAll", query="SELECT e FROM EisServiciosConsumido e")
public class EisServiciosConsumido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EIS_SERVICIOS_CONSUMIDOS_JIDTRANSACCION_GENERATOR", sequenceName="JID_TRANSACC_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EIS_SERVICIOS_CONSUMIDOS_JIDTRANSACCION_GENERATOR")
	@Column(name="JID_TRANSACCION")
	private long jidTransaccion;

	@Column(name="COD_ERROR")
	private BigDecimal codError;

	@Lob
	@Column(name="EXPRESION_SQL")
	private String expresionSql;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_FIN")
	private Date fechaFin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="FECHA_INICIO")
	private Date fechaInicio;

	@Column(name="JID_SENTENCIA_SQL")
	private BigDecimal jidSentenciaSql;

	@Column(name="JID_SERVICIO_INFORMACION")
	private String jidServicioInformacion;

	@Column(name="JID_SUBTRANSACCION")
	private BigDecimal jidSubtransaccion;

	private String jndi;

	@Lob
	@Column(name="MSJ_ERROR")
	private String msjError;

	@Column(name="PARAMETRO_BIND1")
	private String parametroBind1;

	@Column(name="PARAMETRO_BIND2")
	private String parametroBind2;

	@Column(name="PARAMETRO_BIND3")
	private String parametroBind3;

	@Column(name="PARAMETRO_BIND4")
	private String parametroBind4;

	@Column(name="PARAMETRO_BIND5")
	private String parametroBind5;

	@Lob
	@Column(name="PARAMETROS_BINDS")
	private String parametrosBinds;

	@Lob
	private String resultado;

	public EisServiciosConsumido() {
	}

	public long getJidTransaccion() {
		return this.jidTransaccion;
	}

	public void setJidTransaccion(long jidTransaccion) {
		this.jidTransaccion = jidTransaccion;
	}

	public BigDecimal getCodError() {
		return this.codError;
	}

	public void setCodError(BigDecimal codError) {
		this.codError = codError;
	}

	public String getExpresionSql() {
		return this.expresionSql;
	}

	public void setExpresionSql(String expresionSql) {
		this.expresionSql = expresionSql;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public BigDecimal getJidSentenciaSql() {
		return this.jidSentenciaSql;
	}

	public void setJidSentenciaSql(BigDecimal jidSentenciaSql) {
		this.jidSentenciaSql = jidSentenciaSql;
	}

	public String getJidServicioInformacion() {
		return this.jidServicioInformacion;
	}

	public void setJidServicioInformacion(String jidServicioInformacion) {
		this.jidServicioInformacion = jidServicioInformacion;
	}

	public BigDecimal getJidSubtransaccion() {
		return this.jidSubtransaccion;
	}

	public void setJidSubtransaccion(BigDecimal jidSubtransaccion) {
		this.jidSubtransaccion = jidSubtransaccion;
	}

	public String getJndi() {
		return this.jndi;
	}

	public void setJndi(String jndi) {
		this.jndi = jndi;
	}

	public String getMsjError() {
		return this.msjError;
	}

	public void setMsjError(String msjError) {
		this.msjError = msjError;
	}

	public String getParametroBind1() {
		return this.parametroBind1;
	}

	public void setParametroBind1(String parametroBind1) {
		this.parametroBind1 = parametroBind1;
	}

	public String getParametroBind2() {
		return this.parametroBind2;
	}

	public void setParametroBind2(String parametroBind2) {
		this.parametroBind2 = parametroBind2;
	}

	public String getParametroBind3() {
		return this.parametroBind3;
	}

	public void setParametroBind3(String parametroBind3) {
		this.parametroBind3 = parametroBind3;
	}

	public String getParametroBind4() {
		return this.parametroBind4;
	}

	public void setParametroBind4(String parametroBind4) {
		this.parametroBind4 = parametroBind4;
	}

	public String getParametroBind5() {
		return this.parametroBind5;
	}

	public void setParametroBind5(String parametroBind5) {
		this.parametroBind5 = parametroBind5;
	}

	public String getParametrosBinds() {
		return this.parametrosBinds;
	}

	public void setParametrosBinds(String parametrosBinds) {
		this.parametrosBinds = parametrosBinds;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}