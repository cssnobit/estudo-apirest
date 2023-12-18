package com.estudo.estudoapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.estudoapi.domain.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
