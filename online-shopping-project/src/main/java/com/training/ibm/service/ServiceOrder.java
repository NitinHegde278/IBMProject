package com.training.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.ibm.bean.Orders;
import com.training.ibm.repository.OrderRepository;

@Service
public class ServiceOrder {
	
	@Autowired
	OrderRepository repo;
	
	public void addToOrder(Orders order) {
		repo.save(order);
	}
	
	public Iterable<Orders> getOrders(){
		return repo.findAll();
	}
	
	public void cancelOrder(Integer orderId) {
		repo.deleteById(orderId);
	}
}
