package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;


@Service //registrar um sevriço na camada de serviço
public class OrderService {
	
	//dependencia para o OrderRespository
	@Autowired
	private OrderRepository repository;
	
	//metodo para retornar todos os usuarios do banco de dados
	public List<Order> findAll() { //operação na camada de serviço
		return repository.findAll();
	}
	
	//metodo para retornar usuário por id
	public Order findById(Long id) {
		Optional <Order> obj = repository.findById(id);
		return obj.get(); // vai retornar o objeto do tipo Order que estiver dentro do option
		
	}
}
