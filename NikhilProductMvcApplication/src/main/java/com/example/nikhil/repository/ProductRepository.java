package com.example.nikhil.repository;
import java.util.*;
import com.example.nikhil.model.Product;

public interface ProductRepository {
    public List<Product>  getAllProducts();
    public Product getProductById(String id);
    public void addProduct(Product product);
    public Product findByName(String name);
}
