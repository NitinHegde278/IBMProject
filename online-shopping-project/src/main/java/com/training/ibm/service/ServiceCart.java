package com.training.ibm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.ibm.bean.Cart;
import com.training.ibm.repository.CartRepository;

@Service
public class ServiceCart {

	@Autowired
	CartRepository repo;
	
	public void addtoCart(Cart cart) {
		repo.save(cart);
	}
	
	public Iterable<Cart> getAllProductsInCart() {
		return repo.findAll();
	}
	
	public void updateQuantity(Cart cart) {
		repo.save(cart);
	}
	
	public void deleteFromCart(Integer cartId) {
		repo.deleteById(cartId);
	}
	
	public Double getTotalOfCart() {
		return repo.getSumOfCart();
	}
	
	public List<Integer> getAllIds() {
		return repo.getAllId();
	}
	
	public Integer getProductQuantity(Cart cart) {
		return repo.getProductQuantity(cart.getProductId());
	}
	
	public Integer getCount() {
		return repo.getCount();
	}

	public void increment(Cart cart) {
		repo.save(cart);
	}

	public void decrement(Cart cart) {
		repo.save(cart);
	}
	
	public void removeAll() {
		repo.deleteAll();
	}
}
