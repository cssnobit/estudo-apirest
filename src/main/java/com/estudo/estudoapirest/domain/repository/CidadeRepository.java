package com.estudo.estudoapirest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudo.estudoapirest.domain.model.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
