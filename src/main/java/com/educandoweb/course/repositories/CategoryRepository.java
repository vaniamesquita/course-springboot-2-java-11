package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;


// instanciar um objeto repository que vai ter varias operações para trabalhar com usuário
public interface CategoryRepository extends JpaRepository<Category, Long>{ //Category: tipo da entidade, Long: tipo da ID
	

}
