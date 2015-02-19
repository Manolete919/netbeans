package com.conecel.interfaz.remote;

import java.util.List;

import javax.ejb.Remote;

import com.conecel.dominio.EisRuteo;



@Remote
public interface EisRuteoBeanRemote {
	            	
	public void create(EisRuteo eisRuteo);

	public void edit(EisRuteo eisRuteo);

	public void remove(EisRuteo eisRuteo);

	public EisRuteo find(Object id);
	
	public List<EisRuteo> findAll();

	public List<EisRuteo> findRange(int[] range);

	public int count();
	
	public List<EisRuteo> obtenerListaOrdenadaDeDestinosDeBalanceoPorIdServicioJndiOrigenYOpcion(String idServicioInformacionOrigen, String jndiOrigen, String opcion) throws Exception;
	public List<EisRuteo> obtenerListaOrdenadaDeDestinosDeFailOverPorIdServicioJndiOrigenYOpcion(String idServicioInformacionOrigen, String jndiOrigen, String opcion) throws Exception;
   
}
