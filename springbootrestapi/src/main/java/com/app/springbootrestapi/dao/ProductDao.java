package com.app.springbootrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.springbootrestapi.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {

}
