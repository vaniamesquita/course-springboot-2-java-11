package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;


// instanciar um objeto repository que vai ter varias operações para trabalhar com usuário
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{ //User: tipo da entidade, Long: tipo da ID
	

}
