package com.example.nikhil.service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.nikhil.exception.ProductNotFoundException;
import com.example.nikhil.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.example.nikhil.repository.ProductRepository;

@Service
public class ProductServiceImpl   implements ProductService{
	
	@Autowired
	@Qualifier("repo2")
	ProductRepository   productRepository;

	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public Product getProductById(String id) {
		Product p=productRepository.getProductById(id);
		if(p==null)
			throw new ProductNotFoundException("product with the given id not found");
		return p;
	}

	@Override
	public List<Product> getAllProductsByCategory(String category) {
		return productRepository.getAllProducts().stream().filter(p->p.getCategory().equals(category)).collect(Collectors.toList());
	}

	@Override
	public void addProduct(Product product) {
		productRepository.addProduct(product);
		
	}

	@Override
	public boolean isTheProductNameTaken(String name) {
		if(productRepository.findByName(name)==null)
			return false;
		else
			return true;
	}
	
	

}
