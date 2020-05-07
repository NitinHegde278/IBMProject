package com.training.ibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.training.ibm.bean.Cart;
import com.training.ibm.bean.Product;
import com.training.ibm.repository.ProductRepository;
import com.training.ibm.service.ServiceCart;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CartController {

	@Autowired
	ServiceCart service;

	@RequestMapping(method = RequestMethod.POST, value = "/cart/add/{productId}")
	void addToCart(@RequestBody Cart cart, @PathVariable Integer productId) {
		if (!service.getAllProductsInCart().iterator().hasNext()) {
			cart.setSubTotal(cart.getProductPrice() * cart.getProductQuantity());
			service.addtoCart(cart);
		} else{
			List<Integer> temp = service.getAllIds();
			for (Integer id : temp) {
				if (productId!=id) {
					continue;
				}
				cart.setProductQuantity(service.getProductQuantity(cart) + 1);
				break;
			}
			cart.setSubTotal(cart.getProductPrice() * cart.getProductQuantity());
			service.addtoCart(cart);
		}

	}

	@RequestMapping("/cart")
	Iterable<Cart> getAllProductsInCart() {
		return service.getAllProductsInCart();
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/cart/qty")
	void updateQuantity(@RequestBody Cart cart) {
		cart.setSubTotal(cart.getProductPrice() * cart.getProductQuantity());
		service.updateQuantity(cart);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/cart/{cartId}")
	void deleteFromCart(@PathVariable Integer cartId) {
		service.deleteFromCart(cartId);
	}

	@RequestMapping("/cart/total")
	Double getTotalOfCart() {
		return service.getTotalOfCart();
	}
	
	@RequestMapping("/cart/count")
	Integer getCount() {
		return service.getCount();
	}
}
