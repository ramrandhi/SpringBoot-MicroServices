package com.ramrandhi.productservice.service;

import org.springframework.stereotype.Service;

import com.ramrandhi.productservice.dto.ProductRequest;
import com.ramrandhi.productservice.entities.Product;
import com.ramrandhi.productservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(ProductRequest productRequest) {
        return Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
    }

}
