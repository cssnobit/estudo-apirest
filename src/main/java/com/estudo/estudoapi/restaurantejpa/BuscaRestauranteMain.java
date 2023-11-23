package com.estudo.estudoapi.restaurantejpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.estudo.estudoapi.EstudoApiApplication;
import com.estudo.estudoapi.domain.model.Restaurante;
import com.estudo.estudoapi.domain.repository.RestauranteRepository;

public class BuscaRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new SpringApplicationBuilder(EstudoApiApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		RestauranteRepository restaurantes = applicationContext.getBean(RestauranteRepository.class);
		
		Restaurante restaurante = restaurantes.porId(1l);
		
		System.out.printf("ID: %d / Nome: %s / Taxa Frete: R$%.2f%n",
				restaurante.getId(), restaurante.getNome(), restaurante.getTaxaFrete());
	}

}
