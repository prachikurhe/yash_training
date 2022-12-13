package com.example.nikhil.validator;

import java.util.Set;

import javax.validation.ConstraintViolation;

import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.nikhil.model.Product;
import com.example.nikhil.service.ProductService;

@Component
public class ProductValidator   implements Validator{
	
	@Autowired
	ProductService productService;

	@Override
	public boolean supports(Class<?> clazz) {
		return Product.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Product product = (Product)target;
		if(productService.isTheProductNameTaken(product.getName()))
			errors.reject("name", "product name is taken");
		
	}



}
