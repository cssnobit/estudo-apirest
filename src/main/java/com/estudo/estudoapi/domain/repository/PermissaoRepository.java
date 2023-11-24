package com.estudo.estudoapi.domain.repository;

import java.util.List;

import com.estudo.estudoapi.domain.model.Permissao;

public interface PermissaoRepository {

	List<Permissao> todas();
	Permissao porId(Long id);
	Permissao adicionar(Permissao permissao);
	void remover(Permissao permissao);
	
}
