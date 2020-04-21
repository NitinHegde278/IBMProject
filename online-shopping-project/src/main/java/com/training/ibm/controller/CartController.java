package com.training.ibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.ibm.bean.Cart;
import com.training.ibm.bean.Product;
import com.training.ibm.repository.ProductRepository;
import com.training.ibm.service.ServiceCart;

@RestController
public class CartController {
	
	@Autowired
	ServiceCart service;
	
	@RequestMapping(method = RequestMethod.POST, value="/cart/add")
	void addToCart(@RequestBody Cart cart) {
		for(Integer i: service.getIds()) {
			if(i==cart.getProductId()) {
				cart.setProductQuantity(service.getQuantity(cart)+1);
			}
		}
		cart.setSubTotal(cart.getProductPrice()*cart.getProductQuantity());
		service.addtoCart(cart);
	}
	
	@RequestMapping("/cart")
	Iterable<Cart> getAllProductsInCart() {
		return service.getAllProductsInCart();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/cart/qty")
	void updateQuantity(@RequestBody Cart cart) {
		cart.setSubTotal(cart.getProductPrice()*cart.getProductQuantity());
		service.updateQuantity(cart);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/cart/{cartId}")
	void deleteFromCart(@PathVariable Integer cartId) {
		service.deleteFromCart(cartId);
	}
	
	@RequestMapping("/cart/total")
	Double getTotalFromCart(){
		return service.getTotalFromCart();
	}
}
