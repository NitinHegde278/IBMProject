package com.training.ibm.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WishList {

	@Id
	private int productId;

	private String productCategory;
	private String productSubCategory;
	private String productName;
	private double productPrice;
	private double subTotal;
	
	private int productQuantity=1;

	public WishList() {
	}

	public WishList(int productId, String productCategory, String productSubCategory, String productName,
			double productPrice, double subTotal, int productQuantity) {
		super();
		this.productId = productId;
		this.productCategory = productCategory;
		this.productSubCategory = productSubCategory;
		this.productName = productName;
		this.productPrice = productPrice;
		this.subTotal = subTotal;
		this.productQuantity = productQuantity;
	}

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

