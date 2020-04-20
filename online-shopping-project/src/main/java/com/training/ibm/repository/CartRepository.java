package com.training.ibm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.ibm.bean.Cart;
import com.training.ibm.bean.Product;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer>{

	void save(Integer productQuantity);

}
