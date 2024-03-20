package br.com.reginareis.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI().components(new Components()).info(new Info().title("API clinicaMedica - Regina Reis")
				.description("Proyecto Spring Boot API para controlar la asistencia a Clínicas Médicas").version("v1"));
	}
}