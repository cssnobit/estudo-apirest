package com.estudo.estudoapi.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.estudo.estudoapi.domain.exception.EntidadeNaoEncontradaException;
import com.estudo.estudoapi.domain.model.Cozinha;
import com.estudo.estudoapi.domain.model.Restaurante;
import com.estudo.estudoapi.domain.repository.CozinhaRepository;
import com.estudo.estudoapi.domain.repository.RestauranteRepository;

@Service
public class CadastroRestauranteService {

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@Autowired
	private CozinhaRepository cozinhaRepository;
	
	public Restaurante salvar(Restaurante restaurante) {
		Long cozinhaId = restaurante.getCozinha().getId();
		Cozinha cozinha = cozinhaRepository.porId(cozinhaId);
		
		if(cozinha == null) {
			throw new EntidadeNaoEncontradaException(
					String.format("Nao existe cadastro de cozinha com codigo %d", cozinhaId));
		}
		
		restaurante.setCozinha(cozinha);
		
		return restauranteRepository.adicionar(restaurante);
	}
	
	public void excluir(Long restauranteId) {
		try {			
			restauranteRepository.remover(restauranteId);
		} catch(EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Nao existe cadastro de restaurante com codigo %d", restauranteId));
		}
	}
	
}
