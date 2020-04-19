package com.training.ibm.controller;

import java.util.List;

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
	
	@RequestMapping("/products/{productName}")
	List<Product> getProductByName(@PathVariable String productName){
		return service.getProductByName(productName);
	}
}
