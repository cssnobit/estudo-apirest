package com.estudo.estudoapi.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.estudo.estudoapi.domain.exception.EntidadeNaoEncontradaException;
import com.estudo.estudoapi.domain.model.Cidade;
import com.estudo.estudoapi.domain.model.Estado;
import com.estudo.estudoapi.domain.repository.CidadeRepository;
import com.estudo.estudoapi.domain.repository.EstadoRepository;

@Service
public class CadastroCidadeService {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public Cidade salvar(Cidade cidade) {
		Long estadoId = cidade.getEstado().getId();
		Estado estado = estadoRepository.porId(estadoId);
		
		if(estado == null) {
			throw new EntidadeNaoEncontradaException(
					String.format("Nao existe cadastro de estado com codigo %d", estadoId));
		}
		
		cidade.setEstado(estado);
		
		return cidadeRepository.adicionar(cidade);
	}
	
	public void excluir(Long cidadeId) {
		try {			
			cidadeRepository.remover(cidadeId);
		} catch(EmptyResultDataAccessException e) {
			throw new EntidadeNaoEncontradaException(
					String.format("Nao existe cadastro de cidade com codigo %d", cidadeId));
		}
	}
}
