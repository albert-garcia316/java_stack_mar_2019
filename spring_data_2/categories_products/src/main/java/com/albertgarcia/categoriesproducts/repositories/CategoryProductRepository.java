package com.albertgarcia.categoriesproducts.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.albertgarcia.categoriesproducts.models.Category;
import com.albertgarcia.categoriesproducts.models.CategoryProduct;
import com.albertgarcia.categoriesproducts.models.Product;

public interface CategoryProductRepository extends CrudRepository<CategoryProduct, Long> {
	List<CategoryProduct> findAll();

}
