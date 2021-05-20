package com.project.InfyShop.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.InfyShop.entity.Subscribedproduct;

public interface SubscribedproductRepository extends JpaRepository<Subscribedproduct, Integer>{
	public List<Subscribedproduct> findByBuyerId(int buyerId);
}
