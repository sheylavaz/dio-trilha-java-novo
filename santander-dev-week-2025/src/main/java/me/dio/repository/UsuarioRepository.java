/**
 *
 * Projeto: santander-dev-week-2025
 * Autor: Sheyla Vaz
 * Data de criação: 20/10/2025
 *
 */


package me.dio.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import me.dio.model.Usuario;


/**
 * 
 */
@Repository
public class UsuarioRepository {

	public void save(Usuario usuario) {
		if(usuario.getId()==null) {
			System.out.println("SAVE - recebendo o usuario na camada de repositorio");
		} else {
			System.out.println("UPDATE - Recebendo o usuario na camada de repositorio");
		}
		System.out.println(usuario);
	}
	public void deleteById(Integer id) {
		System.out.println(String.format("DELETE/id - Recebendo id: %d para ", id));
		System.out.println(id);
	}
	public List<Usuario> findAll(){
		System.out.println("Listando os usuario do sistema");
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("svaz", "ss123"));
		usuarios.add(new Usuario("smattos", "mm1234"));
		return usuarios;
	}
	public Usuario findById(Integer id) {
		System.out.println(String.format("FIND/ID - Recebendo o id: %d para localizar um usuario", id));
		return new Usuario("svaz","ss123");
	}
	public Usuario findByUsername(String username) {
		System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuario", username));
		return new Usuario("svaz","ss123");
	}

}
