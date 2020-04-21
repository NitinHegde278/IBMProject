package com.training.ibm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.training.ibm.bean.Product;
import com.training.ibm.repository.ProductRepository;

@Service
public class ServiceProduct {

	@Autowired
	ProductRepository repo;
	
	public List<Product> getProductByName(String productName){
		return repo.findByProductName(productName);
	}

	public Iterable<Product> getAllProducts() {
		return repo.findAll();
	}

	public Optional<Product> getProductById(Integer productId) {
		return repo.findById(productId);
	}
}
