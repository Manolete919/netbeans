package com.conecel.dominio;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the EIS_SENTENCIAS_SERVICIOS_INF database table.
 * 
 */
@Embeddable
public class EisSentenciasServiciosInfPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="JID_SERVICIO_INFORMACION", insertable=false, updatable=false)
	private String jidServicioInformacion;

	@Column(name="JID_SENTENCIA_SQL", insertable=false, updatable=false)
	private long jidSentenciaSql;

	public EisSentenciasServiciosInfPK() {
	}
	public String getJidServicioInformacion() {
		return this.jidServicioInformacion;
	}
	public void setJidServicioInformacion(String jidServicioInformacion) {
		this.jidServicioInformacion = jidServicioInformacion;
	}
	public long getJidSentenciaSql() {
		return this.jidSentenciaSql;
	}
	public void setJidSentenciaSql(long jidSentenciaSql) {
		this.jidSentenciaSql = jidSentenciaSql;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EisSentenciasServiciosInfPK)) {
			return false;
		}
		EisSentenciasServiciosInfPK castOther = (EisSentenciasServiciosInfPK)other;
		return 
			this.jidServicioInformacion.equals(castOther.jidServicioInformacion)
			&& (this.jidSentenciaSql == castOther.jidSentenciaSql);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.jidServicioInformacion.hashCode();
		hash = hash * prime + ((int) (this.jidSentenciaSql ^ (this.jidSentenciaSql >>> 32)));
		
		return hash;
	}
}