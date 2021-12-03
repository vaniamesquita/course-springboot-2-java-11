package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;


@Service //registrar um sevriço na camada de serviço
public class CategoryService {
	
	//dependencia para o CategoryRespository
	@Autowired
	private CategoryRepository repository;
	
	//metodo para retornar todos os usuarios do banco de dados
	public List<Category> findAll() { //operação na camada de serviço
		return repository.findAll();
	}
	
	//metodo para retornar usuário por id
	public Category findById(Long id) {
		Optional <Category> obj = repository.findById(id);
		return obj.get(); // vai retornar o objeto do tipo Category que estiver dentro do option
		
	}
}
