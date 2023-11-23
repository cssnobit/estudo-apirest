package com.estudo.estudoapi.restaurantejpa;

import java.math.BigDecimal;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.estudo.estudoapi.EstudoApiApplication;
import com.estudo.estudoapi.domain.model.Restaurante;
import com.estudo.estudoapi.domain.repository.RestauranteRepository;

public class InclusaoRestauranteMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(EstudoApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		RestauranteRepository restaurantes = applicationContext.getBean(RestauranteRepository.class);
		
		Restaurante restaurante1 = new Restaurante();
		restaurante1.setNome("Itabaiana");
		restaurante1.setTaxaFrete(new BigDecimal(15.0));
		
		Restaurante restaurante2 = new Restaurante();
		restaurante2.setNome("Temakeiro");
		restaurante2.setTaxaFrete(new BigDecimal(12.0));
		
		restaurante1 = restaurantes.adicionar(restaurante1);		
		restaurante2 = restaurantes.adicionar(restaurante2);
		
		System.out.printf("ID: %d / Nome: %s / Taxa Frete: R$%.2f%n",
				restaurante1.getId(), restaurante1.getNome(), restaurante1.getTaxaFrete());
		System.out.printf("ID: %d / Nome: %s / Taxa Frete: R$%.2f%n",
				restaurante2.getId(), restaurante2.getNome(), restaurante2.getTaxaFrete());
	}
}
