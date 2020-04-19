package com.training.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.ibm.bean.Product;
import com.training.ibm.repository.ProductRepository;

@Service
public class ServiceProduct {

	@Autowired
	ProductRepository repo;
	
	public List<Product> getProductByName(String productName){
		return repo.findByProductName(productName);
	}
}
