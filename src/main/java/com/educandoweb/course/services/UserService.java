package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;


@Service //registrar um sevriço na camada de serviço
public class UserService {
	
	//dependencia para o UserRespository
	@Autowired
	private UserRepository repository;
	
	//metodo para retornar todos os usuarios do banco de dados
	public List<User> findAll() { //operação na camada de serviço
		return repository.findAll();
	}
	
	//metodo para retornar usuário por id
	public User findById(Long id) {
		Optional <User> obj = repository.findById(id);
		return obj.get(); // vai retornar o objeto do tipo User que estiver dentro do option
		
	}
}
