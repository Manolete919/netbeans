package com.conecel.interfaz.remote;

import java.math.BigDecimal;
import java.util.List;
import javax.ejb.Remote;


import com.conecel.dominio.EisServiciosConsumido;

@Remote
public interface EisServiciosConsumidoBeanRemote {

	void create(EisServiciosConsumido eisServiciosConsumido);

	void edit(EisServiciosConsumido eisServiciosConsumido);

	void remove(EisServiciosConsumido eisServiciosConsumido);
	
	public BigDecimal devolverSiguienteNoDeTransaccionServiciosConsumidos();

	EisServiciosConsumido find(Object id);

	List<EisServiciosConsumido> findAll();

	List<EisServiciosConsumido> findRange(int[] range);
	
	int count();

}
