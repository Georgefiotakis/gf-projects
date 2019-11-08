package com.app.springbootrestapi.service;

import java.util.List;

import com.app.springbootrestapi.entity.Product;

public interface ProductService {
	
	Product saveProduct(Product product);
	
	Product updateProduct(Product product);
	
	List<Product> getAllProductList();
	
	Product getProduct(Long id);
	
	void deleteProduct(Long ProductCode);
	
}
