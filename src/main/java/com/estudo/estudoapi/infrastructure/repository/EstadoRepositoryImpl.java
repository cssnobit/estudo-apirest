package com.estudo.estudoapi.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.estudo.estudoapi.domain.model.Estado;
import com.estudo.estudoapi.domain.repository.EstadoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

	@PersistenceContext
	private EntityManager entity;
	
	@Override
	public List<Estado> todas() {
		// TODO Auto-generated method stub
		return entity.createQuery("from Estado", Estado.class).getResultList();
	}

	@Override
	public Estado porId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Estado adicionar(Estado estado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Estado estado) {
		// TODO Auto-generated method stub
		
	}

}
