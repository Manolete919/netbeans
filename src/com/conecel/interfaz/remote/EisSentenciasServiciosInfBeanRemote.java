package com.conecel.interfaz.remote;

import java.util.List;
import javax.ejb.Remote;
import com.conecel.dominio.EisSentenciasServiciosInf;


@Remote
public interface EisSentenciasServiciosInfBeanRemote {
	
	void create(EisSentenciasServiciosInf eisSentenciasServiciosInf);

	void edit(EisSentenciasServiciosInf eisSentenciasServiciosInf);

	void remove(EisSentenciasServiciosInf eisSentenciasServiciosInf);

	EisSentenciasServiciosInf find(Object id);
	
    List<EisSentenciasServiciosInf> findAll();

    List<EisSentenciasServiciosInf> findRange(int[] range);
        
    int count();
    
    public List<EisSentenciasServiciosInf> consultarSentenciasServiciosInfPorJidServicioInformacion(String jidServicioInformacion );
    
}
