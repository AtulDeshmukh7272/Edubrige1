package com.validation.service;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl  implement ProductService{
	
@Override
@Autowired
private ProductService service;
public Product addProduct(Product product) {
	return service.addProduct(product);
}
}
