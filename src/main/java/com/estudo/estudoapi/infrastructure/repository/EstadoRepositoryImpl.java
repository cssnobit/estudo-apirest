package com.estudo.estudoapi.infrastructure.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.estudo.estudoapi.domain.model.Estado;
import com.estudo.estudoapi.domain.repository.EstadoRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Component
public class EstadoRepositoryImpl implements EstadoRepository {

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public List<Estado> todas() {
		return manager.createQuery("from Estado", Estado.class).getResultList();
	}

	@Override
	public Estado porId(Long id) {
		return manager.find(Estado.class, id);
	}

	@Transactional
	@Override
	public Estado adicionar(Estado estado) {
		return manager.merge(estado);
	}

	@Transactional
	@Override
	public void remover(Estado estado) {
		estado = porId(estado.getId());
		manager.remove(estado);
		
	}

}
