package com.ramrandhi.productservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramrandhi.productservice.entities.Product;
import com.ramrandhi.productservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	@Autowired
	private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String createProduct(Product product) {
    	logger.info("Product Saved Successfully");
        productRepository.save(product);
        return "product saved";
    }

}
