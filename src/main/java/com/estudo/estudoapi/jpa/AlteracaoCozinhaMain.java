package com.estudo.estudoapi.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.estudo.estudoapi.EstudoApiApplication;
import com.estudo.estudoapi.domain.model.Cozinha;

public class AlteracaoCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(EstudoApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		CadastroCozinha cadastroCozinha = applicationContext.getBean(CadastroCozinha.class);
		
		Cozinha cozinha = new Cozinha();
		cozinha.setId(1l);
		cozinha.setNome("Brasileira");
		
		cadastroCozinha.salvar(cozinha);
	}
}
