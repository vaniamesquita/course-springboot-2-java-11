package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;



// instanciar um objeto repository que vai ter varias operações para trabalhar com usuário
public interface OrderRepository extends JpaRepository<Order, Long>{ //User: tipo da entidade, Long: tipo da ID
	

}
