package com.endpoint.repository;

import org.springframework.data.repository.CrudRepository;

import com.endpoint.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
