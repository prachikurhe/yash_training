package com.example.nikhil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="PRODUCT")
public class Product {
	
	@Id
    @Column(name="PRODUCT_ID")
    private String productId;
    
	
	//@Size(min = 5, max = 100 , message = "{product.name.size.message}")
    @Column(name="NAME")
    private String name;
    
    @Column(name="UNIT_PRICE")
    private int unitPrice;
    
    @Column(name="CATEGORY")
    private String category;
    
    
    @Column(name="DESCRIPTION")
    //@Size(min=5,message="{product.description.notnull.message}")
    private String description;
    
    @Column(name="MANUFACTURER")
    private String manufacturer;
    
    
    @Transient
    private MultipartFile productImage;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", unitPrice=" + unitPrice + ", category="
				+ category + ", description=" + description + ", manufacturer=" + manufacturer + "]";
	}
	
	
    
    
    

}
