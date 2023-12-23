package com.ramrandhi.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ramrandhi.productservice.entities.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
