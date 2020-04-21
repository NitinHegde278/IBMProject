package com.training.ibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.ibm.bean.Product;
import com.training.ibm.service.ServiceProduct;

@RestController
public class ProductController {

	@Autowired
	ServiceProduct service;
	
	
	@RequestMapping("/products/name/{productName}")
	List<Product> getProductByName(@PathVariable String productName){
		return service.getProductByName(productName);
	}
	
	@RequestMapping("/products")
	Iterable<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@RequestMapping("/products/id/{productId}")
	Optional<Product> getProductById(@PathVariable Integer productId){
		return service.getProductById(productId);
	}
}
