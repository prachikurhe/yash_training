package com.example.nikhil.repository;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.nikhil.mapper.ProductMapper;
import com.example.nikhil.model.Product;

@Repository("repo2")
public class ProductRepositoryImpl    implements ProductRepository{
	
	  @Autowired
      JdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAllProducts() {
		String sql="select * from product";
		return jdbcTemplate.query(sql,new ProductMapper());
	}

	@SuppressWarnings("deprecation")
	@Override
	public Product getProductById(String id) {
		String sql="select * from product where product_id=?";
		Product p=null;
		try {
		p=jdbcTemplate.queryForObject(sql, new Object[] {id}, new ProductMapper());
		}catch(EmptyResultDataAccessException ex) {
			return null;
		}
		return p;
	}

	@Override
	public void addProduct(Product product) {
		String sql="insert into product(product_id , name , category , description , manufacturer , unit_price) values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql,new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, product.getProductId());
				ps.setString(2, product.getName());
				ps.setString(3, product.getCategory());
				ps.setString(4, product.getDescription());
				ps.setString(5, product.getManufacturer());
				ps.setInt(6, product.getUnitPrice());
				
			}
		});
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public Product findByName(String name) {
		String sql="select * from product where name=?";
		Product p=null;
		try {
		p=jdbcTemplate.queryForObject(sql, new Object[] {name}, new ProductMapper());
		}catch(EmptyResultDataAccessException ex) {
			return null;
		}
		return p;
	}

}
