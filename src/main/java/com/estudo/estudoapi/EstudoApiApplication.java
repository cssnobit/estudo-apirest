package com.estudo.estudoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.estudo.estudoapi.infrastructure.repository.CustomJpaRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class EstudoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoApiApplication.class, args);
	}

}
