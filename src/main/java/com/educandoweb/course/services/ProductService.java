package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;


@Service //registrar um sevriço na camada de serviço
public class ProductService {
	
	//dependencia para o ProductRespository
	@Autowired
	private ProductRepository repository;
	
	//metodo para retornar todos os usuarios do banco de dados
	public List<Product> findAll() { //operação na camada de serviço
		return repository.findAll();
	}
	
	//metodo para retornar usuário por id
	public Product findById(Long id) {
		Optional <Product> obj = repository.findById(id);
		return obj.get(); // vai retornar o objeto do tipo Product que estiver dentro do option
		
	}
}
