package com.conecel.interfaz.remote;
import java.util.List;
import javax.ejb.Remote;
import com.conecel.dominio.EisServiciosInformacion;

@Remote
public interface EisServiciosInformacionBeanRemote {
	
	void create(EisServiciosInformacion eisServiciosInformacion);

	void edit(EisServiciosInformacion eisServiciosInformacion);

	void remove(EisServiciosInformacion eisServiciosInformacion);

	EisServiciosInformacion find(Object id);

	List<EisServiciosInformacion> findAll();

	List<EisServiciosInformacion> findRange(int[] range);
		
	int count();
}
