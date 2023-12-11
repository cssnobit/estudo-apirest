package com.estudo.estudoapi.domain.repository;

import java.util.List;

import com.estudo.estudoapi.domain.model.Restaurante;

public interface RestauranteRepository {

	List<Restaurante> listar();
	Restaurante porId(Long id);
	Restaurante adicionar(Restaurante restaurante);
	void remover(Long id);
}
