package com.ramrandhi.productservice.entities;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(value="PRODUCT")
public class Product {
	@Id
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
	public Product(String id, String name, String description, BigDecimal price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Product() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	
	 public static ProductBuilder builder() {
	        return new ProductBuilder();
	    }

	    public static class ProductBuilder {
	        private String name;
	        private String description;
	        private BigDecimal price;

	        private ProductBuilder() {
	        }

	        public ProductBuilder name(String name) {
	            this.name = name;
	            return this;
	        }

	        public ProductBuilder description(String description) {
	            this.description = description;
	            return this;
	        }

	        public ProductBuilder price(BigDecimal price) {
	            this.price = price;
	            return this;
	        }

	        public Product build() {
	            Product product = new Product();
	            product.name = this.name;
	            product.description = this.description;
	            product.price = this.price;
	            return product;
	        }
	    }
}
