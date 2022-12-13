package com.example.nikhil.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.nikhil.model.Product;

@Repository("repo1")
public class ProductRepositoryEntityImpl    implements ProductRepository{
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getProductById(String id) {
		return entityManager.find(Product.class, id);
	}

	@Override
	@Transactional
	public void addProduct(Product product) {
	      entityManager.persist(product);
		
	}

	@Override
	public Product findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
