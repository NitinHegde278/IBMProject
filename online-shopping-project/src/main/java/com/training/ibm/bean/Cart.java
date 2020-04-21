package com.training.ibm.bean;

import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int productId;
	
	private String productCategory;
	private String productSubCategory;
	private String productName;
	private double productPrice;
	private double subTotal;
	
	//@Column(columnDefinition = "integer default 1",nullable = false)
	private int productQuantity=1;

	//@ManyToOne
	//@JoinColumn(name = "product_id")
	//Product product;
	
	public Cart() { }


	public Cart(int productId, String productCategory, String productSubCategory, String productName,
			double productPrice, double subTotal, int productQuantity) {
		this.productId = productId;
		this.productCategory = productCategory;
		this.productSubCategory = productSubCategory;
		this.productName = productName;
		this.productPrice = productPrice;
		this.subTotal = subTotal;
		this.productQuantity = productQuantity;
	}




/*	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
*/
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	

	public String getProductSubCategory() {
		return productSubCategory;
	}


	public void setProductSubCategory(String productSubCategory) {
		this.productSubCategory = productSubCategory;
	}


	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

}
