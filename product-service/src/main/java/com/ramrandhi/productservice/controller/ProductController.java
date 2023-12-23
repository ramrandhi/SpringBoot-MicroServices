package com.ramrandhi.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ramrandhi.productservice.dto.ProductRequest;
import com.ramrandhi.productservice.service.ProductService;


@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createproduct(@RequestBody ProductRequest productrequest) {
		
	}
}
