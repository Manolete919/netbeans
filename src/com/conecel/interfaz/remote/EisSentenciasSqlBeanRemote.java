package com.conecel.interfaz.remote;

import java.util.List;
import javax.ejb.Remote;

import com.conecel.dominio.EisSentenciasSql;

@Remote
public interface EisSentenciasSqlBeanRemote {
	
	void create(EisSentenciasSql eisSentenciasSql);

	void edit(EisSentenciasSql eisSentenciasSql);

	void remove(EisSentenciasSql eisSentenciasSql);

	EisSentenciasSql find(Object id);

	List<EisSentenciasSql> findAll();

	List<EisSentenciasSql> findRange(int[] range);

	int count();
}
