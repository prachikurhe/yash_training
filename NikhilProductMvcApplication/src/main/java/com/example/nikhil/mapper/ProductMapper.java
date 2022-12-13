package com.example.nikhil.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.nikhil.model.Product;

public class ProductMapper   implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p1 = new Product();
		p1.setProductId(rs.getString("PRODUCT_ID"));
		p1.setCategory(rs.getString("CATEGORY"));
		p1.setManufacturer(rs.getString("MANUFACTURER"));
		p1.setDescription(rs.getString("DESCRIPTION"));
		p1.setUnitPrice(rs.getInt("UNIT_PRICE"));
		p1.setName(rs.getString("NAME"));
		return p1;
	}

}
