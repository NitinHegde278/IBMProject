package com.training.ibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.training.ibm.bean.WishList;
import com.training.ibm.service.ServiceWishList;

@RestController
public class WishListController {

	@Autowired
	ServiceWishList service;

	@RequestMapping(method = RequestMethod.POST, value = "/wishList")
	void addToWishList(@RequestBody WishList wish) {
		if (!service.getAllproducts().iterator().hasNext()) {
			wish.setSubTotal(wish.getProductPrice() * wish.getProductQuantity());
			service.addToWishList(wish);
		} else {
			for (Integer id : service.getAllIds()) {
				if (id == wish.getProductId()) {
					System.out.println("Product already added to wishList!");
				} else {
					wish.setSubTotal(wish.getProductPrice() * wish.getProductQuantity());
					service.addToWishList(wish);
				}
			}
		}

	}

	@RequestMapping("/wishList")
	Iterable<WishList> getAllProducts() {
		return service.getAllproducts();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/wishList/{productId}")
	void deleteFromWishList(@PathVariable Integer productId) {
		service.deleteFromWishList(productId);
	}
}
