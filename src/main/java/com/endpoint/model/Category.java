package com.endpoint.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Category extends AbstractEntity{

	
	@NotNull
	private String name;
	
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
	
}
