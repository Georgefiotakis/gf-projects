package com.app.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springbootrestapi.entity.Product;
import com.app.springbootrestapi.service.ProductService;

@RequestMapping("product")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/save")
	public Product save(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@PutMapping("/update")
	public Product update(@RequestBody Product product) {
		return productService.updateProduct(product);
	}
	
	@GetMapping("/all")
	public List<Product> getAllProduct() {
		return productService.getAllProductList();
	}
	
	@GetMapping("/by/{ProductCode}")
	public Product getProduct(@PathVariable(name = "ProductCode") Long ProductCode) {
		return productService.getProduct(ProductCode);
	}
	
	@DeleteMapping("/delete/{ProductCode}")
	public void deleteProduct(@PathVariable(name = "ProductCode") Long ProductCode) {
		productService.deleteProduct(ProductCode);
	}
	
}
