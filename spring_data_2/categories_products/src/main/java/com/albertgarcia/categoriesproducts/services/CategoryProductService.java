package com.albertgarcia.categoriesproducts.services;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.albertgarcia.categoriesproducts.models.Category;
import com.albertgarcia.categoriesproducts.models.Product;
import com.albertgarcia.categoriesproducts.repositories.CategoryProductRepository;
import com.albertgarcia.categoriesproducts.repositories.CategoryRepository;
import com.albertgarcia.categoriesproducts.repositories.ProductRepository;

@Service
public class CategoryProductService {
	private final CategoryRepository cR;
	private final ProductRepository pR;
	private final CategoryProductRepository catProRepo;
	public CategoryProductService(CategoryRepository cR, ProductRepository pR, CategoryProductRepository catProRepo) {
		this.cR = cR;
		this.pR = pR;
		this.catProRepo = catProRepo;
	}
	public Category createCategory(Category category) {
		return cR.save(category);
	}
	public Category findCategory(Long id) {
		Optional<Category> optCat = cR.findById(id);
		if(optCat.isPresent()) {
			return optCat.get();
		}
		return null;
	}
	public List<Product> findAllProducts() {
		return pR.findAll();
	}
	public List<Product> findMyProducts(Category c) {
		return catProRepo.findByCategory(c);
	}
	public List<Product> findAllOtherProducts(Category c) {
		List<Product> myProducts = this.findMyProducts(c);
		List<Long> myIds = new ArrayList<>();
		for(int i = 0; i < myProducts.size(); i++) {
			myIds.add(myProducts.get(i).getId());
		}
		return pR.findAllByIdNotIn(myIds);
	}
	
}
