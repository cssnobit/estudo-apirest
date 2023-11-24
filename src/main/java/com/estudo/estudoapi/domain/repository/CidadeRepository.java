package com.estudo.estudoapi.domain.repository;

import java.util.List;

import com.estudo.estudoapi.domain.model.Cidade;

public interface CidadeRepository {

	List<Cidade> todas();
	Cidade porId(Long id);
	Cidade adicionar(Cidade cidade);
	void remover(Cidade cidade);
	
}
