package com.estudo.estudoapi.domain.repository;

import java.util.List;

import com.estudo.estudoapi.domain.model.Cozinha;

public interface CozinhaRepository {

	List<Cozinha> todas();
	Cozinha porId(Long id);
	Cozinha adicionar(Cozinha cozinha);
	void remover(Cozinha cozinha);
	
}
