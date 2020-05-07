package com.training.ibm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.ibm.bean.Cart;
import com.training.ibm.bean.Product;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer>{

	@Query(value="SELECT sum(sub_total) from cart", nativeQuery = true)
	Double getSumOfCart();
	
	@Query(value="SELECT product_id from cart", nativeQuery = true)
	List<Integer> getAllId();
	
	@Query(value="SELECT product_quantity from cart where product_id=:id", nativeQuery = true)
	Integer getProductQuantity(@Param("id") Integer id);
	
	@Query(value="SELECT count(*) from cart", nativeQuery = true)
	Integer getCount();
}

