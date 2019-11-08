package com.app.springbootrestapi.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.springbootrestapi.dao.ProductDao;
import com.app.springbootrestapi.entity.Product;
import com.app.springbootrestapi.service.ProductService;

@Service
public class ProductServiceImplementation implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.saveAndFlush(product);
	}

	@Override
	public List<Product> getAllProductList() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public Product getProduct(Long ProductCode) {
		// TODO Auto-generated method stub
		return productDao.findOne(ProductCode);
	}

	@Override
	public void deleteProduct(Long ProductCode) {
		// TODO Auto-generated method stub
		productDao.delete(ProductCode);

	}

}
