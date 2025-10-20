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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.model.Usuario;
import me.dio.repository.UsuarioRepository;

/**
 * 
 */
@RestController
@RequestMapping("/users")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping()
	public List<Usuario> getUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/{username}")
	public Usuario getOne(@PathVariable("username") String username) {
		return repository.findByUsername(username);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {repository.deleteById(id);}
	
	@PostMapping()
	public void postUser(@RequestBody Usuario usuario) {
		repository.save(usuario);
	}
	
	
}
