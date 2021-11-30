package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

/* para saber se o rest da aplicação springboot esta funcionando, criamos um recurso basico baseado na classe user
	(UserResource - classe que disponiliza um recurso web correspondente a entidade User)
	 */

	
@RestController // para informar que esse classe é recurso web que é implementado por um controlador rest, colocamos a anotation @RestController
@RequestMapping(value = "/users")
public class UserResource { //metodo que vai ser um endpoint para acessar os usuários
	
	@GetMapping
	public ResponseEntity<User> findAll() { //generics, espera um tipo dentro. e o tipo da resposta eh a classe user
		User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "12345");
		return ResponseEntity.ok().body(u);
	
	}
	
}
	
