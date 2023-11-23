package com.estudo.estudoapi.restaurantejpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.estudo.estudoapi.EstudoApiApplication;
import com.estudo.estudoapi.domain.model.Restaurante;
import com.estudo.estudoapi.domain.repository.RestauranteRepository;

public class ConsultaRestauranteMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = 
				new SpringApplicationBuilder(EstudoApiApplication.class)
				.web(WebApplicationType.NONE).run(args);
		
		RestauranteRepository restaurantes = applicationContext.getBean(RestauranteRepository.class);
		List<Restaurante> listaRestaurante = restaurantes.listar();
		
		for(Restaurante restaurante: listaRestaurante) {
			System.out.printf("%d - %s - R$%.2f - %s\n",
					restaurante.getId(), restaurante.getNome(), restaurante.getTaxaFrete(), 
					restaurante.getCozinha().getNome());
		}
		
	}

}
