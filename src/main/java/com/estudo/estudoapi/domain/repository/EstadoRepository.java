package com.estudo.estudoapi.domain.repository;

import java.util.List;

import com.estudo.estudoapi.domain.model.Estado;

public interface EstadoRepository {

	List<Estado> todas();
	Estado porId(Long id);
	Estado adicionar(Estado estado);
	void remover(Estado estado);
	
}
