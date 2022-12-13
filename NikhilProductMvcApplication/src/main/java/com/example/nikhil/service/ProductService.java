package com.example.nikhil.service;
import java.util.*;

import com.example.nikhil.model.Product;


public interface ProductService {
   List<Product> getAllProducts();
   public Product getProductById(String id);
   List<Product> getAllProductsByCategory(String category);
   public void addProduct(Product product);
   public boolean isTheProductNameTaken(String name);
}
