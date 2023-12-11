package com.estudo.estudoapi.api.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.estudoapi.domain.exception.EntidadeNaoEncontradaException;
import com.estudo.estudoapi.domain.model.Cidade;
import com.estudo.estudoapi.domain.model.Estado;
import com.estudo.estudoapi.domain.repository.CidadeRepository;
import com.estudo.estudoapi.domain.repository.EstadoRepository;
import com.estudo.estudoapi.domain.service.CadastroCidadeService;

@RequestMapping("/cidades")
@RestController
public class CidadeController {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CadastroCidadeService cadastroCidade;
	
	@GetMapping
	public List<Cidade> listar(){
		return cidadeRepository.todas();
	}
	
	@GetMapping("/{cidadeId}")
	public ResponseEntity<Cidade> buscar(@PathVariable Long cidadeId) {
		Cidade cidade = cidadeRepository.porId(cidadeId);
		
		if(cidade != null) {
			return ResponseEntity.ok(cidade);
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@PostMapping
	public ResponseEntity<?> adicionar(@RequestBody Cidade cidade) {
		try {
			cidade = cadastroCidade.salvar(cidade);
			
			return ResponseEntity.status(HttpStatus.CREATED).body(cidade);
		} catch(EntidadeNaoEncontradaException e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
	
	@PutMapping("/{cidadeId}")
	public ResponseEntity<?> atualizar(@PathVariable Long cidadeId,
			@RequestBody Cidade cidade) {
		
		Cidade cidadeAtual = cidadeRepository.porId(cidadeId);
		
		if(cidadeAtual != null) {
			try {
				BeanUtils.copyProperties(cidade, cidadeAtual, "id");
				
				cidadeAtual = cadastroCidade.salvar(cidadeAtual);			
				return ResponseEntity.ok(cidadeAtual);			
			} catch(EntidadeNaoEncontradaException e) {
				return ResponseEntity.badRequest().body(e.getMessage());
			}
		}
		
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{cidadeId}")
	public ResponseEntity<?> excluir(@PathVariable Long cidadeId) {
		try {
			cadastroCidade.excluir(cidadeId);
			
			return ResponseEntity.noContent().build();
		} catch(EntidadeNaoEncontradaException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		}
	}
}
