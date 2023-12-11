package com.estudo.estudoapi.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.estudo.estudoapi.domain.exception.EntidadeEmUsoException;
import com.estudo.estudoapi.domain.exception.EntidadeNaoEncontradaException;
import com.estudo.estudoapi.domain.model.Estado;
import com.estudo.estudoapi.domain.repository.EstadoRepository;

@Service
public class CadastroEstadoService {

	@Autowired
	private EstadoRepository estadoRepository;
	
	public Estado salvar(Estado estado) {
		return estadoRepository.adicionar(estado);
	}

	public void excluir(Long estadoId) {
		try {			
			estadoRepository.remover(estadoId);
		} catch(EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Nao existe um cadastro de estado com codigo %d", estadoId));
		} catch(DataIntegrityViolationException e) {
			throw new EntidadeEmUsoException(
					String.format("Estado de codigo %d nao pode ser removida, pois esta em uso", estadoId));
		}
	}
}
