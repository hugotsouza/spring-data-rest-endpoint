package com.endpoint;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.endpoint.model.Brand;
import com.endpoint.model.Category;
import com.endpoint.model.Product;
import com.endpoint.repository.BrandRepository;
import com.endpoint.repository.CategoryRepository;
import com.endpoint.repository.ProductRepository;

@SpringBootApplication
public class SpringDataRestEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRestEndpointApplication.class, args);
	}
	
	@Autowired
	BrandRepository brandRepository;
	@Autowired
	CategoryRepository catRepository;
	@Autowired
	ProductRepository proRepository;
	
	@PostConstruct
	@Transactional
	public void onLoad(){
		Brand brand = new Brand();
		brand.setName("Honda");
		brandRepository.save(brand);
		
		Category category = new Category();
		category.setName("Vehicle");
		catRepository.save(category);
		
		Product product = new Product();
		product.setName("Fit");
		product.setDescription("Motor 1.6 flex");
		product.setPrice(37758.0);
		product.setBrand(brand);
		product.addCategories(category);
		proRepository.save(product);
		
	}
}
