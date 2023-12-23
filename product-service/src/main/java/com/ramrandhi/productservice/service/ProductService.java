package com.ramrandhi.productservice.service;

import com.ramrandhi.productservice.dto.ProductRequest;
import com.ramrandhi.productservice.entities.Product;

public interface ProductService {
	Product createProduct(ProductRequest productRequest);
}
