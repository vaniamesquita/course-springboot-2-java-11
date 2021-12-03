package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;

/* para saber se o rest da aplicação springboot esta funcionando, criamos um recurso basico baseado na classe user
	(CategoryResource - classe que disponiliza um recurso web correspondente a entidade Category)
	 */

	
@RestController // para informar que essa classe é recurso web que é implementado por um controlador rest, colocamos a anotation @RestController
@RequestMapping(value = "/categories")
public class CategoryResource { //metodo que vai ser um endpoint para acessar os usuários
	
	//dependencia para o service
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll() { //generics, espera um tipo dentro, e o tipo da resposta eh a classe user <Category>
		List<Category> list = service.findAll();
				
		return ResponseEntity.ok().body(list);
	
	}
	
	//endpoint para buscar um usuário por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
	
