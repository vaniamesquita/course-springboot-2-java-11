package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;


// instanciar um objeto repository que vai ter varias operações para trabalhar com usuário
public interface ProductRepository extends JpaRepository<Product, Long>{ //Product: tipo da entidade, Long: tipo da ID
	

}
