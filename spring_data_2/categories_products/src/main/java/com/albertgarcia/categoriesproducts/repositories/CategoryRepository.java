package com.albertgarcia.categoriesproducts.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.albertgarcia.categoriesproducts.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();

	List<Category> findByIdNotIn(List<Long> myCatIds);
}
