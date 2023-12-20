package com.estudo.estudoapi.domain.repository;

import java.math.BigDecimal;
import java.util.List;

import com.estudo.estudoapi.domain.model.Restaurante;

public interface RestauranteRepositoryQueries {

	List<Restaurante> find(String nome,
			BigDecimal taxaFreteInicial, BigDecimal taxaFreteFinal);

}