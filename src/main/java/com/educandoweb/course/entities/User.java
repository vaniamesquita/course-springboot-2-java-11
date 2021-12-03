package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

	/* definimos o serializable nos objetos, quando queremos que ele seja transformado em cadeia de bytes
	para que o objeto trafegue na rede, para que possa ser gravado em arquivo e etc */

@Entity
@Table(name = "tb_user") //para não dar conflito no nome reservado USER
public class User implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // para a id ser autoincrementavel no banco de dados
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String password;
	
	@JsonIgnore //evitar um looping (jackson), pq temos uma associação de mão dupla, entre usuário(user) e pedido(order)
	@OneToMany(mappedBy = "client")
	private List<Order> orders = new ArrayList<>(); //lista de pedido de usuários é uma coleção
	
	// ao usar framework, é obrigatorio usar um construtor vazio
	public User() {
		
	}

	public User(Long id, String name, String email, String phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}
	
	// Getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Order> getOrders() {
		return orders;
	}

	// metodo hashCode
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	// metodo equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	
	
	
	
	

}
