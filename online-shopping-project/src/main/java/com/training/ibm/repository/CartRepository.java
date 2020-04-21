package com.training.ibm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.training.ibm.bean.Cart;
import com.training.ibm.bean.Product;

@Repository
public interface CartRepository extends CrudRepository<Cart, Integer>{
	
	@Query(value="SELECT sum(sub_total) FROM cart", nativeQuery = true)
	 Double getSumOfSubTotal();

	@Query(value="SELECT product_id FROM cart", nativeQuery = true)
	List<Integer> getAllId();

	@Query(value="SELECT product_quantity FROM cart WHERE product_id=:id", nativeQuery = true)
	Integer getProductQuantity(@Param("id") int id);

}
