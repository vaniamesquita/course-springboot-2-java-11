package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;


// instanciar um objeto repository que vai ter varias operações para trabalhar com usuário
public interface UserRepository extends JpaRepository<User, Long>{
	

}
