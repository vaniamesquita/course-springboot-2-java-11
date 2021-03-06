package com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_product") 
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String description;
	private Double price;
	private String imgUrl;
	
	/*
	 * usamos o set pois o mesmo produto nao pode ter mais de uma categoria de uma
	 * vez instanciamos para garanir que a coleção não comece valendo nula, ela tem
	 * q começar vazia, porem em instanciada.
	 * Usamos o HashSet ao inves do set, pq o set é uma interface, não pode ser instanciado, por isso temos q usar uma classe referente a essa interface
	 * do mesmo jeito que usamos o List e ArrayList, usamos o Set e o HashSet
	 */
	
	@ManyToMany
	@JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"),
	inverseJoinColumns = @JoinColumn(name = "category_id"))
	//Tabela de associação joincolumns = chave estrangeira | inversejoincolumns = decidir qual vai ser a chave estrangeira da outra entidade
	private Set<Category> categories = new HashSet<>(); //coleção de categorias
	
	public Product() {
		
	}

	public Product(Long id, String nome, String description, Double price, String imgUrl) {
		super();
		this.id = id;
		this.nome = nome;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
		//não colocamos a coleção dentro do construtor pois ja estamos instanciando ela ali em cima sem Set<Category>
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	public Set<Category> getCategories() {
		return categories;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}

	

}
