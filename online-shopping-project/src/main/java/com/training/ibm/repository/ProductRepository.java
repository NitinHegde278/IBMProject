package com.training.ibm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.ibm.bean.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{

	List<Product> findByProductName(String productName);
}
