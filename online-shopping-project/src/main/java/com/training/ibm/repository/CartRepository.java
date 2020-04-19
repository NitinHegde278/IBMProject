package com.training.ibm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.ibm.bean.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer>{
	
}
