package com.albertgarcia.categoriesproducts.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.albertgarcia.categoriesproducts.models.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();

	List<Product> findByIdNotIn(List<Long> myProIds);

}
