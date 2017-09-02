package com.endpoint.repository;

import org.springframework.data.repository.CrudRepository;

import com.endpoint.model.Category;

public interface CategoryRepository extends CrudRepository <Category, Long>{

}
