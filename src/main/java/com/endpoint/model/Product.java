package com.endpoint.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product extends AbstractEntity{


	private String name;
	@Column(columnDefinition="TEXT")
	private String description;
	private Double price;
	
	@ManyToMany
	private List<Category> categories;
	
	@ManyToOne
	private Brand brand;
	
	public Product(){
		this.categories = new ArrayList<>();
	}

	public void addCategories(Category... categories){
		for(Category category : categories){
			this.categories.add(category);
		}
	}
	
	public List<Category> getCategories() {
		return Collections.unmodifiableList(categories);
	}
	
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

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
