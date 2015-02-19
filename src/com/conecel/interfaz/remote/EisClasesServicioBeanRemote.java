package com.conecel.interfaz.remote;

import java.util.List;
import javax.ejb.Remote;

import com.conecel.dominio.EisClasesServicio;

@Remote
public interface EisClasesServicioBeanRemote {
	            
	
	public void create(EisClasesServicio eisClasesServicio);

	public void edit(EisClasesServicio eisClasesServicio);

	public void remove(EisClasesServicio eisClasesServicio);

	public EisClasesServicio find(Object id);
	
	public List<EisClasesServicio> findAll();

	public List<EisClasesServicio> findRange(int[] range);

	public int count();
    
   
}
