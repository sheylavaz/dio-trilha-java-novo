/**
 *
 * Projeto: santander-dev-week-2025
 * Autor: Sheyla Vaz
 * Data de criação: 20/10/2025
 *
 */


package me.dio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.model.Usuario;
import me.dio.repository.UsuarioRepository;

/**
 * 
 */
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/users")
	public List<Usuario> getUsers(){
		return repository.findAll();
	}

}
