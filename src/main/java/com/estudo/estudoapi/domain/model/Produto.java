package com.estudo.estudoapi.domain.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Produto {

	@EqualsAndHashCode.Include
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	private String descricao;
	
	@Column(nullable = false)
	private BigDecimal preco;
	
	@Column(nullable = false)
	private boolean ativo;
	
	@JsonIgnore
	@ManyToOne
	private Restaurante restaurante;
	
}
