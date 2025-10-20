/**
 *
 * Projeto: santander-dev-week-2025
 * Autor: Sheyla Vaz
 * Data de criação: 20/10/2025
 *
 */


package me.dio.controller;

/**
 * 
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping
	public String welcome() {
		return "Bem vindo ao Spring Boot Web API";
	}
}
