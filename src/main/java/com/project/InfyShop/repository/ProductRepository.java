package com.project.InfyShop.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.InfyShop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
	List<Product> findByCategory(String category);
	List<Product> findByProductName(String productName);
	public Product findByProdId(Integer prodId); 
}
